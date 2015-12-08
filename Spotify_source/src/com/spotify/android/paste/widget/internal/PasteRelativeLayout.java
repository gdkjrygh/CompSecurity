// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.android.paste.widget.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import dhs;

public class PasteRelativeLayout extends RelativeLayout
    implements dhs
{

    private static final int b[] = {
        0x10100a2
    };
    private boolean a;

    public PasteRelativeLayout(Context context)
    {
        this(context, null);
    }

    public PasteRelativeLayout(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public PasteRelativeLayout(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset);
    }

    public final void a(boolean flag)
    {
        a = flag;
        refreshDrawableState();
    }

    protected int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (a)
        {
            mergeDrawableStates(ai, b);
        }
        return ai;
    }

}
