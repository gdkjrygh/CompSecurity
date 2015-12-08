// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wallet.shared;

import com.google.android.gms.internal.xm;

// Referenced classes of package com.google.android.gms.wallet.shared:
//            BuyFlowConfig, ApplicationParameters

public final class <init>
{

    final BuyFlowConfig aVG;

    public final eters a(ApplicationParameters applicationparameters)
    {
        aVG.aVC = applicationparameters;
        return this;
    }

    public final C ei(String s)
    {
        aVG.aVD = s;
        return this;
    }

    public final D ej(String s)
    {
        aVG.aVE = s;
        return this;
    }

    public final BuyFlowConfig va()
    {
        if (aVG.aVB == null)
        {
            aVG.aVB = xm.uW();
        }
        return aVG;
    }

    private eters(BuyFlowConfig buyflowconfig)
    {
        aVG = buyflowconfig;
        super();
    }

    aVG(BuyFlowConfig buyflowconfig, aVG avg)
    {
        this(buyflowconfig);
    }
}
