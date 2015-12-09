// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.ui.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import gcl;
import gmr;

public class GradientView extends View
{

    private GradientDrawable a;
    private int b[] = {
        0xff000000, -1
    };
    private android.graphics.drawable.GradientDrawable.Orientation c;

    public GradientView(Context context)
    {
        super(context);
        c = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
        a();
    }

    public GradientView(Context context, AttributeSet attributeset)
    {
        int i = 0;
        super(context, attributeset);
        if (!isInEditMode())
        {
            context = context.obtainStyledAttributes(attributeset, gmr.f);
            b = (new int[] {
                context.getColor(0, 0xff000000), context.getColor(1, -1)
            });
            i = (int)context.getFloat(2, 0.0F);
            context.recycle();
        } else
        {
            b = (new int[] {
                0xff000000, -1
            });
        }
        i / 90;
        JVM INSTR tableswitch 0 3: default 96
    //                   0 132
    //                   1 142
    //                   2 152
    //                   3 162;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        c = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
_L7:
        a = null;
        a();
        return;
_L2:
        c = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT;
        continue; /* Loop/switch isn't completed */
_L3:
        c = android.graphics.drawable.GradientDrawable.Orientation.BOTTOM_TOP;
        continue; /* Loop/switch isn't completed */
_L4:
        c = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT;
        continue; /* Loop/switch isn't completed */
_L5:
        c = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private void a()
    {
        if (gcl.a)
        {
            setBackgroundDrawable(null);
            return;
        } else
        {
            setBackground(null);
            return;
        }
    }

    protected void onDraw(Canvas canvas)
    {
        if (a == null)
        {
            a = new GradientDrawable(c, b);
        }
        a.draw(canvas);
    }

    protected void onLayout(boolean flag, int i, int j, int k, int l)
    {
        if (a == null)
        {
            a = new GradientDrawable(c, b);
        }
        a.setBounds(0, 0, k - i, l - j);
        super.onLayout(flag, i, j, k, l);
    }
}
