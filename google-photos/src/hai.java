// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hai extends adc
{

    private hae f;

    hai(hae hae1, Context context, int i)
    {
        f = hae1;
        super(context, i);
    }

    public final void onLayoutChildren(afe afe, afl afl1)
    {
        iwf.a("GridLayoutManager LayoutChildren");
        if (hae.c(f) && afl1.i && !afl1.k)
        {
            hae.a(f, true);
        }
        if (!hae.d(f))
        {
            super.onLayoutChildren(afe, afl1);
        }
        iwf.a();
    }

    public final boolean supportsPredictiveItemAnimations()
    {
        return hae.e(f).f && super.supportsPredictiveItemAnimations();
    }
}
