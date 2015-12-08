// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.measurement;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.measurement.internal.ab;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ad;
import com.google.android.gms.measurement.internal.h;
import com.google.android.gms.measurement.internal.j;
import com.google.android.gms.measurement.internal.w;

// Referenced classes of package com.google.android.gms.measurement:
//            AppMeasurementReceiver

public final class AppMeasurementService extends Service
{

    private static Boolean b;
    private final Handler a = new Handler();

    public AppMeasurementService()
    {
    }

    static Handler a(AppMeasurementService appmeasurementservice)
    {
        return appmeasurementservice.a;
    }

    public static boolean a(Context context)
    {
        u.a(context);
        if (b != null)
        {
            return b.booleanValue();
        } else
        {
            boolean flag = h.b(context, com/google/android/gms/measurement/AppMeasurementService);
            b = Boolean.valueOf(flag);
            return flag;
        }
    }

    public final IBinder onBind(Intent intent)
    {
        if (intent == null)
        {
            ac.a(this).e().a.a("onBind called with null intent");
            return null;
        }
        intent = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(intent))
        {
            return new ad(ac.a(this));
        } else
        {
            ac.a(this).e().b.a("onBind received unknown action", intent);
            return null;
        }
    }

    public final void onCreate()
    {
        super.onCreate();
        w w1 = ac.a(this).e();
        if (j.z())
        {
            w1.g.a("Device AppMeasurementService is starting up");
            return;
        } else
        {
            w1.g.a("Local AppMeasurementService is starting up");
            return;
        }
    }

    public final void onDestroy()
    {
        w w1 = ac.a(this).e();
        if (j.z())
        {
            w1.g.a("Device AppMeasurementService is shutting down");
        } else
        {
            w1.g.a("Local AppMeasurementService is shutting down");
        }
        super.onDestroy();
    }

    public final void onRebind(Intent intent)
    {
        if (intent == null)
        {
            ac.a(this).e().a.a("onRebind called with null intent");
            return;
        } else
        {
            intent = intent.getAction();
            ac.a(this).e().g.a("onRebind called. action", intent);
            return;
        }
    }

    public final int onStartCommand(Intent intent, int i, int k)
    {
        Object obj = AppMeasurementReceiver.a;
        obj;
        JVM INSTR monitorenter ;
        android.os.PowerManager.WakeLock wakelock = AppMeasurementReceiver.b;
        if (wakelock == null)
        {
            break MISSING_BLOCK_LABEL_31;
        }
        if (wakelock.isHeld())
        {
            wakelock.release();
        }
        obj;
        JVM INSTR monitorexit ;
_L1:
        obj = ac.a(this);
        Object obj1 = ((ac) (obj)).e();
        intent = intent.getAction();
        SecurityException securityexception;
        if (j.z())
        {
            ((w) (obj1)).g.a("Device AppMeasurementService called. startId, action", Integer.valueOf(k), intent);
        } else
        {
            ((w) (obj1)).g.a("Local AppMeasurementService called. startId, action", Integer.valueOf(k), intent);
        }
        if ("com.google.android.gms.measurement.UPLOAD".equals(intent))
        {
            ((ac) (obj)).f().a(new Runnable(((ac) (obj)), k, ((w) (obj1))) {

                final ac a;
                final int b;
                final w c;
                final AppMeasurementService d;

                public final void run()
                {
                    a.k();
                    AppMeasurementService.a(d).post(new Runnable(this) {

                        final _cls1 a;

                        public final void run()
                        {
label0:
                            {
                                if (a.d.stopSelfResult(a.b))
                                {
                                    if (!j.z())
                                    {
                                        break label0;
                                    }
                                    a.c.g.a("Device AppMeasurementService processed last upload request");
                                }
                                return;
                            }
                            a.c.g.a("Local AppMeasurementService processed last upload request");
                        }

            
            {
                a = _pcls1;
                super();
            }
                    });
                }

            
            {
                d = AppMeasurementService.this;
                a = ac1;
                b = i;
                c = w1;
                super();
            }
            });
        }
        return 2;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        try
        {
            throw obj1;
        }
        // Misplaced declaration of an exception variable
        catch (SecurityException securityexception) { }
          goto _L1
    }

    public final boolean onUnbind(Intent intent)
    {
        if (intent == null)
        {
            ac.a(this).e().a.a("onUnbind called with null intent");
            return true;
        } else
        {
            intent = intent.getAction();
            ac.a(this).e().g.a("onUnbind called for intent. action", intent);
            return true;
        }
    }
}
