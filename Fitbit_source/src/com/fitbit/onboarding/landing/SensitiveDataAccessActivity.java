// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.app.Activity;
import android.widget.ImageView;
import android.widget.TextView;
import com.fitbit.ui.WebViewActivity;
import com.fitbit.util.a.a;

// Referenced classes of package com.fitbit.onboarding.landing:
//            ConfirmationActivity, SensitiveDataAccessActivity_

public class SensitiveDataAccessActivity extends ConfirmationActivity
{

    protected ImageView b;
    protected TextView c;
    protected TextView d;

    public SensitiveDataAccessActivity()
    {
    }

    public static void b(Activity activity, int j)
    {
        com.fitbit.onboarding.landing.SensitiveDataAccessActivity_.a(activity).b(j);
        a.a(activity);
    }

    protected void d()
    {
        super.d();
        b.setVisibility(8);
        d.setText(0x7f0800e9);
        c.setText(0x7f0800ea);
        c.setVisibility(0);
    }

    protected com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope h()
    {
        return com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope.d;
    }

    protected void i()
    {
        WebViewActivity.a(this, null, String.format("file:///android_asset/%s", new Object[] {
            getString(0x7f08005d)
        }), true);
    }
}
