// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            ca

class cd
    implements Runnable
{

    final ca a;

    cd(ca ca1)
    {
        a = ca1;
        super();
    }

    public void run()
    {
        ca.b(a);
    }
}
