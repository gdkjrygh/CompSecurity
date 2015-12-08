// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import com.comscore.utils.InstallReferrerReceiver;
import com.comscore.utils.RootDetector;
import com.comscore.utils.Storage;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

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
        eventtype = core.getPreviousVersion();
        if (eventtype != null && eventtype.length() > 0)
        {
            setLabel(new Label("ns_ap_updated", eventtype, Boolean.valueOf(false)));
        }
        eventtype = core.getStorage().get("exception_ocurrences");
        if (eventtype != null && eventtype.length() > 0 && !eventtype.equals("0"))
        {
            setLabel(new Label("ns_ap_er", eventtype, Boolean.valueOf(false)));
            core.getStorage().remove("exception_ocurrences");
        }
        if (flag)
        {
            core = InstallReferrerReceiver.retrieveReferrerLabels(core.getAppContext());
            if (core != null)
            {
                for (eventtype = core.keySet().iterator(); eventtype.hasNext(); setLabel(s, (String)core.get(s)))
                {
                    s = (String)eventtype.next();
                }

            }
        }
    }
}
