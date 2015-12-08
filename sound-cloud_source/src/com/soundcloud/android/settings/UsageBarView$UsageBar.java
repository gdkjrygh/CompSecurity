// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.settings;

import android.graphics.Paint;

// Referenced classes of package com.soundcloud.android.settings:
//            UsageBarView

private class amount
{

    private long amount;
    private Paint paint;
    final UsageBarView this$0;

    public long getAmount()
    {
        return amount;
    }

    public Paint getPaint()
    {
        return paint;
    }

    (int i, long l)
    {
        this$0 = UsageBarView.this;
        super();
        paint = new Paint();
        paint.setColor(i);
        amount = Math.max(0L, l);
    }
}
