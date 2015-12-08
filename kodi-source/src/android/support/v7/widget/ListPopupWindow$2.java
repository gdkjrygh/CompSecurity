// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ListPopupWindow

class this._cls0
    implements Runnable
{

    final ListPopupWindow this$0;

    public void run()
    {
        View view = getAnchorView();
        if (view != null && view.getWindowToken() != null)
        {
            show();
        }
    }

    ()
    {
        this$0 = ListPopupWindow.this;
        super();
    }
}
