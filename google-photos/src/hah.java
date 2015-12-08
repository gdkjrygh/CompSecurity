// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class hah extends adi
{

    private hae a;

    hah(hae hae1, Context context)
    {
        a = hae1;
        super(context);
    }

    public final void onLayoutChildren(afe afe, afl afl1)
    {
        if (hae.c(a) && afl1.i && !afl1.k)
        {
            hae.a(a, true);
        }
        if (!hae.d(a))
        {
            super.onLayoutChildren(afe, afl1);
        }
    }
}
