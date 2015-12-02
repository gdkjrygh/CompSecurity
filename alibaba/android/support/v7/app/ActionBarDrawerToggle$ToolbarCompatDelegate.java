// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

// Referenced classes of package android.support.v7.app:
//            ActionBarDrawerToggle

static class mToolbar
    implements mToolbar
{

    final Toolbar mToolbar;

    public Context getActionBarThemedContext()
    {
        return mToolbar.getContext();
    }

    public Drawable getThemeUpIndicator()
    {
        TypedArray typedarray = mToolbar.getContext().obtainStyledAttributes(new int[] {
            0x102002c
        });
        Drawable drawable = typedarray.getDrawable(0);
        typedarray.recycle();
        return drawable;
    }

    public void setActionBarDescription(int i)
    {
        mToolbar.setNavigationContentDescription(i);
    }

    public void setActionBarUpIndicator(Drawable drawable, int i)
    {
        mToolbar.setNavigationIcon(drawable);
        mToolbar.setNavigationContentDescription(i);
    }

    (Toolbar toolbar)
    {
        mToolbar = toolbar;
    }
}
