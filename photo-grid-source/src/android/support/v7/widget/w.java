// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager, ad

final class w
{

    int a;
    int b;
    boolean c;
    final LinearLayoutManager d;

    w(LinearLayoutManager linearlayoutmanager)
    {
        d = linearlayoutmanager;
        super();
    }

    final void a()
    {
        int i;
        if (c)
        {
            i = d.k.d();
        } else
        {
            i = d.k.c();
        }
        b = i;
    }

    public final void a(View view)
    {
        if (c)
        {
            b = d.k.b(view) + d.k.b();
        } else
        {
            b = d.k.a(view);
        }
        a = LinearLayoutManager.e(view);
    }

    public final String toString()
    {
        return (new StringBuilder("AnchorInfo{mPosition=")).append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
    }
}
