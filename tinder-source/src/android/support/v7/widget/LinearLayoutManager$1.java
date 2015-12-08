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

    final LinearLayoutManager this$0;

    public PointF computeScrollVectorForPosition(int i)
    {
        return LinearLayoutManager.this.computeScrollVectorForPosition(i);
    }

    (Context context)
    {
        this$0 = LinearLayoutManager.this;
        super(context);
    }
}
