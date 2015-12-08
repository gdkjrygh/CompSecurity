// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hhi
    implements geb, omb, opt, opu, opv
{

    private static final get c;
    public gcp a;
    public boolean b;
    private Context d;
    private mmr e;
    private gdw f;
    private final hhk g;
    private final get h;
    private boolean i;
    private boolean j;

    hhi(opd opd1, hhk hhk1, get get1)
    {
        g = hhk1;
        if (get1 == null)
        {
            get1 = c;
        }
        h = get1;
        opd1.a(this);
    }

    public final void V_()
    {
        f.b(this);
    }

    public final void X_()
    {
        f.a(this);
    }

    public final void a()
    {
        if (a == null)
        {
            j = true;
        }
        if (i || !e.e() || !gcp.a(a) || mtj.a(d, "com.google.android.apps.photos.metasync.async.GetAllPhotosTask"))
        {
            return;
        } else
        {
            int k = e.d();
            mtj.a(d, new gco(h, k));
            return;
        }
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        e = (mmr)olm1.a(mmr);
        f = (gdw)olm1.a(gdw);
    }

    public final void a(gcp gcp1)
    {
        i = true;
        a = gcp1;
    }

    public final void a(gcp gcp1, long l)
    {
        a = gcp1;
        boolean flag;
        if (l == 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        b = flag;
        if (j)
        {
            j = false;
            a();
        }
    }

    public final void a(Long long1, long l)
    {
    }

    public final void b(gcp gcp1, long l)
    {
        boolean flag = false;
        i = false;
        a = gcp1;
        if (l == 0L)
        {
            flag = true;
        }
        b = flag;
        if (g != null)
        {
            g.ad_();
        }
    }

    static 
    {
        c = get.e;
    }
}
