// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.actionbarsherlock.view.ActionProvider;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.SubMenu;

public class ActionMenuItem
    implements MenuItem
{

    private static final int CHECKABLE = 1;
    private static final int CHECKED = 2;
    private static final int ENABLED = 16;
    private static final int EXCLUSIVE = 4;
    private static final int HIDDEN = 8;
    private com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private final int mId;
    private Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    public ActionMenuItem(Context context, int i, int j, int k, int l, CharSequence charsequence)
    {
        mFlags = 16;
        mContext = context;
        mId = j;
        mGroup = i;
        mOrdering = l;
        mTitle = charsequence;
    }

    public boolean collapseActionView()
    {
        return false;
    }

    public boolean expandActionView()
    {
        return false;
    }

    public ActionProvider getActionProvider()
    {
        return null;
    }

    public View getActionView()
    {
        return null;
    }

    public char getAlphabeticShortcut()
    {
        return mShortcutAlphabeticChar;
    }

    public int getGroupId()
    {
        return mGroup;
    }

    public Drawable getIcon()
    {
        return mIconDrawable;
    }

    public Intent getIntent()
    {
        return mIntent;
    }

    public int getItemId()
    {
        return mId;
    }

    public android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return null;
    }

    public char getNumericShortcut()
    {
        return mShortcutNumericChar;
    }

    public int getOrder()
    {
        return mOrdering;
    }

    public SubMenu getSubMenu()
    {
        return null;
    }

    public CharSequence getTitle()
    {
        return mTitle;
    }

    public CharSequence getTitleCondensed()
    {
        return mTitleCondensed;
    }

    public boolean hasSubMenu()
    {
        return false;
    }

    public boolean invoke()
    {
        if (mClickListener != null && mClickListener.onMenuItemClick(this))
        {
            return true;
        }
        if (mIntent != null)
        {
            mContext.startActivity(mIntent);
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isActionViewExpanded()
    {
        return false;
    }

    public boolean isCheckable()
    {
        return (mFlags & 1) != 0;
    }

    public boolean isChecked()
    {
        return (mFlags & 2) != 0;
    }

    public boolean isEnabled()
    {
        return (mFlags & 0x10) != 0;
    }

    public boolean isVisible()
    {
        return (mFlags & 8) == 0;
    }

    public MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(int i)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setActionView(View view)
    {
        throw new UnsupportedOperationException();
    }

    public MenuItem setAlphabeticShortcut(char c)
    {
        mShortcutAlphabeticChar = c;
        return this;
    }

    public MenuItem setCheckable(boolean flag)
    {
        int i = mFlags;
        boolean flag1;
        if (flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        mFlags = flag1 | i & -2;
        return this;
    }

    public MenuItem setChecked(boolean flag)
    {
        int i = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | i & -3;
        return this;
    }

    public MenuItem setEnabled(boolean flag)
    {
        int i = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 16;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | i & 0xffffffef;
        return this;
    }

    public ActionMenuItem setExclusiveCheckable(boolean flag)
    {
        int i = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        mFlags = byte0 | i & -5;
        return this;
    }

    public MenuItem setIcon(int i)
    {
        mIconDrawable = mContext.getResources().getDrawable(i);
        return this;
    }

    public MenuItem setIcon(Drawable drawable)
    {
        mIconDrawable = drawable;
        return this;
    }

    public MenuItem setIntent(Intent intent)
    {
        mIntent = intent;
        return this;
    }

    public MenuItem setNumericShortcut(char c)
    {
        mShortcutNumericChar = c;
        return this;
    }

    public MenuItem setOnActionExpandListener(com.actionbarsherlock.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        return this;
    }

    public MenuItem setOnMenuItemClickListener(com.actionbarsherlock.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mClickListener = onmenuitemclicklistener;
        return this;
    }

    public MenuItem setShortcut(char c, char c1)
    {
        mShortcutNumericChar = c;
        mShortcutAlphabeticChar = c1;
        return this;
    }

    public void setShowAsAction(int i)
    {
    }

    public MenuItem setShowAsActionFlags(int i)
    {
        setShowAsAction(i);
        return this;
    }

    public MenuItem setTitle(int i)
    {
        mTitle = mContext.getResources().getString(i);
        return this;
    }

    public MenuItem setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        return this;
    }

    public MenuItem setTitleCondensed(CharSequence charsequence)
    {
        mTitleCondensed = charsequence;
        return this;
    }

    public MenuItem setVisible(boolean flag)
    {
        int i = mFlags;
        byte byte0;
        if (flag)
        {
            byte0 = 0;
        } else
        {
            byte0 = 8;
        }
        mFlags = byte0 | i & 8;
        return this;
    }
}
