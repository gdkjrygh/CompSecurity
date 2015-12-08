// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.clearcut.LogEventParcelable;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.concurrent.TimeUnit;

class lyz
    implements lyy
{

    private boolean a;
    private jyn b;
    private jxd c;
    private Handler d;
    private final Runnable e = new lzc(this);
    private final jyx f = new lzd(this);

    lyz(Context context)
    {
        b = (new jyo(context)).a(jxd.b).a();
        b.a(new lza(this));
        b.a(new lzb(this));
        c = new jxd(context, -1, null, null);
    }

    static void a(lyz lyz1)
    {
        synchronized (lyz1.b)
        {
            if (lyz1.a)
            {
                jxd jxd1 = lyz1.c;
                Object obj = lyz1.b;
                obj = TimeUnit.MILLISECONDS;
                jxd1.c.a(5000L, ((TimeUnit) (obj)));
                lyz1.b.d();
                lyz1.a = false;
            }
        }
        return;
        lyz1;
        jyn1;
        JVM INSTR monitorexit ;
        throw lyz1;
    }

    static Runnable b(lyz lyz1)
    {
        return lyz1.e;
    }

    static Handler c(lyz lyz1)
    {
        return lyz1.d;
    }

    public void a(String s, String s1, int i, byte abyte0[])
    {
        if (d == null)
        {
            d = new Handler(Looper.myLooper());
        }
        d.removeCallbacks(e);
        synchronized (b)
        {
            if (!a)
            {
                b.b();
                a = true;
            }
        }
        abyte0 = new jxf(c, abyte0);
        abyte0.b = s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_123;
        }
        if (jxd.h(((jxf) (abyte0)).i))
        {
            throw new IllegalArgumentException("setUploadAccountName forbidden on anonymous logger");
        }
        break MISSING_BLOCK_LABEL_117;
        s;
        jyn1;
        JVM INSTR monitorexit ;
        throw s;
        abyte0.c = s1;
        if (i != 0)
        {
            ((jxf) (abyte0)).g.e = i;
        }
        s = b;
        if (((jxf) (abyte0)).h)
        {
            throw new IllegalStateException("do not reuse LogEventBuilder");
        } else
        {
            abyte0.h = true;
            jxd.k(((jxf) (abyte0)).i).a(s, new LogEventParcelable(new PlayLoggerContext(jxd.i(((jxf) (abyte0)).i), jxd.j(((jxf) (abyte0)).i), ((jxf) (abyte0)).a, ((jxf) (abyte0)).b, ((jxf) (abyte0)).c, ((jxf) (abyte0)).d, jxd.h(((jxf) (abyte0)).i), ((jxf) (abyte0)).e), ((jxf) (abyte0)).g, ((jxf) (abyte0)).f, null, jxd.a(null))).a(f);
            return;
        }
    }
}
