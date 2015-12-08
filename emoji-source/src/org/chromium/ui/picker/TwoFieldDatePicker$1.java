// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.ui.picker;

import android.widget.NumberPicker;

// Referenced classes of package org.chromium.ui.picker:
//            TwoFieldDatePicker

class this._cls0
    implements android.widget.hangeListener
{

    final TwoFieldDatePicker this$0;

    public void onValueChange(NumberPicker numberpicker, int i, int j)
    {
        int k;
        int j1;
        j1 = getYear();
        k = getPositionInYear();
        if (numberpicker != TwoFieldDatePicker.access$000(TwoFieldDatePicker.this)) goto _L2; else goto _L1
_L1:
        int i1 = j;
        if (i != numberpicker.getMaxValue() || j != numberpicker.getMinValue()) goto _L4; else goto _L3
_L3:
        int l;
        l = j1 + 1;
        k = getMinPositionInYear(l);
_L6:
        setCurrentDate(l, k);
        updateSpinners();
        notifyDateChanged();
        return;
_L4:
        k = i1;
        l = j1;
        if (i == numberpicker.getMinValue())
        {
            k = i1;
            l = j1;
            if (j == numberpicker.getMaxValue())
            {
                l = j1 - 1;
                k = getMaxPositionInYear(l);
            }
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (numberpicker == TwoFieldDatePicker.access$100(TwoFieldDatePicker.this))
        {
            l = j;
        } else
        {
            throw new IllegalArgumentException();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    tener()
    {
        this$0 = TwoFieldDatePicker.this;
        super();
    }
}
