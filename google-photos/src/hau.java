// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class hau
    implements Runnable
{

    private final int a;
    private final hyk b;
    private hat c;

    hau(hat hat1, int i, hyk hyk1)
    {
        c = hat1;
        super();
        a = i;
        b = hyk1;
    }

    public final void run()
    {
        b.a(((RecyclerView) (hae.g(c.a))).e.findViewByPosition(a));
    }
}
