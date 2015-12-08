// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.location.api;

import android.app.Application;
import android.content.ActivityNotFoundException;
import android.content.ContentResolver;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import com.google.android.apps.wallet.eventbus.EventBus;
import com.google.android.apps.wallet.eventbus.InitializedEventPublisher;
import com.google.android.apps.wallet.eventbus.RegistrationCallback;
import com.google.android.apps.wallet.logging.WLog;
import com.google.common.base.Optional;

public class GoogleLocationSettingHelper
    implements InitializedEventPublisher
{
    public static class GoogleLocationSetting
    {

        private final int setting;

        public final int getSetting()
        {
            return setting;
        }

        private GoogleLocationSetting(int i)
        {
            setting = i;
        }

    }


    static final Uri GOOGLE_SETTINGS_CONTENT_URI = Uri.parse("content://com.google.settings/partner");
    static final String QUERY_PROJECTION[] = {
        "value"
    };
    static final String QUERY_SELECTION_ARGS[] = {
        "use_location_for_services"
    };
    private static final String TAG = com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper.getSimpleName();
    private final String accountName;
    private final Application application;
    private final EventBus eventBus;
    private Optional lastSetting;
    private final Handler uiThreadHandler;

    GoogleLocationSettingHelper(Application application1, String s, Handler handler, EventBus eventbus)
    {
        lastSetting = Optional.absent();
        application = application1;
        accountName = s;
        eventBus = eventbus;
        uiThreadHandler = handler;
    }

    private void fetchAndPostLocation()
    {
        int i = getUseLocationForServices();
        if (!lastSetting.isPresent() || ((GoogleLocationSetting)lastSetting.get()).getSetting() != i)
        {
            lastSetting = Optional.of(new GoogleLocationSetting(i));
            eventBus.post(lastSetting.get());
        }
    }

    private static Intent getGoogleLocationSettingsIntent()
    {
        return new Intent("com.google.android.gsf.GOOGLE_LOCATION_SETTINGS");
    }

    private void handleRegistrationEventId(Object obj)
    {
        if (lastSetting.isPresent())
        {
            eventBus.post(obj, lastSetting.get());
            return;
        } else
        {
            fetchAndPostLocation();
            return;
        }
    }

    public final int getUseLocationForServices()
    {
        Cursor cursor;
        Object obj;
        Object obj1;
        Object obj2;
        Object obj3;
        obj1 = application.getContentResolver();
        obj = null;
        cursor = null;
        obj2 = null;
        obj3 = null;
        Cursor cursor1 = ((ContentResolver) (obj1)).query(GOOGLE_SETTINGS_CONTENT_URI, QUERY_PROJECTION, "name=?", QUERY_SELECTION_ARGS, null);
        obj1 = obj3;
        if (cursor1 == null)
        {
            break MISSING_BLOCK_LABEL_78;
        }
        obj1 = obj3;
        cursor = cursor1;
        obj = cursor1;
        if (!cursor1.moveToNext())
        {
            break MISSING_BLOCK_LABEL_78;
        }
        cursor = cursor1;
        obj = cursor1;
        obj1 = cursor1.getString(0);
        obj = obj1;
        if (cursor1 != null)
        {
            cursor1.close();
            obj = obj1;
        }
_L2:
        if (obj == null)
        {
            return 2;
        }
        break; /* Loop/switch isn't completed */
        RuntimeException runtimeexception;
        runtimeexception;
        obj = cursor;
        WLog.w(TAG, "Failed to get 'Use My Location' setting", runtimeexception);
        obj = obj2;
        if (cursor != null)
        {
            cursor.close();
            obj = obj2;
        }
        if (true) goto _L2; else goto _L1
        Exception exception;
        exception;
        if (obj != null)
        {
            ((Cursor) (obj)).close();
        }
        throw exception;
_L1:
        int i;
        try
        {
            i = Integer.parseInt(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            return 2;
        }
        return i;
    }

    public final void initialize()
    {
        eventBus.registerEventProducer(com/google/android/apps/wallet/location/api/GoogleLocationSettingHelper$GoogleLocationSetting, new RegistrationCallback() {

            final GoogleLocationSettingHelper this$0;

            public final void handleRegistration(Object obj)
            {
                handleRegistrationEventId(obj);
            }

            
            {
                this$0 = GoogleLocationSettingHelper.this;
                super();
            }
        });
        application.getContentResolver().registerContentObserver(GOOGLE_SETTINGS_CONTENT_URI, true, new ContentObserver(uiThreadHandler) {

            final GoogleLocationSettingHelper this$0;

            public final boolean deliverSelfNotifications()
            {
                return false;
            }

            public final void onChange(boolean flag)
            {
                fetchAndPostLocation();
            }

            
            {
                this$0 = GoogleLocationSettingHelper.this;
                super(handler);
            }
        });
    }

    public final boolean isAvailable()
    {
        return application.getPackageManager().resolveActivity(getGoogleLocationSettingsIntent(), 0x10000) != null;
    }

    public final void launchGoogleLocationSettingIntent()
    {
        Intent intent = getGoogleLocationSettingsIntent();
        intent.setFlags(0x10000000);
        intent.putExtra("account", accountName);
        try
        {
            application.startActivity(intent);
            return;
        }
        catch (ActivityNotFoundException activitynotfoundexception)
        {
            WLog.e("GoogleLocationSettingHelper", "Problem while starting GSF location activity");
        }
    }



}
