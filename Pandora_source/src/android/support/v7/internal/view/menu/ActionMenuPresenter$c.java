// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.view.menu;

import android.content.Context;
import android.widget.ImageButton;

// Referenced classes of package android.support.v7.internal.view.menu:
//            ActionMenuPresenter

private class setEnabled extends ImageButton
    implements setEnabled
{

    final ActionMenuPresenter a;

    public boolean c()
    {
        return false;
    }

    public boolean d()
    {
        return false;
    }

    public boolean performClick()
    {
        if (super.performClick())
        {
            return true;
        } else
        {
            playSoundEffect(0);
            a.a();
            return true;
        }
    }

    public A(ActionMenuPresenter actionmenupresenter, Context context)
    {
        a = actionmenupresenter;
        super(context, null, android.support.v7.appcompat.uttonStyle);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }
}
