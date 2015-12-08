// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.y;
import com.google.android.gms.common.stats.f;
import com.google.android.gms.common.stats.h;

// Referenced classes of package com.google.android.gms.internal:
//            ix, iv, ib, it

public final class jt
{

    private static String a = "WakeLock";
    private static boolean b = false;
    private final android.os.PowerManager.WakeLock c;
    private WorkSource d;
    private final int e;
    private final String f;
    private final String g;
    private final Context h;
    private boolean i;
    private int j;
    private int k;

    private jt(Context context, String s)
    {
        i = true;
        y.a(s, "Wake lock name can NOT be empty");
        e = 1;
        f = s;
        g = null;
        h = context.getApplicationContext();
        c = ((PowerManager)context.getSystemService("power")).newWakeLock(1, s);
        if (ix.a(h))
        {
            if (iv.a(null))
            {
                if (g.a && ib.b())
                {
                    Log.e(a, (new StringBuilder("callingPackage is not supposed to be empty for wakelock ")).append(f).append("!").toString());
                    s = "com.google.android.gms";
                } else
                {
                    s = context.getPackageName();
                }
            } else
            {
                s = null;
            }
            d = ix.a(context, s);
            context = d;
            if (ix.a(h) && context != null)
            {
                if (d != null)
                {
                    d.add(context);
                } else
                {
                    d = context;
                }
                c.setWorkSource(d);
            }
        }
    }

    public jt(Context context, String s, byte byte0)
    {
        this(context, s);
    }

    private String a(boolean flag)
    {
        if (i)
        {
            if (flag)
            {
                return null;
            } else
            {
                return g;
            }
        } else
        {
            return g;
        }
    }

    private boolean e()
    {
        if (!TextUtils.isEmpty(null))
        {
            String s = g;
            throw new NullPointerException();
        } else
        {
            return false;
        }
    }

    public final void a()
    {
        String s;
        boolean flag;
        if (!it.c() && i)
        {
            Log.wtf(a, (new StringBuilder("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ")).append(f).toString());
        }
        flag = e();
        s = a(flag);
        if (b)
        {
            (new StringBuilder("Acquire:\n mWakeLockName: ")).append(f).append("\n mSecondaryName: ").append(g).append("\nmReferenceCounted: ").append(i).append("\nreason: ").append(null).append("\nmOpenEventCount").append(k).append("\nuseWithReason: ").append(flag).append("\ntrackingName: ").append(s);
        }
        this;
        JVM INSTR monitorenter ;
        int l;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_165;
        }
        l = j;
        j = l + 1;
        if (l == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_179;
        }
        if (i || k != 0)
        {
            break MISSING_BLOCK_LABEL_226;
        }
        com.google.android.gms.common.stats.h.a();
        com.google.android.gms.common.stats.h.a(h, com.google.android.gms.common.stats.f.a(c, s), 7, f, s, e, ix.a(d));
        k = k + 1;
        this;
        JVM INSTR monitorexit ;
        c.acquire(1000L);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void b()
    {
        String s;
        boolean flag;
        flag = e();
        s = a(flag);
        if (b)
        {
            (new StringBuilder("Release:\n mWakeLockName: ")).append(f).append("\n mSecondaryName: ").append(g).append("\nmReferenceCounted: ").append(i).append("\nreason: ").append(null).append("\n mOpenEventCount").append(k).append("\nuseWithReason: ").append(flag).append("\ntrackingName: ").append(s);
        }
        this;
        JVM INSTR monitorenter ;
        int l;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_126;
        }
        l = j - 1;
        j = l;
        if (l == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_141;
        }
        if (i || k != 1)
        {
            break MISSING_BLOCK_LABEL_188;
        }
        com.google.android.gms.common.stats.h.a();
        com.google.android.gms.common.stats.h.a(h, com.google.android.gms.common.stats.f.a(c, s), 8, f, s, e, ix.a(d));
        k = k - 1;
        this;
        JVM INSTR monitorexit ;
        c.release();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void c()
    {
        c.setReferenceCounted(false);
        i = false;
    }

    public final boolean d()
    {
        return c.isHeld();
    }

}
