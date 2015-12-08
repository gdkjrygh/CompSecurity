// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.widget.CompoundButton;

// Referenced classes of package android.support.v4.widget:
//            CompoundButtonCompat

static interface 
{

    public abstract Drawable getButtonDrawable(CompoundButton compoundbutton);

    public abstract ColorStateList getButtonTintList(CompoundButton compoundbutton);

    public abstract android.graphics.mpatImpl getButtonTintMode(CompoundButton compoundbutton);

    public abstract void setButtonTintList(CompoundButton compoundbutton, ColorStateList colorstatelist);

    public abstract void setButtonTintMode(CompoundButton compoundbutton, android.graphics.mpatImpl mpatimpl);
}
