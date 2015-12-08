// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.applications;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import com.comscore.analytics.ApplicationState;
import com.comscore.analytics.Core;
import com.comscore.measurement.Label;
import com.comscore.measurement.Measurement;
import com.comscore.metrics.EventType;
import com.comscore.utils.API13;
import com.comscore.utils.OfflineMeasurementsCache;
import com.comscore.utils.id.IdHelper;
import java.util.HashMap;
import java.util.Locale;

// Referenced classes of package com.comscore.applications:
//            EventType, AppStartMeasurement, AggregateMeasurement

public class ApplicationMeasurement extends Measurement
{

    protected ApplicationMeasurement(Core core, com.comscore.applications.EventType eventtype, String s)
    {
        this(core, eventtype, s, false, false, true);
    }

    protected ApplicationMeasurement(Core core, com.comscore.applications.EventType eventtype, String s, boolean flag, boolean flag1, boolean flag2)
    {
        super(core);
        core.update(flag2);
        if (flag2)
        {
            int i = core.getForegroundTransitionsCountDelta(flag1);
            long l1 = core.getForegroundTotalTime(flag);
            long l3 = core.getForegroundTimeDelta(flag1);
            long l4 = core.getBackgroundTotalTime(flag);
            long l5 = core.getBackgroundTimeDelta(flag1);
            long l6 = core.getInactiveTotalTime(flag);
            long l7 = core.getInactiveTimeDelta(flag1);
            long l8 = core.getApplicationSessionTimeDelta(flag1);
            long l9 = core.getActiveUserSessionTimeDelta(flag1);
            long l10 = core.getUserSessionTimeDelta(flag1);
            long l11 = core.getAutoUpdateInterval();
            int k = core.getApplicationSessionCountDelta(flag1);
            int i1 = core.getActiveUserSessionCountDelta(flag1);
            int j1 = core.getUserSessionCountDelta(flag1);
            int k1 = core.getUserInteractionCount(flag1);
            setLabel(new Label("ns_ap_fg", String.valueOf(i), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_ft", String.valueOf(l1), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_dft", String.valueOf(l3), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_bt", String.valueOf(l4), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_dbt", String.valueOf(l5), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_it", String.valueOf(l6), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_dit", String.valueOf(l7), Boolean.valueOf(false)));
            if (l11 >= 60000L)
            {
                setLabel(new Label("ns_ap_ut", String.valueOf(l11), Boolean.valueOf(false)));
            }
            setLabel(new Label("ns_ap_as", String.valueOf(k), Boolean.valueOf(false)));
            setLabel(new Label("ns_ap_das", String.valueOf(l8), Boolean.valueOf(false)));
            if (i1 >= 0)
            {
                setLabel(new Label("ns_ap_aus", String.valueOf(i1), Boolean.valueOf(false)));
                setLabel(new Label("ns_ap_daus", String.valueOf(l9), Boolean.valueOf(false)));
                setLabel(new Label("ns_ap_uc", String.valueOf(k1), Boolean.valueOf(false)));
            }
            if (j1 >= 0)
            {
                setLabel(new Label("ns_ap_us", String.valueOf(j1), Boolean.valueOf(false)));
                setLabel(new Label("ns_ap_dus", String.valueOf(l10), Boolean.valueOf(false)));
            }
            setLabel(new Label("ns_ap_usage", Long.toString(c - core.getGenesis()), Boolean.valueOf(false)));
        }
        if (s != null)
        {
            setPixelURL(s);
        }
        setLabel(new Label("c1", "19", Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_an", core.getAppName(), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_pn", "android", Boolean.valueOf(false)));
        setLabel(new Label("c12", core.getVisitorId(), Boolean.valueOf(false)));
        if (core.getCrossPublisherId() != null)
        {
            setLabel(new Label("ns_ak", core.getCrossPublisherId(), Boolean.valueOf(false)));
            if (core.getIdHelper().isIdChanged())
            {
                setLabel(new Label("ns_ap_ni", "1", Boolean.valueOf(false)));
            }
        }
        if (core.getIdHelper().getMD5AdvertisingId() != null)
        {
            setLabel("ns_ap_i3", core.getIdHelper().getMD5AdvertisingId());
        }
        setLabel(new Label("ns_ap_device", Build.DEVICE, Boolean.valueOf(false)));
        setLabel(new Label("ns_type", a(eventtype).toString(), Boolean.valueOf(false)));
        setLabel(new Label("ns_ts", Long.toString(c), Boolean.valueOf(false)));
        setLabel(new Label("ns_nc", "1", Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_pfv", android.os.Build.VERSION.RELEASE, Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_pfm", "android", Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_ev", eventtype.toString(), Boolean.valueOf(false)));
        s = core.getAppContext();
        setLabel(new Label("ns_ap_ver", core.getCurrentVersion(), Boolean.valueOf(false)));
        s = a(s);
        int j = ((Point) (s)).x;
        int l = ((Point) (s)).y;
        setLabel(new Label("ns_ap_res", (new StringBuilder()).append(Integer.toString(j)).append("x").append(Integer.toString(l)).toString(), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_lang", Locale.getDefault().getLanguage(), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_sv", core.getVersion(), Boolean.valueOf(false)));
        if (eventtype.equals(EventType.KEEPALIVE))
        {
            setLabel("ns_ap_oc", String.valueOf(core.getOfflineCache().getEventCount()));
        }
        long l2 = core.getColdStartId();
        j = core.getColdStartCount();
        setLabel(new Label("ns_ap_id", String.valueOf(l2), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_cs", String.valueOf(j), Boolean.valueOf(false)));
        setLabel(new Label("ns_ap_bi", core.getAppContext().getPackageName(), Boolean.valueOf(false)));
    }

    private Point a(Context context)
    {
        Point point = new Point();
        context = ((WindowManager)context.getSystemService("window")).getDefaultDisplay();
        if (android.os.Build.VERSION.SDK_INT >= 13)
        {
            return API13.getDisplaySize(context);
        } else
        {
            point.x = context.getWidth();
            point.y = context.getHeight();
            return point;
        }
    }

    private static EventType a(com.comscore.applications.EventType eventtype)
    {
        if (eventtype == EventType.START || eventtype == EventType.CLOSE || eventtype == EventType.VIEW)
        {
            return EventType.VIEW;
        } else
        {
            return EventType.HIDDEN;
        }
    }

    public static ApplicationMeasurement newApplicationMeasurement(Core core, com.comscore.applications.EventType eventtype, HashMap hashmap, String s)
    {
        Object obj;
label0:
        {
            boolean flag2 = true;
            obj = null;
            boolean flag;
            if (eventtype == EventType.START)
            {
                core.incrementRunsCount();
                obj = new AppStartMeasurement(core, eventtype, s, core.handleColdStart());
            } else
            if (eventtype == EventType.AGGREGATE)
            {
                obj = new AggregateMeasurement(core, eventtype, s);
            } else
            if (eventtype != EventType.CLOSE)
            {
                boolean flag1;
                if (hashmap == null || hashmap.get("ns_st_ev") != "hb")
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (hashmap == null || !hashmap.containsKey("ns_st_ev"))
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                obj = new ApplicationMeasurement(core, eventtype, s, false, flag, flag1);
            }
            if (eventtype != EventType.AGGREGATE)
            {
                ((ApplicationMeasurement) (obj)).a(core.getLabels());
            }
            if (eventtype == EventType.AGGREGATE)
            {
                flag = flag2;
            } else
            {
                flag = false;
            }
            ((ApplicationMeasurement) (obj)).a(hashmap, flag);
            if (!((ApplicationMeasurement) (obj)).hasLabel("name").booleanValue())
            {
                if (core.getCurrentActivityName() == null)
                {
                    break label0;
                }
                ((ApplicationMeasurement) (obj)).setLabel("name", core.getCurrentActivityName());
            }
            return ((ApplicationMeasurement) (obj));
        }
        if (eventtype == EventType.START)
        {
            ((ApplicationMeasurement) (obj)).setLabel("name", "start");
            return ((ApplicationMeasurement) (obj));
        }
        if (core.getApplicationState() == ApplicationState.FOREGROUND)
        {
            ((ApplicationMeasurement) (obj)).setLabel("name", "foreground");
            return ((ApplicationMeasurement) (obj));
        } else
        {
            ((ApplicationMeasurement) (obj)).setLabel("name", "background");
            return ((ApplicationMeasurement) (obj));
        }
    }
}
