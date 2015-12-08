// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.content.Context;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.galileo.ui.sync.SyncUICase;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.loadable.CircleLoadablePicassoImageView;
import com.fitbit.ui.loadable.e;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ConfirmReplacePairedDeviceActivity_

public class ConfirmReplacePairedDeviceActivity extends FitbitActivity
{

    protected TextView a;
    protected CircleLoadablePicassoImageView b;
    protected String c;
    protected DeviceVersion d;
    protected b e;

    public ConfirmReplacePairedDeviceActivity()
    {
        c = "";
    }

    public static void a(Context context, int i, String s1, DeviceVersion deviceversion)
    {
        ConfirmReplacePairedDeviceActivity_.a(context).a(s1).a(deviceversion).b(i);
    }

    protected void c()
    {
        b.a(new e(this, b, 3F, 0x7f0f015c), new e(this, b, 3F, 0x7f0f015c));
        Profile profile = an.a().b();
        if (profile == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        if (d == DeviceVersion.MOTIONBIT)
        {
            a.setText(Html.fromHtml(getString(0x7f080109, new Object[] {
                c
            })));
        } else
        {
            a.setText(Html.fromHtml(getString(0x7f080109, new Object[] {
                getString(0x7f0802f2, new Object[] {
                    c
                })
            })));
        }
        b.a(profile.G());
        return;
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        b.setImageURI(null);
        return;
    }

    protected void d()
    {
        if (P())
        {
            setResult(0);
            finish();
        }
    }

    protected void e()
    {
label0:
        {
            if (P())
            {
                e.f();
                SyncUICase syncuicase = e.d();
                e.c(null);
                if (syncuicase != SyncUICase.a)
                {
                    break label0;
                }
                s.a(this, getString(0x7f08053e), 1).i();
            }
            return;
        }
        setResult(-1);
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onPause()
    {
        super.onPause();
    }

    protected void onResume()
    {
        super.onResume();
    }
}
