// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.accountswitcherview;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.widget.ImageButton;

public class ExpanderView extends ImageButton
{

    private static final int STATE_EXPANDED[] = {
        0x10100a8
    };
    private String mCollapsedDesc;
    private String mExpandedDesc;
    private boolean mIsExpanded;

    public ExpanderView(Context context)
    {
        this(context, null);
    }

    public ExpanderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        setupStrings(context);
    }

    public ExpanderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        setupStrings(context);
    }

    private void setupStrings(Context context)
    {
        context = context.getResources();
        mCollapsedDesc = context.getString(R.string.show_account_list);
        mExpandedDesc = context.getString(R.string.hide_account_list);
    }

    public int[] onCreateDrawableState(int i)
    {
        int ai[] = super.onCreateDrawableState(i + 1);
        if (mIsExpanded)
        {
            mergeDrawableStates(ai, STATE_EXPANDED);
        }
        return ai;
    }

    public void setExpanded(boolean flag)
    {
        mIsExpanded = flag;
        String s;
        if (mIsExpanded)
        {
            s = mExpandedDesc;
        } else
        {
            s = mCollapsedDesc;
        }
        setContentDescription(s);
        refreshDrawableState();
    }

}
