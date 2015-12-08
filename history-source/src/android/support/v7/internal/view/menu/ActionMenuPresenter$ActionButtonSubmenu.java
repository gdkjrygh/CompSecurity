// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

// Referenced classes of package android.support.v7.internal.view.menu:
//            MenuDialogHelper, ActionMenuPresenter, SubMenuBuilder

private class ack extends MenuDialogHelper
{

    final ActionMenuPresenter this$0;

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        ActionMenuPresenter.access$202(ActionMenuPresenter.this, null);
        mOpenSubMenuId = 0;
    }

    public (SubMenuBuilder submenubuilder)
    {
        this$0 = ActionMenuPresenter.this;
        super(submenubuilder);
        setCallback(mPopupPresenterCallback);
    }
}
