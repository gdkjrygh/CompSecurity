// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.Toolbar;

// Referenced classes of package android.support.v7.app:
//            ActionBarDrawerToggle

static class mDefaultContentDescription
    implements mDefaultContentDescription
{

    final CharSequence mDefaultContentDescription;
    final Drawable mDefaultUpIndicator;
    final Toolbar mToolbar;

    public Context getActionBarThemedContext()
    {
        return mToolbar.getContext();
    }

    public Drawable getThemeUpIndicator()
    {
        return mDefaultUpIndicator;
    }

    public boolean isNavigationVisible()
    {
        return true;
    }

    public void setActionBarDescription(int i)
    {
        if (i == 0)
        {
            mToolbar.setNavigationContentDescription(mDefaultContentDescription);
            return;
        } else
        {
            mToolbar.setNavigationContentDescription(i);
            return;
        }
    }

    public void setActionBarUpIndicator(Drawable drawable, int i)
    {
        mToolbar.setNavigationIcon(drawable);
        setActionBarDescription(i);
    }

    (Toolbar toolbar)
    {
        mToolbar = toolbar;
        mDefaultUpIndicator = toolbar.getNavigationIcon();
        mDefaultContentDescription = toolbar.getNavigationContentDescription();
    }
}
