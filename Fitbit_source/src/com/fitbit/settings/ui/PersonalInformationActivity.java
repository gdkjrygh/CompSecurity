// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.widget.Toast;
import com.fitbit.data.domain.Profile;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.settings.ui:
//            ProfileInfo

public class PersonalInformationActivity extends FitbitActivity
    implements ProfileInfo.a
{

    public PersonalInformationActivity()
    {
    }

    public static Intent a(Context context)
    {
        return new Intent(context, com/fitbit/settings/ui/PersonalInformationActivity);
    }

    public void e()
    {
        Toast.makeText(getApplicationContext(), 0x7f08045f, 0).show();
        finish();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f040024);
        if (getSupportFragmentManager().findFragmentByTag(com/fitbit/settings/ui/ProfileInfo.getName()) == null)
        {
            bundle = new ProfileInfo();
            getSupportFragmentManager().beginTransaction().add(0x7f110009, bundle, com/fitbit/data/domain/Profile.getName()).commit();
        }
    }
}
