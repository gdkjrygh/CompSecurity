// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.compose;


// Referenced classes of package com.facebook.orca.compose:
//            ComposeFragment

class w
    implements Runnable
{

    final ComposeFragment a;

    w(ComposeFragment composefragment)
    {
        a = composefragment;
        super();
    }

    public void run()
    {
        ComposeFragment.e(a, false);
        ComposeFragment.a(a, false, false);
    }
}
