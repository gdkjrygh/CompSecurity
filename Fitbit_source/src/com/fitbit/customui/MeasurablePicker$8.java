// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.text.Editable;
import android.text.TextWatcher;
import com.fitbit.e.a;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.format.e;
import java.text.ParseException;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements TextWatcher
{

    final MeasurablePicker a;

    public void afterTextChanged(Editable editable)
    {
    }

    public void beforeTextChanged(CharSequence charsequence, int i, int j, int k)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i, int j, int k)
    {
        if (!a.k || !MeasurablePicker.c(a))
        {
            break MISSING_BLOCK_LABEL_130;
        }
        a a1;
        charsequence = a.e.getText().toString();
        a.c(0);
        a1 = a.i;
        if (charsequence.length() != 0)
        {
            break MISSING_BLOCK_LABEL_101;
        }
        double d;
        if (MeasurablePicker.d(a))
        {
            d = -1D;
        } else
        {
            d = 0.0D;
        }
        try
        {
            a1.b(d);
            a.i.b(a.i.f());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            com.fitbit.e.a.a("MeasurablePicker", "NumberFormatException: %s", charsequence, new Object[] {
                charsequence.toString()
            });
        }
        break MISSING_BLOCK_LABEL_130;
        d = e.a(charsequence);
        break MISSING_BLOCK_LABEL_73;
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
