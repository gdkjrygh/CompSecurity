// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            j, d, u, AdColonyAd

class nit> extends j
{

    final String a;
    final int b;
    final AdColonyAd c;
    final d d;

    void a()
    {
        ata.g g = new ata.g();
        g.b("v4vc_name", a);
        g.b("v4vc_amount", b);
        o.d.a("reward_v4vc", g, c);
    }

    lonyAd(d d1, d d2, String s, int i, AdColonyAd adcolonyad)
    {
        d = d1;
        a = s;
        b = i;
        c = adcolonyad;
        super(d2);
    }
}
