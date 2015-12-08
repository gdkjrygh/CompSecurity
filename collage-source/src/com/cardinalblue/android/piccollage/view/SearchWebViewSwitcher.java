// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;

public class SearchWebViewSwitcher extends FrameLayout
{

    private int a;

    public SearchWebViewSwitcher(Context context)
    {
        super(context);
        a = -1;
        a();
    }

    public SearchWebViewSwitcher(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = -1;
        a();
    }

    public SearchWebViewSwitcher(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = -1;
        a();
    }

    private void a()
    {
        a(0);
    }

    public boolean a(int i)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (i >= 0)
        {
            flag = flag1;
            if (getChildCount() > i)
            {
                flag = flag1;
                if (a != i)
                {
                    a = i;
                    int j = 0;
                    while (j < getChildCount()) 
                    {
                        View view = getChildAt(j);
                        int k;
                        if (i == j)
                        {
                            k = 0;
                        } else
                        {
                            k = 8;
                        }
                        view.setVisibility(k);
                        j++;
                    }
                    flag = true;
                }
            }
        }
        return flag;
    }

    public View getCurrentView()
    {
        return getChildAt(a);
    }
}
