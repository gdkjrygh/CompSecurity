// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.widget.RadioGroup;
import android.widget.TextView;

// Referenced classes of package com.roidapp.photogrid.release:
//            qi

final class qk
    implements android.widget.RadioGroup.OnCheckedChangeListener
{

    final TextView a;
    final qi b;

    qk(qi qi1, TextView textview)
    {
        b = qi1;
        a = textview;
        super();
    }

    public final void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        i = radiogroup.getCheckedRadioButtonId();
        if (i == 0x7f0d0408)
        {
            qi.a(b, qi.b(b));
            a.setVisibility(0);
        } else
        if (i == 0x7f0d0409)
        {
            qi.a(b, qi.c(b));
            a.setVisibility(4);
            return;
        }
    }
}
