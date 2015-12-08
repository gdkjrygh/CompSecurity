// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.d;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.i.h;
import com.bumptech.glide.p;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.d:
//            q, b, h, l

public final class n
    implements android.os.Handler.Callback
{

    private static final n c = new n();
    final Map a = new HashMap();
    final Map b = new HashMap();
    private volatile p d;
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    n()
    {
    }

    public static n a()
    {
        return c;
    }

    private p a(Context context, android.support.v4.app.FragmentManager fragmentmanager)
    {
        q q1 = a(fragmentmanager);
        p p1 = q1.b();
        fragmentmanager = p1;
        if (p1 == null)
        {
            fragmentmanager = new p(context, q1.a(), q1.c());
            q1.a(fragmentmanager);
        }
        return fragmentmanager;
    }

    private p b(Context context)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new p(context.getApplicationContext(), new b(), new com.bumptech.glide.d.h());
        }
        this;
        JVM INSTR monitorexit ;
_L2:
        return d;
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

    final l a(FragmentManager fragmentmanager)
    {
        l l2 = (l)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
        l l1 = l2;
        if (l2 == null)
        {
            l l3 = (l)a.get(fragmentmanager);
            l1 = l3;
            if (l3 == null)
            {
                l1 = new l();
                a.put(fragmentmanager, l1);
                fragmentmanager.beginTransaction().add(l1, "com.bumptech.glide.manager").commitAllowingStateLoss();
                e.obtainMessage(1, fragmentmanager).sendToTarget();
            }
        }
        return l1;
    }

    final q a(android.support.v4.app.FragmentManager fragmentmanager)
    {
        q q2 = (q)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
        q q1 = q2;
        if (q2 == null)
        {
            q q3 = (q)b.get(fragmentmanager);
            q1 = q3;
            if (q3 == null)
            {
                q1 = new q();
                b.put(fragmentmanager, q1);
                fragmentmanager.beginTransaction().add(q1, "com.bumptech.glide.manager").commitAllowingStateLoss();
                e.obtainMessage(2, fragmentmanager).sendToTarget();
            }
        }
        return q1;
    }

    public final p a(Activity activity)
    {
        p p1;
        if (h.c() || android.os.Build.VERSION.SDK_INT < 11)
        {
            p1 = a(activity.getApplicationContext());
        } else
        {
            b(activity);
            l l1 = a(activity.getFragmentManager());
            p p2 = l1.b();
            p1 = p2;
            if (p2 == null)
            {
                activity = new p(activity, l1.a(), l1.c());
                l1.a(activity);
                return activity;
            }
        }
        return p1;
    }

    public final p a(Context context)
    {
        do
        {
            if (context == null)
            {
                throw new IllegalArgumentException("You cannot start a load on a null Context");
            }
            if (!h.b() || (context instanceof Application))
            {
                break;
            }
            if (context instanceof FragmentActivity)
            {
                return a((FragmentActivity)context);
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

    public final p a(Fragment fragment)
    {
        if (fragment.getActivity() == null)
        {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (h.c())
        {
            return a(fragment.getActivity().getApplicationContext());
        } else
        {
            android.support.v4.app.FragmentManager fragmentmanager = fragment.getChildFragmentManager();
            return a(((Context) (fragment.getActivity())), fragmentmanager);
        }
    }

    public final p a(FragmentActivity fragmentactivity)
    {
        if (h.c())
        {
            return a(fragmentactivity.getApplicationContext());
        } else
        {
            b(fragmentactivity);
            return a(((Context) (fragmentactivity)), fragmentactivity.getSupportFragmentManager());
        }
    }

    public final boolean handleMessage(Message message)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = true;
        message.what;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 82
    //                   2 104;
           goto _L1 _L2 _L3
_L1:
        Object obj;
        flag = false;
        obj = null;
        message = obj1;
_L5:
        if (flag && obj == null && Log.isLoggable("RMRetriever", 5))
        {
            Log.w("RMRetriever", (new StringBuilder("Failed to remove expected request manager fragment, manager: ")).append(message).toString());
        }
        return flag;
_L2:
        message = (FragmentManager)message.obj;
        obj = a.remove(message);
        continue; /* Loop/switch isn't completed */
_L3:
        message = (android.support.v4.app.FragmentManager)message.obj;
        obj = b.remove(message);
        if (true) goto _L5; else goto _L4
_L4:
    }

}
