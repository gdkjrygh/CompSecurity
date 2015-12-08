// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.widget.CompoundButton;

class CompoundButtonCompatLollipop
{

    CompoundButtonCompatLollipop()
    {
    }

    static ColorStateList getButtonTintList(CompoundButton compoundbutton)
    {
        return compoundbutton.getButtonTintList();
    }

    static android.graphics.PorterDuff.Mode getButtonTintMode(CompoundButton compoundbutton)
    {
        return compoundbutton.getButtonTintMode();
    }

    static void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        compoundbutton.setButtonTintList(colorstatelist);
    }

    static void setButtonTintMode(CompoundButton compoundbutton, android.graphics.PorterDuff.Mode mode)
    {
        compoundbutton.setButtonTintMode(mode);
    }
}
