// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.support.v7.internal.view.menu.MenuBuilder;
import android.support.v7.internal.view.menu.MenuPopupHelper;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter

private final class rCallback extends MenuPopupHelper
{

    final ActionMenuPresenter this$0;

    public final void onDismiss()
    {
        super.onDismiss();
        mMenu.close();
        mOverflowPopup = null;
    }

    public A(Context context, MenuBuilder menubuilder, View view)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, menubuilder, view, true, 0x7f0100fb);
        super.mDropDownGravity = 0x800005;
        super.mPresenterCallback = mPopupPresenterCallback;
    }
}
