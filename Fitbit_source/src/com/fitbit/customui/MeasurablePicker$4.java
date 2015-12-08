// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.view.View;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements android.view.r
{

    final MeasurablePicker a;

    public void onClick(View view)
    {
        view.getOnFocusChangeListener().onFocusChange(view, true);
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
