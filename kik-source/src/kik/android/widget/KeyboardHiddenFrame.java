// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import kik.android.chat.KikApplication;

public class KeyboardHiddenFrame extends FrameLayout
{

    private static final int b = KikApplication.a(200);
    private final Rect a;

    public KeyboardHiddenFrame(Context context)
    {
        super(context);
        a = new Rect();
    }

    public KeyboardHiddenFrame(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a = new Rect();
    }

    public KeyboardHiddenFrame(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a = new Rect();
    }

    protected void onMeasure(int i, int j)
    {
        boolean flag;
        View view = getRootView();
        if (view == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        view.getWindowVisibleDisplayFrame(a);
        if (view.getMeasuredHeight() - a.bottom <= b)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        flag = true;
_L1:
        if (flag)
        {
            setMeasuredDimension(0, 0);
            return;
        } else
        {
            super.onMeasure(i, j);
            return;
        }
        flag = false;
          goto _L1
    }

}
