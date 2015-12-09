// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.view.menu.MenuBuilder;
import android.support.v7.view.menu.MenuPopupHelper;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private class rCallback extends MenuPopupHelper
{

    final ActionMenuPresenter this$0;

    public void onDismiss()
    {
        super.onDismiss();
        if (ActionMenuPresenter.access$400(ActionMenuPresenter.this) != null)
        {
            ActionMenuPresenter.access$500(ActionMenuPresenter.this).close();
        }
        ActionMenuPresenter.access$202(ActionMenuPresenter.this, null);
    }

    public A(Context context, MenuBuilder menubuilder, View view, boolean flag)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, menubuilder, view, flag, android.support.v7.appcompat.s._fld0);
        setGravity(0x800005);
        setCallback(mPopupPresenterCallback);
    }
}
