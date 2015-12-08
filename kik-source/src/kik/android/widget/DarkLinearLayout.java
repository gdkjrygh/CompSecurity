// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class DarkLinearLayout extends LinearLayout
{

    private static final int a[] = {
        0x7f010002
    };
    private boolean b;

    public DarkLinearLayout(Context context)
    {
        super(context);
        b = false;
    }

    public DarkLinearLayout(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        b = false;
    }

    public final void a(boolean flag)
    {
        if (b != flag)
        {
            b = flag;
            refreshDrawableState();
        }
    }

    public int[] onCreateDrawableState(int i)
    {
        if (b)
        {
            int ai[] = super.onCreateDrawableState(i + 1);
            mergeDrawableStates(ai, a);
            return ai;
        } else
        {
            return super.onCreateDrawableState(i);
        }
    }

}
