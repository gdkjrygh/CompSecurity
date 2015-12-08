// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.sothree.slidinguppanel;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;

// Referenced classes of package com.sothree.slidinguppanel:
//            SlidingUpPanelLayout

public static class ATTRS extends android.view..LayoutParams
{

    private static final int ATTRS[] = {
        0x1010181
    };
    Paint dimPaint;
    boolean dimWhenOffset;
    boolean slideable;


    public ()
    {
        super(-1, -1);
    }

    public (int i, int j)
    {
        super(i, j);
    }

    public (Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context.obtainStyledAttributes(attributeset, ATTRS).recycle();
    }

    public ATTRS(android.view..LayoutParams layoutparams)
    {
        super(layoutparams);
    }

    public ATTRS(android.view..LayoutParams layoutparams)
    {
        super(layoutparams);
    }

    public ATTRS(ATTRS attrs)
    {
        super(attrs);
    }
}
