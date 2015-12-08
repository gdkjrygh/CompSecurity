// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.DialogInterface;

// Referenced classes of package android.support.v7.internal.view.menu:
//            g, ActionMenuPresenter, p

private class a extends g
{

    final ActionMenuPresenter a;

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        ActionMenuPresenter.a(a, null);
        a.b = 0;
    }

    public A(ActionMenuPresenter actionmenupresenter, p p)
    {
        a = actionmenupresenter;
        super(p);
        actionmenupresenter.a(actionmenupresenter.a);
    }
}
