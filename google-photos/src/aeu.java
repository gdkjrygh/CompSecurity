// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class aeu
    implements aet
{

    private RecyclerView a;

    public aeu(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public final void a(afn afn1)
    {
        afn1.a(true);
        if (!RecyclerView.c(a, afn1.a) && afn1.p())
        {
            a.removeDetachedView(afn1.a, false);
        }
    }

    public final void b(afn afn1)
    {
        afn1.a(true);
        if (!afn.d(afn1))
        {
            RecyclerView.c(a, afn1.a);
        }
    }

    public final void c(afn afn1)
    {
        afn1.a(true);
        if (!afn.d(afn1))
        {
            RecyclerView.c(a, afn1.a);
        }
    }

    public final void d(afn afn1)
    {
        afn1.a(true);
        if (afn1.g != null && afn1.h == null)
        {
            afn1.g = null;
            afn1.a(-65, afn.e(afn1));
        }
        afn1.h = null;
        if (!afn.d(afn1))
        {
            RecyclerView.c(a, afn1.a);
        }
    }
}
