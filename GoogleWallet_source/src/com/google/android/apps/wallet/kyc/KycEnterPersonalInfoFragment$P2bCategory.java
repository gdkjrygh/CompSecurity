// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.kyc;


// Referenced classes of package com.google.android.apps.wallet.kyc:
//            KycEnterPersonalInfoFragment

public static final class displayableP2pCommercialUse
{

    private final com.google.wallet.proto.alUses.DisplayableP2pCommercialUse displayableP2pCommercialUse;

    public final Integer getP2pCommercialUseType()
    {
        return displayableP2pCommercialUse.p2PCommercialUseType;
    }

    public final String toString()
    {
        return displayableP2pCommercialUse.displayName;
    }

    public layableP2pCommercialUse(com.google.wallet.proto.alUses.DisplayableP2pCommercialUse displayablep2pcommercialuse)
    {
        displayableP2pCommercialUse = displayablep2pcommercialuse;
    }
}
