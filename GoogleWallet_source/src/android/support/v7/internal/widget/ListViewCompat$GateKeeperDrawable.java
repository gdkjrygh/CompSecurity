// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.internal.widget:
//            DrawableWrapper, ListViewCompat

static final class mEnabled extends DrawableWrapper
{

    private boolean mEnabled;

    public final void draw(Canvas canvas)
    {
        if (mEnabled)
        {
            super.draw(canvas);
        }
    }

    final void setEnabled(boolean flag)
    {
        mEnabled = flag;
    }

    public final void setHotspot(float f, float f1)
    {
        if (mEnabled)
        {
            super.setHotspot(f, f1);
        }
    }

    public final void setHotspotBounds(int i, int j, int k, int l)
    {
        if (mEnabled)
        {
            super.setHotspotBounds(i, j, k, l);
        }
    }

    public final boolean setState(int ai[])
    {
        if (mEnabled)
        {
            return super.setState(ai);
        } else
        {
            return false;
        }
    }

    public final boolean setVisible(boolean flag, boolean flag1)
    {
        if (mEnabled)
        {
            return super.setVisible(flag, flag1);
        } else
        {
            return false;
        }
    }

    public (Drawable drawable)
    {
        super(drawable);
        mEnabled = true;
    }
}
