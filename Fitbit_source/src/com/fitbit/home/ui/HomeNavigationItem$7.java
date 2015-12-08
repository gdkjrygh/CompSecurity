// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.content.Context;
import com.fitbit.alarm.ui.AlarmActivity;
import com.fitbit.alarm.ui.ChooseAlarmActivity;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceFeature;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.home.ui:
//            HomeNavigationItem

static final class s extends HomeNavigationItem
{

    void a(Context context)
    {
        List list = p.b(DeviceFeature.ALARMS);
        if (list != null && list.size() == 1)
        {
            AlarmActivity.a(context, (Device)list.get(0));
            return;
        } else
        {
            ChooseAlarmActivity.a(context);
            return;
        }
    }

    s(String s, int i, com.fitbit.ui.drawer.e e, com.fitbit.ui.drawer.e e1, int j)
    {
        super(s, i, e, e1, j, null);
    }
}
