// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            ap, ao

class aq
    implements Runnable
{

    final ao a;
    final ap b;

    aq(ap ap1, ao ao)
    {
        b = ap1;
        a = ao;
        super();
    }

    public void run()
    {
        ap.a(b, a);
    }
}
