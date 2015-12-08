// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Spinner;
import com.fitbit.customui.WaterEditText;
import com.fitbit.util.bt;
import com.fitbit.water.Water;

// Referenced classes of package com.fitbit.water.ui:
//            AddWaterActivity

class a
    implements com.fitbit.customui.or.a
{

    final AddWaterActivity a;

    public void a(Water water)
    {
        if (AddWaterActivity.a(a).b() == 0.0D || AddWaterActivity.b(a).getText().toString().isEmpty())
        {
            AddWaterActivity.a(a, water.a(AddWaterActivity.d(a)));
            AddWaterActivity.b(a).b(bt.a(AddWaterActivity.a(a).b(), 2));
            return;
        } else
        {
            double d = water.a(AddWaterActivity.d(a)).b();
            AddWaterActivity.a(a).a(AddWaterActivity.a(a).b() + d);
            AddWaterActivity.b(a).a(bt.a(d, 2));
            a.e.findItem(0x7f1104e9).setEnabled(false);
            a.f.setEnabled(false);
            AddWaterActivity.c(a).postDelayed(AddWaterActivity.e(a), 1000L);
            return;
        }
    }

    or.a(AddWaterActivity addwateractivity)
    {
        a = addwateractivity;
        super();
    }
}
