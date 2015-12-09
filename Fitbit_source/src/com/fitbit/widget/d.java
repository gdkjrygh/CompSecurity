// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.widget.RemoteViews;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.home.ui.i;
import com.fitbit.onboarding.landing.LandingActivity_;
import com.fitbit.util.format.e;

// Referenced classes of package com.fitbit.widget:
//            WidgetProgressBarSector, WidgetModel, a

class d
{

    private static final String c = "setTextSize";
    private final RemoteViews a;
    private final Context b;

    public d(Context context)
    {
        b = context;
        a = new RemoteViews(context.getPackageName(), 0x7f0401e5);
        b();
    }

    private int a(ValueGoal valuegoal)
    {
        return WidgetProgressBarSector.a(ValueGoal.b(valuegoal), ValueGoal.a(valuegoal)).a(b);
    }

    private static String a(ValueGoal valuegoal, TrackerGoalType trackergoaltype)
    {
        if (trackergoaltype == TrackerGoalType.DISTANCE)
        {
            return com.fitbit.util.format.e.b(b(valuegoal, trackergoaltype));
        } else
        {
            return com.fitbit.util.format.e.g(b(valuegoal, trackergoaltype));
        }
    }

    private String a(String s, TrackerGoalType trackergoaltype)
    {
        if (trackergoaltype == TrackerGoalType.DISTANCE)
        {
            return c().getQuantityDisplayName(s);
        } else
        {
            return trackergoaltype.getGoalUnit(b, s);
        }
    }

    private void a(WidgetModel.WidgetErrorType widgeterrortype)
    {
    /* anonymous class not found */
    class _anm1 {}

        switch (_cls1.a[widgeterrortype.ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            a.setViewVisibility(0x7f1104cd, 8);
            a.setViewVisibility(0x7f1104c8, 0);
            return;

        case 2: // '\002'
            a.setViewVisibility(0x7f1104c8, 8);
            a.setViewVisibility(0x7f1104cd, 0);
            a.setViewVisibility(0x7f1104ce, 0);
            a.setFloat(0x7f11009d, "setTextSize", 22F);
            a.setTextViewText(0x7f11009d, b.getString(0x7f0805a2));
            return;

        case 3: // '\003'
            a.setViewVisibility(0x7f1104c8, 8);
            a.setViewVisibility(0x7f1104cd, 0);
            a.setViewVisibility(0x7f1104ce, 0);
            a.setFloat(0x7f11009d, "setTextSize", 22F);
            a.setTextViewText(0x7f11009d, b.getString(0x7f0805a0));
            return;

        case 4: // '\004'
            a.setViewVisibility(0x7f1104c8, 8);
            break;
        }
        a.setViewVisibility(0x7f1104cd, 0);
        a.setViewVisibility(0x7f1104ce, 8);
        a.setFloat(0x7f11009d, "setTextSize", 17F);
        a.setTextViewText(0x7f11009d, b.getString(0x7f0805a1));
    }

    private static double b(ValueGoal valuegoal, TrackerGoalType trackergoaltype)
    {
        if (trackergoaltype != TrackerGoalType.DISTANCE) goto _L2; else goto _L1
_L1:
        if (valuegoal != null) goto _L4; else goto _L3
_L3:
        return 0.0D;
_L4:
        return c().convert(ValueGoal.b(valuegoal), com.fitbit.data.domain.Length.LengthUnits.KM);
_L2:
        if (valuegoal != null)
        {
            return ValueGoal.b(valuegoal);
        }
        if (true) goto _L3; else goto _L5
_L5:
    }

    private void b()
    {
        Object obj = LandingActivity_.b(b).a();
        ((Intent) (obj)).putExtra("id", 0x7f110023);
        obj = PendingIntent.getActivity(b, 0, ((Intent) (obj)), 0x10000000);
        a.setOnClickPendingIntent(0x7f1104c7, ((PendingIntent) (obj)));
    }

    private void b(WidgetModel widgetmodel)
    {
        d(widgetmodel);
        c(widgetmodel);
        e(widgetmodel);
    }

    private static com.fitbit.data.domain.Length.LengthUnits c()
    {
        Profile profile = an.a().b();
        if (profile != null)
        {
            return profile.t();
        } else
        {
            return com.fitbit.data.domain.Length.LengthUnits.KM;
        }
    }

    private void c(WidgetModel widgetmodel)
    {
        if (widgetmodel.a() != null && widgetmodel.c() != null)
        {
            a.setImageViewBitmap(0x7f1104c9, com.fitbit.widget.a.a(b, widgetmodel.c(), widgetmodel.a()));
        }
    }

    private void d(WidgetModel widgetmodel)
    {
        String s = a(widgetmodel.a(), widgetmodel.c());
        a.setTextViewText(0x7f1103ea, a(s, widgetmodel.c()));
        a.setTextViewText(0x7f1104ca, s);
        a.setTextColor(0x7f1104ca, a(widgetmodel.a()));
    }

    private void e(WidgetModel widgetmodel)
    {
        if (widgetmodel.b() != null)
        {
            widgetmodel = (new i()).a(widgetmodel.b().e(), b, 0x7f080157);
            a.setTextViewText(0x7f1104cb, widgetmodel);
            a.setViewVisibility(0x7f1104cb, 0);
            return;
        } else
        {
            a.setViewVisibility(0x7f1104cb, 8);
            return;
        }
    }

    public RemoteViews a()
    {
        return a;
    }

    public void a(WidgetModel widgetmodel)
    {
        a(widgetmodel.d());
        if (widgetmodel.d() != WidgetModel.WidgetErrorType.a)
        {
            return;
        } else
        {
            b(widgetmodel);
            return;
        }
    }
}
