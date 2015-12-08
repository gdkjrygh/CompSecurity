// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;
import bI;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

final class d
{

    int a;
    int b;
    boolean c;
    final LinearLayoutManager d;

    final void a()
    {
        int i;
        if (c)
        {
            i = d.d.c();
        } else
        {
            i = d.d.b();
        }
        b = i;
    }

    public final void a(View view)
    {
        if (c)
        {
            b = d.d.b(view) + d.d.a();
        } else
        {
            b = d.d.a(view);
        }
        a = LinearLayoutManager.a(view);
    }

    public final String toString()
    {
        return (new StringBuilder("AnchorInfo{mPosition=")).append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
    }

    (LinearLayoutManager linearlayoutmanager)
    {
        d = linearlayoutmanager;
        super();
    }
}
