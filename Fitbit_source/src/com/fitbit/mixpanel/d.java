// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;


// Referenced classes of package com.fitbit.mixpanel:
//            j, MixPanelTrackingHelper

public class d extends j
{

    private static final String a = "FConnect: Cancel Setup";

    public d(String s)
    {
        super(s);
        MixPanelTrackingHelper.a(MixPanelTrackingHelper.PairingStatus.a);
    }

    public String a()
    {
        return "FConnect: Cancel Setup";
    }
}
