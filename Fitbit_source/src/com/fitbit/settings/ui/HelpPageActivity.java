// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.analytics.core.a;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.settings.ui:
//            HelpPageListFragment

public class HelpPageActivity extends FitbitActivity
    implements HelpPageListFragment.a
{

    public HelpPageActivity()
    {
    }

    public static void a(Context context)
    {
        context.startActivity(new Intent(context, com/fitbit/settings/ui/HelpPageActivity));
    }

    public void a(Fragment fragment, String s)
    {
        getSupportFragmentManager().beginTransaction().addToBackStack(s).replace(0x1020002, fragment).commit();
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    protected void onResumeFragments()
    {
        super.onResumeFragments();
        if (getSupportFragmentManager().findFragmentById(0x1020002) == null)
        {
            getSupportFragmentManager().beginTransaction().replace(0x1020002, com.fitbit.settings.ui.HelpPageListFragment.a()).commit();
        }
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.A);
    }
}
