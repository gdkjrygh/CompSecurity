// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;
import com.google.android.gms.clearcut.LogEventParcelable;
import java.util.concurrent.TimeUnit;

public final class jxq
    implements jxh
{

    private static final jxx a = new jxx();
    private static final long b;
    private final kdh c;
    private final Object d;
    private long e;
    private jyn f;

    public jxq()
    {
        this(((kdh) (new kdj())), b, new jxt());
    }

    private jxq(kdh kdh, long l, jxt jxt1)
    {
        d = new Object();
        e = 0L;
        f = null;
        new jxr(this);
        c = kdh;
    }

    static Object a(jxq jxq1)
    {
        return jxq1.d;
    }

    static jxx a()
    {
        return a;
    }

    static jyn a(jxq jxq1, jyn jyn1)
    {
        jxq1.f = null;
        return null;
    }

    static void a(LogEventParcelable logeventparcelable)
    {
        b(logeventparcelable);
    }

    static long b(jxq jxq1)
    {
        return 0L;
    }

    private static void b(LogEventParcelable logeventparcelable)
    {
        if (logeventparcelable.f != null && logeventparcelable.e.f.length == 0)
        {
            logeventparcelable.e.f = logeventparcelable.f.m();
        }
        if (logeventparcelable.g != null && logeventparcelable.e.h.length == 0)
        {
            logeventparcelable.e.h = logeventparcelable.g.m();
        }
        ksc ksc1 = logeventparcelable.e;
        byte abyte0[] = new byte[ksc1.e()];
        krw.a(ksc1, abyte0, 0, abyte0.length);
        logeventparcelable.c = abyte0;
    }

    static kdh c(jxq jxq1)
    {
        return jxq1.c;
    }

    static jyn d(jxq jxq1)
    {
        return jxq1.f;
    }

    public final jyt a(jyn jyn1, LogEventParcelable logeventparcelable)
    {
        b(logeventparcelable);
        a.a();
        logeventparcelable = new jxv(this, logeventparcelable, jyn1);
        logeventparcelable.a(new jxs(this));
        return jyn1.a(logeventparcelable);
    }

    public final boolean a(long l, TimeUnit timeunit)
    {
        boolean flag;
        try
        {
            flag = a.a(l, timeunit);
        }
        // Misplaced declaration of an exception variable
        catch (TimeUnit timeunit)
        {
            Log.e("ClearcutLoggerApiImpl", "flush interrupted");
            Thread.currentThread().interrupt();
            return false;
        }
        return flag;
    }

    static 
    {
        b = TimeUnit.MILLISECONDS.convert(2L, TimeUnit.MINUTES);
    }
}
