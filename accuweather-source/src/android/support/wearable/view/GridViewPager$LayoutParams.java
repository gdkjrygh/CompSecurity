// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.wearable.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

// Referenced classes of package android.support.wearable.view:
//            GridViewPager

public static class gravity extends android.view.ger.LayoutParams
{

    public boolean contentView;
    public boolean current;
    public int gravity;
    public boolean needsMeasure;
    public int scrollLeft;
    public int scrollTop;
    public boolean tall;
    public boolean wide;

    public ()
    {
        super(-1, -1);
        needsMeasure = true;
    }

    public needsMeasure(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = context.obtainStyledAttributes(attributeset, GridViewPager.access$1300());
        gravity = context.getInteger(0, 48);
        context.recycle();
    }
}
