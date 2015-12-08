// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.profile.ui.badges;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import com.fitbit.data.domain.badges.Badge;
import com.fitbit.ui.FitbitActivity;

// Referenced classes of package com.fitbit.profile.ui.badges:
//            BadgeDetailFragment

public class BadgeDetailActivity extends FitbitActivity
{

    private static final String a = "badgeId";
    private static final String b = "userId";
    private static final String c = "badge";

    public BadgeDetailActivity()
    {
    }

    public static Intent a(Context context, Badge badge, String s)
    {
        context = new Intent(context, com/fitbit/profile/ui/badges/BadgeDetailActivity);
        context.putExtra("badge", badge);
        context.putExtra("userId", s);
        return context;
    }

    public static Intent a(Context context, String s)
    {
        return a(context, s, null);
    }

    public static Intent a(Context context, String s, String s1)
    {
        context = new Intent(context, com/fitbit/profile/ui/badges/BadgeDetailActivity);
        context.putExtra("badgeId", s);
        context.putExtra("userId", s1);
        return context;
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(0x7f04016c);
        ActivityCompat.postponeEnterTransition(this);
        if (getSupportFragmentManager().findFragmentByTag("fragment") == null)
        {
            bundle = getIntent();
            String s = bundle.getStringExtra("userId");
            if (bundle.hasExtra("badge"))
            {
                bundle = BadgeDetailFragment.a((Badge)bundle.getSerializableExtra("badge"), s);
            } else
            {
                bundle = BadgeDetailFragment.a(getIntent().getStringExtra("badgeId"), s);
            }
            getSupportFragmentManager().beginTransaction().add(0x7f110415, bundle).commit();
        }
    }
}
