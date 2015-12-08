// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.bumptech.glide.manager;

import android.app.Activity;
import android.app.Application;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.support.v4.app.FragmentActivity;
import android.util.Log;
import com.bumptech.glide.g.h;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.bumptech.glide.manager:
//            b, f, RequestManagerFragment, m

public class j
    implements android.os.Handler.Callback
{

    private static final j c = new j();
    final Map a = new HashMap();
    final Map b = new HashMap();
    private volatile com.bumptech.glide.j d;
    private final Handler e = new Handler(Looper.getMainLooper(), this);

    j()
    {
    }

    public static j a()
    {
        return c;
    }

    private com.bumptech.glide.j b(Context context)
    {
        if (d != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorenter ;
        if (d == null)
        {
            d = new com.bumptech.glide.j(context.getApplicationContext(), new b(), new f());
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

    public com.bumptech.glide.j a(Activity activity)
    {
        if (h.d() || android.os.Build.VERSION.SDK_INT < 11)
        {
            return a(activity.getApplicationContext());
        } else
        {
            b(activity);
            return a(((Context) (activity)), activity.getFragmentManager());
        }
    }

    public com.bumptech.glide.j a(Context context)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("You cannot start a load on a null Context");
        }
        if (h.c() && !(context instanceof Application))
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

    com.bumptech.glide.j a(Context context, FragmentManager fragmentmanager)
    {
        RequestManagerFragment requestmanagerfragment = a(fragmentmanager);
        com.bumptech.glide.j j1 = requestmanagerfragment.b();
        fragmentmanager = j1;
        if (j1 == null)
        {
            fragmentmanager = new com.bumptech.glide.j(context, requestmanagerfragment.a(), requestmanagerfragment.c());
            requestmanagerfragment.a(fragmentmanager);
        }
        return fragmentmanager;
    }

    com.bumptech.glide.j a(Context context, android.support.v4.app.FragmentManager fragmentmanager)
    {
        m m1 = a(fragmentmanager);
        com.bumptech.glide.j j1 = m1.b();
        fragmentmanager = j1;
        if (j1 == null)
        {
            fragmentmanager = new com.bumptech.glide.j(context, m1.a(), m1.c());
            m1.a(fragmentmanager);
        }
        return fragmentmanager;
    }

    public com.bumptech.glide.j a(FragmentActivity fragmentactivity)
    {
        if (h.d())
        {
            return a(fragmentactivity.getApplicationContext());
        } else
        {
            b(fragmentactivity);
            return a(((Context) (fragmentactivity)), fragmentactivity.getSupportFragmentManager());
        }
    }

    RequestManagerFragment a(FragmentManager fragmentmanager)
    {
        RequestManagerFragment requestmanagerfragment1 = (RequestManagerFragment)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
        RequestManagerFragment requestmanagerfragment = requestmanagerfragment1;
        if (requestmanagerfragment1 == null)
        {
            RequestManagerFragment requestmanagerfragment2 = (RequestManagerFragment)a.get(fragmentmanager);
            requestmanagerfragment = requestmanagerfragment2;
            if (requestmanagerfragment2 == null)
            {
                requestmanagerfragment = new RequestManagerFragment();
                a.put(fragmentmanager, requestmanagerfragment);
                fragmentmanager.beginTransaction().add(requestmanagerfragment, "com.bumptech.glide.manager").commitAllowingStateLoss();
                e.obtainMessage(1, fragmentmanager).sendToTarget();
            }
        }
        return requestmanagerfragment;
    }

    m a(android.support.v4.app.FragmentManager fragmentmanager)
    {
        m m2 = (m)fragmentmanager.findFragmentByTag("com.bumptech.glide.manager");
        m m1 = m2;
        if (m2 == null)
        {
            m m3 = (m)b.get(fragmentmanager);
            m1 = m3;
            if (m3 == null)
            {
                m1 = new m();
                b.put(fragmentmanager, m1);
                fragmentmanager.beginTransaction().add(m1, "com.bumptech.glide.manager").commitAllowingStateLoss();
                e.obtainMessage(2, fragmentmanager).sendToTarget();
            }
        }
        return m1;
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
        message = (android.support.v4.app.FragmentManager)message.obj;
        obj = b.remove(message);
        if (true) goto _L5; else goto _L4
_L4:
    }

}
