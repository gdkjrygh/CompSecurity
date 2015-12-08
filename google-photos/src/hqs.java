// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.RecyclerView;

final class hqs extends aep
{

    final hqr a;

    hqs(hqr hqr1)
    {
        a = hqr1;
        super();
    }

    public final void a()
    {
        aer aer1 = hqr.a(a).q;
        if (aer1 != null)
        {
            aer1.a(new hqt(this));
            return;
        } else
        {
            hqr.b(a).b();
            return;
        }
    }
}
