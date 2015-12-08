// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompat

static interface 
{

    public abstract boolean isAutoMirrored(Drawable drawable);

    public abstract void jumpToCurrentState(Drawable drawable);

    public abstract void setAutoMirrored(Drawable drawable, boolean flag);

    public abstract void setHotspot(Drawable drawable, float f, float f1);

    public abstract void setHotspotBounds(Drawable drawable, int i, int j, int k, int l);

    public abstract void setTint(Drawable drawable, int i);

    public abstract void setTintList(Drawable drawable, ColorStateList colorstatelist);

    public abstract void setTintMode(Drawable drawable, android.graphics.Compat.DrawableImpl drawableimpl);

    public abstract Drawable wrap(Drawable drawable);
}
