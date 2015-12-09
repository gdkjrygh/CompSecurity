// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v7.view.ActionMode;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;

public abstract class ActionBar
{
    public static class LayoutParams extends android.view.ViewGroup.MarginLayoutParams
    {

        public int gravity;

        public LayoutParams(int i, int j)
        {
            super(-2, -2);
            gravity = 0;
            gravity = 0x800013;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            gravity = 0;
            context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBarLayout);
            gravity = context.getInt(0, 0);
            context.recycle();
        }

        public LayoutParams(LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = 0;
            gravity = layoutparams.gravity;
        }

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutparams)
        {
            super(layoutparams);
            gravity = 0;
        }
    }


    public ActionBar()
    {
    }

    public boolean collapseActionView()
    {
        return false;
    }

    public void dispatchMenuVisibilityChanged(boolean flag)
    {
    }

    public abstract View getCustomView();

    public abstract int getDisplayOptions();

    public Context getThemedContext()
    {
        return null;
    }

    public abstract void hide();

    public boolean invalidateOptionsMenu()
    {
        return false;
    }

    public void onConfigurationChanged(Configuration configuration)
    {
    }

    public boolean onKeyShortcut(int i, KeyEvent keyevent)
    {
        return false;
    }

    public abstract void setBackgroundDrawable(Drawable drawable);

    public abstract void setCustomView(int i);

    public abstract void setCustomView(View view);

    public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean flag);

    public abstract void setDisplayOptions(int i, int j);

    public abstract void setDisplayShowTitleEnabled(boolean flag);

    public void setHomeActionContentDescription(int i)
    {
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
    }

    public void setShowHideAnimationEnabled(boolean flag)
    {
    }

    public abstract void setSubtitle(CharSequence charsequence);

    public abstract void setTitle(CharSequence charsequence);

    public abstract void setTitle$13462e();

    public void setWindowTitle(CharSequence charsequence)
    {
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return null;
    }
}
