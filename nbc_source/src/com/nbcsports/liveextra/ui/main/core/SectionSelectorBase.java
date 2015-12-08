// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import android.content.ContextWrapper;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.phunware.nbc.sochi.fragments.EventReplayFragment;
import com.phunware.nbc.sochi.fragments.HighlightsFragment;
import com.phunware.nbc.sochi.fragments.HomeFragment;
import com.phunware.nbc.sochi.fragments.ScheduleFragment;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            Section

public abstract class SectionSelectorBase extends ContextWrapper
{

    public SectionSelectorBase(Context context)
    {
        super(context);
    }

    public Section getSection(int i, Sport sport, Configuration configuration)
    {
        Section section = new Section(i);
        String s;
        if (sport == null)
        {
            s = null;
        } else
        {
            s = sport.getName();
        }
        switch (i)
        {
        default:
            if (configuration.isHomepageDefaultTabHighlights())
            {
                return getSection(2, sport, configuration);
            }
            break;

        case 2: // '\002'
            if (sport == null)
            {
                sport = getString(0x7f07011b);
            } else
            {
                sport = sport.getName();
            }
            section.setTitle(sport);
            section.setFragment(HighlightsFragment.getInstance());
            section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Highlights", "Highlights", "Highlights", s));
            return section;

        case 3: // '\003'
            if (sport == null)
            {
                sport = getString(0x7f0700e5);
            } else
            {
                sport = sport.getName();
            }
            section.setTitle(sport);
            section.setFragment(EventReplayFragment.getInstance());
            section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":FullEventReplays", "Full Event Replays", "Full Event Replays", s));
            return section;

        case 4: // '\004'
            if (sport == null)
            {
                sport = getString(0x7f07017e);
            } else
            {
                sport = sport.getName();
            }
            section.setTitle(sport);
            section.setFragment(ScheduleFragment.getInstance());
            section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Schedule", "Schedule", null, s));
            return section;
        }
        section.setIndex(1);
        section.setSport(sport);
        if (sport == null)
        {
            sport = getString(0x7f070059);
        } else
        {
            sport = sport.getName();
        }
        section.setTitle(sport);
        section.setFragment(HomeFragment.getInstance());
        section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Live&Upcoming", "Live & Upcoming", "Live & Upcoming", s));
        return section;
    }

    protected abstract boolean isTelemundo();
}
