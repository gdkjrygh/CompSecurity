// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.water.ui;

import com.fitbit.customui.WaterEditText;
import com.fitbit.e.a;
import com.fitbit.util.bt;

// Referenced classes of package com.fitbit.water.ui:
//            AddWaterActivity

class a
    implements com.fitbit.customui.a
{

    final AddWaterActivity a;

    public void a()
    {
        String s = AddWaterActivity.b(a).getText().toString();
        if (s.contains("+"))
        {
            return;
        }
        try
        {
            a.a(bt.a(s));
            return;
        }
        catch (NumberFormatException numberformatexception)
        {
            com.fitbit.e.a.f(AddWaterActivity.g(), "Error converting double from String.", numberformatexception, new Object[0]);
        }
        a.a(0.0D);
    }

    (AddWaterActivity addwateractivity)
    {
        a = addwateractivity;
        super();
    }
}
