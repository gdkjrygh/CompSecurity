// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.ClipboardManager;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class SelectActionModeCallback
    implements android.view.ActionMode.Callback
{
    public static interface ActionHandler
    {

        public abstract void copy();

        public abstract void cut();

        public abstract boolean isSelectionEditable();

        public abstract boolean isSelectionPassword();

        public abstract boolean isShareAvailable();

        public abstract boolean isWebSearchAvailable();

        public abstract void onDestroyActionMode();

        public abstract void paste();

        public abstract void search();

        public abstract void selectAll();

        public abstract void share();
    }


    private final ActionHandler mActionHandler;
    private final Context mContext;
    private boolean mEditable;
    private final boolean mIncognito;
    private boolean mIsPasswordType;

    protected SelectActionModeCallback(Context context, ActionHandler actionhandler, boolean flag)
    {
        mContext = context;
        mActionHandler = actionhandler;
        mIncognito = flag;
    }

    private boolean canPaste()
    {
        return ((ClipboardManager)getContext().getSystemService("clipboard")).hasPrimaryClip();
    }

    private void createActionMenu(ActionMode actionmode, Menu menu)
    {
        actionmode.getMenuInflater().inflate(org.chromium.content.R.menu.select_action_menu, menu);
        if (!mEditable || !canPaste())
        {
            menu.removeItem(org.chromium.content.R.id.select_action_menu_paste);
        }
        if (!mEditable)
        {
            menu.removeItem(org.chromium.content.R.id.select_action_menu_cut);
        }
        if (mEditable || !mActionHandler.isShareAvailable())
        {
            menu.removeItem(org.chromium.content.R.id.select_action_menu_share);
        }
        if (mEditable || mIncognito || !mActionHandler.isWebSearchAvailable())
        {
            menu.removeItem(org.chromium.content.R.id.select_action_menu_web_search);
        }
        if (mIsPasswordType)
        {
            menu.removeItem(org.chromium.content.R.id.select_action_menu_copy);
            menu.removeItem(org.chromium.content.R.id.select_action_menu_cut);
        }
    }

    protected Context getContext()
    {
        return mContext;
    }

    public boolean onActionItemClicked(ActionMode actionmode, MenuItem menuitem)
    {
        int i = menuitem.getItemId();
        if (i == org.chromium.content.R.id.select_action_menu_select_all)
        {
            mActionHandler.selectAll();
        } else
        if (i == org.chromium.content.R.id.select_action_menu_cut)
        {
            mActionHandler.cut();
            actionmode.finish();
        } else
        if (i == org.chromium.content.R.id.select_action_menu_copy)
        {
            mActionHandler.copy();
            actionmode.finish();
        } else
        if (i == org.chromium.content.R.id.select_action_menu_paste)
        {
            mActionHandler.paste();
            actionmode.finish();
        } else
        if (i == org.chromium.content.R.id.select_action_menu_share)
        {
            mActionHandler.share();
            actionmode.finish();
        } else
        if (i == org.chromium.content.R.id.select_action_menu_web_search)
        {
            mActionHandler.search();
            actionmode.finish();
        } else
        {
            return false;
        }
        return true;
    }

    public boolean onCreateActionMode(ActionMode actionmode, Menu menu)
    {
        actionmode.setTitle(null);
        actionmode.setSubtitle(null);
        mEditable = mActionHandler.isSelectionEditable();
        mIsPasswordType = mActionHandler.isSelectionPassword();
        createActionMenu(actionmode, menu);
        return true;
    }

    public void onDestroyActionMode(ActionMode actionmode)
    {
        mActionHandler.onDestroyActionMode();
    }

    public boolean onPrepareActionMode(ActionMode actionmode, Menu menu)
    {
        boolean flag = mActionHandler.isSelectionEditable();
        boolean flag1 = mActionHandler.isSelectionPassword();
        if (mEditable != flag || mIsPasswordType != flag1)
        {
            mEditable = flag;
            mIsPasswordType = flag1;
            menu.clear();
            createActionMenu(actionmode, menu);
            return true;
        } else
        {
            return false;
        }
    }
}
