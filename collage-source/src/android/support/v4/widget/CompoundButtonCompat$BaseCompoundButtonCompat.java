// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            CompoundButtonCompat, CompoundButtonCompatDonut

static class 
    implements 
{

    public Drawable getButtonDrawable(CompoundButton compoundbutton)
    {
        return CompoundButtonCompatDonut.getButtonDrawable(compoundbutton);
    }

    public ColorStateList getButtonTintList(CompoundButton compoundbutton)
    {
        return CompoundButtonCompatDonut.getButtonTintList(compoundbutton);
    }

    public android.graphics.onCompat getButtonTintMode(CompoundButton compoundbutton)
    {
        return CompoundButtonCompatDonut.getButtonTintMode(compoundbutton);
    }

    public void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist)
    {
        CompoundButtonCompatDonut.setButtonTintList(compoundbutton, colorstatelist);
    }

    public void setButtonTintMode(CompoundButton compoundbutton, android.graphics.onCompat oncompat)
    {
        CompoundButtonCompatDonut.setButtonTintMode(compoundbutton, oncompat);
    }

    ()
    {
    }
}
