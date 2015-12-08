// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;
import android.widget.RadioButton;

final class ghe
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private ghc a;

    ghe(ghc ghc1)
    {
        a = ghc1;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (flag)
        {
            ghc.a(a).setChecked(false);
        }
    }
}
