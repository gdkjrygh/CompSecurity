// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.ex.photo;

import android.graphics.drawable.Drawable;
import android.support.v7.app.ActionBar;

public class ActionBarInterface
{
    public static interface OnMenuVisibilityListener
    {

        public abstract void onMenuVisibilityChanged(boolean flag);
    }


    private final ActionBar mActionBar;

    public ActionBarInterface(ActionBar actionbar)
    {
        mActionBar = actionbar;
    }

    public void addOnMenuVisibilityListener(OnMenuVisibilityListener onmenuvisibilitylistener)
    {
        mActionBar.addOnMenuVisibilityListener(new ActionBarWrapper.MenuVisiblityListenerWrapper(this, onmenuvisibilitylistener));
    }

    public void hide()
    {
        mActionBar.hide();
    }

    public void setDisplayHomeAsUpEnabled(boolean flag)
    {
        mActionBar.setDisplayHomeAsUpEnabled(flag);
    }

    public void setDisplayOptionsShowTitle()
    {
        mActionBar.setDisplayOptions(8, 8);
    }

    public void setLogo(Drawable drawable)
    {
        mActionBar.setLogo(drawable);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mActionBar.setSubtitle(charsequence);
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionBar.setTitle(charsequence);
    }

    public void show()
    {
        mActionBar.show();
    }
}
