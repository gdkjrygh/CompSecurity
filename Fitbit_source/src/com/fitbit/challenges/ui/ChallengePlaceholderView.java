// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengePlaceholderView_

public class ChallengePlaceholderView extends LinearLayout
{

    protected TextView a;

    public ChallengePlaceholderView(Context context)
    {
        super(context);
    }

    public ChallengePlaceholderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ChallengePlaceholderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ChallengePlaceholderView a(Context context)
    {
        return ChallengePlaceholderView_.b(context);
    }
}
