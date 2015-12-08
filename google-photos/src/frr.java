// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import android.widget.FrameLayout;

final class frr
    implements android.view.View.OnAttachStateChangeListener
{

    private fro a;

    frr(fro fro1)
    {
        a = fro1;
        super();
    }

    public final void onViewAttachedToWindow(View view)
    {
        ((hyy)olm.a(fro.a(a).getContext(), hyy)).a.a(fro.b(a), true);
        ((hzh)olm.a(fro.a(a).getContext(), hzh)).a.a(fro.c(a), true);
    }

    public final void onViewDetachedFromWindow(View view)
    {
        ((hyy)olm.a(fro.a(a).getContext(), hyy)).a.a(fro.b(a));
        ((hzh)olm.a(fro.a(a).getContext(), hzh)).a.a(fro.c(a));
    }
}
