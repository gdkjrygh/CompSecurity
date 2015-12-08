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
    implements Runnable
{

    final AddWaterActivity a;

    public void run()
    {
        AddWaterActivity.b(a).b(bt.a(AddWaterActivity.a(a).b(), 2));
        a.e.findItem(0x7f1104e9).setEnabled(true);
        a.f.setEnabled(true);
        AddWaterActivity.c(a).removeCallbacks(this);
    }

    (AddWaterActivity addwateractivity)
    {
        a = addwateractivity;
        super();
    }
}
