// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.content.Context;
import android.text.Html;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.TrackerInfo;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ConfirmReplaceDeviceActivity_

public class ConfirmReplaceDeviceActivity extends AbstractConfirmDeviceActivity
{

    public ConfirmReplaceDeviceActivity()
    {
    }

    public static void a(Context context, int i, TrackerType trackertype)
    {
        ConfirmReplaceDeviceActivity_.a(context).a(trackertype).b(i);
    }

    protected void c()
    {
        super.c();
        e.setVisibility(8);
        a.setText(0x7f080150);
    }

    protected void d()
    {
        super.d();
        b.setText(Html.fromHtml(getString(0x7f08014f)));
        d.setText(getString(0x7f08014d));
    }

    protected void e()
    {
        super.e();
        if (!g.f() || !g.d().b())
        {
            b.setText(g.d().h());
            d.setText(getString(0x7f08010e));
            d.setClickable(false);
            d.setBackgroundColor(0);
            return;
        } else
        {
            b.setText(Html.fromHtml(getString(0x7f08014e, new Object[] {
                getString(0x7f0802f2, new Object[] {
                    g.a()
                })
            })));
            d.setText(getString(0x7f08014c, new Object[] {
                g.a()
            }));
            return;
        }
    }
}
