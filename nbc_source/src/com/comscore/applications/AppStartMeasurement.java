// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import com.comscore.utils.RootDetector;

// Referenced classes of package com.comscore.applications:
//            ApplicationMeasurement, EventType

public class AppStartMeasurement extends ApplicationMeasurement
{

    protected AppStartMeasurement(Core core, EventType eventtype, String s, boolean flag)
    {
        super(core, eventtype, s, flag, true, true);
        setLabel(new Label("ns_ap_gs", String.valueOf(core.getFirstInstallId()), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_install", String.valueOf(core.getInstallId()), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_runs", String.valueOf(core.getRunsCount()), Boolean.valueOf(false)));
        if (flag)
        {
            setLabel(new Label("ns_ap_csf", "1", Boolean.valueOf(false)));
        }
        eventtype = "0";
        if (RootDetector.isDeviceRooted())
        {
            eventtype = "1";
        }
        setLabel(new Label("ns_ap_jb", eventtype, Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_lastrun", String.valueOf(core.getPreviousGenesis()), Boolean.valueOf(false)));
        core = core.getPreviousVersion();
        if (core != null && core.length() > 0)
        {
            setLabel(new Label("ns_ap_updated", core, Boolean.valueOf(false)));
        }
    }
}
