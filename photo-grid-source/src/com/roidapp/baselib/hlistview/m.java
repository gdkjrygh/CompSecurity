// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;


// Referenced classes of package com.roidapp.baselib.hlistview:
//            l

final class m
    implements Runnable
{

    final int a;
    final l b;

    m(l l1, int i)
    {
        b = l1;
        a = i;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
