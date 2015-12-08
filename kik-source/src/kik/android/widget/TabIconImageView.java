// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

public class TabIconImageView extends ImageView
{

    private static final int a[] = {
        0x7f010002
    };
    private boolean b;

    public TabIconImageView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TabIconImageView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
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
