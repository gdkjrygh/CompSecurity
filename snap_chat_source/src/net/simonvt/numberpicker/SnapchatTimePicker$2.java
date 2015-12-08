// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.simonvt.numberpicker;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package net.simonvt.numberpicker:
//            SnapchatTimePicker

final class a
    implements android.view.ner
{

    private SnapchatTimePicker a;

    public final boolean onLongClick(View view)
    {
        SnapchatTimePicker.a(a).clearFocus();
        if (view.getId() == Id)
        {
            SnapchatTimePicker.b(a, true);
            return true;
        } else
        {
            SnapchatTimePicker.b(a, false);
            return true;
        }
    }

    (SnapchatTimePicker snapchattimepicker)
    {
        a = snapchattimepicker;
        super();
    }
}
