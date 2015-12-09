// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

// Referenced classes of package android.support.v7.widget:
//            ResourcesWrapper, TintContextWrapper, TintManager

static class mTintManager extends ResourcesWrapper
{

    private final TintManager mTintManager;

    public Drawable getDrawable(int i)
        throws android.content.res.urces
    {
        Drawable drawable = super.getDrawable(i);
        if (drawable != null)
        {
            mTintManager.tintDrawableUsingColorFilter(i, drawable);
        }
        return drawable;
    }

    public (Resources resources, TintManager tintmanager)
    {
        super(resources);
        mTintManager = tintmanager;
    }
}
