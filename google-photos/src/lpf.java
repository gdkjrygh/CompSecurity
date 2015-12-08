// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;

public final class lpf
{

    private static String b = "WakeLock";
    private static boolean c = false;
    public final android.os.PowerManager.WakeLock a;
    private WorkSource d;
    private final int e;
    private final String f;
    private final String g;
    private final Context h;
    private boolean i;
    private int j;
    private int k;

    public lpf(Context context, int l, String s)
    {
        this(context, 1, s, null, null);
    }

    private lpf(Context context, int l, String s, String s1, String s2)
    {
        i = true;
        b.a(s, "Wake lock name can NOT be empty");
        e = l;
        f = s;
        g = null;
        h = context.getApplicationContext();
        a = ((PowerManager)context.getSystemService("power")).newWakeLock(l, s);
        if (kdm.a(h))
        {
            if (kdl.a(null))
            {
                if (kbe.a && kzu.b())
                {
                    Log.e(b, (new StringBuilder("callingPackage is not supposed to be empty for wakelock ")).append(f).append("!").toString());
                    s = "com.google.android.gms";
                } else
                {
                    s = context.getPackageName();
                }
            } else
            {
                s = null;
            }
            d = kdm.a(context, s);
            context = d;
            if (kdm.a(h) && context != null)
            {
                if (d != null)
                {
                    d.add(context);
                } else
                {
                    d = context;
                }
                a.setWorkSource(d);
            }
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

    private boolean a(String s)
    {
        return !TextUtils.isEmpty(s) && !s.equals(g);
    }

    public final void a()
    {
        boolean flag = a(((String) (null)));
        String s = a(null, flag);
        this;
        JVM INSTR monitorenter ;
        int l;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        l = j - 1;
        j = l;
        if (l == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        if (i || k != 1)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        kdg.a().a(h, b.a(a, s), 8, f, s, e, kdm.a(d));
        k = k - 1;
        this;
        JVM INSTR monitorexit ;
        a.release();
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(long l)
    {
        boolean flag;
        if (!c.a(14) && i)
        {
            Log.wtf(b, (new StringBuilder("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ")).append(f).toString());
        }
        flag = a(((String) (null)));
        String s = a(null, flag);
        this;
        JVM INSTR monitorenter ;
        int i1;
        if (!i)
        {
            break MISSING_BLOCK_LABEL_89;
        }
        i1 = j;
        j = i1 + 1;
        if (i1 == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        if (i || k != 0)
        {
            break MISSING_BLOCK_LABEL_149;
        }
        kdg.a().a(h, b.a(a, s), 7, f, s, e, kdm.a(d));
        k = k + 1;
        this;
        JVM INSTR monitorexit ;
        a.acquire(1000L);
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(boolean flag)
    {
        a.setReferenceCounted(false);
        i = false;
    }

}
