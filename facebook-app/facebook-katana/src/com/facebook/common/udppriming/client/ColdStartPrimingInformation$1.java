// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.udppriming.client;


// Referenced classes of package com.facebook.common.udppriming.client:
//            ColdStartPrimingInformation

class a
    implements Runnable
{

    final boolean a;
    final ColdStartPrimingInformation b;

    public void run()
    {
        b.a(a);
    }

    I(ColdStartPrimingInformation coldstartpriminginformation, boolean flag)
    {
        b = coldstartpriminginformation;
        a = flag;
        super();
    }
}
