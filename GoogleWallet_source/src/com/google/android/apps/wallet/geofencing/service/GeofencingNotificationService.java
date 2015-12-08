// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.geofencing.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.text.Html;
import android.text.TextUtils;
import android.widget.RemoteViews;
import com.google.android.apps.wallet.api.UriIntents;
import com.google.android.apps.wallet.base.service.WalletContextParameter;
import com.google.android.apps.wallet.base.service.WalletIntentService;
import com.google.android.apps.wallet.config.featurecontrol.FeatureManager;
import com.google.android.apps.wallet.config.featurecontrol.FeatureSet;
import com.google.android.apps.wallet.config.sharedpreferences.SharedPreference;
import com.google.android.apps.wallet.geofencing.api.GeofencingNotificationServiceClient;
import com.google.android.apps.wallet.geofencing.api.GeofencingServiceDebugInfo;
import com.google.android.apps.wallet.logging.WLog;
import com.google.android.apps.wallet.notifications.NotificationService;
import com.google.android.apps.wallet.userevents.UserEventLogger;
import com.google.android.apps.wallet.util.barcode.BarcodeBitmapUtil;
import com.google.android.apps.wallet.util.barcode.BarcodeTypeConverter;
import com.google.android.apps.wallet.util.proto.Protos;
import com.google.android.libraries.imageurl.FifeImageUrlUtil;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import com.squareup.picasso.Picasso;
import com.squareup.picasso.RequestCreator;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;

public class GeofencingNotificationService extends WalletIntentService
{

    public static final String SERVICE_NAME = com/google/android/apps/wallet/geofencing/service/GeofencingNotificationService.getSimpleName();
    private static final String TAG = com/google/android/apps/wallet/geofencing/service/GeofencingNotificationService.getSimpleName();
    public FeatureManager featureManager;
    public FeatureSet featureSet;
    public GeofencingServiceDebugInfo geofencingServiceDebugInfo;
    public FifeImageUrlUtil imageUrlUtil;
    public NotificationManager notificationManager;
    public Picasso picasso;
    public SharedPreferences sharedPreferences;
    public UserEventLogger userEventLogger;

    public GeofencingNotificationService()
    {
        super(SERVICE_NAME, EnumSet.of(WalletContextParameter.RESTRICTIONS_SATISFIED, WalletContextParameter.SETUP_COMPLETE));
    }

