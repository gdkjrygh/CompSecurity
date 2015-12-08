// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.IBinder;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.ListAdapter;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ListMenuPresenter, MenuItemImpl, MenuBuilder

public class MenuDialogHelper
    implements android.content.DialogInterface.OnKeyListener, android.content.DialogInterface.OnClickListener, android.content.DialogInterface.OnDismissListener, MenuPresenter.Callback
{

    private AlertDialog mDialog;
    private MenuBuilder mMenu;
    ListMenuPresenter mPresenter;
    private MenuPresenter.Callback mPresenterCallback;

    public MenuDialogHelper(MenuBuilder menubuilder)
    {
        mMenu = menubuilder;
    }

    public void dismiss()
    {
        if (mDialog != null)
        {
            mDialog.dismiss();
        }
    }

    public void onClick(DialogInterface dialoginterface, int i)
    {
        mMenu.performItemAction((MenuItemImpl)mPresenter.getAdapter().getItem(i), 0);
    }

    public void onCloseMenu(MenuBuilder menubuilder, boolean flag)
    {
        if (flag || menubuilder == mMenu)
        {
            dismiss();
        }
        if (mPresenterCallback != null)
        {
            mPresenterCallback.onCloseMenu(menubuilder, flag);
        }
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        mPresenter.onCloseMenu(mMenu, true);
    }

    public boolean onKey(DialogInterface dialoginterface, int i, KeyEvent keyevent)
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

    public boolean onOpenSubMenu(MenuBuilder menubuilder)
    {
        if (mPresenterCallback != null)
        {
            return mPresenterCallback.onOpenSubMenu(menubuilder);
        } else
        {
            return false;
        }
    }

    public void setPresenterCallback(MenuPresenter.Callback callback)
    {
        mPresenterCallback = callback;
    }

    public void show(IBinder ibinder)
    {
        Object obj = mMenu;
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(((MenuBuilder) (obj)).getContext());
        mPresenter = new ListMenuPresenter(android.support.v7.appcompat.R.layout.abc_list_menu_item_layout, android.support.v7.appcompat.R.style.Theme_AppCompat_CompactMenu_Dialog);
        mPresenter.setCallback(this);
        mMenu.addMenuPresenter(mPresenter);
        builder.setAdapter(mPresenter.getAdapter(), this);
        View view = ((MenuBuilder) (obj)).getHeaderView();
        if (view != null)
        {
            builder.setCustomTitle(view);
        } else
        {
            builder.setIcon(((MenuBuilder) (obj)).getHeaderIcon()).setTitle(((MenuBuilder) (obj)).getHeaderTitle());
        }
        builder.setOnKeyListener(this);
        mDialog = builder.create();
        mDialog.setOnDismissListener(this);
        obj = mDialog.getWindow().getAttributes();
        obj.type = 1003;
        if (ibinder != null)
        {
            obj.token = ibinder;
        }
        obj.flags = ((android.view.WindowManager.LayoutParams) (obj)).flags | 0x20000;
        mDialog.show();
    }
}
