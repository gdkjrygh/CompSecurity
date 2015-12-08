// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.mixpanel;


// Referenced classes of package com.fitbit.mixpanel:
//            j, f, MixPanelTrackingHelper

public class e extends j
{

    private static final String a = "FConnect: Done Button";

    public e(String s)
    {
        super(s);
        f.d();
        MixPanelTrackingHelper.a(MixPanelTrackingHelper.PairingStatus.b);
    }

    public String a()
    {
        return "FConnect: Done Button";
    }
}
