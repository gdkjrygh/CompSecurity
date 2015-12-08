// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public class gki
    implements gkj, grh, mti
{

    public final ehr a;
    public final gri b;
    public final mtj c;
    public final gll d;
    public final grg e;
    public final noz f;
    public final noz g;
    public gre h;
    public gre i;

    public gki(Context context, ehr ehr, gri gri1)
    {
        a = ehr;
        b = gri1;
        d = (gll)olm.a(context, gll);
        d.a(ehr, this);
        e = (grg)olm.a(context, grg);
        c = ((mtj)olm.a(context, mtj)).a(this);
        f = noz.a(context, "PagedCurrentMediaSource", new String[0]);
        g = noz.a(context, 2, "PagedCurrentMediaSource", new String[0]);
    }

    public void a()
    {
        d.b(a, this);
        c.b(this);
    }

    public void a(int j, int k)
    {
        if (g.a())
        {
            noy.a("startPosition", Integer.valueOf(j));
            noy.a("endPosition", Integer.valueOf(k));
        }
        i = c();
        b();
    }

    public void a(ekp ekp1, int j)
    {
        b.a(ekp1, j);
    }

    public void a(gre gre1)
    {
        i = null;
        h = gre1;
        b();
    }

    public void a(gre gre1, int j, ekp ekp1)
    {
        boolean flag;
        if (gre1.c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag && !ekp1.equals(gre1.c))
        {
            if (g.a())
            {
                noy.a("cachedMedia", ekp1);
                noy.a("expectedMedia", gre1.c);
            }
            a(ekp1, j);
            return;
        }
        if (ekp1.equals(gre1.c) && g.a())
        {
            noy.a("cachedMedia", ekp1);
            noy.a("expectedMedia", gre1.c);
        }
        e(gre1);
        b.a(ekp1, j);
    }

    public void a(String s, mue mue1, mua mua)
    {
        if ("com.google.android.apps.photos.pager.model.FindPositionTask".equals(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (mue1 != null && !mue1.c())
        {
            break; /* Loop/switch isn't completed */
        }
        if (f.a())
        {
            noy.a("tag", s);
            noy.a("result", mue1);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        s = (ekp)mue1.a().getParcelable("com.google.android.apps.photos.core.media");
        int j = mue1.a().getInt("position");
        if (j < 0)
        {
            i = c();
            b(i);
            return;
        }
        mue1 = e;
        boolean flag;
        if (((grg) (mue1)).i != null && ((grg) (mue1)).i.a(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            if (g.a())
            {
                b.a(s);
            }
            mue1 = e;
            if (((grg) (mue1)).i != null)
            {
                ((grg) (mue1)).i.b = Integer.valueOf(j);
            }
        }
        if (h != null && s.equals(h.b))
        {
            a(gre.a(j, s));
            return;
        }
        if (i != null && s.equals(i.b))
        {
            i = gre.a(j, s);
            b(i);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public gki b(int j, int k)
    {
        return this;
    }

    public void b()
    {
        if (h != null)
        {
            b(h);
            return;
        } else
        {
            b(i);
            return;
        }
    }

    public void b(gre gre1)
    {
        if (gre1.a())
        {
            c(gre1);
            return;
        } else
        {
            d(gre1);
            return;
        }
    }

    public gre c()
    {
        ekp ekp1 = e.h;
        Object obj = e;
        if (((grg) (obj)).i != null)
        {
            obj = ((grg) (obj)).i.a;
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            return gre.a(((ekp) (obj)));
        }
        if (ekp1 != null)
        {
            return gre.a(ekp1);
        } else
        {
            return gre.a(Math.max(0, e.j));
        }
    }

    public void c(gre gre1)
    {
        if (g.a())
        {
            b.a(gre1.b);
        }
        Integer integer = d.a(a, gre1.b);
        if (integer != null)
        {
            ekp ekp1 = (ekp)d.b(a, integer.intValue());
            if (ekp1 == null)
            {
                a(gre.a(integer.intValue()));
                return;
            } else
            {
                e(gre1);
                b.a(ekp1, integer.intValue());
                return;
            }
        }
        c.b("com.google.android.apps.photos.pager.model.FindPositionTask");
        if (g.a())
        {
            b.a(gre1.b);
        }
        c.a(new hyj(a, gre1.b, d.d(a)));
    }

    public int d()
    {
        return e.j;
    }

    public void d(gre gre1)
    {
        Integer integer;
        int j;
        if (g.a())
        {
            noy.a("request index", Integer.valueOf(gre1.a));
            noy.a("expectedMedia", gre1.c);
        }
        j = gre1.a;
        integer = d.b(a);
        if (integer == null) goto _L2; else goto _L1
_L1:
        if (integer.intValue() != 0) goto _L4; else goto _L3
_L3:
        b.a(null, -1);
_L6:
        return;
_L4:
        if (j >= integer.intValue())
        {
            j = integer.intValue() - 1;
        }
_L2:
        ekp ekp1 = (ekp)d.b(a, j);
        if (ekp1 != null)
        {
            a(gre1, j, ekp1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void e(gre gre1)
    {
        if (c.c(gre1, h))
        {
            h = null;
        }
        i = null;
    }
}
