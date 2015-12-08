// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import com.fitbit.ui.DecimalEditText;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements Runnable
{

    final MeasurablePicker a;

    public void run()
    {
        a.e.requestFocus();
        ((InputMethodManager)a.getContext().getSystemService("input_method")).showSoftInput(a.e, 1);
    }

    ager(MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
