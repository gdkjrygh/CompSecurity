// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.microsoft.advertising.android:
//            av, p, g

public class OrientationChangeEventManager extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a();
    }


    private Context a;
    private final ArrayList b = new ArrayList();
    private final IntentFilter c = new IntentFilter();
    private volatile int d;

    public OrientationChangeEventManager(Context context)
    {
        a = null;
        a = context.getApplicationContext();
        c.addAction("android.intent.action.CONFIGURATION_CHANGED");
        d = a();
        try
        {
            a.registerReceiver(this, c);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            av.c("startOrientationListener", context.getMessage());
        }
    }

    private int a()
    {
        return a.getResources().getConfiguration().orientation;
    }

    public static int a(Resources resources)
    {
        return resources.getConfiguration().orientation;
    }

    public final void a(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        this;
        JVM INSTR monitorenter ;
        b.size();
        if (!b.contains(a1))
        {
            b.add(a1);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public final void b(a a1)
    {
        if (a1 == null)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        this;
        JVM INSTR monitorenter ;
        if (b.contains(a1))
        {
            b.remove(a1);
            b.size();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        a1;
        this;
        JVM INSTR monitorexit ;
        throw a1;
    }

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = true;
        if (!intent.getAction().equals("android.intent.action.CONFIGURATION_CHANGED")) goto _L2; else goto _L1
_L1:
        context = b.iterator();
_L6:
        if (context.hasNext()) goto _L4; else goto _L3
_L3:
        int i = a();
        if (i == d) goto _L2; else goto _L5
_L5:
        d = i;
        if (1 != d)
        {
            flag = false;
        }
        context = p.a().o().iterator();
_L7:
        if (context.hasNext())
        {
            break MISSING_BLOCK_LABEL_103;
        }
_L2:
        return;
_L4:
        ((a)context.next()).a();
          goto _L6
        intent = (g)context.next();
        try
        {
            intent.b(flag);
        }
        // Misplaced declaration of an exception variable
        catch (Intent intent)
        {
            av.a("OrientationChangeEventManager", (new StringBuilder("AdController threw exception during orientation change: ")).append(intent.getMessage()).toString(), intent);
        }
          goto _L7
    }
}
