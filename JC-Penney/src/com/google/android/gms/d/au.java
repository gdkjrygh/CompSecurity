// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.d;

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.common.internal.u;
import com.google.android.gms.common.stats.h;
import com.google.android.gms.common.stats.j;

// Referenced classes of package com.google.android.gms.d:
//            w, v, h, t

public class au
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

    public au(Context context, int l, String s)
    {
        this(context, l, s, null, null);
    }

    public au(Context context, int l, String s, String s1, String s2)
    {
        i = true;
        u.a(s, "Wake lock name can NOT be empty");
        e = l;
        f = s;
        g = s1;
        h = context.getApplicationContext();
        c = ((PowerManager)context.getSystemService("power")).newWakeLock(l, s);
        if (com.google.android.gms.d.w.a(h))
        {
            s = s2;
            if (com.google.android.gms.d.v.a(s2))
            {
                if (a.a && com.google.android.gms.d.h.b())
                {
                    Log.e(a, (new StringBuilder()).append("callingPackage is not supposed to be empty for wakelock ").append(f).append("!").toString());
                    s = "com.google.android.gms";
                } else
                {
                    s = context.getPackageName();
                }
            }
            d = com.google.android.gms.d.w.a(context, s);
            a(d);
        }
    }

    private String a(String s, boolean flag)
    {
        if (i)
        {
            if (flag)
            {
                return s;
            } else
            {
                return g;
            }
        } else
        {
            return g;
        }
    }

    private void a(String s)
    {
        String s1;
        boolean flag;
        flag = c(s);
        s1 = a(s, flag);
        if (b)
        {
            Log.d(a, (new StringBuilder()).append("Acquire:\n mWakeLockName: ").append(f).append("\n mSecondaryName: ").append(g).append("\nmReferenceCounted: ").append(i).append("\nreason: ").append(s).append("\nmOpenEventCount").append(k).append("\nuseWithReason: ").append(flag).append("\ntrackingName: ").append(s1).toString());
        }
        this;
        JVM INSTR monitorenter ;
        int l;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        l = j;
        j = l + 1;
        if (l == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        if (i || k != 0)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        com.google.android.gms.common.stats.j.a().a(h, com.google.android.gms.common.stats.h.a(c, s1), 7, f, s1, e, w.b(d));
        k = k + 1;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private void b(String s)
    {
        String s1;
        boolean flag;
        flag = c(s);
        s1 = a(s, flag);
        if (b)
        {
            Log.d(a, (new StringBuilder()).append("Release:\n mWakeLockName: ").append(f).append("\n mSecondaryName: ").append(g).append("\nmReferenceCounted: ").append(i).append("\nreason: ").append(s).append("\n mOpenEventCount").append(k).append("\nuseWithReason: ").append(flag).append("\ntrackingName: ").append(s1).toString());
        }
        this;
        JVM INSTR monitorenter ;
        int l;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_144;
        }
        l = j - 1;
        j = l;
        if (l == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        if (i || k != 1)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        com.google.android.gms.common.stats.j.a().a(h, com.google.android.gms.common.stats.h.a(c, s1), 8, f, s1, e, w.b(d));
        k = k - 1;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        this;
        JVM INSTR monitorexit ;
        throw s;
    }

    private boolean c(String s)
    {
        return !TextUtils.isEmpty(s) && !s.equals(g);
    }

    public void a()
    {
        b(null);
        c.release();
    }

    public void a(long l)
    {
        if (!t.c() && i)
        {
            Log.wtf(a, (new StringBuilder()).append("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ").append(f).toString());
        }
        a(((String) (null)));
        c.acquire(l);
    }

    public void a(WorkSource worksource)
    {
        if (com.google.android.gms.d.w.a(h) && worksource != null)
        {
            if (d != null)
            {
                d.add(worksource);
            } else
            {
                d = worksource;
            }
            c.setWorkSource(d);
        }
    }

    public void a(boolean flag)
    {
        c.setReferenceCounted(flag);
        i = flag;
    }

    public boolean b()
    {
        return c.isHeld();
    }

}
