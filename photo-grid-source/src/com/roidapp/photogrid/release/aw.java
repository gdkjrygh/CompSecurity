// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.text.Editable;
import android.widget.EditText;
import android.widget.SeekBar;
import java.math.BigDecimal;

// Referenced classes of package com.roidapp.photogrid.release:
//            as

final class aw
    implements android.widget.SeekBar.OnSeekBarChangeListener
{

    final as a;

    aw(as as1)
    {
        a = as1;
        super();
    }

    public final void onProgressChanged(SeekBar seekbar, int i, boolean flag)
    {
        if (i < 50)
        {
            float f = (float)((50 - i) * 2) / 100F;
            as.a(a, f + 1.0F);
            seekbar = new BigDecimal(as.b(a));
            as.c(a).requestFocus();
            as.c(a).setText((new StringBuilder()).append(seekbar.setScale(2, 4)).toString());
            as.c(a).setSelection(as.c(a).getText().length());
            as.d(a).setText("1.00");
            return;
        }
        if (i > 50)
        {
            float f1 = (float)((i - 50) * 2) / 100F;
            as.b(a, f1 + 1.0F);
            seekbar = new BigDecimal(as.e(a));
            as.c(a).setText("1.00");
            as.d(a).requestFocus();
            as.d(a).setText((new StringBuilder()).append(seekbar.setScale(2, 4)).toString());
            as.d(a).setSelection(as.d(a).getText().length());
            return;
        } else
        {
            as.d(a).setText("1.00");
            as.d(a).setText("1.00");
            as.c(a).setSelection(as.c(a).getText().length());
            as.d(a).setSelection(as.d(a).getText().length());
            return;
        }
    }

    public final void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public final void onStopTrackingTouch(SeekBar seekbar)
    {
    }
}
