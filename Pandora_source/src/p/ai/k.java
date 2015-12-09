// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ai;

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
import android.support.v4.app.h;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import p.l.j;

// Referenced classes of package p.ai:
//            b, f, j, n

public class k
    implements android.os.Handler.Callback
{

    private static final k c = new k();
    final Map a = new HashMap();
    final Map b = new HashMap();
    private volatile j d;
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    k()
    {
    }

    public static k a()
    {
        return c;
    }

    private j b(Context context)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new j(context.getApplicationContext(), new b(), new f());
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

    p.ai.j a(FragmentManager fragmentmanager)
    {
        p.ai.j j2 = (p.ai.j)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
        p.ai.j j1 = j2;
        if (j2 == null)
        {
            p.ai.j j3 = (p.ai.j)a.get(fragmentmanager);
            j1 = j3;
            if (j3 == null)
            {
                j1 = new p.ai.j();
                a.put(fragmentmanager, j1);
                fragmentmanager.beginTransaction().add(j1, "com.bumptech.glide.manager").commitAllowingStateLoss();
                e.obtainMessage(1, fragmentmanager).sendToTarget();
            }
        }
        return j1;
    }

    n a(h h1)
    {
        n n2 = (n)h1.a("com.bumptech.glide.manager");
        n n1 = n2;
        if (n2 == null)
        {
            n n3 = (n)b.get(h1);
            n1 = n3;
            if (n3 == null)
            {
                n1 = new n();
                b.put(h1, n1);
                h1.a().a(n1, "com.bumptech.glide.manager").c();
                e.obtainMessage(2, h1).sendToTarget();
            }
        }
        return n1;
    }

    public j a(Activity activity)
    {
        if (p.ap.h.d() || android.os.Build.VERSION.SDK_INT < 11)
        {
            return a(activity.getApplicationContext());
        } else
        {
            b(activity);
            return a(((Context) (activity)), activity.getFragmentManager());
        }
    }

    public j a(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (p.ap.h.c() && !(context instanceof Application))
        {
            if (context instanceof FragmentActivity)
            {
                return a((FragmentActivity)context);
            }
            if (context instanceof Activity)
            {
                return a((Activity)context);
            }
            if (context instanceof ContextWrapper)
            {
                return a(((ContextWrapper)context).getBaseContext());
            }
        }
        return b(context);
    }

    j a(Context context, FragmentManager fragmentmanager)
    {
        p.ai.j j2 = a(fragmentmanager);
        j j1 = j2.b();
        fragmentmanager = j1;
        if (j1 == null)
        {
            fragmentmanager = new j(context, j2.a(), j2.c());
            j2.a(fragmentmanager);
        }
        return fragmentmanager;
    }

    j a(Context context, h h1)
    {
        n n1 = a(h1);
        j j1 = n1.b();
        h1 = j1;
        if (j1 == null)
        {
            h1 = new j(context, n1.a(), n1.c());
            n1.a(h1);
        }
        return h1;
    }

    public j a(Fragment fragment)
    {
        if (fragment.getActivity() == null)
        {
            throw new IllegalArgumentException("You cannot start a load on a fragment before it is attached");
        }
        if (p.ap.h.d())
        {
            return a(fragment.getActivity().getApplicationContext());
        } else
        {
            h h1 = fragment.getChildFragmentManager();
            return a(((Context) (fragment.getActivity())), h1);
        }
    }

    public j a(FragmentActivity fragmentactivity)
    {
        if (p.ap.h.d())
        {
            return a(fragmentactivity.getApplicationContext());
        } else
        {
            b(fragmentactivity);
            return a(((Context) (fragmentactivity)), fragmentactivity.f());
        }
    }

    public boolean handleMessage(Message message)
    {
        Object obj1;
        boolean flag;
        obj1 = null;
        flag = true;
        message.what;
        JVM INSTR tableswitch 1 2: default 32
    //                   1 85
    //                   2 107;
           goto _L1 _L2 _L3
_L1:
        Object obj;
        flag = false;
        obj = null;
        message = obj1;
_L5:
        if (flag && obj == null && Log.isLoggable("RMRetriever", 5))
        {
            Log.w("RMRetriever", (new StringBuilder()).append("Failed to remove expected request manager fragment, manager: ").append(message).toString());
        }
        return flag;
_L2:
        message = (FragmentManager)message.obj;
        obj = a.remove(message);
        continue; /* Loop/switch isn't completed */
_L3:
        message = (h)message.obj;
        obj = b.remove(message);
        if (true) goto _L5; else goto _L4
_L4:
    }

}
