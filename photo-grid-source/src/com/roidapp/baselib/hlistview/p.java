// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;


// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView

class p
{

    private int a;
    final AbsHListView c;

    private p(AbsHListView abshlistview)
    {
        c = abshlistview;
        super();
    }

    p(AbsHListView abshlistview, byte byte0)
    {
        this(abshlistview);
    }

    public final void a()
    {
        a = AbsHListView.a(c);
    }

    public final boolean b()
    {
        return c.hasWindowFocus() && AbsHListView.b(c) == a;
    }
}
