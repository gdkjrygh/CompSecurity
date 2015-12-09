// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.view.View;

// Referenced classes of package android.support.v7.widget:
//            ActivityChooserView, ListPopupWindow

class dingListener extends dingListener
{

    final ActivityChooserView this$0;

    public ListPopupWindow getPopup()
    {
        return ActivityChooserView.access$100(ActivityChooserView.this);
    }

    protected boolean onForwardingStarted()
    {
        showPopup();
        return true;
    }

    protected boolean onForwardingStopped()
    {
        dismissPopup();
        return true;
    }

    dingListener(View view)
    {
        this$0 = ActivityChooserView.this;
        super(view);
    }
}
