// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.fitbit.food.ui.logging:
//            QuickCalorieAddActivity

class a
    implements android.widget.tener
{

    final QuickCalorieAddActivity a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        if (i == 6 && QuickCalorieAddActivity.a(a))
        {
            a.o();
        }
        return false;
    }

    (QuickCalorieAddActivity quickcalorieaddactivity)
    {
        a = quickcalorieaddactivity;
        super();
    }
}
