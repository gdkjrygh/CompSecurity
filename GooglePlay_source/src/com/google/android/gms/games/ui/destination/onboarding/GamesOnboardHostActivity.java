// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.onboarding;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.View;
import android.view.Window;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.play.onboard.OnboardHostFragment;
import com.google.android.play.onboard.OnboardPage;

// Referenced classes of package com.google.android.gms.games.ui.destination.onboarding:
//            GamesOnboardHostFragment, GamesOnboardAccountsPage

public class GamesOnboardHostActivity extends FragmentActivity
{

    PowerUpPlayLogger mPlayLogger;

    public GamesOnboardHostActivity()
    {
    }

    private GamesOnboardHostFragment hostFragment()
    {
        return (GamesOnboardHostFragment)super.mFragments.findFragmentByTag("GamesOnboardActivity");
    }

    public void onBackPressed()
    {
        Object obj = hostFragment().getCurrentPageView();
        if (!(obj instanceof OnboardPage))
        {
            obj = null;
        }
        obj = (OnboardPage)obj;
        if (obj != null)
        {
            ((OnboardPage) (obj)).getPageInfo();
        }
        super.onBackPressed();
    }

    public void onCreate(Bundle bundle)
    {
        if (PlatformVersion.checkVersion(16))
        {
            getWindow().getDecorView().setSystemUiVisibility(4);
        }
        super.onCreate(bundle);
        if (hostFragment() == null)
        {
            bundle = super.mFragments.beginTransaction();
            bundle.replace(0x1020002, new GamesOnboardHostFragment(), "GamesOnboardActivity");
            bundle.commit();
        }
        mPlayLogger = new PowerUpPlayLogger(this);
    }

    public void onResume()
    {
        super.onResume();
        Object obj = hostFragment();
        if (obj != null && ((GamesOnboardHostFragment) (obj)).mAccountsPage != null)
        {
            obj = ((GamesOnboardHostFragment) (obj)).mAccountsPage;
            if (((GamesOnboardAccountsPage) (obj)).mAdapter != null)
            {
                ((GamesOnboardAccountsPage) (obj)).mAdapter.clear();
                android.accounts.Account aaccount[] = AccountUtils.getAvailableAccounts(((GamesOnboardAccountsPage) (obj)).mContext);
                ((GamesOnboardAccountsPage) (obj)).mAdapter.addAll(aaccount);
                ((GamesOnboardAccountsPage) (obj)).mAdapter.notifyDataSetChanged();
            }
        }
    }

    public boolean onSearchRequested()
    {
        return false;
    }

    public void onStart()
    {
        super.onStart();
        PowerUpPlayLogger.start();
    }

    public void onStop()
    {
        super.onStop();
        mPlayLogger.clearPendingEvents();
    }
}
