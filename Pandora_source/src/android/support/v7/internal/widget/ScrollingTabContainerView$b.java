// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.internal.widget;

import android.view.View;
import android.widget.LinearLayout;

// Referenced classes of package android.support.v7.internal.widget:
//            ScrollingTabContainerView

private class <init>
    implements android.view.ingTabContainerView.b
{

    final ScrollingTabContainerView a;

    public void onClick(View view)
    {
        ((bView)view).getTab().getTab();
        int j = ScrollingTabContainerView.a(a).getChildCount();
        int i = 0;
        while (i < j) 
        {
            View view1 = ScrollingTabContainerView.a(a).getChildAt(i);
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
        }
    }

    private bView(ScrollingTabContainerView scrollingtabcontainerview)
    {
        a = scrollingtabcontainerview;
        super();
    }

    a(ScrollingTabContainerView scrollingtabcontainerview, a a1)
    {
        this(scrollingtabcontainerview);
    }
}
