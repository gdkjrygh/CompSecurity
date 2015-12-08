// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.appwidget;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.pinterest.api.remote.WidgetApi;
import com.pinterest.base.Application;
import com.pinterest.base.ApplicationInfo;
import com.pinterest.kit.application.Resources;
import com.pinterest.kit.data.Preferences;
import com.pinterest.kit.data.PreferencesManager;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.NetworkUtils;
import com.pinterest.networking.MccMnc;
import com.pinterest.networking.MccMncSet;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.pinterest.appwidget:
//            PWidgetProvider

public class WidgetValidator
{

    private static final long ENABLED_GRACE_PERIOD;
    public static final String Movistar = "Movistar";
    public static final String O2 = "O2";
    public static final String Vivo = "Vivo";
    private static HashMap sEligibleMap = new HashMap();

    public WidgetValidator()
    {
    }

    public static void addEligibleSet(MccMncSet mccmncset)
    {
        sEligibleMap.put(Integer.valueOf(mccmncset.b), mccmncset);
    }

    public static void addEligibleSets()
    {
        sEligibleMap.clear();
        for (int i = 310; i <= '\u013C'; i++)
        {
            addEligibleSet(new MccMncSet("US", i, new int[0]));
        }

        addEligibleSet(new MccMncSet("Canada", 302, new int[0]));
        addEligibleSet(new MccMncSet("O2", 262, new int[] {
            7
        }));
        addEligibleSet(new MccMncSet("Movistar", 214, new int[] {
            7
        }));
        addEligibleSet(new MccMncSet("O2", 234, new int[] {
            2, 10, 11
        }));
    }

    public static void enableWidget(Context context, boolean flag)
    {
        PackageManager packagemanager = context.getPackageManager();
        int i;
        int j;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 2;
        }
        context = new ComponentName(context, com/pinterest/appwidget/PWidgetProvider);
        j = packagemanager.getComponentEnabledSetting(context);
        PLog.info((new StringBuilder("enableWidget: ")).append(flag).append(" current: ").append(j).toString(), new Object[0]);
        if (j != i)
        {
            packagemanager.setComponentEnabledSetting(context, i, 1);
        }
    }

    private static long getCurrentTime()
    {
        return Calendar.getInstance().getTime().getTime();
    }

    public static long getLastEnabledTime()
    {
        return Preferences.persisted().getLong("PREF_WIDGET_LAST_ENABLED_DATE", 0L);
    }

    public static boolean isWidgetEligibleNow()
    {
        if (ApplicationInfo.isNonProduction())
        {
            return true;
        }
        MccMnc mccmnc = NetworkUtils.getInstance().getCarrierMccMnc();
        PLog.info("NetworkOperator: %s", new Object[] {
            mccmnc
        });
        if (!mccmnc.a())
        {
            return false;
        }
        MccMncSet mccmncset = (MccMncSet)sEligibleMap.get(Integer.valueOf(mccmnc.a));
        if (mccmncset == null)
        {
            return false;
        }
        int j = mccmnc.b;
        if (mccmncset.c == null)
        {
            return true;
        }
        int ai[] = mccmncset.c;
        int k = ai.length;
        for (int i = 0; i < k; i++)
        {
            if (ai[i] == j)
            {
                return true;
            }
        }

        return false;
    }

    public static void setLastEnabledTime()
    {
        Preferences.persisted().set("PREF_WIDGET_LAST_ENABLED_DATE", getCurrentTime());
    }

    public static boolean shouldShowWidget()
    {
        return shouldShowWidget(isWidgetEligibleNow());
    }

    public static boolean shouldShowWidget(boolean flag)
    {
        if (flag)
        {
            setLastEnabledTime();
        } else
        {
            long l = getLastEnabledTime();
            if (getCurrentTime() - l >= ENABLED_GRACE_PERIOD)
            {
                return false;
            }
        }
        return true;
    }

    public static void showIneligibleToast()
    {
        Object obj = NetworkUtils.getInstance().getCarrierMccMnc();
        if (!((MccMnc) (obj)).a()) goto _L2; else goto _L1
_L1:
        obj = (MccMncSet)sEligibleMap.get(Integer.valueOf(((MccMnc) (obj)).a));
        if (obj == null) goto _L2; else goto _L3
_L3:
        obj = ((MccMncSet) (obj)).a;
_L5:
        Application.showToast(String.format(Resources.string(0x7f070605), new Object[] {
            obj
        }));
        return;
_L2:
        obj = "Telefonica";
        if (true) goto _L5; else goto _L4
_L4:
    }

    public static void tryEnableWidget(final Context context, final boolean showToast)
    {
        if (ApplicationInfo.isPreinstalled())
        {
            return;
        } else
        {
            MccMnc mccmnc = NetworkUtils.getInstance().getCarrierMccMnc();
            WidgetApi.a(mccmnc.a, mccmnc.b, new _cls1());
            return;
        }
    }

    static 
    {
        ENABLED_GRACE_PERIOD = TimeUnit.MILLISECONDS.convert(5L, TimeUnit.DAYS);
        addEligibleSets();
    }

    private class _cls1 extends ApiResponseHandler
    {

        final Context val$context;
        final boolean val$showToast;

        public final void onSuccess(ApiResponse apiresponse)
        {
            super.onSuccess(apiresponse);
            apiresponse = (PinterestJsonObject)apiresponse.getData();
            boolean flag = WidgetValidator.shouldShowWidget(apiresponse.a("is_enabled").booleanValue());
            WidgetValidator.enableWidget(context, flag);
            if (!flag && showToast)
            {
                apiresponse.a("operator", "");
                WidgetValidator.showIneligibleToast();
            }
        }

        _cls1()
        {
            context = context1;
            showToast = flag;
            super();
        }
    }

}
