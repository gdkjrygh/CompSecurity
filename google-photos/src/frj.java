// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.apps.photos.list.PhotoTileView;

public final class frj
    implements hgo
{

    private static final oni c = new oni("debug.photos.enable_album_rem");
    public hgp a;
    public final ekp b;
    private final int d;

    public frj(ekp ekp1)
    {
        this(ekp1, -1);
    }

    public frj(ekp ekp1, int i)
    {
        b = ekp1;
        d = i;
    }

    static ekp a(frj frj1)
    {
        return frj1.b;
    }

    public final int a()
    {
        return au.n;
    }

    public final int a(int i)
    {
        return 1;
    }

    public final void a(afn afn1)
    {
        Object obj = afn1.a.getContext();
        afn1 = (fro)afn1;
        frm frm1 = (frm)olm.a(((android.content.Context) (obj)), frm);
        frn frn1 = (frn)olm.b(((android.content.Context) (obj)), frn);
        b.a(((fro) (afn1)).a, b.a(((android.content.Context) (obj)), pwt.y, b));
        fro.b(afn1, ((hzh)olm.a(((android.content.Context) (obj)), hzh)).a(b));
        fro.a(afn1, ((hyy)olm.a(((android.content.Context) (obj)), hyy)).d());
        olm.b(((android.content.Context) (obj)), hkl);
        Object obj1 = (fso)olm.b(((android.content.Context) (obj)), fso);
        PhotoTileView phototileview = ((fro) (afn1)).o;
        phototileview.c = ((fso) (obj1));
        phototileview.d = afn1;
        ((fro) (afn1)).a.setVisibility(0);
        ((fro) (afn1)).o.j = false;
        ((fro) (afn1)).o.a(b);
        obj1 = ((fro) (afn1)).o;
        obj1.h = fsd.a;
        if (b.c() == euv.c)
        {
            Object obj2 = (gfn)b.b(gfn);
            if (obj2 != null && ((gfn) (obj2)).g())
            {
                obj1.h = fsd.e;
            } else
            {
                jgi jgi1 = (jgi)b.b(jgi);
                if (jgi1 != null && jgh.a(jgi1))
                {
                    obj1.h = fsd.f;
                } else
                {
                    obj1.h = fsd.b;
                }
            }
        } else
        {
            hdv hdv1 = (hdv)b.b(hdv);
            if (hdv1 != null && hdv1.m())
            {
                obj1.h = fsd.c;
            } else
            {
                eev eev1 = (eev)b.b(eev);
                if (eev1 != null && eev1.b() != 0)
                {
                    obj1.h = fsd.d;
                }
            }
        }
        obj1 = ((fro) (afn1)).o;
        obj1.l = 0L;
        if (b.c() == euv.c)
        {
            obj2 = (jdv)b.b(jdv);
            if (obj2 != null)
            {
                obj1.l = ((jdv) (obj2)).p();
            }
        }
        ((fro) (afn1)).o.k = true;
        ((fro) (afn1)).o.e = b();
        obj1 = (hkh)b.b(hkh);
        obj2 = (dje)olm.b(((android.content.Context) (obj)), dje);
        if (obj1 != null && obj2 != null && ((dje) (obj2)).a)
        {
            fro.a(afn1, ((hkh) (obj1)).a.b);
        } else
        {
            fro.d(afn1);
        }
        obj = (fqg)olm.b(((android.content.Context) (obj)), fqg);
        if (obj != null)
        {
            ((fqg) (obj)).a(((fro) (afn1)).o);
        }
        ((fro) (afn1)).o.setOnClickListener(new msj(new frk(this, frm1, afn1)));
        fro.a(afn1).setOnClickListener(((fro) (afn1)).o.i);
        if (frn1 != null)
        {
            ((fro) (afn1)).o.setOnLongClickListener(new msk(new frl(this, frn1, afn1)));
        }
    }

    public final int b(int i)
    {
        if (d != -1)
        {
            return d % i;
        } else
        {
            return 0;
        }
    }

    public final long b()
    {
        long l1 = b.b();
        long l = l1;
        if (a != null)
        {
            l = a.a(this, l1);
        }
        return l;
    }

}
