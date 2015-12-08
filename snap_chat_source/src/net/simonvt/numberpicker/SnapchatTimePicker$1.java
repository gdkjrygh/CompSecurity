// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package net.simonvt.numberpicker:
//            SnapchatTimePicker

final class a
    implements android.view.imePicker._cls1
{

    private SnapchatTimePicker a;

    public final void onClick(View view)
    {
        SnapchatTimePicker.a(a).clearFocus();
        if (view.getId() == Id)
        {
            SnapchatTimePicker.a(a, true);
            return;
        } else
        {
            SnapchatTimePicker.a(a, false);
            return;
        }
    }

    (SnapchatTimePicker snapchattimepicker)
    {
        a = snapchattimepicker;
        super();
    }
}
