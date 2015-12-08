// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.internal.view.menu.MenuPopupHelper;

// Referenced classes of package android.support.v7.widget:
//            ActionMenuPresenter, ListPopupWindow

private final class <init> extends android.support.v7.internal.view.menu.
{

    final ActionMenuPresenter this$0;

    public final ListPopupWindow getPopup()
    {
        if (mActionButtonPopup != null)
        {
            return ((MenuPopupHelper) (mActionButtonPopup)).mPopup;
        } else
        {
            return null;
        }
    }

    private ()
    {
        this$0 = ActionMenuPresenter.this;
        super();
    }

    (byte byte0)
    {
        this();
    }
}
