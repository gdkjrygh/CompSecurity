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

public static class weight extends android.view.LayoutParams
{

    private static final int ATTRS[] = {
        0x1010181
    };
    Paint dimPaint;
    boolean dimWhenOffset;
    boolean slideable;
    public float weight;


    public ()
    {
        super(-1, -1);
        weight = 0.0F;
    }

    public weight(int i, int j)
    {
        super(i, j);
        weight = 0.0F;
    }

    public weight(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        weight = 0.0F;
        context = context.obtainStyledAttributes(attributeset, ATTRS);
        weight = context.getFloat(0, 0.0F);
        context.recycle();
    }

    public weight(weight weight1)
    {
        super(weight1);
        weight = 0.0F;
        weight = weight1.weight;
    }

    public weight(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        weight = 0.0F;
    }

    public weight(android.view.LayoutParams layoutparams)
    {
        super(layoutparams);
        weight = 0.0F;
    }
}
