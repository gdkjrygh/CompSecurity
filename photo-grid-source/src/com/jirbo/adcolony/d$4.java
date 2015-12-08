// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;


// Referenced classes of package com.jirbo.adcolony:
//            j, AdColonyAd, AdColony, ag, 
//            d

class nit> extends j
{

    final AdColonyAd a;
    final d b;

    void a()
    {
        if (AdColony.isZoneV4VC(a.g) || !a.k.equals("native"))
        {
            b.a("start", (new StringBuilder("{\"ad_slot\":")).append(a.h.k.d).append(", \"replay\":").append(a.s).append("}").toString(), a);
        }
    }

    lonyAd(d d1, d d2, AdColonyAd adcolonyad)
    {
        b = d1;
        a = adcolonyad;
        super(d2);
    }
}
