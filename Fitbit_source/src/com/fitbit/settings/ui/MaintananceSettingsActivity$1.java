// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.View;
import android.widget.EditText;
import com.fitbit.savedstate.f;

// Referenced classes of package com.fitbit.settings.ui:
//            MaintananceSettingsActivity

class a
    implements android.view.ctivity._cls1
{

    final MaintananceSettingsActivity a;

    public void onClick(View view)
    {
        Integer integer = null;
        long l = Long.parseLong(MaintananceSettingsActivity.a(a).getText().toString());
        view = Long.valueOf(l);
_L1:
        int i = Integer.parseInt(MaintananceSettingsActivity.b(a).getText().toString());
        integer = Integer.valueOf(i);
_L2:
        if (view != null)
        {
            f.b(view.longValue());
        }
        if (integer != null)
        {
            f.a(integer.intValue());
        }
        MaintananceSettingsActivity.c(a);
        return;
        view;
        view = null;
          goto _L1
        NumberFormatException numberformatexception;
        numberformatexception;
          goto _L2
    }

    (MaintananceSettingsActivity maintanancesettingsactivity)
    {
        a = maintanancesettingsactivity;
        super();
    }
}
