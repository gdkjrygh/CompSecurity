// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.res.Resources;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

final class ggn
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private Switch a;
    private TextView b;
    private ggl c;

    ggn(ggl ggl1, Switch switch1, TextView textview)
    {
        c = ggl1;
        a = switch1;
        b = textview;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = ggl.a(c);
        compoundbutton.d = flag;
        ((gha) (compoundbutton)).a.b();
        a.setEnabled(flag);
        compoundbutton = b;
        Resources resources = c.g();
        int i;
        if (flag)
        {
            i = b.rA;
        } else
        {
            i = b.rz;
        }
        compoundbutton.setTextColor(resources.getColor(i));
    }
}
