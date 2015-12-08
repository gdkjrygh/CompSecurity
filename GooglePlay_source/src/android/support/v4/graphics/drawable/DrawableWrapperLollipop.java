// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.graphics.drawable;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.graphics.drawable:
//            DrawableWrapperKitKat

final class DrawableWrapperLollipop extends DrawableWrapperKitKat
{

    DrawableWrapperLollipop(Drawable drawable)
    {
        super(drawable);
    }

    public final void applyTheme(android.content.res.Resources.Theme theme)
    {
        mDrawable.applyTheme(theme);
    }

    public final boolean canApplyTheme()
    {
        return mDrawable.canApplyTheme();
    }

    public final Rect getDirtyBounds()
    {
        return mDrawable.getDirtyBounds();
    }

    public final void getOutline(Outline outline)
    {
        mDrawable.getOutline(outline);
    }

    public final void setHotspot(float f, float f1)
    {
        mDrawable.setHotspot(f, f1);
    }

    public final void setHotspotBounds(int i, int j, int k, int l)
    {
        mDrawable.setHotspotBounds(i, j, k, l);
    }
}
