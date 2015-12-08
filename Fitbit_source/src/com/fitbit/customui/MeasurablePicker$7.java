// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.view.KeyEvent;
import android.widget.TextView;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements android.widget.tionListener
{

    final MeasurablePicker a;

    public boolean onEditorAction(TextView textview, int i, KeyEvent keyevent)
    {
        textview.getOnFocusChangeListener().onFocusChange(textview, false);
        if (MeasurablePicker.b(a) != null)
        {
            MeasurablePicker.b(a).onEditorAction(textview, i, keyevent);
        }
        return false;
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
