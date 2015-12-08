// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver.achievements.dials;

import android.content.Context;
import android.content.res.Resources;
import java.util.concurrent.TimeUnit;

// Referenced classes of package me.lyft.android.ui.driver.achievements.dials:
//            DialView

public class TimeDialView extends DialView
{

    public TimeDialView(Context context)
    {
        super(context);
    }

    String getProgressTextValue(int i)
    {
        long l = TimeUnit.SECONDS.toHours(i);
        long l1 = TimeUnit.SECONDS.toMinutes((long)i - TimeUnit.HOURS.toSeconds(l));
        if (l1 == 0L)
        {
            return getResources().getString(0x7f07015b, new Object[] {
                Long.valueOf(l)
            });
        } else
        {
            return getResources().getString(0x7f07015a, new Object[] {
                Long.valueOf(l), Long.valueOf(l1)
            });
        }
    }
}
