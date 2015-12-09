// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.support.v4.internal.view.SupportMenuItem;
import android.view.ActionProvider;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

public final class ActionMenuItem
    implements SupportMenuItem
{

    private final int mCategoryOrder;
    private android.view.MenuItem.OnMenuItemClickListener mClickListener;
    private Context mContext;
    private int mFlags;
    private final int mGroup;
    private Drawable mIconDrawable;
    private int mIconResId;
    private final int mId;
    private Intent mIntent;
    private final int mOrdering;
    private char mShortcutAlphabeticChar;
    private char mShortcutNumericChar;
    private CharSequence mTitle;
    private CharSequence mTitleCondensed;

    public ActionMenuItem(Context context, int i, int j, int k, int l, CharSequence charsequence)
    {
        mIconResId = 0;
        mFlags = 16;
        mContext = context;
        mId = j;
        mGroup = i;
        mCategoryOrder = k;
        mOrdering = l;
        mTitle = charsequence;
    }

    private static SupportMenuItem setActionView(int i)
    {
        throw new UnsupportedOperationException();
    }

    private static SupportMenuItem setActionView(View view)
    {
        throw new UnsupportedOperationException();
    }

    private SupportMenuItem setShowAsActionFlags(int i)
    {
        setShowAsAction(i);
        return this;
    }

    public final boolean collapseActionView()
    {
        return false;
    }

    public final boolean expandActionView()
    {
        return false;
    }

    public final ActionProvider getActionProvider()
    {
        throw new UnsupportedOperationException();
    }

    public final View getActionView()
    {
        return null;
    }

    public final char getAlphabeticShortcut()
    {
        return mShortcutAlphabeticChar;
    }

    public final int getGroupId()
    {
        return mGroup;
    }

    public final Drawable getIcon()
    {
        return mIconDrawable;
    }

    public final Intent getIntent()
    {
        return mIntent;
    }

    public final int getItemId()
    {
        return mId;
    }

    public final android.view.ContextMenu.ContextMenuInfo getMenuInfo()
    {
        return null;
    }

    public final char getNumericShortcut()
    {
        return mShortcutNumericChar;
    }

    public final int getOrder()
    {
        return mOrdering;
    }

    public final SubMenu getSubMenu()
    {
        return null;
    }

    public final android.support.v4.view.ActionProvider getSupportActionProvider()
    {
        return null;
    }

    public final CharSequence getTitle()
    {
        return mTitle;
    }

    public final CharSequence getTitleCondensed()
    {
        if (mTitleCondensed != null)
        {
            return mTitleCondensed;
        } else
        {
            return mTitle;
        }
    }

    public final boolean hasSubMenu()
    {
        return false;
    }

    public final boolean isActionViewExpanded()
    {
        return false;
    }

    public final boolean isCheckable()
    {
        return (mFlags & 1) != 0;
    }

    public final boolean isChecked()
    {
        return (mFlags & 2) != 0;
    }

    public final boolean isEnabled()
    {
        return (mFlags & 0x10) != 0;
    }

    public final boolean isVisible()
    {
        return (mFlags & 8) == 0;
    }

    public final MenuItem setActionProvider(ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public final volatile MenuItem setActionView(int i)
    {
        return setActionView(i);
    }

    public final volatile MenuItem setActionView(View view)
    {
        return setActionView(view);
    }

    public final MenuItem setAlphabeticShortcut(char c)
    {
        mShortcutAlphabeticChar = c;
        return this;
    }

    public final MenuItem setCheckable(boolean flag)
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

    public final MenuItem setChecked(boolean flag)
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

    public final MenuItem setEnabled(boolean flag)
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

    public final MenuItem setIcon(int i)
    {
        mIconResId = i;
        mIconDrawable = ContextCompat.getDrawable(mContext, i);
        return this;
    }

    public final MenuItem setIcon(Drawable drawable)
    {
        mIconDrawable = drawable;
        mIconResId = 0;
        return this;
    }

    public final MenuItem setIntent(Intent intent)
    {
        mIntent = intent;
        return this;
    }

    public final MenuItem setNumericShortcut(char c)
    {
        mShortcutNumericChar = c;
        return this;
    }

    public final MenuItem setOnActionExpandListener(android.view.MenuItem.OnActionExpandListener onactionexpandlistener)
    {
        throw new UnsupportedOperationException();
    }

    public final MenuItem setOnMenuItemClickListener(android.view.MenuItem.OnMenuItemClickListener onmenuitemclicklistener)
    {
        mClickListener = onmenuitemclicklistener;
        return this;
    }

    public final MenuItem setShortcut(char c, char c1)
    {
        mShortcutNumericChar = c;
        mShortcutAlphabeticChar = c1;
        return this;
    }

    public final void setShowAsAction(int i)
    {
    }

    public final volatile MenuItem setShowAsActionFlags(int i)
    {
        return setShowAsActionFlags(i);
    }

    public final SupportMenuItem setSupportActionProvider(android.support.v4.view.ActionProvider actionprovider)
    {
        throw new UnsupportedOperationException();
    }

    public final SupportMenuItem setSupportOnActionExpandListener(android.support.v4.view.MenuItemCompat.OnActionExpandListener onactionexpandlistener)
    {
        return this;
    }

    public final MenuItem setTitle(int i)
    {
        mTitle = mContext.getResources().getString(i);
        return this;
    }

    public final MenuItem setTitle(CharSequence charsequence)
    {
        mTitle = charsequence;
        return this;
    }

    public final MenuItem setTitleCondensed(CharSequence charsequence)
    {
        mTitleCondensed = charsequence;
        return this;
    }

    public final MenuItem setVisible(boolean flag)
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
