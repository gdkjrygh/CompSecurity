// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;
import android.view.animation.AnimationUtils;

final class hcc
    implements Runnable
{

    private hcb a;

    hcc(hcb hcb1)
    {
        a = hcb1;
        super();
    }

    public final void run()
    {
        if (!hcb.a(a))
        {
            return;
        }
        long l = AnimationUtils.currentAnimationTimeMillis();
        hcb.d(a).scrollBy(0, Math.round((float)hcb.b(a) * ((float)(l - hcb.c(a)) / hcb.d())));
        if (hcb.e(a) < hcb.c(a) && hcb.f(a) != null)
        {
            hcb.f(a).a(hcb.g(a));
        }
        hcb.a(a, l);
        mk.a(hcb.d(a), this);
    }
}
