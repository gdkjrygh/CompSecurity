// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class hag
    implements hbu
{

    private hae a;

    hag(hae hae1)
    {
        a = hae1;
        super();
    }

    public final void a(RecyclerView recyclerview, int i)
    {
        if (i == hbv.b && hae.b(a) != null)
        {
            hae.b(a).a();
        }
    }

    public final void a_(int i, int j, int k)
    {
        hae.b(a).onScroll(null, i, j, k);
    }
}
