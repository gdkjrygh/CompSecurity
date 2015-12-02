// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view;

import android.content.Context;
import android.support.v7.b.a;
import android.support.v7.internal.view.menu.MenuWrapperFactory;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

// Referenced classes of package android.support.v7.internal.view:
//            SupportMenuInflater

public class ActionModeWrapper extends a
{
    public static class CallbackWrapper
        implements android.view.ActionMode.Callback
    {

        final Context mContext;
        private ActionModeWrapper mLastStartedActionMode;
        final android.support.v7.b.a.a mWrappedCallback;

        private a getActionModeWrapper(ActionMode actionmode)
        {
            if (mLastStartedActionMode != null && mLastStartedActionMode.mWrappedObject == actionmode)
            {
                return mLastStartedActionMode;
            } else
            {
                return createActionModeWrapper(mContext, actionmode);
            }
        }

        protected ActionModeWrapper createActionModeWrapper(Context context, ActionMode actionmode)
        {
            return new ActionModeWrapper(context, actionmode);
        }

        public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
        {
            return mWrappedCallback.a(getActionModeWrapper(actionmode), MenuWrapperFactory.createMenuItemWrapper(menuitem));
        }

        public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrappedCallback.a(getActionModeWrapper(actionmode), MenuWrapperFactory.createMenuWrapper(menu));
        }

        public void onDestroyActionMode(ActionMode actionmode)
        {
            mWrappedCallback.a(getActionModeWrapper(actionmode));
        }

        public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
        {
            return mWrappedCallback.b(getActionModeWrapper(actionmode), MenuWrapperFactory.createMenuWrapper(menu));
        }

        public void setLastStartedActionMode(ActionModeWrapper actionmodewrapper)
        {
            mLastStartedActionMode = actionmodewrapper;
        }

        public CallbackWrapper(Context context, android.support.v7.b.a.a a1)
        {
            mContext = context;
            mWrappedCallback = a1;
        }
    }


    final MenuInflater mInflater;
    final ActionMode mWrappedObject;

    public ActionModeWrapper(Context context, ActionMode actionmode)
    {
        mWrappedObject = actionmode;
        mInflater = new SupportMenuInflater(context);
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
        return MenuWrapperFactory.createMenuWrapper(mWrappedObject.getMenu());
    }

    public MenuInflater getMenuInflater()
    {
        return mInflater;
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

    public void invalidate()
    {
        mWrappedObject.invalidate();
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
}
