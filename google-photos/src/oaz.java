// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;

final class oaz
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private oay a;

    oaz(oay oay1)
    {
        a = oay1;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (!a.b(Boolean.valueOf(flag)))
        {
            if (!flag)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            compoundbutton.setChecked(flag);
            return;
        } else
        {
            a.a(flag);
            return;
        }
    }
}
