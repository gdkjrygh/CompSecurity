// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.view.View;
import android.widget.ImageButton;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.a;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

private class <init>
{

    final TrackerDetailsActivity a;
    private a b;

    private void a()
    {
        a.h.setEnabled(true);
        a.c.setEnabled(false);
        a.c.setVisibility(0);
    }

    private void b()
    {
        a.h.setEnabled(true);
        a.c.setEnabled(true);
        a.c.setVisibility(0);
    }

    private void c()
    {
        a.h.setEnabled(true);
        a.c.setEnabled(true);
        a.c.setVisibility(0);
        if (TrackerDetailsActivity.e(a) != null)
        {
            com.fitbit.device.ui.TrackerDetailsActivity.a(a, TrackerDetailsActivity.e(a));
        }
    }

    private void d()
    {
        a.f.setVisibility(0);
    }

    private void e()
    {
        a.h.setEnabled(false);
        a.c.setVisibility(8);
        a.c.setEnabled(false);
        a.f.setVisibility(8);
    }

    void a(SyncUICase syncuicase, a a1, boolean flag)
    {
        b = a1;
        a.i.setText(String.format(a.getString(0x7f080316), new Object[] {
            b.b
        }));
        if (!flag)
        {
            return;
        }
        e();
        switch (com.fitbit.device.ui..a[syncuicase.ordinal()])
        {
        default:
            c();
            return;

        case 10: // '\n'
            d();
            return;

        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
        case 9: // '\t'
        case 11: // '\013'
            a();
            return;

        case 12: // '\f'
            b();
            break;
        }
    }

    private (TrackerDetailsActivity trackerdetailsactivity)
    {
        a = trackerdetailsactivity;
        super();
    }

    a(TrackerDetailsActivity trackerdetailsactivity, a a1)
    {
        this(trackerdetailsactivity);
    }
}
