// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            CompoundButtonCompat, CompoundButtonCompatLollipop

static class  extends 
{

    public ColorStateList getButtonTintList(CompoundButton compoundbutton)
    {
        return CompoundButtonCompatLollipop.getButtonTintList(compoundbutton);
    }

    public android.graphics.ttonImpl getButtonTintMode(CompoundButton compoundbutton)
    {
        return CompoundButtonCompatLollipop.getButtonTintMode(compoundbutton);
    }

    public void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        CompoundButtonCompatLollipop.setButtonTintList(compoundbutton, colorstatelist);
    }

    public void setButtonTintMode(CompoundButton compoundbutton, android.graphics.ttonImpl ttonimpl)
    {
        CompoundButtonCompatLollipop.setButtonTintMode(compoundbutton, ttonimpl);
    }

    ()
    {
    }
}
