// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import com.fitbit.bluetooth.g;
import com.fitbit.data.bl.am;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.t;
import com.fitbit.data.domain.StepsGoal;
import com.fitbit.data.domain.ValueGoal;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.TrackerGoalType;
import com.fitbit.data.domain.p;
import com.fitbit.savedstate.s;
import com.fitbit.util.ap;
import com.fitbit.util.o;
import java.util.Date;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.fitbit.widget:
//            WidgetProgressBarSector, WidgetModel

class a
{

    private static final String a = "WidgetDataSource";

    a()
    {
    }

    public static Bitmap a(Context context, TrackerGoalType trackergoaltype, ValueGoal valuegoal)
    {
        double d = ValueGoal.a(valuegoal);
        double d1 = ValueGoal.b(valuegoal);
        int i = (int)((100D * d1) / d);
        WidgetProgressBarSector widgetprogressbarsector = WidgetProgressBarSector.a(d1, d);
        float f7 = ap.b(120F);
        float f6 = ap.b(140F);
        float f2 = ap.b(53F);
        float f1 = ap.b(13F);
        float f3 = f1 / 2.0F;
        float f4 = ap.b(14F);
        float f = f4 / 2.0F;
        Bitmap bitmap = widgetprogressbarsector.b(context);
        valuegoal = Bitmap.createBitmap((int)f7, (int)f6, android.graphics.Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(valuegoal);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setFilterBitmap(true);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setStrokeWidth(f1);
        paint.setARGB(15, 255, 255, 255);
        float f5 = f7 / 2.0F;
        float f8 = f6 / 2.0F;
        float f9;
        float f10;
        float f11;
        if (widgetprogressbarsector == WidgetProgressBarSector.d)
        {
            f1 = f;
        } else
        {
            f1 = 0.0F;
        }
        f8 -= f1;
        canvas.drawCircle(f5, f8, f2 - f3, paint);
        paint.setStyle(android.graphics.Paint.Style.STROKE);
        paint.setARGB(255, 133, 230, 231);
        paint.setShader(widgetprogressbarsector.a(f2, i));
        d = d1 / d;
        if (i > 95 && d < 0.995D)
        {
            i = 95;
        }
        f9 = 3.6F * (float)i;
        canvas.drawArc(new RectF((f5 - f2) + f3, (f8 - f2) + f3, (f5 + f2) - f3, (f8 + f2) - f3), 90F, f9, false, paint);
        paint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
        paint.setStrokeWidth(0.0F);
        f10 = f7 / 2.0F;
        f11 = f6 / 2.0F;
        if (widgetprogressbarsector == WidgetProgressBarSector.d)
        {
            f1 = f;
        } else
        {
            f1 = 0.0F;
        }
        canvas.drawCircle(f10, (f11 + f2) - f3 - f1, f3, paint);
        f1 = (float)((double)(f7 / 2.0F) + (double)(f2 - f3) * Math.cos((90F + f9) / 57.29578F));
        d = f6 / 2.0F;
        d1 = f2 - f3;
        f6 = (float)(Math.sin((90F + f9) / 57.29578F) * d1 + d);
        if (widgetprogressbarsector != WidgetProgressBarSector.d)
        {
            f = 0.0F;
        }
        canvas.drawCircle(f1, f6 - f, f3, paint);
        canvas.drawBitmap(bitmap, f5 - (float)(bitmap.getWidth() / 2), (f8 + f2) - f3 - (float)(bitmap.getHeight() / 2), null);
        trackergoaltype = trackergoaltype.getIcon(context, widgetprogressbarsector.ordinal());
        canvas.drawBitmap(trackergoaltype, f5 - (float)(trackergoaltype.getWidth() / 2), f8 - (float)(trackergoaltype.getHeight() / 2), null);
        if (widgetprogressbarsector == WidgetProgressBarSector.d)
        {
            context = context.getString(0x7f08059f);
            paint.setTypeface(Typeface.create("sans-serif-light", 0));
            paint.setTextSize(f4);
            canvas.drawText(context, f5 - paint.measureText(context) / 2.0F, f8 + f2 + f4, paint);
        }
        return valuegoal;
    }

    private ValueGoal a(ValueGoal valuegoal)
    {
        StepsGoal stepsgoal;
        p p1;
        Map map;
        stepsgoal = new StepsGoal();
        stepsgoal.b(Double.valueOf(ValueGoal.a(valuegoal)));
        p1 = am.a().b(new Date());
        if (p1 == null)
        {
            return valuegoal;
        }
        map = s.c();
        if (map == null || !map.containsKey("soft_tracker_data_offset_date_milliseconds_key")) goto _L2; else goto _L1
_L1:
        if (!o.i(new Date(((Number)map.get("soft_tracker_data_offset_date_milliseconds_key")).longValue())) || !map.containsKey("soft_tracker_data_offset_steps_key")) goto _L4; else goto _L3
_L3:
        valuegoal = (Number)map.get("soft_tracker_data_offset_steps_key");
        if (valuegoal == null) goto _L4; else goto _L5
_L5:
        double d;
        com.fitbit.e.a.a("WidgetDataSource", "Server offset is used for widget", new Object[0]);
        d = valuegoal.doubleValue();
_L7:
        valuegoal = s.d();
        double d1;
        int i;
        if (valuegoal != null)
        {
            i = valuegoal.size();
        } else
        {
            i = 0;
        }
        d1 = (double)(p1.getSteps() + i) + d;
        com.fitbit.e.a.a("WidgetDataSource", String.format("Summary[%d] + uncompleteSteps[%d] + offset[%f] = %f", new Object[] {
            Integer.valueOf(p1.getSteps()), Integer.valueOf(i), Double.valueOf(d), Double.valueOf(d1)
        }), new Object[0]);
        stepsgoal.a(Double.valueOf(d1));
        return stepsgoal;
_L2:
        com.fitbit.e.a.a("WidgetDataSource", "Goal result is used for widget", new Object[0]);
        d = valuegoal.c().doubleValue();
        continue; /* Loop/switch isn't completed */
_L4:
        d = 0.0D;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public WidgetModel a()
    {
        if (!an.a().g())
        {
            com.fitbit.e.a.a("WidgetDataSource", "User credentials are empty.", new Object[0]);
            return new WidgetModel(WidgetModel.WidgetErrorType.c);
        }
        if (an.a().b() == null)
        {
            com.fitbit.e.a.a("WidgetDataSource", "Unable to find profile.", new Object[0]);
            return new WidgetModel(WidgetModel.WidgetErrorType.c);
        }
        Object obj = t.a();
        if (obj == null)
        {
            com.fitbit.e.a.a("WidgetDataSource", "Unable to get GoalBusinessLogic.", new Object[0]);
            return new WidgetModel(WidgetModel.WidgetErrorType.b);
        }
        Device device = com.fitbit.util.p.f();
        if (device == null)
        {
            device = com.fitbit.util.p.m();
        }
        if (device != null && !g.d())
        {
            com.fitbit.e.a.a("WidgetDataSource", "Device not support tracker syncing", new Object[0]);
            return new WidgetModel(WidgetModel.WidgetErrorType.d);
        }
        TrackerGoalType trackergoaltype = com.fitbit.util.p.b(device);
        obj = ((t) (obj)).a(trackergoaltype, new Date());
        if (obj != null && device != null && device.h() == DeviceVersion.MOTIONBIT)
        {
            obj = a(((ValueGoal) (obj)));
        }
        if (obj == null)
        {
            com.fitbit.e.a.a("WidgetDataSource", "Unable to find goal.", new Object[0]);
            return new WidgetModel(WidgetModel.WidgetErrorType.b);
        } else
        {
            WidgetModel widgetmodel = new WidgetModel();
            widgetmodel.a(((ValueGoal) (obj)));
            widgetmodel.a(trackergoaltype);
            widgetmodel.a(device);
            return widgetmodel;
        }
    }
}
