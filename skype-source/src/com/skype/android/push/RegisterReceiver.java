// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.concurrent.AsyncService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.push:
//            PushRetryScheduler, PushManager

public class RegisterReceiver extends SkypeBroadcastReceiver
{

    public static final String ACTION_REGISTER = "com.skype.android.push.REGISTER";
    private static final Logger log = Logger.getLogger("RegisterReceiver");
    AsyncService asyncService;
    PushManager pushManager;
    private AtomicBoolean registering;
    private android.os.PowerManager.WakeLock wakeLock;

    public RegisterReceiver()
    {
        registering = new AtomicBoolean(false);
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        String s = intent.getAction();
        if ("com.skype.android.push.REGISTER".equalsIgnoreCase(s) || "android.intent.action.BOOT_COMPLETED".equals(s) || "android.intent.action.MY_PACKAGE_REPLACED".equals(s))
        {
            long l = intent.getLongExtra("backoff", 0L);
            if (l > 0L)
            {
                PushRetryScheduler.setBackOff(l);
            } else
            {
                PushRetryScheduler.setBackOff(PushRetryScheduler.INITIAL_RETRY_TIME);
            }
            if (!registering.get())
            {
                registering.set(true);
                wakeLock = ((PowerManager)context.getSystemService("power")).newWakeLock(1, com/skype/android/push/PushManager.getName());
                wakeLock.acquire();
                asyncService.a(new Runnable() {

                    final RegisterReceiver this$0;

                    public final void run()
                    {
                        if (pushManager.isAnyServiceSupported())
                        {
                            pushManager.register();
                            PushRetryScheduler.setBackOff(PushRetryScheduler.INITIAL_RETRY_TIME);
                        }
                        registering.set(false);
                        wakeLock.release();
                        return;
                        Object obj;
                        obj;
                        RegisterReceiver.log.log(Level.INFO, "Can't register to push", ((Throwable) (obj)));
                        registering.set(false);
                        wakeLock.release();
                        return;
                        obj;
                        registering.set(false);
                        wakeLock.release();
                        throw obj;
                    }

            
            {
                this$0 = RegisterReceiver.this;
                super();
            }
                });
            }
        }
    }




}
