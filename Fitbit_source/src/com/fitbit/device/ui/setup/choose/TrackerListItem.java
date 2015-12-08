// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.TextView;
import com.fitbit.data.domain.device.TrackerInfo;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.AbstractTrackerListItem;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            TrackerListItem_

class TrackerListItem extends AbstractTrackerListItem
{

    public TrackerListItem(Context context)
    {
        super(context);
    }

    public TrackerListItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public TrackerListItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public static TrackerListItem a(Context context)
    {
        return TrackerListItem_.b(context);
    }

    protected void b(TrackerType trackertype)
    {
        a.setText(trackertype.a());
    }

    protected void c(TrackerType trackertype)
    {
        b.setText(trackertype.d().c());
    }
}
