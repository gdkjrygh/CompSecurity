// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.net.Uri;
import android.os.Looper;
import java.io.OutputStream;
import java.util.Date;
import java.util.List;

public final class oue extends Thread
{

    public volatile Exception a;
    private final Context b;
    private final OutputStream c;
    private final Uri d;
    private final long e;
    private final Uri f;
    private final long g;
    private final float h;
    private final long i;

    public oue(Context context, OutputStream outputstream, Uri uri, long l, Uri uri1, long l1, float f1, long l2)
    {
        boolean flag;
        if (l2 >= 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        b = (Context)p.a(context);
        c = (OutputStream)p.a(outputstream);
        d = uri;
        e = l;
        f = (Uri)p.a(uri1);
        g = l1;
        h = f1;
        i = l2;
    }

    static Exception a(oue oue1, Exception exception)
    {
        oue1.a = exception;
        return exception;
    }

    private static jjl a(Context context, Uri uri)
    {
        return new jil(context, uri, null);
    }

    private static osk a(long l, float f1, osc osc1, jjl jjl)
    {
        jjl = new osk(jjl, true);
        osf osf1;
        boolean flag;
        if (osc1.b == ose.a)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "Invalid mixer status (%s)", new Object[] {
            osc1.b
        });
        osf1 = new osf(osc1, f1);
        osf1.a((0x6baa80L * l) / 0xf4240L);
        osc1.a.add(osf1);
        jjl.f = osf1;
        return jjl;
    }

    public final void run()
    {
        Looper.prepare();
        Object obj1 = new Date(0L);
        Looper looper = (Looper)p.a(Looper.myLooper());
        Object obj = b.o(1);
        jif jif1 = b.o(1);
        ouf ouf1 = new ouf(this, ((jif) (obj)), jif1, looper);
        ((jif) (obj)).a(new ouh(this, jif1, ((jif) (obj)), looper));
        jif1.a(new oui(this, ((jif) (obj)), jif1, looper));
        obj1 = new osc(48000, 2, new osa(new osb(c, ((Date) (obj1)), ouf1)), i);
        if (d != null)
        {
            jjl jjl = a(b, d);
            ((jif) (obj)).a(new jig[] {
                a(e, 1.0F - h, ((osc) (obj1)), jjl)
            });
            ((jif) (obj)).a(true);
        }
        obj = a(b, f);
        obj = a(g, h, ((osc) (obj1)), ((jjl) (obj)));
        obj1.b = ose.b;
        jif1.a(new jig[] {
            obj
        });
        jif1.a(true);
        Looper.loop();
    }
}
