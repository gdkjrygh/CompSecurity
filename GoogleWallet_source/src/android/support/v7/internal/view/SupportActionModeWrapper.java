// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public final class SupportActionModeWrapper extends ActionMode
{
    public static final class CallbackWrapper
        implements android.support.v7.view.ActionMode.Callback
    {

        final SimpleArrayMap mActionModes = new SimpleArrayMap();
        final Context mContext;
        final SimpleArrayMap mMenus = new SimpleArrayMap();
        final android.view.ActionMode.Callback mWrappedCallback;

        private ActionMode getActionModeWrapper(android.support.v7.view.ActionMode actionmode)
        {
            SupportActionModeWrapper supportactionmodewrapper = (SupportActionModeWrapper)mActionModes.get(actionmode);
            if (supportactionmodewrapper != null)
            {
                return supportactionmodewrapper;
            } else
            {
                SupportActionModeWrapper supportactionmodewrapper1 = new SupportActionModeWrapper(mContext, actionmode);
                mActionModes.put(actionmode, supportactionmodewrapper1);
                return supportactionmodewrapper1;
            }
        }

        private Menu getMenuWrapper(Menu menu)
        {
            Menu menu2 = (Menu)mMenus.get(menu);
            Menu menu1 = menu2;
            if (menu2 == null)
            {
                menu1 = MenuWrapperFactory.wrapSupportMenu(mContext, (SupportMenu)menu);
                mMenus.put(menu, menu1);
            }
            return menu1;
        }

        public final boolean onActionItemClicked(android.support.v7.view.ActionMode actionmode, MenuItem menuitem)
        {
            return mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionmode), MenuWrapperFactory.wrapSupportMenuItem(mContext, (SupportMenuItem)menuitem));
        }

        public final boolean onCreateActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
        {
            return mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
        }

        public final void onDestroyActionMode(android.support.v7.view.ActionMode actionmode)
        {
            mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionmode));
        }

        public final boolean onPrepareActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
        {
            return mWrappedCallback.onPrepareActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
        }

        public CallbackWrapper(Context context, android.view.ActionMode.Callback callback)
        {
            mContext = context;
            mWrappedCallback = callback;
        }
    }


    final Context mContext;
    final android.support.v7.view.ActionMode mWrappedObject;

    public SupportActionModeWrapper(Context context, android.support.v7.view.ActionMode actionmode)
    {
        mContext = context;
        mWrappedObject = actionmode;
    }

    public final void finish()
    {
        mWrappedObject.finish();
    }

    public final View getCustomView()
    {
        return mWrappedObject.getCustomView();
    }

    public final Menu getMenu()
    {
        return MenuWrapperFactory.wrapSupportMenu(mContext, (SupportMenu)mWrappedObject.getMenu());
    }

    public final MenuInflater getMenuInflater()
    {
        return mWrappedObject.getMenuInflater();
    }

    public final CharSequence getSubtitle()
    {
        return mWrappedObject.getSubtitle();
    }

    public final Object getTag()
    {
        return mWrappedObject.getTag();
    }

    public final CharSequence getTitle()
    {
        return mWrappedObject.getTitle();
    }

    public final boolean getTitleOptionalHint()
    {
        return mWrappedObject.getTitleOptionalHint();
    }

    public final void invalidate()
    {
        mWrappedObject.invalidate();
    }

    public final boolean isTitleOptional()
    {
        return mWrappedObject.isTitleOptional();
    }

    public final void setCustomView(View view)
    {
        mWrappedObject.setCustomView(view);
    }

    public final void setSubtitle(int i)
    {
        mWrappedObject.setSubtitle(i);
    }

    public final void setSubtitle(CharSequence charsequence)
    {
        mWrappedObject.setSubtitle(charsequence);
    }

    public final void setTag(Object obj)
    {
        mWrappedObject.setTag(obj);
    }

    public final void setTitle(int i)
    {
        mWrappedObject.setTitle(i);
    }

    public final void setTitle(CharSequence charsequence)
    {
        mWrappedObject.setTitle(charsequence);
    }

    public final void setTitleOptionalHint(boolean flag)
    {
        mWrappedObject.setTitleOptionalHint(flag);
    }
}
