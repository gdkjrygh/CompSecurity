// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.ubercab.android.partner.funnel.core.apps.PartnerFunnelActivity;

public final class coi
{

    private final PartnerFunnelActivity a;
    private boolean b;

    public coi(PartnerFunnelActivity partnerfunnelactivity)
    {
        a = partnerfunnelactivity;
    }

    public final coi a()
    {
        b = true;
        return this;
    }

    public final coh b()
    {
        return new coh(a, b);
    }
}
