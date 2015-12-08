// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.widget.CheckBox;
import android.widget.CompoundButton;
import com.roidapp.baselib.c.b;
import com.roidapp.photogrid.common.af;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            ch, cm

final class cj
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    final CheckBox a;
    final ch b;

    cj(ch ch1, CheckBox checkbox)
    {
        b = ch1;
        a = checkbox;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            if (((Integer)compoundbutton.getTag()).intValue() == 1)
            {
                b.getActivity();
                com.roidapp.baselib.c.b.a("SNS", "click", (new StringBuilder("hashtags/")).append(compoundbutton.getText().toString()).toString());
                af.b(b.getActivity(), "SNS", "click", (new StringBuilder("hashtags/")).append(compoundbutton.getText().toString()).toString(), Long.valueOf(1L));
            }
            if (ch.c(b) != null)
            {
                ch.c(b).a(compoundbutton.getText().toString(), false);
            }
            a.setTextColor(-1);
            return;
        }
        if (ch.c(b) != null)
        {
            ch.c(b).a(compoundbutton.getText().toString(), true);
        }
        a.setTextColor(ch.e(b));
    }
}
