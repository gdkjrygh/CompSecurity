// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.topic;

import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.ax;

// Referenced classes of package com.roidapp.cloudlib.sns.topic:
//            b

public final class c extends ax
{

    final b a;

    public c(b b1)
    {
        a = b1;
        super();
    }

    public final void a(RecyclerView recyclerview, int i, int j)
    {
        super.a(recyclerview, i, j);
        if (!b.a(a) && ((GridLayoutManager)recyclerview.b()).l() >= 4)
        {
            b.b(a);
            a.i();
        }
    }
}
