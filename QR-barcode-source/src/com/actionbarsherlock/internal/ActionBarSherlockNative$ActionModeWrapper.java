// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal;

import android.view.View;
import com.actionbarsherlock.internal.view.menu.MenuWrapper;
import com.actionbarsherlock.view.ActionMode;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuInflater;

// Referenced classes of package com.actionbarsherlock.internal:
//            ActionBarSherlockNative

private class mActionMode extends ActionMode
{

    private final android.view.ActionMode mActionMode;
    private MenuWrapper mMenu;
    final ActionBarSherlockNative this$0;

    public void finish()
    {
        mActionMode.finish();
    }

    public View getCustomView()
    {
        return mActionMode.getCustomView();
    }

    public MenuWrapper getMenu()
    {
        if (mMenu == null)
        {
            mMenu = new MenuWrapper(mActionMode.getMenu());
        }
        return mMenu;
    }

    public volatile Menu getMenu()
    {
        return getMenu();
    }

    public MenuInflater getMenuInflater()
    {
        return ActionBarSherlockNative.this.getMenuInflater();
    }

    public CharSequence getSubtitle()
    {
        return mActionMode.getSubtitle();
    }

    public Object getTag()
    {
        return mActionMode.getTag();
    }

    public CharSequence getTitle()
    {
        return mActionMode.getTitle();
    }

    public void invalidate()
    {
        mActionMode.invalidate();
        if (mMenu != null)
        {
            mMenu.invalidate();
        }
    }

    public void setCustomView(View view)
    {
        mActionMode.setCustomView(view);
    }

    public void setSubtitle(int i)
    {
        mActionMode.setSubtitle(i);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mActionMode.setSubtitle(charsequence);
    }

    public void setTag(Object obj)
    {
        mActionMode.setTag(obj);
    }

    public void setTitle(int i)
    {
        mActionMode.setTitle(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        mActionMode.setTitle(charsequence);
    }

    (android.view.ActionMode actionmode)
    {
        this$0 = ActionBarSherlockNative.this;
        super();
        mMenu = null;
        mActionMode = actionmode;
    }
}
