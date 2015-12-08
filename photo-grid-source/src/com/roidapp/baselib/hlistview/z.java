// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;


// Referenced classes of package com.roidapp.baselib.hlistview:
//            HListView

final class z
    implements Runnable
{

    final HListView a;
    private int b;
    private int c;

    private z(HListView hlistview)
    {
        a = hlistview;
        super();
    }

    z(HListView hlistview, byte byte0)
    {
        this(hlistview);
    }

    public final z a(int i, int j)
    {
        b = i;
        c = j;
        return this;
    }

    public final void run()
    {
        a.b(b, c);
    }
}
