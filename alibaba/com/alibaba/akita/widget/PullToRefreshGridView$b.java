// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.widget;

import android.content.Context;
import android.util.AttributeSet;
import mr;

// Referenced classes of package com.alibaba.akita.widget:
//            PullToRefreshGridView

final class <init> extends <init>
{

    final PullToRefreshGridView b;

    protected boolean overScrollBy(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, boolean flag)
    {
        boolean flag1 = super.overScrollBy(i, j, k, l, i1, j1, k1, l1, flag);
        mr.a(b, i, k, j, l, flag);
        return flag1;
    }

    public (PullToRefreshGridView pulltorefreshgridview, Context context, AttributeSet attributeset)
    {
        b = pulltorefreshgridview;
        super(pulltorefreshgridview, context, attributeset);
    }
}
