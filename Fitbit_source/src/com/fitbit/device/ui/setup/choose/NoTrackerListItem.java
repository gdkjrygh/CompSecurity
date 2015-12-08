// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fitbit.ui.loadable.LoadablePicassoImageView;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            NoTrackerListItem_

class NoTrackerListItem extends RelativeLayout
{

    protected TextView a;
    protected TextView b;
    protected LoadablePicassoImageView c;

    public NoTrackerListItem(Context context)
    {
        super(context);
    }

    public NoTrackerListItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public NoTrackerListItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static NoTrackerListItem a(Context context)
    {
        return NoTrackerListItem_.b(context);
    }

    protected void a()
    {
        if (c != null)
        {
            c.setImageResource(0x7f0202b5);
        }
        if (a != null)
        {
            a.setText(getContext().getString(0x7f0800fa));
        }
        if (b != null)
        {
            b.setText(getContext().getString(0x7f0800fd));
        }
    }
}
