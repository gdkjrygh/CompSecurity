// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.mm.android.library.utils;

import android.content.Context;
import android.os.AsyncTask;
import android.util.Log;
import com.digby.mm.android.library.controller.IDigbyController;
import com.digby.mm.android.library.controller.impl.DigbyController;
import com.digby.mm.android.library.events.impl.DeviceRegistrationEvent;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.gcm.GoogleCloudMessaging;
import java.util.Random;

// Referenced classes of package com.digby.mm.android.library.utils:
//            Logger

public class GCMUtil
{

    private static final int BACKOFF_MILLI_SECONDS = 2000;
    private static final int MAX_ATTEMPTS = 5;
    public static final long REGISTRATION_EXPIRY_TIME_MS = 0x240c8400L;
    private static final String TAG = "GCMUtil";
    private static GoogleCloudMessaging gcm;
    private static final Random random = new Random();

    public GCMUtil()
    {
    }

    public static boolean checkPlayServices(Context context)
    {
        int i = GooglePlayServicesUtil.isGooglePlayServicesAvailable(context);
        if (i != 0)
        {
            if (GooglePlayServicesUtil.isUserRecoverableError(i))
            {
                Log.i("GCMUtil", "Change configuration to enable GCM.");
            } else
            {
                Log.i("GCMUtil", "This device is not supported.");
            }
            return false;
        } else
        {
            return true;
        }
    }

    public static void register(Context context, String s)
    {
        registerBackground(context, s);
    }

    private static void registerBackground(Context context, String s)
    {
        (new AsyncTask(context) {

            final Context val$context;

            protected transient Boolean doInBackground(String as[])
            {
                int i;
                long l;
                as = as[0];
                l = GCMUtil.random.nextInt(1000) + 2000;
                i = 1;
_L2:
                if (i > 5)
                {
                    break MISSING_BLOCK_LABEL_113;
                }
                Log.d("GCMUtil", (new StringBuilder()).append("Attempt #").append(i).append(" to register with senderId =").append(as).toString());
                Object obj;
                if (GCMUtil.gcm == null)
                {
                    GCMUtil.gcm = GoogleCloudMessaging.getInstance(context);
                }
                obj = GCMUtil.gcm.register(new String[] {
                    as
                });
                GCMUtil.sendDeviceRegistrationEvent(context, ((String) (obj)));
                obj = Boolean.TRUE;
                return ((Boolean) (obj));
                Exception exception;
                exception;
                if (i != 5)
                {
                    break MISSING_BLOCK_LABEL_117;
                }
                return Boolean.FALSE;
                try
                {
                    Thread.sleep(l);
                }
                catch (InterruptedException interruptedexception)
                {
                    Thread.currentThread().interrupt();
                }
                l *= 2L;
                i++;
                if (true) goto _L2; else goto _L1
_L1:
            }

            protected volatile Object doInBackground(Object aobj[])
            {
                return doInBackground((String[])aobj);
            }

            
            {
                context = context1;
                super();
            }
        }).execute(new String[] {
            s, null, null
        });
    }

    private static void sendDeviceRegistrationEvent(Context context, String s)
    {
        try
        {
            DigbyController.getInstance(context).sendEvent(new DeviceRegistrationEvent(context.getApplicationContext(), s), null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.Error("sendDeviceRegistrationEvent", context);
        }
    }





/*
    static GoogleCloudMessaging access$102(GoogleCloudMessaging googlecloudmessaging)
    {
        gcm = googlecloudmessaging;
        return googlecloudmessaging;
    }

*/

}
