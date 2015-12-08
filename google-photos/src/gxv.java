// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import java.util.concurrent.TimeUnit;

public final class gxv
    implements nug, omb, opl, ops, opt, opu, opv
{

    private static final long b;
    gzb a;
    private mwx c;
    private grg d;
    private ekp e;
    private mwz f;
    private final Runnable g = new gxw(this);

    public gxv(opd opd1)
    {
        opd1.a(this);
    }

    static void a(gxv gxv1)
    {
        gxv1.c();
    }

    private void c()
    {
        e = null;
        d.a.a(this);
    }

    public final void V_()
    {
        d.a.a(this);
        if (f != null)
        {
            c.a(f);
        }
    }

    public final void X_()
    {
        if (e != null)
        {
            a(e);
        }
    }

    public final void a()
    {
        a.s().setVisibility(8);
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = (mwx)olm1.a(mwx);
        a = (gzb)olm1.a(gzb);
        d = (grg)olm1.a(grg);
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            e = (ekp)bundle.getParcelable("HideOriginalMixin.edited_media");
        }
    }

    public final void a(ekp ekp1)
    {
        e = ekp1;
        d.a.a(this, true);
        f = c.a(g, b);
    }

    public final void b_(Object obj)
    {
        obj = (grg)obj;
        if (e != null && e.equals(((grg) (obj)).h))
        {
            c();
            a();
        }
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("HideOriginalMixin.edited_media", e);
    }

    static 
    {
        b = TimeUnit.SECONDS.toMillis(3L);
    }
}
