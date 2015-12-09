// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.app.PowerUpPlayLogger;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.destination.sharedprefs.SharedPrefsConfig;
import com.google.android.gms.games.util.AccountUtils;
import com.google.android.libraries.bind.data.Data;
import com.google.android.libraries.bind.data.DataList;
import com.google.android.play.onboard.OnboardHostFragment;
import com.google.android.play.onboard.OnboardPageInfo;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.destination.onboarding:
//            GamesOnboardHostActivity, GamesTutorialPageInfo, GamesOnboardAccountsPage

public final class GamesOnboardHostFragment extends OnboardHostFragment
    implements GamesOnboardAccountsPage.OnboardAccountsEventListener, com.google.android.play.onboard.OnboardPagerAdapter.PageGenerator
{

    GamesOnboardAccountsPage mAccountsPage;
    private DataList mPageList;
    private String mSelectedAccount;
    private boolean mShowAccounts;
    private boolean mSkipped;

    public GamesOnboardHostFragment()
    {
        mSkipped = false;
    }

    public final void finishOnboardFlow()
    {
        super.finishOnboardFlow();
        GamesOnboardHostActivity gamesonboardhostactivity;
        String s;
        Intent intent;
        if (mSkipped)
        {
            ((GamesOnboardHostActivity)super.mActivity).mPlayLogger.logOnboardAction(2);
        } else
        {
            ((GamesOnboardHostActivity)super.mActivity).mPlayLogger.logOnboardAction(8);
        }
        mPageList = null;
        gamesonboardhostactivity = (GamesOnboardHostActivity)super.mActivity;
        s = mSelectedAccount;
        SharedPrefsConfig.setBoolean(gamesonboardhostactivity, "showOnBoardingFlow", false);
        intent = new Intent();
        intent.putExtra("com.google.android.gms.games.ON_BOARDING_ACCOUNT", s);
        gamesonboardhostactivity.setResult(-1, intent);
        gamesonboardhostactivity.finish();
    }

    public final DataList getPageList()
    {
        boolean flag = true;
        ArrayList arraylist = new ArrayList();
        arraylist.add((new com.google.android.play.onboard.OnboardTutorialPage.Builder(super.mActivity, 0)).setBackgroundColor(getAppColor()).setTitleText(0x7f100113).setBodyText(0x7f100112).setIconDrawableId(0x7f02015c).setPageInfo(new GamesTutorialPageInfo(super.mActivity, 0)).build());
        arraylist.add((new com.google.android.play.onboard.OnboardTutorialPage.Builder(super.mActivity, 1)).setBackgroundColor(getAppColor()).setTitleText(0x7f100115).setBodyText(0x7f100114).setIconDrawableId(0x7f02015d).setPageInfo(new GamesTutorialPageInfo(super.mActivity, 1)).build());
        arraylist.add((new com.google.android.play.onboard.OnboardTutorialPage.Builder(super.mActivity, 2)).setBackgroundColor(getAppColor()).setTitleText(0x7f100117).setBodyText(0x7f100116).setIconDrawableId(0x7f02015e).setPageInfo(new GamesTutorialPageInfo(super.mActivity, 2)).build());
        if (AccountUtils.getAvailableAccounts(super.mActivity).length == 1)
        {
            flag = false;
        }
        mShowAccounts = flag;
        if (mShowAccounts)
        {
            Data data = new Data();
            data.put(0x7f0d0055, "accounts");
            data.put(0x7f0d0057, this);
            arraylist.add(data);
        }
        mPageList = new DataList(0x7f0d0055, arraylist);
        return mPageList;
    }

    public final void goToNextPage()
    {
        byte byte0;
        if (mShowAccounts)
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        if (getCurrentPageIndex() == byte0)
        {
            finishOnboardFlow();
            return;
        } else
        {
            incrementPage$13462e();
            return;
        }
    }

    public final View makePage$4edf3998(Context context)
    {
        mAccountsPage = new GamesOnboardAccountsPage(context);
        mAccountsPage.mListener = (GamesOnboardAccountsPage.OnboardAccountsEventListener)Preconditions.checkNotNull(this);
        mAccountsPage.mActivity = super.mActivity;
        return mAccountsPage;
    }

    public final void onAccountClicked(String s)
    {
        ((GamesOnboardHostActivity)super.mActivity).mPlayLogger.logOnboardAction(7);
        mSelectedAccount = s;
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        super.replaceViewByIdAtIndex$17e143a3(LayoutInflater.from(super.mActivity).inflate(0x7f0400aa, null), 0x7f0d005d);
    }

    protected final void restoreOnboardState(Bundle bundle)
    {
        super.restoreOnboardState(bundle);
        mShowAccounts = bundle.getBoolean("showAccountsState");
        mSelectedAccount = bundle.getString("selectedAccountState");
    }

    protected final void saveOnboardState(Bundle bundle)
    {
        super.saveOnboardState(bundle);
        bundle.putBoolean("showAccountsState", mShowAccounts);
        bundle.putString("selectedAccountState", mSelectedAccount);
    }

    public final void skipOnboardFlow()
    {
        mSkipped = true;
        finishOnboardFlow();
    }

    public final void updateUiForPage(OnboardPageInfo onboardpageinfo)
    {
        byte byte0;
        int i;
        byte byte1;
        super.updateUiForPage(onboardpageinfo);
        i = -1;
        byte1 = -1;
        byte0 = byte1;
        if (onboardpageinfo == null) goto _L2; else goto _L1
_L1:
        i = onboardpageinfo.getGroupPageIndex$5669346e();
        i;
        JVM INSTR tableswitch 0 3: default 56
    //                   0 78
    //                   1 83
    //                   2 88
    //                   3 93;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_93;
_L3:
        byte0 = byte1;
_L2:
        if (byte0 >= 0)
        {
            ((GamesOnboardHostActivity)super.mActivity).mPlayLogger.logOnboardAction(byte0);
            return;
        } else
        {
            GamesLog.w("OnboardHostFrag", (new StringBuilder("goToPage - trying to go to invalid page: ")).append(i).toString());
            return;
        }
_L4:
        byte0 = 3;
          goto _L2
_L5:
        byte0 = 4;
          goto _L2
_L6:
        byte0 = 5;
          goto _L2
        byte0 = 6;
          goto _L2
    }
}
