// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.widget.CompoundButton;

final class bdz
    implements android.widget.CompoundButton.OnCheckedChangeListener
{

    private bdw a;
    private int b;

    bdz(bdx bdx, bdw bdw1, int i)
    {
        a = bdw1;
        b = i;
        super();
    }

    public final void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        compoundbutton = a;
        long l = b;
        compoundbutton.e = flag;
        compoundbutton.c = System.currentTimeMillis();
        compoundbutton.d = l + ((bdw) (compoundbutton)).c;
        compoundbutton.invalidateSelf();
    }
}
