// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;


// Referenced classes of package com.jcp.fragments:
//            dy, ProductDetailFragment

class dz
    implements Runnable
{

    final dy a;

    dz(dy dy1)
    {
        a = dy1;
        super();
    }

    public void run()
    {
        ProductDetailFragment.g(a.b, false);
    }
}