    private void createAndPost(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, int i, boolean flag, boolean flag1, Uri uri, int j)
    {
        Object obj;
        com.google.wallet.proto.NanoWalletEntities.Barcode barcode;
        android.support.v4.app.NotificationCompat.Builder builder;
        String s;
        String s1;
        PendingIntent pendingintent;
        Bitmap bitmap;
        obj = geofencedmessage.localizedStrings;
        s = ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.LocalizedStrings) (obj)).title;
        s1 = ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.LocalizedStrings) (obj)).collapsedDescription;
        pendingintent = NotificationService.createOpenGeofencingNotificationIntent(this, geofencedmessage, PendingIntent.getActivity(this, 0, UriIntents.create(this, geofencedmessage.targetUri), 0x10000000));
        builder = (new android.support.v4.app.NotificationCompat.Builder(this)).setAutoCancel(true).setSmallIcon(com.google.android.apps.walletnfcrel.R.drawable.ic_wallet_logo_white_24dp).setContentIntent(pendingintent).setTicker(s).setContentTitle(s).setDeleteIntent(NotificationService.createDismissGeofencingNotificationIntent(this, geofencedmessage));
        if (s1 != null)
        {
            builder.setContentText(s1);
        }
        bitmap = downloadBitmap(geofencedmessage.logoUrl);
        if (bitmap != null)
        {
            builder.setLargeIcon(bitmap);
        }
        if (Protos.valueWithDefaultTrue(geofencedmessage.shouldBuzz) && flag)
        {
            SharedPreference.ALLOW_REMOVING_GEOFENCING_NOTIFICATION.put(sharedPreferences, Boolean.valueOf(false));
            if (flag1)
            {
                builder.setDefaults(2);
            }
            if (uri != null)
            {
                builder.setSound(uri);
            }
        }
        barcode = geofencedmessage.barcode;
        if (geofencedmessage.wobInstanceData.length > 0)
        {
            barcode = geofencedmessage.wobInstanceData[i].barcode;
        }
        obj = getDetailMessages(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.LocalizedStrings) (obj)).expandedDescriptionLines);
        if (geofencedmessage.wobInstanceData.length != 0 || ((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        geofencedmessage = new android.support.v4.app.NotificationCompat.InboxStyle();
        for (uri = ((List) (obj)).iterator(); uri.hasNext(); geofencedmessage.addLine((String)uri.next())) { }
        if (s1 != null)
        {
            geofencedmessage.setSummaryText(s1);
        }
        builder.setStyle(geofencedmessage);
_L4:
        uri = geofencingServiceDebugInfo;
        geofencedmessage = String.valueOf(s);
        Object obj1;
        Object obj2;
        Exception exception;
        RemoteViews remoteviews;
        Object obj3;
        Resources resources;
        int k;
        int l;
        int i1;
        if (geofencedmessage.length() != 0)
        {
            geofencedmessage = "Post notification message with title: ".concat(geofencedmessage);
        } else
        {
            geofencedmessage = new String("Post notification message with title: ");
        }
        uri.logMessage(geofencedmessage);
        builder.setColor(getResources().getColor(com.google.android.apps.walletnfcrel.R.color.primary));
        geofencedmessage = builder.build();
        notificationManager.notify(j, geofencedmessage);
        return;
_L2:
        if (!isValidBarcode(barcode) && geofencedmessage.wobInstanceData.length <= 0 || android.os.Build.VERSION.SDK_INT < 16) goto _L4; else goto _L3
_L3:
        resources = getResources();
        obj3 = null;
        remoteviews = null;
        flag1 = false;
        flag = false;
        obj2 = remoteviews;
        obj1 = obj3;
        if (!isValidBarcode(barcode))
        {
            break MISSING_BLOCK_LABEL_525;
        }
        flag = flag1;
        i1 = resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.notification_barcode_ideal_width);
        flag = flag1;
        l = resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.notification_barcode_max_height) - (resources.getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.notification_barcode_vertical_padding) << 1);
        flag = flag1;
        flag1 = BarcodeTypeConverter.convertToIrBarcodeType(barcode.type.intValue()).isSquare();
        k = i1;
        if (flag1)
        {
            k = i1;
            if (i1 > l)
            {
                k = l;
            }
        }
        flag = flag1;
        obj2 = BarcodeBitmapUtil.generateBitmap(barcode.value, barcode.type.intValue(), k, l);
        flag = flag1;
        obj1 = obj3;
