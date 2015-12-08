// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;


// Referenced classes of package com.roidapp.baselib.hlistview:
//            AbsHListView

final class b
    implements Runnable
{

    final AbsHListView a;

    b(AbsHListView abshlistview)
    {
        a = abshlistview;
        super();
    }

    public final void run()
    {
        if (a.y)
        {
            AbsHListView abshlistview = a;
            a.z = false;
            abshlistview.y = false;
            AbsHListView.m(a);
            if ((a.getPersistentDrawingCache() & 2) == 0)
            {
                AbsHListView.n(a);
            }
            if (!a.isAlwaysDrawnWithCacheEnabled())
            {
                a.invalidate();
            }
        }
    }
}
