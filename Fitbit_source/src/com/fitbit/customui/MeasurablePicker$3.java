// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.view.View;
import com.fitbit.ui.DecimalEditText;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements android.view.tener
{

    final MeasurablePicker a;

    public boolean onLongClick(View view)
    {
        a.g.requestFocus();
        return false;
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
