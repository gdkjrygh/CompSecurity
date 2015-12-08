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

    final ActionMenuPresenter this$0;

    public boolean needsDividerAfter()
    {
        return false;
    }

    public boolean needsDividerBefore()
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
            showOverflowMenu();
            return true;
        }
    }

    public (Context context)
    {
        this$0 = ActionMenuPresenter.this;
        super(context, null, android.support.v7.appcompat.nuButton.this._fld0);
        setClickable(true);
        setFocusable(true);
        setVisibility(0);
        setEnabled(true);
    }
}
