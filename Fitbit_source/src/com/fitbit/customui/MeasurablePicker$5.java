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
        if (!a.l) goto _L2; else goto _L1
_L1:
        charsequence = a.g.getText().toString();
        a a1;
        a1 = a.i;
        if (charsequence.length() != 0)
        {
            break MISSING_BLOCK_LABEL_59;
        }
        double d = 0.0D;
_L3:
        try
        {
            a1.c(d);
        }
        // Misplaced declaration of an exception variable
        catch (CharSequence charsequence)
        {
            com.fitbit.e.a.a("MeasurablePicker", "NumberFormatException: %s", charsequence, new Object[] {
                charsequence.toString()
            });
        }
        a.c(0);
_L2:
        return;
        d = e.a(charsequence);
          goto _L3
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
