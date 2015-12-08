// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.text.Editable;
import android.view.View;
import com.fitbit.data.domain.Measurable;
import com.fitbit.e.a;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.format.e;
import java.text.ParseException;

// Referenced classes of package com.fitbit.customui:
//            MeasurablePicker

class a
    implements android.view.istener
{

    final MeasurablePicker a;

    public void onFocusChange(View view, boolean flag)
    {
        double d;
        boolean flag1;
        d = 0.0D;
        flag1 = false;
        if (a.g() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a.k) goto _L1; else goto _L3
_L3:
        com.fitbit.customui.MeasurablePicker.a(a, a.g().b());
        if (a.i.f() == 0.0D)
        {
            view = "";
        } else
        {
            view = a.i;
            flag = flag1;
            if (!a.k)
            {
                flag = true;
            }
            view = view.a(flag);
        }
        a.a(a.e, view);
        a.k = true;
        return;
        if (!a.k) goto _L1; else goto _L4
_L4:
        view = a.e.getText().toString();
        if (com.fitbit.customui.MeasurablePicker.e(a) != -1D && !MeasurablePicker.d(a) || a.e.getText().length() != 0 || a.i.e()) goto _L6; else goto _L5
_L5:
        a.i.b(-1D);
_L7:
        view = a.i;
         ;
        if (!a.k)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        try
        {
            view = view.a(flag);
            a.a(a.e, view);
            a.k = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            com.fitbit.e.a.a("MeasurablePicker", "ParseException: %s", view, new Object[] {
                String.valueOf(view)
            });
        }
        return;
_L6:
         = a.i;
        if (view.length() != 0)
        {
            break MISSING_BLOCK_LABEL_362;
        }
_L8:
        .b(d);
        if (a.m != 0.0F && a.i.f() > (double)a.m)
        {
            a.i.b(a.m);
        }
          goto _L7
        d = e.a(view);
          goto _L8
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
