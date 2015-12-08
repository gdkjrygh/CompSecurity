// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;

public final class hfx
    implements omb, opl, opr, opv
{

    private final am a;
    private final ar b;
    private final android.view.View.OnClickListener c;
    private hfv d;
    private hfy e;
    private ay f;

    public hfx(am am1, opd opd1, android.view.View.OnClickListener onclicklistener)
    {
        opd1.a(this);
        b = null;
        a = am1;
        c = onclicklistener;
    }

    public hfx(ar ar1, opd opd1, android.view.View.OnClickListener onclicklistener)
    {
        opd1.a(this);
        b = ar1;
        a = null;
        c = onclicklistener;
    }

    public final hfx a(double d1)
    {
        hfy hfy1 = e;
        hfy1.b = Math.min(1.0D, Math.max(0.0D, d1));
        hfy1.d.b();
        return this;
    }

    public final hfx a(String s)
    {
        e.a(s);
        return this;
    }

    public final hfx a(boolean flag)
    {
        e.a(flag);
        return this;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        e = (hfy)olm1.a(hfy);
    }

    public final void a(Bundle bundle)
    {
        if (b != null)
        {
            f = b.c();
            return;
        } else
        {
            f = a.h();
            return;
        }
    }

    public final void al_()
    {
        d = (hfv)f.a("com.google.android.apps.photos.progress.DynamicProgressMixin_dialog_tag");
        if (d != null)
        {
            d.ad = c;
        }
    }

    public final hfx b()
    {
        d = new hfv();
        d.ad = c;
        d.a(f, "com.google.android.apps.photos.progress.DynamicProgressMixin_dialog_tag");
        return this;
    }

    public final void c()
    {
        if (d != null)
        {
            d.a(false);
        }
    }
}
