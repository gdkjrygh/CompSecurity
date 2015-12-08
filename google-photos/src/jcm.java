// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.List;

public final class jcm extends omp
    implements jcq, mti
{

    private static final ekk a = (new ekm()).a(hpg).a();
    private ArrayList ag;
    private final jcr b;
    private final hfx c;
    private jcp d;
    private mtj e;
    private noz f;
    private noz g;
    private boolean h;

    public jcm()
    {
        b = new jcr(af, new jco(this), new gfy(af));
        c = new hfx(this, af, new jcn(this));
        h = false;
    }

    public static jcm a(List list, jcp jcp1)
    {
        Bundle bundle;
        boolean flag;
        if (list != null && !list.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify non-empty mediaList");
        p.b(jcp1, "uploadHandler cannot be null");
        bundle = new Bundle();
        bundle.putParcelableArrayList("com.google.android.apps.photos.core.media_list", new ArrayList(list));
        bundle.putParcelable("upload_handler", jcp1);
        list = new jcm();
        list.f(bundle);
        return list;
    }

    static jcr a(jcm jcm1)
    {
        return jcm1.b;
    }

    static jcp b(jcm jcm1)
    {
        return jcm1.d;
    }

    static hfx c(jcm jcm1)
    {
        return jcm1.c;
    }

    static noz d(jcm jcm1)
    {
        return jcm1.f;
    }

    static mtj e(jcm jcm1)
    {
        return jcm1.e;
    }

    private List r()
    {
        return super.q.getParcelableArrayList("com.google.android.apps.photos.core.media_list");
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        if (bundle != null)
        {
            h = bundle.getBoolean("started");
            ag = bundle.getParcelableArrayList("loaded_media_list");
        }
    }

    public final void a(Exception exception)
    {
        c.c();
    }

    public final void a(String s, mue mue1, mua mua)
    {
        boolean flag1 = false;
        if (!ele.a(b.BV).equals(s)) goto _L2; else goto _L1
_L1:
        if (f.a())
        {
            noy.a("result", mue1);
        }
        if (mue1 == null || mue1.c()) goto _L4; else goto _L3
_L3:
        ag = new ArrayList(mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list"));
        d.a(ag);
_L6:
        return;
_L4:
        c.c();
        Toast.makeText(ad, b.BW, 1).show();
        if (g.a())
        {
            noy.a("result", mue1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (eld.a(b.BV).equals(s))
        {
            if (mue1 != null && !mue1.c())
            {
                mue1 = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
                s = b;
                if (((jcr) (s)).j.a())
                {
                    noy.a("this", s);
                }
                boolean flag;
                if (!((jcr) (s)).h)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                p.b(flag, "Cannot call start() while running.");
                s.g = new ArrayList(mue1);
                s.h = true;
                if (mue1.size() == 1)
                {
                    mue1 = ((jcr) (s)).k.a((ekp)mue1.get(0));
                    if (gfw.a(mue1))
                    {
                        mua = ((jcr) (s)).k;
                        if (!gfw.a(mue1))
                        {
                            flag = flag1;
                        } else
                        {
                            flag = "true".equalsIgnoreCase(gfw.a(mue1, 1));
                        }
                        if (flag)
                        {
                            ((jcr) (s)).b.a(mue1, gga.b);
                            return;
                        }
                    }
                }
                s.e();
                return;
            }
            c.c();
            Toast.makeText(ad, b.BW, 1).show();
            if (g.a())
            {
                noy.a("result", mue1);
                b.a(a);
                noy.a("mediaList", r());
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void au_()
    {
        super.au_();
        if (!h)
        {
            c.b().a(a(b.BX)).a(true);
            e.a(new eld(r(), a, b.BV));
            h = true;
        }
    }

    public final void b(Intent intent)
    {
        c.c();
    }

    protected final void c(Bundle bundle)
    {
        super.c(bundle);
        ae.a(jcq, this);
        f = noz.a(ad, 4, "UploadFragment", new String[0]);
        g = noz.a(ad, "UploadFragment", new String[0]);
        e = ((mtj)ae.a(mtj)).a(this);
        d = (jcp)super.q.getParcelable("upload_handler");
        af.a(d);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putBoolean("started", h);
        bundle.putParcelableArrayList("loaded_media_list", ag);
    }

}
