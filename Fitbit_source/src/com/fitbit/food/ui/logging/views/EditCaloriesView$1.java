// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.food.ui.logging.views;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.fitbit.ui.DecimalEditText;

// Referenced classes of package com.fitbit.food.ui.logging.views:
//            EditCaloriesView

class a
    implements Runnable
{

    final EditCaloriesView a;

    public void run()
    {
        EditCaloriesView.a(a).requestFocus();
        ((InputMethodManager)a.getContext().getSystemService("input_method")).showSoftInput(EditCaloriesView.a(a), 1);
    }

    _cls9(EditCaloriesView editcaloriesview)
    {
        a = editcaloriesview;
        super();
    }
}
