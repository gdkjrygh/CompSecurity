// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewFragment

class bm
    implements Runnable
{

    final ThreadViewFragment a;

    bm(ThreadViewFragment threadviewfragment)
    {
        a = threadviewfragment;
        super();
    }

    public void run()
    {
        a.Q();
    }
}
