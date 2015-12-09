// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.customui;

import android.view.View;
import com.fitbit.ui.DecimalEditText;
import com.fitbit.util.format.e;

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
        boolean flag2;
        d = 0.0D;
        flag1 = true;
        flag2 = false;
        if (a.g() != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!flag)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a.l) goto _L1; else goto _L3
_L3:
        if (a.i.g() == 0.0D)
        {
            view = "";
        } else
        {
            view = a.i;
            flag = flag2;
            if (!a.l)
            {
                flag = true;
            }
            view = view.b(flag);
        }
        a.a(a.g, view);
        a.l = true;
        return;
        if (!a.l) goto _L1; else goto _L4
_L4:
         ;
        view = a.g.getText().toString();
         = a.i;
        if (view.length() != 0)
        {
            break MISSING_BLOCK_LABEL_256;
        }
_L5:
        .c(d);
        if (MeasurablePicker.a(a) != 0.0F && a.i.g() > (double)MeasurablePicker.a(a))
        {
            a.i.c(MeasurablePicker.a(a));
        }
        view = a.i;
        if (!a.l)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        try
        {
            view = view.b(flag);
            a.a(a.g, view);
            a.l = false;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (View view)
        {
            return;
        }
        d = e.a(view);
          goto _L5
    }

    (MeasurablePicker measurablepicker)
    {
        a = measurablepicker;
        super();
    }
}
