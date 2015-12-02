// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;


// Referenced classes of package com.facebook.orca.threadview:
//            ThreadViewMessageFragment

class dg
    implements Runnable
{

    final ThreadViewMessageFragment a;

    dg(ThreadViewMessageFragment threadviewmessagefragment)
    {
        a = threadviewmessagefragment;
        super();
    }

    public void run()
    {
        ThreadViewMessageFragment.a(a, false);
    }
}
