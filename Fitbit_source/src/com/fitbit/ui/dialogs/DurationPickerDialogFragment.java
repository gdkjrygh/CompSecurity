// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.ui.dialogs;

import android.app.Dialog;
import android.os.Bundle;
import com.fitbit.util.TimeListenerFragment;

public class DurationPickerDialogFragment extends TimeListenerFragment
{

    public DurationPickerDialogFragment()
    {
    }

    public DurationPickerDialogFragment(android.app.TimePickerDialog.OnTimeSetListener ontimesetlistener, int i, int j)
    {
        super(i, j);
        a(ontimesetlistener);
    }

    static int a(DurationPickerDialogFragment durationpickerdialogfragment)
    {
        return durationpickerdialogfragment.b;
    }

    static int b(DurationPickerDialogFragment durationpickerdialogfragment)
    {
        return durationpickerdialogfragment.c;
    }

    protected Dialog a(Bundle bundle)
    {
        return new _cls1(getActivity(), a, b, c, true);
    }

    /* member class not found */
    class _cls1 {}

}
