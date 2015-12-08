// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.support.v7.view.menu.MenuPopupHelper;
import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            CBluePopupMenu, ListPopupWindow

class orwardingListener extends orwardingListener
{

    final CBluePopupMenu this$0;

    public ListPopupWindow getPopup()
    {
        return CBluePopupMenu.access$000(CBluePopupMenu.this).getPopup();
    }

    protected boolean onForwardingStarted()
    {
        show();
        return true;
    }

    protected boolean onForwardingStopped()
    {
        dismiss();
        return true;
    }

    r(View view)
    {
        this$0 = CBluePopupMenu.this;
        super(view);
    }
}
