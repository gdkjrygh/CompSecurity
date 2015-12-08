// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class fpw
{

    private Set a;
    private fpx b;

    fpw(Set set, fpx fpx1)
    {
        a = set;
        b = fpx1;
        if (set.isEmpty())
        {
            b.a();
        }
    }

    final void a(com.spotify.mobile.android.ui.activity.dynamicupsell.DynamicUpsellConfig.AdSlotConfiguration adslotconfiguration)
    {
        a.remove(adslotconfiguration);
        if (a.isEmpty())
        {
            b.a();
        }
    }
}
