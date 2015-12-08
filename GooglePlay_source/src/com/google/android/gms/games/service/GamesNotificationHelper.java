// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.RemoteException;
import com.android.common.SharedPreferencesCompat;
import com.google.android.gms.common.BlockingServiceConnection;
import com.google.android.gms.common.data.BitmapTeleporter;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.images.ImageBroker;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.GamesSharedPrefs;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.internal.notification.GameNotification;
import com.google.android.gms.games.internal.notification.GameNotificationBuffer;
import com.google.android.gms.games.util.PanoUtils;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.games.service:
//            IPlayGamesBridgeService

public final class GamesNotificationHelper
{

    public static IPlayGamesBridgeService getBridgeService(Context context, BlockingServiceConnection blockingserviceconnection)
    {
        Intent intent = new Intent("com.google.android.gms.games.service.GAMES_BRIDGE");
        intent.setPackage("com.google.android.play.games");
        if (!ConnectionTracker.getInstance().bindService(context, intent, blockingserviceconnection, 1))
        {
            GamesLog.w("GamesNotificationHelper", "Failed to bind to BridgeService");
            return null;
        }
        try
        {
            context = IPlayGamesBridgeService.Stub.asInterface(blockingserviceconnection.getService());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("GamesNotificationHelper", "Cannot get BridgeService instance", context);
            return null;
        }
        return context;
    }

    public static BitmapTeleporter getIconTeleporter(Context context, String s, DataHolder dataholder)
    {
        Iterator iterator;
        dataholder = new GameNotificationBuffer(dataholder);
        if (!PanoUtils.isPano(context))
        {
            break MISSING_BLOCK_LABEL_70;
        }
        iterator = dataholder.iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        dataholder = com.google.android.gms.games.provider.GamesContractInternal.Games.getFeaturedImageUri(s, ((GameNotification)iterator.next()).getApplicationId());
        if (dataholder == null) goto _L4; else goto _L3
_L3:
        s = loadNotificationImage(context, dataholder);
        Uri uri;
        GameNotification gamenotification;
        if (s == null)
        {
            return null;
        } else
        {
            s = new BitmapTeleporter(s);
            s.setTempDir(context.getCacheDir());
            return s;
        }
_L2:
        dataholder = null;
          goto _L3
        gamenotification = dataholder.get(0);
        uri = gamenotification.getImageUri();
        dataholder = uri;
        if (uri == null)
        {
            dataholder = com.google.android.gms.games.provider.GamesContractInternal.Games.getIconImageUri(s, gamenotification.getApplicationId());
        }
          goto _L3
    }

    private static Bitmap loadNotificationImage(Context context, Uri uri)
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = obj2;
        if (uri == null) goto _L2; else goto _L1
_L1:
        AssetFileDescriptor assetfiledescriptor;
        assetfiledescriptor = ImageBroker.acquireBroker$3d64b9a2(context).loadImageFile(context, uri);
        obj = obj2;
        if (assetfiledescriptor == null) goto _L2; else goto _L3
_L3:
        obj = BitmapFactory.decodeStream(assetfiledescriptor.createInputStream());
        uri = ((Uri) (obj));
_L5:
        obj = uri;
        if (PlatformVersion.checkVersion(11))
        {
            obj = uri;
            if (!PanoUtils.isPano(context))
            {
                context = context.getResources();
                int i = (int)context.getDimension(0x1050006);
                obj = Bitmap.createScaledBitmap(uri, (int)context.getDimension(0x1050005), i, true);
            }
        }
_L2:
        return ((Bitmap) (obj));
        IOException ioexception;
        ioexception;
        GamesLog.e("GamesNotificationHelper", (new StringBuilder("Unable to parse image content for icon URI ")).append(uri).toString());
        uri = obj1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void logDisplayedNotificationAction(Context context, String s, String s1, int i)
    {
        BlockingServiceConnection blockingserviceconnection;
        IPlayGamesBridgeService iplaygamesbridgeservice;
        blockingserviceconnection = new BlockingServiceConnection();
        iplaygamesbridgeservice = getBridgeService(context, blockingserviceconnection);
        if (iplaygamesbridgeservice == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        iplaygamesbridgeservice.logDisplayedNotificationAction(s, s1, i);
        silentUnbind(context, blockingserviceconnection);
        return;
        s;
        GamesLog.e("GamesNotificationHelper", "Remote exception from bridge service", s);
        silentUnbind(context, blockingserviceconnection);
        return;
        s;
        silentUnbind(context, blockingserviceconnection);
        throw s;
    }

    public static void setUseNewPlayerNotifications(Context context, boolean flag)
    {
        context = GamesSharedPrefs.getSharedPrefs(context).edit();
        context.putBoolean("useNewPlayerNotifications", flag);
        SharedPreferencesCompat.apply(context);
    }

    public static boolean shouldAllowLevelUpNotifications(Context context)
    {
        return GamesSharedPrefs.getSharedPrefs(context).getBoolean("allowLevelUpNotifications", true);
    }

    public static boolean shouldUseNewPlayerNotifications(Context context)
    {
        if (PanoUtils.isPano(context))
        {
            return false;
        } else
        {
            return GamesSharedPrefs.getSharedPrefs(context).getBoolean("useNewPlayerNotifications", true);
        }
    }

    public static void silentUnbind(Context context, BlockingServiceConnection blockingserviceconnection)
    {
        try
        {
            ConnectionTracker.getInstance().unbindService(context, blockingserviceconnection);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.w("GamesNotificationHelper", "Failed to unbind from service", context);
        }
    }

    public static void updateNotifications(Context context, String s, String s1, String s2, DataHolder dataholder)
    {
        BitmapTeleporter bitmapteleporter;
        BlockingServiceConnection blockingserviceconnection;
        IPlayGamesBridgeService iplaygamesbridgeservice;
        boolean flag;
        flag = shouldUseNewPlayerNotifications(context);
        blockingserviceconnection = null;
        bitmapteleporter = blockingserviceconnection;
        if (!flag)
        {
            bitmapteleporter = blockingserviceconnection;
            if (dataholder.mRowCount > 0)
            {
                bitmapteleporter = getIconTeleporter(context, s, dataholder);
            }
        }
        blockingserviceconnection = new BlockingServiceConnection();
        iplaygamesbridgeservice = getBridgeService(context, blockingserviceconnection);
        if (iplaygamesbridgeservice == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        iplaygamesbridgeservice.updateNotifications(s, s1, s2, flag, dataholder, bitmapteleporter);
        silentUnbind(context, blockingserviceconnection);
        return;
        s;
        GamesLog.e("GamesNotificationHelper", "Remote exception from bridge service", s);
        silentUnbind(context, blockingserviceconnection);
        return;
        s;
        silentUnbind(context, blockingserviceconnection);
        throw s;
    }
}
