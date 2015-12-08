// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ListMenuPresenter, MenuItemImpl, MenuBuilder

public final class MenuDialogHelper
    implements android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, android.content.DialogInterface.OnKeyListener, MenuPresenter.Callback
{

    AlertDialog mDialog;
    MenuBuilder mMenu;
    ListMenuPresenter mPresenter;

    public MenuDialogHelper(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public final void onClick(DialogInterface dialoginterface, int i)
    {
        mMenu.performItemAction((MenuItemImpl)mPresenter.getAdapter().getItem(i), null, 0);
    }

    public final void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if ((flag || menubuilder == mMenu) && mDialog != null)
        {
            mDialog.dismiss();
        }
    }

    public final void onDismiss(DialogInterface dialoginterface)
    {
        mPresenter.onCloseMenu(mMenu, true);
    }

    public final boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
    {
        if (i == 82 || i == 4)
        {
            if (keyevent.getAction() == 0 && keyevent.getRepeatCount() == 0)
            {
                dialoginterface = mDialog.getWindow();
                if (dialoginterface != null)
                {
                    dialoginterface = dialoginterface.getDecorView();
                    if (dialoginterface != null)
                    {
                        dialoginterface = dialoginterface.getKeyDispatcherState();
                        if (dialoginterface != null)
                        {
                            dialoginterface.startTracking(keyevent, this);
                            return true;
                        }
                    }
                }
            } else
            if (keyevent.getAction() == 1 && !keyevent.isCanceled())
            {
                Object obj = mDialog.getWindow();
                if (obj != null)
                {
                    obj = ((Window) (obj)).getDecorView();
                    if (obj != null)
                    {
                        obj = ((View) (obj)).getKeyDispatcherState();
                        if (obj != null && ((android.view.KeyEvent.DispatcherState) (obj)).isTracking(keyevent))
                        {
                            mMenu.close(true);
                            dialoginterface.dismiss();
                            return true;
                        }
                    }
                }
            }
        }
        return mMenu.performShortcut(i, keyevent, 0);
    }

    public final boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        return false;
    }
}
