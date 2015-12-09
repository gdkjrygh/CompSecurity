// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

public final class aaf
{

    public int a;
    public int b;
    public boolean c;
    public final LinearLayoutManager d;

    public aaf(LinearLayoutManager linearlayoutmanager)
    {
        d = linearlayoutmanager;
        super();
    }

    public final void a()
    {
        int i;
        if (c)
        {
            i = d.g.c();
        } else
        {
            i = d.g.b();
        }
        b = i;
    }

    public final void a(View view)
    {
        if (c)
        {
            b = d.g.b(view) + d.g.a();
        } else
        {
            b = d.g.a(view);
        }
        a = LinearLayoutManager.b(view);
    }

    public final String toString()
    {
        return (new StringBuilder("AnchorInfo{mPosition=")).append(a).append(", mCoordinate=").append(b).append(", mLayoutFromEnd=").append(c).append('}').toString();
    }
}
