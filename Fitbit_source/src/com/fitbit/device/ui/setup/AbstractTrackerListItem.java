// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup;

import android.content.Context;
import android.content.IntentFilter;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.fitbit.data.domain.device.TrackerInfo;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.threading.c;

public abstract class AbstractTrackerListItem extends RelativeLayout
{

    protected TextView a;
    protected TextView b;
    protected LoadablePicassoImageView c;
    protected TrackerType d;
    private c e;

    public AbstractTrackerListItem(Context context)
    {
        super(context);
        e = new _cls1();
    }

    public AbstractTrackerListItem(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        e = new _cls1();
    }

    public AbstractTrackerListItem(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
        e = new _cls1();
    }

    public void a(TrackerType trackertype)
    {
        e.a(new IntentFilter("SyncTrackerInfoOperation.ACTION_TRACKER_INFO_SYNCED"));
        d = trackertype;
        if (trackertype == null) goto _L2; else goto _L1
_L1:
        if (a != null)
        {
            b(trackertype);
        }
_L8:
        if (trackertype == null || trackertype.d() == null) goto _L4; else goto _L3
_L3:
        if (b != null)
        {
            c(trackertype);
        }
        if (c != null)
        {
            c.a(trackertype.d().d());
        }
_L6:
        return;
_L2:
        if (a != null)
        {
            a.setText("");
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (b != null)
        {
            b.setText("");
        }
        if (c == null) goto _L6; else goto _L5
_L5:
        c.setImageResource(0x106000d);
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected abstract void b(TrackerType trackertype);

    protected abstract void c(TrackerType trackertype);

    /* member class not found */
    class _cls1 {}

}
