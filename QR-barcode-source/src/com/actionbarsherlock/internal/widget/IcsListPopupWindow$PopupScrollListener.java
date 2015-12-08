// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.os.Handler;
import android.widget.AbsListView;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            IcsListPopupWindow, PopupWindowCompat

private class <init>
    implements android.widget.ow.PopupScrollListener
{

    final IcsListPopupWindow this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && !IcsListPopupWindow.access$5(IcsListPopupWindow.this) && IcsListPopupWindow.access$2(IcsListPopupWindow.this).getContentView() != null)
        {
            IcsListPopupWindow.access$3(IcsListPopupWindow.this).removeCallbacks(IcsListPopupWindow.access$4(IcsListPopupWindow.this));
            IcsListPopupWindow.access$4(IcsListPopupWindow.this).run();
        }
    }

    private ()
    {
        this$0 = IcsListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