_L5:
        if (obj2 != null || geofencedmessage.wobInstanceData.length > 0)
        {
            remoteviews = new RemoteViews(getPackageName(), com.google.android.apps.walletnfcrel.R.layout.notification_with_barcode);
            if (obj2 != null)
            {
                remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.NoBarcodeMsg, 8);
                remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.BarcodeBitmap, 0);
                remoteviews.setImageViewBitmap(com.google.android.apps.walletnfcrel.R.id.BarcodeBitmap, ((Bitmap) (obj2)));
                if (BarcodeTypeConverter.convertToIrBarcodeType(barcode.type.intValue()).isSquare() || barcode.value.length() > resources.getInteger(com.google.android.apps.walletnfcrel.R.integer.notification_barcode_max_chars))
                {
                    remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.BarcodeValue, 8);
                } else
                {
                    remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.BarcodeValue, 0);
                    remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.BarcodeValue, getBarcodeDisplayText(barcode));
                }
            } else
            {
                remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.BarcodeValue, 8);
                remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.BarcodeBitmap, 8);
                if (obj1 != null)
                {
                    remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.NoBarcodeMsg, 0);
                    remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.NoBarcodeMsg, ((CharSequence) (obj1)));
                } else
                if (barcode != null)
                {
                    remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.NoBarcodeMsg, 0);
                    remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.NoBarcodeMsg, getBarcodeDisplayText(barcode));
                } else
                {
                    remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.NoBarcodeMsg, 8);
                }
            }
            if (geofencedmessage.wobInstanceData.length > 0 && !flag)
            {
                obj1 = geofencedmessage.wobInstanceData[i];
                obj1 = Joiner.on("&nbsp;&nbsp;<font color='gray'>|</font>&nbsp;&nbsp;").join(((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.WobInstanceData) (obj1)).description);
                remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.WobDescription, Html.fromHtml(((String) (obj1))));
                remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.WobDescription, 0);
            } else
            {
                remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.WobDescription, 8);
            }
            if (geofencedmessage.wobInstanceData.length > 0)
            {
                setExpandedViewLogo(remoteviews, downloadWobInstanceLogo(geofencedmessage, i, bitmap));
            } else
            {
                setExpandedViewLogo(remoteviews, bitmap);
            }
            if (geofencedmessage.wobInstanceData.length > 0)
            {
                obj1 = geofencedmessage.wobInstanceData[i];
                remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.Title, ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.WobInstanceData) (obj1)).title);
                remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.Description, ((com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.WobInstanceData) (obj1)).merchant);
            } else
            {
                remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.Title, s);
                remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.Description, s1);
            }
            if (geofencedmessage.wobInstanceData.length > 0)
            {
                obj1 = NotificationService.createOpenGeofencingWobDetailIntent(this, geofencedmessage, PendingIntent.getActivity(this, 0, UriIntents.create(this, geofencedmessage.wobInstanceData[i].targetUri), 0x10000000));
                remoteviews.setOnClickPendingIntent(com.google.android.apps.walletnfcrel.R.id.NotificationExpandedView, ((PendingIntent) (obj1)));
            } else
            {
                remoteviews.setOnClickPendingIntent(com.google.android.apps.walletnfcrel.R.id.NotificationExpandedView, pendingintent);
            }
            l = com.google.android.apps.walletnfcrel.R.id.FooterSection;
            if (geofencedmessage.wobInstanceData.length > 1)
            {
                k = 0;
            } else
            {
                k = 8;
            }
            remoteviews.setViewVisibility(l, k);
            if (geofencedmessage.wobInstanceData.length > 1)
            {
                obj1 = PendingIntent.getService(this, 0, GeofencingNotificationServiceClient.createShowNextWobIntent(this, geofencedmessage, i, false, false, uri, j), 0x8000000);
                remoteviews.setOnClickPendingIntent(com.google.android.apps.walletnfcrel.R.id.NextButton, ((PendingIntent) (obj1)));
                uri = PendingIntent.getService(this, 0, GeofencingNotificationServiceClient.createShowPreviousWobIntent(this, geofencedmessage, i, false, false, uri, j), 0x8000000);
                remoteviews.setOnClickPendingIntent(com.google.android.apps.walletnfcrel.R.id.PrevButton, uri);
                remoteviews.setTextViewText(com.google.android.apps.walletnfcrel.R.id.NavigationProgress, getString(com.google.android.apps.walletnfcrel.R.string.one_view_notification_navigation_progress, new Object[] {
                    Integer.valueOf(i + 1), Integer.valueOf(geofencedmessage.wobInstanceData.length)
                }));
            }
            builder.setContentTitle(s);
            geofencedmessage = builder.build();
            geofencedmessage.bigContentView = remoteviews;
            notificationManager.notify(j, geofencedmessage);
            return;
        }
          goto _L4
        exception;
        if (featureSet == FeatureSet.DEVELOPMENT)
        {
            obj1 = exception.getLocalizedMessage();
        } else
        {
            obj1 = getString(com.google.android.apps.walletnfcrel.R.string.notification_barcode_error);
        }
        WLog.e(TAG, "Exception rendering barcode: ", exception);
        geofencingServiceDebugInfo.logMessage("Exception rendering barcode", exception);
        exception = remoteviews;
          goto _L5
    }

    private Bitmap downloadBitmap(String s)
    {
        if (s == null)
        {
            return null;
        }
        Object obj1 = null;
        Object obj = new com.google.android.libraries.imageurl.FifeImageUrlUtil.Options();
        ((com.google.android.libraries.imageurl.FifeImageUrlUtil.Options) (obj)).setSmartCrop(true, false);
        ((com.google.android.libraries.imageurl.FifeImageUrlUtil.Options) (obj)).setSize(getResources().getDimensionPixelSize(com.google.android.apps.walletnfcrel.R.dimen.notification_logo_size), false);
        try
        {
            obj = imageUrlUtil.mergeOptions(((com.google.android.libraries.imageurl.FifeImageUrlUtil.Options) (obj)), Uri.parse(s)).toString();
        }
        catch (com.google.android.libraries.imageurl.FifeImageUrlUtil.InvalidUrlException invalidurlexception)
        {
            geofencingServiceDebugInfo.logMessage("decorating logo url failed", invalidurlexception);
            invalidurlexception = s;
        }
        s = obj1;
        try
        {
            obj = picasso.load(((String) (obj))).get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            geofencingServiceDebugInfo.logMessage("Loading logoUrl failed", ((Throwable) (obj)));
            return s;
        }
        s = ((String) (obj));
        geofencingServiceDebugInfo.logMessage("loading logoUrl successful");
        return ((Bitmap) (obj));
    }

    private Bitmap downloadWobInstanceLogo(com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage, int i, Bitmap bitmap)
    {
label0:
        {
            Bitmap bitmap1 = null;
            if (geofencedmessage.wobInstanceData.length > 0)
            {
                if (!Objects.equal(geofencedmessage.logoUrl, geofencedmessage.wobInstanceData[i].logoUrl))
                {
                    break label0;
                }
                bitmap1 = bitmap;
            }
            return bitmap1;
        }
        return downloadBitmap(geofencedmessage.wobInstanceData[i].logoUrl);
    }

    private static String getBarcodeDisplayText(com.google.wallet.proto.NanoWalletEntities.Barcode barcode)
    {
        if (!TextUtils.isEmpty(barcode.text))
        {
            return barcode.text;
        } else
        {
            return barcode.value;
        }
    }

    private static List getDetailMessages(String as[])
    {
        java.util.ArrayList arraylist = Lists.newArrayList();
        if (as != null)
        {
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                if (!Strings.isNullOrEmpty(s))
                {
                    arraylist.add(s);
                }
                i++;
            }
        }
        return arraylist;
    }

    private static boolean isValidBarcode(com.google.wallet.proto.NanoWalletEntities.Barcode barcode)
    {
        return barcode != null && barcode.value != null && BarcodeTypeConverter.lookupByWalletEntitiesType(barcode.type.intValue()) != null;
    }

    private void setExpandedViewLogo(RemoteViews remoteviews, Bitmap bitmap)
    {
        if (bitmap != null)
        {
            remoteviews.setImageViewBitmap(com.google.android.apps.walletnfcrel.R.id.BigLogo, bitmap);
            remoteviews.setImageViewBitmap(com.google.android.apps.walletnfcrel.R.id.SmallLogo, BitmapFactory.decodeResource(getResources(), com.google.android.apps.walletnfcrel.R.drawable.ic_wallet_logo_white_24dp));
            remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.SmallLogoFrame, 0);
            return;
        } else
        {
            remoteviews.setImageViewBitmap(com.google.android.apps.walletnfcrel.R.id.BigLogo, BitmapFactory.decodeResource(getResources(), com.google.android.apps.walletnfcrel.R.drawable.img_logo_wallet_color_88dp));
            remoteviews.setViewVisibility(com.google.android.apps.walletnfcrel.R.id.SmallLogoFrame, 8);
            return;
        }
    }

    public final void doOnHandleIntent(Intent intent)
    {
        if (intent == null)
        {
            return;
        }
        com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage geofencedmessage = new com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage();
        int i = intent.getIntExtra("wob_instance_number", 0);
        boolean flag = intent.getBooleanExtra("should_vibrate", false);
        boolean flag1 = intent.getBooleanExtra("can_buzz", false);
        Object obj = intent.getStringExtra("ringtone_uri");
        int j;
        if (obj != null)
        {
            obj = Uri.parse(((String) (obj)));
        } else
        {
            obj = null;
        }
        j = intent.getIntExtra("notification_id", 0);
        try
        {
            com.google.wallet.proto.api.NanoWalletLocation.GeofencedMessage.mergeFrom(geofencedmessage, intent.getByteArrayExtra("geofenced_message"));
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            return;
        }
        createAndPost(geofencedmessage, i, flag1, flag, ((Uri) (obj)), j);
    }

}
