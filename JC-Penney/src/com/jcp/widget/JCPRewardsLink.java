// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;

// Referenced classes of package com.jcp.widget:
//            e

public class JCPRewardsLink extends LinearLayout
{

    public JCPRewardsLink(Context context)
    {
        super(context);
        a(context);
    }

    public JCPRewardsLink(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public JCPRewardsLink(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        a(context);
    }

    private void a(Context context)
    {
        inflate(context, 0x7f03004e, this);
        setOnClickListener(new e(this, context));
    }
}
