// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class blj extends bmb
    implements bru
{

    private static final String e = blj.getSimpleName();
    private static final String f = String.valueOf(blj.getName()).concat(":CacheUriKey");
    public final bto a = new bll(this, this, bln);
    public Uri b;
    private final blo g = new blk(this);
    private final blw h;
    private final ckx i;
    private boolean j;

    blj(bmb bmb1, Bundle bundle, blw blw1, ckx ckx1)
    {
        super(bmb1);
        h = (blw)b.a(blw1, "movieMakerDisplay", null);
        i = (ckx)b.a(ckx1, "videoDecoderPool", null);
        if (bundle != null)
        {
            bmb1 = bundle.getString(f);
            if (bmb1 != null)
            {
                b = Uri.parse(bmb1);
            }
        }
    }

    public static int a(int k, cqf cqf1)
    {
        boolean flag = false;
        if (cqf1.b(0).d == cnt.d)
        {
            flag = true;
        }
        int l = k;
        if (flag)
        {
            l = k + 1;
        }
        return l;
    }

    private void a(Uri uri)
    {
        if (!((bln)a.b).a(d().b, uri, c.c.u, c.c.v))
        {
            Log.w(e, "Failed to set video when populating UI.");
            h.a(true);
        }
    }

    static void a(blj blj1)
    {
        blj1.c();
        if (blj1.c.c.t)
        {
            Object obj = new cod(blj1.c.c.u, blj1.c.c.v);
            Object obj1 = blj1.c.c.e.b(blj1.f());
            cns cns1 = ((cnq) (obj1)).a();
            cns1.a = blj1.c.d.a();
            cns1.c = false;
            obj1 = blj1.c.c.e.a(((cnq) (obj1)).e);
            if (0x16e360L < 0L)
            {
                b.a((new StringBuilder()).append("minLengthUs").append(" must be zero or positive: ").append(0x16e360L), null);
            }
            long l = ((cqk) (obj1)).e;
            long l1;
            boolean flag;
            if (l >= 0x16e360L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            b.a(flag, "video duration must be greater than minLengthUs");
            l1 = ((cod) (obj)).c - ((cod) (obj)).b;
            if (l1 < 0x16e360L)
            {
                long l2 = Math.min(((cod) (obj)).b, (0x16e360L - l1) / 2L);
                l2 = Math.min(l - ((cod) (obj)).c, 0x16e360L - l1 - l2);
                obj = new cod(((cod) (obj)).b - (0x16e360L - l1 - l2), ((cod) (obj)).c + l2);
                String s;
                boolean flag1;
                if (0L <= ((cod) (obj)).b && ((cod) (obj)).c <= l && ((cod) (obj)).c - ((cod) (obj)).b == 0x16e360L)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                s = String.valueOf(obj);
                c.a(flag1, (new StringBuilder(String.valueOf(s).length() + 29)).append("interval ").append(s).append(" failed sanity check").toString());
            }
            obj = cns1.a(((cod) (obj))).a();
            obj = new cqx(blj1.c.c.s, ((cnq) (obj)));
            blj1.c.a(((crd) (obj)));
            blj1.c.g(false);
        }
    }

    static void a(blj blj1, long l, long l1)
    {
        blj1.c();
        blj1.c.b(l);
        blj1.c.c(l1);
        if (!blj1.c.c.t)
        {
            blj1.c.g(true);
        }
    }

    static void a(blj blj1, bln bln1)
    {
        blj1.c();
        bln1.a(blj1.g);
        ckx ckx1 = blj1.i;
        blm blm1 = new blm(blj1);
        c.b(ckx1.c, "listener", null);
        ckx1.c = blm1;
        if (ckx1.b.isEmpty() && ckx1.a.isEmpty())
        {
            ckx1.b();
        }
        if (blj1.c.c.e != null)
        {
            if (blj1.j || blj1.b == null)
            {
                blj1.a(blj1.d().a.b);
            } else
            {
                blj1.a(blj1.b);
            }
            bln1.F_();
        }
    }

    private int b(int k)
    {
        return a(k, c.c.e);
    }

    static bto b(blj blj1)
    {
        return blj1.a;
    }

    static void b(blj blj1, bln bln1)
    {
        blj1.c();
        bln1.a(null);
    }

    private cqk d()
    {
        return c.c.e.a(c.c.e.b(f()).e);
    }

    private int f()
    {
        return b(c.c.s);
    }

    public final void C_()
    {
        super.C_();
    }

    public final void a(int k)
    {
        c();
        c.a(c.c.e, "state.getStoryboard()", null);
        c.g(false);
        c.c.s = k;
        Object obj = c.c.e.b(b(k));
        cod cod1 = ((cnq) (obj)).f;
        c.b(cod1.b);
        c.c(cod1.c);
        obj = (Boolean)c.z().get(((cnq) (obj)).e.a);
        if (obj == null)
        {
            Log.w(e, "Can't find CloudMediaId in map; assuming video stream isn't local.");
            j = false;
            return;
        } else
        {
            j = ((Boolean) (obj)).booleanValue();
            return;
        }
    }

    public final void a(Bundle bundle)
    {
        if (b != null)
        {
            bundle.putString(f, b.toString());
        }
    }

    public final String b()
    {
        nnt nnt1 = d().a.a;
        if (nnt1 == null)
        {
            return null;
        } else
        {
            return nnt1.a;
        }
    }

}
