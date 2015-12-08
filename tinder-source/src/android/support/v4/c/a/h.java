// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.c.a;

import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v4.c.a:
//            g

final class h extends g
{

    h(Drawable drawable)
    {
        super(drawable);
    }

    public final void applyTheme(android.content.res.Resources.Theme theme)
    {
        b.applyTheme(theme);
    }

    public final boolean canApplyTheme()
    {
        return b.canApplyTheme();
    }

    public final Rect getDirtyBounds()
    {
        return b.getDirtyBounds();
    }

    public final void getOutline(Outline outline)
    {
        b.getOutline(outline);
    }

    public final void setHotspot(float f, float f1)
    {
        b.setHotspot(f, f1);
    }

    public final void setHotspotBounds(int i, int j, int k, int l)
    {
        b.setHotspotBounds(i, j, k, l);
    }
}
