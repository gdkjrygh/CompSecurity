// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;

// Referenced classes of package android.support.v7.widget:
//            LinearSmoothScroller, LinearLayoutManager

class init> extends LinearSmoothScroller
{

    final LinearLayoutManager a;

    public PointF a(int i)
    {
        return a.c(i);
    }

    (LinearLayoutManager linearlayoutmanager, Context context)
    {
        a = linearlayoutmanager;
        super(context);
    }
}
