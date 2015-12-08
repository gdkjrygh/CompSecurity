// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.util;

import android.app.Dialog;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;

public abstract class TimeListenerFragment extends DialogFragment
{

    private static final String d = "hours";
    private static final String e = "minutes";
    protected android.app.TimePickerDialog.OnTimeSetListener a;
    protected int b;
    protected int c;

    public TimeListenerFragment()
    {
    }

    public TimeListenerFragment(int i, int j)
    {
        b = i;
        c = j;
    }

    protected abstract Dialog a(Bundle bundle);

    public void a(android.app.TimePickerDialog.OnTimeSetListener ontimesetlistener)
    {
        a = ontimesetlistener;
    }

    public Dialog onCreateDialog(Bundle bundle)
    {
        if (bundle != null)
        {
            b = bundle.getInt("hours");
            c = bundle.getInt("minutes");
        }
        return a(bundle);
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        bundle.putInt("hours", b);
        bundle.putInt("minutes", c);
    }
}
