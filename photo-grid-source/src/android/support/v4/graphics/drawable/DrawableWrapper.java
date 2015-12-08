// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

public interface DrawableWrapper
{

    public abstract Drawable getWrappedDrawable();

    public abstract void setTint(int i);

    public abstract void setTintList(ColorStateList colorstatelist);

    public abstract void setTintMode(android.graphics.PorterDuff.Mode mode);

    public abstract void setWrappedDrawable(Drawable drawable);
}
