// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class fpy
    implements sz
{

    private com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration a;
    private fpw b;

    public fpy(com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration, fpw fpw1)
    {
        a = adslotconfiguration;
        b = fpw1;
    }

    public final void a(sv sv1)
    {
        ta ta1;
        int i;
        ta1 = sv1.a();
        sv1 = sv1.b();
        i = -1;
        if (ta1 == null) goto _L2; else goto _L1
_L1:
        i = ta1.a();
_L4:
        a.mBackgroundProminentColor = i;
        b.a(a);
        return;
_L2:
        if (sv1 != null)
        {
            i = sv1.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }
}
