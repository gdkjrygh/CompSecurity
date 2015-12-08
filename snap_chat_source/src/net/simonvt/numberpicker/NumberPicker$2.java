// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.view.View;
import android.widget.EditText;

// Referenced classes of package net.simonvt.numberpicker:
//            NumberPicker

final class a
    implements android.view.kListener
{

    private NumberPicker a;

    public final boolean onLongClick(View view)
    {
        NumberPicker.a(a);
        NumberPicker.b(a).clearFocus();
        if (view.getId() == ment)
        {
            NumberPicker.b(a, true);
            return true;
        } else
        {
            NumberPicker.b(a, false);
            return true;
        }
    }

    (NumberPicker numberpicker)
    {
        a = numberpicker;
        super();
    }
}
