// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.view.View;
import android.widget.AdapterView;
import com.fitbit.ui.DecimalEditText;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements android.widget.lectedListener
{

    final MeasurablePicker a;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        a.e.h();
        a.g.h();
        a.a(i);
    }

    public void onNothingSelected(AdapterView adapterview)
    {
    }

    dListener(MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
