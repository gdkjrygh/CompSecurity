// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.mobileads;


// Referenced classes of package com.mopub.mobileads:
//            AdViewController

final class h
    implements Runnable
{

    final AdViewController a;

    h(AdViewController adviewcontroller)
    {
        a = adviewcontroller;
        super();
    }

    public final void run()
    {
        AdViewController.a(a);
    }
}
