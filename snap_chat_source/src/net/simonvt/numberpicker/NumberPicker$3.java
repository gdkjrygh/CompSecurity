// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

final class a
    implements android.view.ngeListener
{

    private NumberPicker a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (flag)
        {
            NumberPicker.b(a).selectAll();
            return;
        } else
        {
            NumberPicker.b(a).setSelection(0, 0);
            NumberPicker.a(a, view);
            return;
        }
    }

    (NumberPicker numberpicker)
    {
        a = numberpicker;
        super();
    }
}
