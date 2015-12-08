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
            super(i, j);
            gravity = 0;
            gravity = 0x800013;
        }

        public LayoutParams(Context context, AttributeSet attributeset)
        {
            super(context, attributeset);
            gravity = 0;
            context = context.obtainStyledAttributes(attributeset, android.support.v7.appcompat.R.styleable.ActionBarLayout);
            gravity = context.getInt(android.support.v7.appcompat.R.styleable.ActionBarLayout_android_layout_gravity, 0);
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

    public static interface OnMenuVisibilityListener
    {

        public abstract void onMenuVisibilityChanged(boolean flag);
    }

    public static abstract class Tab
    {

        public abstract CharSequence getContentDescription();

        public abstract View getCustomView();

        public abstract Drawable getIcon();

        public abstract CharSequence getText();

        public abstract void select();

        public Tab()
        {
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

    public abstract int getDisplayOptions();

    public Context getThemedContext()
    {
        return null;
    }

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

    public void setDefaultDisplayHomeAsUpEnabled(boolean flag)
    {
    }

    public abstract void setDisplayHomeAsUpEnabled(boolean flag);

    public void setElevation(float f)
    {
        if (f != 0.0F)
        {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public void setHideOnContentScrollEnabled(boolean flag)
    {
        if (flag)
        {
            throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
        } else
        {
            return;
        }
    }

    public void setHomeActionContentDescription(int i)
    {
    }

    public void setHomeAsUpIndicator(Drawable drawable)
    {
    }

    public void setHomeButtonEnabled(boolean flag)
    {
    }

    public abstract void setIcon(int i);

    public void setShowHideAnimationEnabled(boolean flag)
    {
    }

    public abstract void setTitle(int i);

    public abstract void setTitle(CharSequence charsequence);

    public void setWindowTitle(CharSequence charsequence)
    {
    }

    public ActionMode startActionMode(android.support.v7.view.ActionMode.Callback callback)
    {
        return null;
    }
}
