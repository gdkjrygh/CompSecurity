// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging;

import android.text.Editable;
import android.text.TextWatcher;
import com.fitbit.food.ui.logging.views.EditCaloriesView;

// Referenced classes of package com.fitbit.food.ui.logging:
//            QuickCalorieAddActivity

class a
    implements TextWatcher
{

    final QuickCalorieAddActivity a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        a.c = a.a.a();
    }

    (QuickCalorieAddActivity quickcalorieaddactivity)
    {
        a = quickcalorieaddactivity;
        super();
    }
}
