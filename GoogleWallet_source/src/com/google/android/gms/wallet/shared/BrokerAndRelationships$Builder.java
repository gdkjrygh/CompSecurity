// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;


// Referenced classes of package com.google.android.gms.wallet.shared:
//            BrokerAndRelationships

public final class <init>
{

    final BrokerAndRelationships aVA;

    public final BrokerAndRelationships build()
    {
        return aVA;
    }

    public final aVA setBrokerId(String s)
    {
        aVA.aVy = s;
        return this;
    }

    public final aVA setRelationships(String as[])
    {
        aVA.aVz = as;
        return this;
    }

    private I(BrokerAndRelationships brokerandrelationships)
    {
        aVA = brokerandrelationships;
        super();
    }

    aVA(BrokerAndRelationships brokerandrelationships, aVA ava)
    {
        this(brokerandrelationships);
    }
}
