// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.activities;

import android.view.View;
import butterknife.internal.DebouncingOnClickListener;

// Referenced classes of package com.jcp.activities:
//            RewardsScanViewActivity

class bg extends DebouncingOnClickListener
{

    final RewardsScanViewActivity a;
    final RewardsScanViewActivity..ViewInjector b;

    bg(RewardsScanViewActivity..ViewInjector viewinjector, RewardsScanViewActivity rewardsscanviewactivity)
    {
        b = viewinjector;
        a = rewardsscanviewactivity;
        super();
    }

    public void doClick(View view)
    {
        a.onClickClose();
    }
}
