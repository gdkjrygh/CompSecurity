// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

public final class abb
    implements aaz
{

    private RecyclerView a;

    private abb(RecyclerView recyclerview)
    {
        a = recyclerview;
        super();
    }

    public abb(RecyclerView recyclerview, byte byte0)
    {
        this(recyclerview);
    }

    public final void a(abo abo1)
    {
        abo1.a(true);
        if (abo1.g != null && abo1.h == null)
        {
            abo1.g = null;
        }
        abo1.h = null;
        if (!abo.g(abo1) && !RecyclerView.c(a, abo1.a) && abo1.o())
        {
            a.removeDetachedView(abo1.a, false);
        }
    }
}
