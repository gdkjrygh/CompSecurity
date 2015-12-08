// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;
import android.widget.RadioButton;

final class ghf
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private ghc a;

    ghf(ghc ghc1)
    {
        a = ghc1;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = ghc.b(a);
        compoundbutton.f = flag;
        ((gha) (compoundbutton)).a.b();
        if (flag)
        {
            ghc.c(a).setChecked(false);
        }
    }
}
