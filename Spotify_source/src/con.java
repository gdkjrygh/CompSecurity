// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.PowerManager;
import android.os.WorkSource;
import android.text.TextUtils;
import android.util.Log;

public final class con
{

    private static String b = "WakeLock";
    public final android.os.PowerManager.WakeLock a;
    private WorkSource c;
    private final String d;
    private final Context e;
    private boolean f;
    private int g;
    private int h;

    private con(Context context, String s)
    {
        f = true;
        btl.a(s, "Wake lock name can NOT be empty");
        d = s;
        e = context.getApplicationContext();
        a = ((PowerManager)context.getSystemService("power")).newWakeLock(1, s);
        if (cny.a(e))
        {
            if (cnx.a(null))
            {
                s = context.getPackageName();
            } else
            {
                s = null;
            }
            c = cny.a(context, s);
            context = c;
            if (cny.a(e) && context != null)
            {
                if (c != null)
                {
                    c.add(context);
                } else
                {
                    c = context;
                }
                a.setWorkSource(c);
            }
        }
    }

    public con(Context context, String s, byte byte0)
    {
        this(context, s);
    }

    private static boolean d()
    {
        if (!TextUtils.isEmpty(null))
        {
            throw new NullPointerException();
        } else
        {
            return false;
        }
    }

    public final void a()
    {
        if (!cnv.a(14) && f)
        {
            Log.wtf(b, (new StringBuilder("Do not acquire with timeout on reference counted WakeLocks before ICS. wakelock: ")).append(d).toString());
        }
        boolean flag = d();
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        i = g;
        g = i + 1;
        if (i == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        if (f || h != 0)
        {
            break MISSING_BLOCK_LABEL_134;
        }
        btw.a();
        btw.a(e, btu.a(a), 7, d, null, 1, cny.a(c), 1000L);
        h = h + 1;
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

    public final void b()
    {
        boolean flag = d();
        this;
        JVM INSTR monitorenter ;
        int i;
        if (!f)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        i = g - 1;
        g = i;
        if (i == 0 || flag)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        if (f || h != 1)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        btw.a();
        btw.a(e, btu.a(a), d, cny.a(c));
        h = h - 1;
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

    public final void c()
    {
        a.setReferenceCounted(false);
        f = false;
    }

}
