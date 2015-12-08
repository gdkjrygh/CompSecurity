// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;

final class ggo
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private ggl a;

    ggo(ggl ggl1)
    {
        a = ggl1;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = ggl.a(a);
        compoundbutton.e = flag;
        ((gha) (compoundbutton)).a.b();
    }
}
