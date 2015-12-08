// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

public final class fm extends fl
{

    public fm(Drawable drawable)
    {
        super(drawable);
    }

    public final void applyTheme(android.content.res.Resources.Theme theme)
    {
        a.applyTheme(theme);
    }

    public final boolean canApplyTheme()
    {
        return a.canApplyTheme();
    }

    public final Rect getDirtyBounds()
    {
        return a.getDirtyBounds();
    }

    public final void getOutline(Outline outline)
    {
        a.getOutline(outline);
    }

    public final void setHotspot(float f, float f1)
    {
        a.setHotspot(f, f1);
    }

    public final void setHotspotBounds(int i, int j, int k, int l)
    {
        a.setHotspotBounds(i, j, k, l);
    }
}
