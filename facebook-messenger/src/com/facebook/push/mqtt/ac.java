// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            aa, v, ag

class ac
    implements Runnable
{

    final aa a;

    ac(aa aa1)
    {
        a = aa1;
        super();
    }

    public void run()
    {
        if (v.b(a.a) == aa.a(a))
        {
            v.a(a.a, ag.CONNECT_FAILED, null);
        }
    }
}
