// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeHeaderView_

public class ChallengeHeaderView extends LinearLayout
{

    protected TextView a;

    public ChallengeHeaderView(Context context)
    {
        super(context);
    }

    public ChallengeHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ChallengeHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ChallengeHeaderView a(Context context)
    {
        return ChallengeHeaderView_.b(context);
    }

    public static ChallengeHeaderView a(Context context, AttributeSet attributeset)
    {
        return ChallengeHeaderView_.b(context, attributeset);
    }

    public static ChallengeHeaderView a(Context context, AttributeSet attributeset, int i)
    {
        return ChallengeHeaderView_.b(context, attributeset, i);
    }

    public void a(String s)
    {
        a.setText(s);
    }
}
