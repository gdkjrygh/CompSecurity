// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.widget.PopupWindow;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

private class <init>
    implements Runnable
{

    final ListPopupWindow this$0;

    public void run()
    {
        if (ListPopupWindow.access$600(ListPopupWindow.this) != null && ListPopupWindow.access$600(ListPopupWindow.this).Count() > ListPopupWindow.access$600(ListPopupWindow.this).ChildCount() && ListPopupWindow.access$600(ListPopupWindow.this).ChildCount() <= mListItemExpandMaximum)
        {
            ListPopupWindow.access$1100(ListPopupWindow.this).setInputMethodMode(2);
            show();
        }
    }

    private ()
    {
        this$0 = ListPopupWindow.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
