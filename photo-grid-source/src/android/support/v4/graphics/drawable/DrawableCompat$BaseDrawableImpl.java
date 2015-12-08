// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableCompatBase

class 
    implements 
{

    public boolean isAutoMirrored(Drawable drawable)
    {
        return false;
    }

    public void jumpToCurrentState(Drawable drawable)
    {
    }

    public void setAutoMirrored(Drawable drawable, boolean flag)
    {
    }

    public void setHotspot(Drawable drawable, float f, float f1)
    {
    }

    public void setHotspotBounds(Drawable drawable, int i, int j, int k, int l)
    {
    }

    public void setTint(Drawable drawable, int i)
    {
        DrawableCompatBase.setTint(drawable, i);
    }

    public void setTintList(Drawable drawable, ColorStateList colorstatelist)
    {
        DrawableCompatBase.setTintList(drawable, colorstatelist);
    }

    public void setTintMode(Drawable drawable, android.graphics.at.BaseDrawableImpl basedrawableimpl)
    {
        DrawableCompatBase.setTintMode(drawable, basedrawableimpl);
    }

    public Drawable wrap(Drawable drawable)
    {
        return DrawableCompatBase.wrapForTinting(drawable);
    }

    ()
    {
    }
}
