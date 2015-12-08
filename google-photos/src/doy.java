// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class doy
    implements dpc, mti, omb, ops, opt, opu, opv
{

    private static final ekk e = (new ekm()).a(dov).a();
    public noz a;
    public ekq b;
    public dpa c;
    public boolean d;
    private Context f;
    private noz g;
    private dpb h;
    private mtj i;

    public doy(opd opd1)
    {
        d = false;
        opd1.a(this);
    }

    static dpa a(doy doy1)
    {
        return doy1.c;
    }

    public final void V_()
    {
        h.a = null;
    }

    public final void X_()
    {
        boolean flag;
        if (b != null && c != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag, "must initialize mixin before onStart");
        h.a = this;
        if (!d)
        {
            elc elc1 = new elc(b, e, b.iL);
            i.a(elc1);
        }
    }

    public final Runnable a()
    {
        long l = noy.a();
        elb elb1 = b.b(f, b).a(b, e);
        try
        {
            b = (ekq)elb1.a();
        }
        catch (eke eke1) { }
        if (a.a())
        {
            noy.a("duration", l);
        }
        return new doz(this);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        f = context;
        h = (dpb)olm1.a(dpb);
        i = (mtj)olm1.a(mtj);
        i.a(this);
        a = noz.a(context, 2, "ChapterCountMixin", new String[0]);
        g = noz.a(context, 2, "ChapterCountMixin", new String[0]);
        if (bundle != null)
        {
            d = bundle.getBoolean("state_initialized");
            b = (ekq)bundle.getParcelable("com.google.android.apps.photos.core.media_collection");
        }
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (elc.a(b.iL).equals(s) && mue1 != null && !mue1.c())
        {
            b = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
            c.a();
            d = true;
        }
    }

    public final boolean a(int j)
    {
        return ((dov)b.a(dov)).a(j);
    }

    public final int b(int j)
    {
        dov dov1 = (dov)b.a(dov);
        if (!dov1.a(j))
        {
            throw new IllegalArgumentException((new StringBuilder(44)).append("no count available for position: ").append(j).toString());
        } else
        {
            return dov1.a[j];
        }
    }

    public final void e(Bundle bundle)
    {
        if (d)
        {
            bundle.putBoolean("state_initialized", true);
            bundle.putParcelable("com.google.android.apps.photos.core.media_collection", b);
        }
    }

}
