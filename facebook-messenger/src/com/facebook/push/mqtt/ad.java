// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.push.mqtt;


// Referenced classes of package com.facebook.push.mqtt:
//            aa, v, ag

class ad
    implements Runnable
{

    final String a;
    final aa b;

    ad(aa aa1, String s)
    {
        b = aa1;
        a = s;
        super();
    }

    public void run()
    {
        if (v.b(b.a) == aa.a(b))
        {
            v.a(b.a, ag.CONNECTION_LOST, a);
        }
    }
}
