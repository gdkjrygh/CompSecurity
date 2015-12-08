// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;


// Referenced classes of package com.mopub.nativeads:
//            ae

final class af
    implements Runnable
{

    final ae a;

    af(ae ae1)
    {
        a = ae1;
        super();
    }

    public final void run()
    {
        a.b = false;
        a.c();
    }
}
