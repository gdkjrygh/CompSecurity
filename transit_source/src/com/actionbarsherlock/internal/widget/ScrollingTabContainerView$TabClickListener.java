// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.actionbarsherlock.internal.widget;

import android.view.View;

// Referenced classes of package com.actionbarsherlock.internal.widget:
//            ScrollingTabContainerView, IcsLinearLayout

private class <init>
    implements android.view.nerView.TabClickListener
{

    final ScrollingTabContainerView this$0;

    public void onClick(View view)
    {
        ((<init>)view).<init>().getTab();
        int j = ScrollingTabContainerView.access$0(ScrollingTabContainerView.this).getChildCount();
        int i = 0;
        do
        {
            if (i >= j)
            {
                return;
            }
            View view1 = ScrollingTabContainerView.access$0(ScrollingTabContainerView.this).getChildAt(i);
            boolean flag;
            if (view1 == view)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view1.setSelected(flag);
            i++;
        } while (true);
    }

    private ()
    {
        this$0 = ScrollingTabContainerView.this;
        super();
    }

    this._cls0(this._cls0 _pcls0)
    {
        this();
    }
}
