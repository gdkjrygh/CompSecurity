// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.app.Application;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

public final class axw
    implements android.os.Handler.Callback
{

    private static final axw a = new axw();
    private volatile amh b;
    private Map c;
    private Map d;
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    axw()
    {
        c = new HashMap();
        d = new HashMap();
    }

    public static axw a()
    {
        return a;
    }

    private amh b(Context context)
    {
        if (b != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (b == null)
        {
            b = new amh(context.getApplicationContext(), new axl(), new axq());
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return b;
        context;
        this;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static void b(Activity activity)
    {
        if (android.os.Build.VERSION.SDK_INT >= 17 && activity.isDestroyed())
        {
            throw new IllegalArgumentException("You cannot start a load for a destroyed activity");
        } else
        {
            return;
        }
    }

    public final amh a(Activity activity)
    {
        amh amh1;
        if (bag.d() || android.os.Build.VERSION.SDK_INT < 11)
        {
            amh1 = a(activity.getApplicationContext());
        } else
        {
            b(activity);
            axu axu1 = a(activity.getFragmentManager(), ((Fragment) (null)));
            amh amh2 = axu1.c;
            amh1 = amh2;
            if (amh2 == null)
            {
                activity = new amh(activity, axu1.a, axu1.b);
                axu1.c = activity;
                return activity;
            }
        }
        return amh1;
    }

    public final amh a(Context context)
    {
        do
        {
            if (context == null)
            {
                throw new IllegalArgumentException("You cannot start a load on a null Context");
            }
            if (!bag.c() || (context instanceof Application))
            {
                break;
            }
            if (context instanceof ar)
            {
                return a((ar)context);
            }
            if (context instanceof Activity)
            {
                return a((Activity)context);
            }
            if (!(context instanceof ContextWrapper))
            {
                break;
            }
            context = ((ContextWrapper)context).getBaseContext();
        } while (true);
        return b(context);
    }

    public final amh a(Context context, ay ay1, am am1)
    {
        axz axz1 = a(ay1, am1);
        am1 = axz1.c;
        ay1 = am1;
        if (am1 == null)
        {
            ay1 = new amh(context, axz1.a, axz1.b);
            axz1.c = ay1;
        }
        return ay1;
    }

    public final amh a(ar ar1)
    {
        if (bag.d())
        {
            return a(ar1.getApplicationContext());
        } else
        {
            b(ar1);
            return a(((Context) (ar1)), ar1.c(), null);
        }
    }

    final axu a(FragmentManager fragmentmanager, Fragment fragment)
    {
        axu axu2 = (axu)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
        axu axu1 = axu2;
        if (axu2 == null)
        {
            axu axu3 = (axu)c.get(fragmentmanager);
            axu1 = axu3;
            if (axu3 == null)
            {
                axu1 = new axu();
                axu1.d = fragment;
                if (fragment != null && fragment.getActivity() != null)
                {
                    axu1.a(fragment.getActivity());
                }
                c.put(fragmentmanager, axu1);
                fragmentmanager.beginTransaction().add(axu1, "com.bumptech.glide.manager").commitAllowingStateLoss();
                e.obtainMessage(1, fragmentmanager).sendToTarget();
            }
        }
        return axu1;
    }

    final axz a(ay ay1, am am1)
    {
        axz axz2 = (axz)ay1.a("com.bumptech.glide.manager");
        axz axz1 = axz2;
        if (axz2 == null)
        {
            axz axz3 = (axz)d.get(ay1);
            axz1 = axz3;
            if (axz3 == null)
            {
                axz1 = new axz();
                axz1.d = am1;
                if (am1 != null && am1.O_() != null)
                {
                    axz1.a(am1.O_());
                }
                d.put(ay1, axz1);
                ay1.a().a(axz1, "com.bumptech.glide.manager").c();
                e.obtainMessage(2, ay1).sendToTarget();
            }
        }
        return axz1;
    }

    public final boolean handleMessage(Message message)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = true;
        message.what;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 101
    //                   2 123;
           goto _L1 _L2 _L3
_L1:
        Object obj;
        flag = false;
        obj = null;
        message = obj1;
_L5:
        if (flag && obj == null && Log.isLoggable("RMRetriever", 5))
        {
            message = String.valueOf(message);
            Log.w("RMRetriever", (new StringBuilder(String.valueOf(message).length() + 61)).append("Failed to remove expected request manager fragment, manager: ").append(message).toString());
        }
        return flag;
_L2:
        message = (FragmentManager)message.obj;
        obj = c.remove(message);
        continue; /* Loop/switch isn't completed */
_L3:
        message = (ay)message.obj;
        obj = d.remove(message);
        if (true) goto _L5; else goto _L4
_L4:
    }

}
