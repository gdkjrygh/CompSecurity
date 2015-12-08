// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hak extends enn
{

    private hae c;

    hak(hae hae1, Context context, enk enk, eno eno)
    {
        c = hae1;
        super(context, enk, eno);
    }

    public final void onLayoutChildren(afe afe, afl afl1)
    {
        if (hae.c(c) && afl1.i && !afl1.k)
        {
            hae.a(c, true);
        }
        if (!hae.d(c))
        {
            super.onLayoutChildren(afe, afl1);
            afe = (hqq)hae.h(c).b(hqq);
            if (afe != null)
            {
                afe.a(hae.g(c));
            }
        }
    }
}
