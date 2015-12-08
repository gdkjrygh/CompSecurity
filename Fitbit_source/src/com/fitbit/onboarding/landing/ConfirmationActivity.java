// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.onboarding.landing;

import android.app.Activity;
import android.widget.CheckBox;
import com.fitbit.onboarding.OnboardingFragmentActivity;
import com.fitbit.savedstate.ChinaStoreUtilsSavedState;
import com.fitbit.ui.b;
import com.fitbit.util.a.a;

// Referenced classes of package com.fitbit.onboarding.landing:
//            NetworkAccessActivity_

public abstract class ConfirmationActivity extends OnboardingFragmentActivity
{

    protected CheckBox a;

    public ConfirmationActivity()
    {
    }

    public static void a(Activity activity, int i)
    {
        com.fitbit.onboarding.landing.NetworkAccessActivity_.a(activity).b(i);
        com.fitbit.util.a.a.a(activity);
    }

    private void a(boolean flag)
    {
        if (flag)
        {
            com.fitbit.ui.b.b(h());
        }
        if (a.isChecked() && flag)
        {
            ChinaStoreUtilsSavedState.a(h(), flag);
        }
    }

    private void b(int i)
    {
        setResult(i);
        finish();
        com.fitbit.util.a.a.a(this);
    }

    protected void d()
    {
        a.setChecked(ChinaStoreUtilsSavedState.b(h()));
    }

    protected void e()
    {
        CheckBox checkbox = a;
        boolean flag;
        if (!a.isChecked())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        checkbox.setChecked(flag);
        ChinaStoreUtilsSavedState.b(h(), a.isChecked());
    }

    protected void f()
    {
        a(false);
        b(0);
    }

    protected void g()
    {
        a(true);
        b(-1);
    }

    protected abstract com.fitbit.savedstate.ChinaStoreUtilsSavedState.ConfirmationScope h();
}
