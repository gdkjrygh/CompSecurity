// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.view.inputmethod.InputMethodManager;
import com.fitbit.ui.DecimalEditText;

// Referenced classes of package com.fitbit.settings.ui:
//            GoalsActivity

class a
    implements Runnable
{

    final GoalsActivity a;

    public void run()
    {
        InputMethodManager inputmethodmanager = (InputMethodManager)a.getSystemService("input_method");
        if (a.h)
        {
            inputmethodmanager.showSoftInput(a.b, 1);
            a.b.requestFocus();
            return;
        } else
        {
            inputmethodmanager.showSoftInput(a.d, 1);
            a.d.requestFocus();
            return;
        }
    }

    ager(GoalsActivity goalsactivity)
    {
        a = goalsactivity;
        super();
    }
}
