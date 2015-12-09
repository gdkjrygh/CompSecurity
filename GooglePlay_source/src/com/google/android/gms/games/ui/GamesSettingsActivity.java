// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AppCompatDelegate;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.gms.common.account.GoogleAccountSpinnerAdapter;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.util.AccountUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.ui:
//            GamesFragmentActivity, GamesSettingsFragment

public final class GamesSettingsActivity extends GamesFragmentActivity
    implements android.widget.AdapterView.OnItemSelectedListener
{
    public static final class LoadingFragment extends Fragment
    {

        public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
        {
            return layoutinflater.inflate(0x7f040099, viewgroup, false);
        }

        public LoadingFragment()
        {
        }
    }


    private String mAccountName;
    private String mAccountNames[];
    private String mDestAppVersion;
    private boolean mIsInForeground;
    private boolean mMultiAccountMode;
    final Bundle mNotificationChannelSettings = new Bundle();
    boolean mNotificationsEnabled;
    ArrayList mNotifyAcl;

    public GamesSettingsActivity()
    {
        super(2, 0, 0, 0);
        mMultiAccountMode = true;
        mIsInForeground = false;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400cd;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    protected final GoogleApiClient instantiateGoogleApiClient()
    {
        Object obj = super.mFragments;
        LoadingFragment loadingfragment = new LoadingFragment();
        ((FragmentManager) (obj)).beginTransaction().replace(0x7f0d0287, loadingfragment).commit();
        if (isGoogleApiClientCreated())
        {
            getGoogleApiClient().disconnect();
        }
        obj = com.google.android.gms.games.Games.GamesOptions.builder();
        obj.allowHeadlessAccess = true;
        obj = ((com.google.android.gms.games.Games.GamesOptions.Builder) (obj)).build();
        obj = (new com.google.android.gms.common.api.GoogleApiClient.Builder(this, this, this)).addApi(Games.API_1P, ((com.google.android.gms.common.api.Api.ApiOptions.HasOptions) (obj))).addApi(PlayGames.API, com.google.android.gms.games.client.PlayGames.PlayGamesOptions.builder(((com.google.android.gms.games.Games.GamesOptions) (obj))).build()).setAccountName(mAccountName);
        obj.mRealClientPackageName = "com.google.android.gms";
        return ((com.google.android.gms.common.api.GoogleApiClient.Builder) (obj)).build();
    }

    public final void onConnected(Bundle bundle)
    {
label0:
        {
            if (mIsInForeground)
            {
                bundle = super.mFragments;
                Object obj = bundle.findFragmentById(0x7f0d0287);
                if (!(obj instanceof GamesSettingsFragment))
                {
                    break label0;
                }
                obj = ((GamesSettingsFragment)obj).mAccountName;
                if (!Objects.equal(mAccountName, obj))
                {
                    break label0;
                }
                GamesLog.d("GamesSettings", "Not adding duplicate fragment");
            }
            return;
        }
        GamesSettingsFragment gamessettingsfragment = GamesSettingsFragment.newInstance(mAccountName, mDestAppVersion);
        bundle.beginTransaction().replace(0x7f0d0287, gamessettingsfragment).commit();
    }

    public final void onCreate(Bundle bundle)
    {
        mAccountName = getIntent().getStringExtra("com.google.android.gms.games.ACCOUNT_NAME");
        mDestAppVersion = getIntent().getStringExtra("com.google.android.gms.games.DEST_APP_VERSION");
        if (mAccountName == null) goto _L2; else goto _L1
_L1:
        mMultiAccountMode = false;
        setTheme(0x7f1100c3);
_L4:
        mAccountNames = com.google.android.gms.common.util.AccountUtils.extractSortedAccountNames(AccountUtils.getAvailableAccountsAsList(this));
        if (mAccountNames == null || mAccountNames.length == 0)
        {
            GamesLog.e("GamesSettings", "No accounts found when creating settings activity. Bailing out.");
            finish();
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (bundle != null)
        {
            mAccountName = bundle.getString("selected_account");
        }
        if (mAccountName == null)
        {
            mAccountName = UiSharedPrefs.getDefaultAccount(this);
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (mAccountName == null || !Arrays.asList(mAccountNames).contains(mAccountName))
        {
            mAccountName = mAccountNames[0];
        }
        setTitle(getResources().getString(0x7f100286));
        super.onCreate(bundle);
        return;
    }

    public final void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        if (mAccountNames[i].equals(mAccountName))
        {
            return;
        } else
        {
            mAccountName = mAccountNames[i];
            createGoogleApiClient();
            getGoogleApiClient().connect();
            return;
        }
    }

    public final void onNothingSelected(AdapterView adapterview)
    {
    }

    public final boolean onOptionsItemSelected(MenuItem menuitem)
    {
        switch (menuitem.getItemId())
        {
        default:
            return super.onOptionsItemSelected(menuitem);

        case 16908332: 
            finish();
            break;
        }
        return true;
    }

    public final void onPause()
    {
        mIsInForeground = false;
        super.onPause();
    }

    public final void onResume()
    {
        super.onResume();
        mIsInForeground = true;
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putString("selected_account", mAccountName);
    }

    public final void onSetActionBar()
    {
        ActionBar actionbar;
label0:
        {
            GoogleAccountSpinnerAdapter googleaccountspinneradapter;
            Object obj;
label1:
            {
                int i;
label2:
                {
                    super.onSetActionBar();
                    actionbar = getDelegate().getSupportActionBar();
                    actionbar.setDisplayHomeAsUpEnabled(true);
                    if (!mMultiAccountMode)
                    {
                        break label0;
                    }
                    obj = new com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder(actionbar);
                    obj.mTitle = ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mContext.getText(0x7f100286);
                    obj.mListener = this;
                    obj.mSelectedAccountName = mAccountName;
                    obj.mAccountNames = mAccountNames;
                    if (((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mAccountNames == null)
                    {
                        obj.mAccountNames = com.google.android.gms.common.util.AccountUtils.extractSortedAccountNames(com.google.android.gms.common.util.AccountUtils.getAvailableGoogleAccounts(((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mContext, ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mPackageName));
                    }
                    googleaccountspinneradapter = new GoogleAccountSpinnerAdapter(((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mContext, ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mPackageName, ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mTitle, ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mAccountNames, (byte)0);
                    int j = googleaccountspinneradapter.getPosition(((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mSelectedAccountName);
                    if (j == -1)
                    {
                        break label1;
                    }
                    if (j >= -1)
                    {
                        i = j;
                        if (j < googleaccountspinneradapter.mAccountNames.length)
                        {
                            break label2;
                        }
                    }
                    i = -1;
                }
                googleaccountspinneradapter.mSelection = i;
                googleaccountspinneradapter.persistSelectedAccountName(googleaccountspinneradapter.getItem(i));
                if (googleaccountspinneradapter.mSpinner != null)
                {
                    googleaccountspinneradapter.mSpinner.setSelection(i);
                }
            }
            googleaccountspinneradapter.mDelegateListener = ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mListener;
            obj = ((com.google.android.gms.common.account.GoogleAccountSpinnerAdapter.Builder) (obj)).mActionBar;
            if (googleaccountspinneradapter.mSpinner != null)
            {
                googleaccountspinneradapter.mSpinner.setAdapter(null);
                googleaccountspinneradapter.mSpinner.setOnItemSelectedListener(null);
            }
            ((ActionBar) (obj)).setCustomView(0x7f04002f);
            ((ActionBar) (obj)).setDisplayOptions(16, 24);
            googleaccountspinneradapter.mSpinner = (Spinner)((ActionBar) (obj)).getCustomView().findViewById(0x7f0d000d);
            googleaccountspinneradapter.mSpinner.setAdapter(googleaccountspinneradapter);
            googleaccountspinneradapter.mSpinner.setOnItemSelectedListener(googleaccountspinneradapter);
            googleaccountspinneradapter.mSpinner.setSelection(googleaccountspinneradapter.mSelection);
            googleaccountspinneradapter.mSpinner.setVisibility(0);
            if (!PlatformVersion.checkVersion(14))
            {
                actionbar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f0b0251)));
            }
            return;
        }
        actionbar.setTitle$13462e();
        updateTaskDescription(getResources().getString(0x7f100286));
        actionbar.setBackgroundDrawable(new ColorDrawable(getResources().getColor(0x7f0b0257)));
    }

    public final void onStop()
    {
        super.onStop();
        UiSharedPrefs.setDefaultAccount(this, mAccountName);
    }
}
