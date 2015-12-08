// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.ui.main.core;

import android.content.Context;
import com.nbcsports.liveextra.library.configuration.Configuration;
import com.nbcsports.liveextra.library.configuration.Sport;
import com.phunware.nbc.sochi.fragments.FavoritesFragment;
import com.phunware.nbc.sochi.fragments.SochiAlertSettingsFragment;
import com.phunware.nbc.sochi.fragments.SochiApplicationSettingsFragment;

// Referenced classes of package com.nbcsports.liveextra.ui.main.core:
//            SectionSelectorBase, Section

public class SectionSelector extends SectionSelectorBase
{

    public SectionSelector(Context context)
    {
        super(context);
    }

    public Section getSection(int i, Sport sport, Configuration configuration)
    {
        Section section = new Section(i);
        switch (i)
        {
        default:
            return super.getSection(i, sport, configuration);

        case 6: // '\006'
            section.setTitle("Alerts");
            section.setFragment(SochiAlertSettingsFragment.getInstance());
            section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Alerts", "Alerts", "Alerts", null));
            return section;

        case 7: // '\007'
            section.setTitle(getString(0x7f070111));
            section.setFragment(new FavoritesFragment());
            section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Favorites:Extra", "Favorites", "Featured", null));
            return section;

        case 8: // '\b'
            section.setTitle(getString(0x7f070186));
            break;
        }
        section.setFragment(new SochiApplicationSettingsFragment());
        section.setPageInfo(new com.phunware.nbc.sochi.metrics.TrackingHelperBase.PageInfo(":Settings", "Settings", null, null));
        return section;
    }

    protected boolean isTelemundo()
    {
        return false;
    }
}
