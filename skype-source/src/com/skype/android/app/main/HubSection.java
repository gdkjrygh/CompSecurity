// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.main;

import com.skype.android.ads.AdPlacement;
import com.skype.android.analytics.AnalyticsEvent;

public final class HubSection extends Enum
{

    private static final HubSection $VALUES[];
    public static final HubSection CONTACTS;
    public static final HubSection FAVORITES;
    public static final HubSection RECENTS;
    private AdPlacement adPlacement;
    private AnalyticsEvent analyticsEvent;
    private int index;

    private HubSection(String s, int i, int j, AnalyticsEvent analyticsevent, AdPlacement adplacement)
    {
        super(s, i);
        index = j;
        analyticsEvent = analyticsevent;
        adPlacement = adplacement;
    }

    public static HubSection forIndex(int i)
    {
        HubSection ahubsection[] = values();
        int k = ahubsection.length;
        for (int j = 0; j < k; j++)
        {
            HubSection hubsection = ahubsection[j];
            if (hubsection.getIndex() == i)
            {
                return hubsection;
            }
        }

        return null;
    }

    public static HubSection valueOf(String s)
    {
        return (HubSection)Enum.valueOf(com/skype/android/app/main/HubSection, s);
    }

    public static HubSection[] values()
    {
        return (HubSection[])$VALUES.clone();
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
        RECENTS = new HubSection("RECENTS", 0, 0, AnalyticsEvent.ar, AdPlacement.a);
        FAVORITES = new HubSection("FAVORITES", 1, 1, AnalyticsEvent.az, AdPlacement.b);
        CONTACTS = new HubSection("CONTACTS", 2, 2, AnalyticsEvent.a, AdPlacement.c);
        $VALUES = (new HubSection[] {
            RECENTS, FAVORITES, CONTACTS
        });
    }
}
