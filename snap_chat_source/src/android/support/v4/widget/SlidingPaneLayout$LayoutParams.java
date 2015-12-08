// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.util.AttributeSet;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

public static class a extends android.view.LayoutParams
{

    private static final int e[] = {
        0x1010181
    };
    public float a;
    boolean b;
    boolean c;
    Paint d;


    public ()
    {
        super(-1, -1);
        a = 0.0F;
    }

    public a(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = 0.0F;
        context = context.obtainStyledAttributes(attributeset, e);
        a = context.getFloat(0, 0.0F);
        context.recycle();
    }

    public a(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0.0F;
    }

    public a(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        a = 0.0F;
    }
}
