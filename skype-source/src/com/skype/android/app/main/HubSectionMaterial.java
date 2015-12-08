// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.android.ads.AdPlacement;
import com.skype.android.analytics.AnalyticsEvent;

public final class HubSectionMaterial extends Enum
{

    private static final HubSectionMaterial $VALUES[];
    public static final HubSectionMaterial CONTACTS;
    public static final HubSectionMaterial DIALER;
    public static final HubSectionMaterial RECENTS;
    private AdPlacement adPlacement;
    private AnalyticsEvent analyticsEvent;
    private int index;

    private HubSectionMaterial(String s, int i, int j, AnalyticsEvent analyticsevent, AdPlacement adplacement)
    {
        super(s, i);
        index = j;
        analyticsEvent = analyticsevent;
        adPlacement = adplacement;
    }

    public static HubSectionMaterial forIndex(int i)
    {
        HubSectionMaterial ahubsectionmaterial[] = values();
        int k = ahubsectionmaterial.length;
        for (int j = 0; j < k; j++)
        {
            HubSectionMaterial hubsectionmaterial = ahubsectionmaterial[j];
            if (hubsectionmaterial.getIndex() == i)
            {
                return hubsectionmaterial;
            }
        }

        return null;
    }

    public static HubSectionMaterial valueOf(String s)
    {
        return (HubSectionMaterial)Enum.valueOf(com/skype/android/app/main/HubSectionMaterial, s);
    }

    public static HubSectionMaterial[] values()
    {
        return (HubSectionMaterial[])$VALUES.clone();
    }

    public final AdPlacement getAdPlacement()
    {
        return adPlacement;
    }

    public final AnalyticsEvent getAnalyticsEvent()
    {
        return analyticsEvent;
    }

    public final int getIndex()
    {
        return index;
    }

    static 
    {
        RECENTS = new HubSectionMaterial("RECENTS", 0, 0, AnalyticsEvent.ar, AdPlacement.a);
        CONTACTS = new HubSectionMaterial("CONTACTS", 1, 1, AnalyticsEvent.a, AdPlacement.c);
        DIALER = new HubSectionMaterial("DIALER", 2, 2, AnalyticsEvent.dj, AdPlacement.e);
        $VALUES = (new HubSectionMaterial[] {
            RECENTS, CONTACTS, DIALER
        });
    }
}
