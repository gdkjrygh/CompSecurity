// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import android.text.TextUtils;
import android.view.View;
import android.widget.AdapterView;
import com.fitbit.customui.WaterEditText;
import com.fitbit.customui.WaterQuickAddSelector;
import com.fitbit.util.bt;
import com.fitbit.water.Water;

// Referenced classes of package com.fitbit.water.ui:
//            AddWaterActivity

class a
    implements android.widget.electedListener
{

    final AddWaterActivity a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (!AddWaterActivity.f(a))
        {
            if (!TextUtils.equals(AddWaterActivity.b(a).getText().toString(), ""))
            {
                AddWaterActivity.a(a, new Water(bt.a(AddWaterActivity.b(a).getText().toString()), AddWaterActivity.d(a)));
                AddWaterActivity.a(a, com.fitbit.data.domain.Units.values()[i]);
                AddWaterActivity.a(a, AddWaterActivity.a(a).a(AddWaterActivity.d(a)));
                AddWaterActivity.b(a).b(bt.a(AddWaterActivity.a(a).b(), 2));
                AddWaterActivity.g(a).a((com.fitbit.data.domain.Units)AddWaterActivity.a(a).a());
                return;
            } else
            {
                AddWaterActivity.a(a, com.fitbit.data.domain.Units.values()[i]);
                AddWaterActivity.g(a).a(AddWaterActivity.d(a));
                return;
            }
        } else
        {
            AddWaterActivity.a(a, false);
            return;
        }
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    or(AddWaterActivity addwateractivity)
    {
        a = addwateractivity;
        super();
    }
}
