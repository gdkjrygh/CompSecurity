// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.view;

import android.content.Context;
import android.support.v4.internal.view.SupportMenu;
import android.support.v4.internal.view.SupportMenuItem;
import android.support.v4.util.SimpleArrayMap;
import android.support.v7.view.menu.MenuWrapperFactory;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import java.util.ArrayList;

// Referenced classes of package android.support.v7.view:
//            ActionMode

public class SupportActionModeWrapper extends ActionMode
{
    public static class CallbackWrapper
        implements ActionMode.Callback
    {

        final ArrayList mActionModes = new ArrayList();
        final Context mContext;
        final SimpleArrayMap mMenus = new SimpleArrayMap();
        final android.view.ActionMode.Callback mWrappedCallback;

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

        public ActionMode getActionModeWrapper(android.support.v7.view.ActionMode actionmode)
        {
            int j = mActionModes.size();
            for (int i = 0; i < j; i++)
            {
                SupportActionModeWrapper supportactionmodewrapper = (SupportActionModeWrapper)mActionModes.get(i);
                if (supportactionmodewrapper != null && supportactionmodewrapper.mWrappedObject == actionmode)
                {
                    return supportactionmodewrapper;
                }
            }

            actionmode = new SupportActionModeWrapper(mContext, actionmode);
            mActionModes.add(actionmode);
            return actionmode;
        }

        public boolean onActionItemClicked(android.support.v7.view.ActionMode actionmode, MenuItem menuitem)
        {
            return mWrappedCallback.onActionItemClicked(getActionModeWrapper(actionmode), MenuWrapperFactory.wrapSupportMenuItem(mContext, (SupportMenuItem)menuitem));
        }

        public boolean onCreateActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
        {
            return mWrappedCallback.onCreateActionMode(getActionModeWrapper(actionmode), getMenuWrapper(menu));
        }

        public void onDestroyActionMode(android.support.v7.view.ActionMode actionmode)
        {
            mWrappedCallback.onDestroyActionMode(getActionModeWrapper(actionmode));
        }

        public boolean onPrepareActionMode(android.support.v7.view.ActionMode actionmode, Menu menu)
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

    public void finish()
    {
        mWrappedObject.finish();
    }

    public View getCustomView()
    {
        return mWrappedObject.getCustomView();
    }

    public Menu getMenu()
    {
        return MenuWrapperFactory.wrapSupportMenu(mContext, (SupportMenu)mWrappedObject.getMenu());
    }

    public MenuInflater getMenuInflater()
    {
        return mWrappedObject.getMenuInflater();
    }

    public CharSequence getSubtitle()
    {
        return mWrappedObject.getSubtitle();
    }

    public Object getTag()
    {
        return mWrappedObject.getTag();
    }

    public CharSequence getTitle()
    {
        return mWrappedObject.getTitle();
    }

    public boolean getTitleOptionalHint()
    {
        return mWrappedObject.getTitleOptionalHint();
    }

    public void invalidate()
    {
        mWrappedObject.invalidate();
    }

    public boolean isTitleOptional()
    {
        return mWrappedObject.isTitleOptional();
    }

    public void setCustomView(View view)
    {
        mWrappedObject.setCustomView(view);
    }

    public void setSubtitle(int i)
    {
        mWrappedObject.setSubtitle(i);
    }

    public void setSubtitle(CharSequence charsequence)
    {
        mWrappedObject.setSubtitle(charsequence);
    }

    public void setTag(Object obj)
    {
        mWrappedObject.setTag(obj);
    }

    public void setTitle(int i)
    {
        mWrappedObject.setTitle(i);
    }

    public void setTitle(CharSequence charsequence)
    {
        mWrappedObject.setTitle(charsequence);
    }

    public void setTitleOptionalHint(boolean flag)
    {
        mWrappedObject.setTitleOptionalHint(flag);
    }
}
