// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.landing;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

// Referenced classes of package com.fitbit.activity.ui.landing:
//            ActivityStickyHeaderView_

public class ActivityStickyHeaderView extends RelativeLayout
{

    protected ViewGroup a;
    protected TextView b;
    protected TextView c;

    public ActivityStickyHeaderView(Context context)
    {
        super(context);
    }

    public ActivityStickyHeaderView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public ActivityStickyHeaderView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static ActivityStickyHeaderView a(Context context)
    {
        return ActivityStickyHeaderView_.b(context);
    }

    public void a(CharSequence charsequence)
    {
        b.setText(charsequence);
    }

    public void a(boolean flag)
    {
        ViewGroup viewgroup = a;
        if (!flag);
        viewgroup.setVisibility(8);
    }

    public void b(CharSequence charsequence)
    {
        c.setText(charsequence);
    }
}
