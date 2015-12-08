// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;


// Referenced classes of package com.mopub.network:
//            ScribeRequestManager

final class g
    implements Runnable
{

    final ScribeRequestManager a;

    g(ScribeRequestManager scriberequestmanager)
    {
        a = scriberequestmanager;
        super();
    }

    public final void run()
    {
        a.c();
    }
}
