// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget.rewards;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.jcp.d;
import com.jcp.util.au;

public class TermsAndConditionsFooter extends LinearLayout
{

    private Context a;
    private boolean b;
    protected TextView programDetails;
    protected TextView rewardsFaq;
    protected TextView termsAndConditions;

    public TermsAndConditionsFooter(Context context)
    {
        this(context, null);
    }

    public TermsAndConditionsFooter(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
    }

    public TermsAndConditionsFooter(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        b = false;
        attributeset = context.obtainStyledAttributes(attributeset, d.TermsAndConditionsFooter);
        if (attributeset != null)
        {
            b = attributeset.getBoolean(0, false);
            attributeset.recycle();
        }
        a(context);
    }

    private void a(Context context)
    {
        a = context;
        inflate(context, 0x7f0300d8, this);
        ButterKnife.inject(this);
        if (b)
        {
            termsAndConditions.setText(0x7f07038b);
            programDetails.setText(0x7f07038a);
            rewardsFaq.setText(0x7f070378);
        }
    }

    public void openRewardsFaq()
    {
        au.b(a, a.getString(0x7f070456));
    }

    public void openRewardsProgramDetails()
    {
        au.b(a, a.getString(0x7f070457));
    }

    public void openRewardsTermsAndConditions()
    {
        au.b(a, a.getString(0x7f070458));
    }
}
