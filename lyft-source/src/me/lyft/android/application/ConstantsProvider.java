// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.lyft.android.ILyftPreferences;
import me.lyft.android.analytics.studies.AppAnalytics;
import me.lyft.android.common.Objects;
import me.lyft.android.domain.tooltips.Tooltip;
import me.lyft.android.domain.tooltips.TooltipsMapper;
import me.lyft.android.infrastructure.lyft.constants.AppInfo;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import me.lyft.android.infrastructure.lyft.constants.HintMetaDTO;
import me.lyft.android.infrastructure.lyft.constants.RideTypeMeta;

// Referenced classes of package me.lyft.android.application:
//            IConstantsProvider

public class ConstantsProvider
    implements IConstantsProvider
{

    private static final String DEFAULT_API_ROOT = "https://api.lyft.com";
    private static final String ENVOY_API_ROOT = "https://api-iad-1.lyft.com";
    private AppInfo appInfo;
    private ILyftPreferences preferences;

    public ConstantsProvider(ILyftPreferences ilyftpreferences)
    {
        preferences = ilyftpreferences;
        AppInfo appinfo = ilyftpreferences.getAppInfo();
        if (appinfo != null)
        {
            appInfo = appinfo;
        } else
        {
            appInfo = AppInfo.empty();
        }
        if ("https://api-iad-1.lyft.com".equals(ilyftpreferences.getLyftApiRoot()))
        {
            ilyftpreferences.setLyftApiRoot("https://api.lyft.com");
        }
    }

    private void updateTooltips(AppInfo appinfo)
    {
        this;
        JVM INSTR monitorenter ;
        Object obj = appinfo.getHints();
        if (obj != null) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        int i;
        appinfo = appinfo.getHints();
        obj = new ArrayList(appinfo.size());
        i = appinfo.size() - 1;
_L4:
        if (i < 0)
        {
            break; /* Loop/switch isn't completed */
        }
        HintMetaDTO hintmetadto = (HintMetaDTO)appinfo.get(i);
        ((List) (obj)).add(TooltipsMapper.createTooltip(hintmetadto, preferences.getTooltip(hintmetadto.getId())));
        i--;
        if (true) goto _L4; else goto _L3
_L3:
        preferences.clearTooltips();
        appinfo = ((List) (obj)).iterator();
        while (appinfo.hasNext()) 
        {
            saveTooltip((Tooltip)appinfo.next());
        }
        if (true) goto _L1; else goto _L5
_L5:
        appinfo;
        throw appinfo;
    }

    public String getAppInfoRevision()
    {
        return (String)Objects.firstNonNull(appInfo.getRevision(), "");
    }

    public Constants getConstants()
    {
        return (Constants)Objects.firstNonNull(appInfo.getConstants(), Constants.empty());
    }

    public RideTypeMeta getRideTypeMetaById(String s)
    {
        for (Iterator iterator = getRideTypeMetas().iterator(); iterator.hasNext();)
        {
            RideTypeMeta ridetypemeta = (RideTypeMeta)iterator.next();
            if (ridetypemeta.getId().equals(s))
            {
                return ridetypemeta;
            }
        }

        return me.lyft.android.infrastructure.lyft.constants.RideTypeMeta.NullRideTypeMeta.getInstance();
    }

    public List getRideTypeMetas()
    {
        return (List)Objects.firstNonNull(appInfo.getRideTypeMetas(), Collections.emptyList());
    }

    public Tooltip getTooltip(String s)
    {
        return (Tooltip)Objects.firstNonNull(preferences.getTooltip(s), Tooltip.empty());
    }

    public void saveTooltip(Tooltip tooltip)
    {
        preferences.saveTooltip(tooltip);
    }

    public void update(AppInfo appinfo)
    {
        if (appinfo == null)
        {
            return;
        } else
        {
            Map map = (Map)Objects.firstNonNull(appInfo.getTests(), Collections.emptyMap());
            AppAnalytics.trackTestsChanged((Map)Objects.firstNonNull(appinfo.getTests(), Collections.emptyMap()), map);
            appInfo = appinfo;
            preferences.setAppInfo(appinfo);
            updateTooltips(appinfo);
            return;
        }
    }
}
