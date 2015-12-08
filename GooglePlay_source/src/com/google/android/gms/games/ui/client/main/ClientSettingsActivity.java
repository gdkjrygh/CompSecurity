// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.main;

import android.accounts.Account;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.dialog.GamesDialogBuilder;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.util.PackageUtils;

public final class ClientSettingsActivity extends ClientFragmentActivity
    implements android.view.View.OnClickListener
{
    private class _cls1
        implements ResultCallback
    {

        final ClientSettingsActivity this$0;

        public final volatile void onResult(Result result)
        {
            result = ClientSettingsActivity.this;
            DialogFragmentUtil.dismiss(result, "com.google.android.gms.games.ui.dialog.progressDialog");
            result.setResult(10001);
            result.finish();
        }

        _cls1()
        {
            this$0 = ClientSettingsActivity.this;
            super();
        }
    }

    private final class SignOutDialogClickListener
        implements android.content.DialogInterface.OnClickListener
    {

        final ClientSettingsActivity this$0;

        public final void onClick(DialogInterface dialoginterface, int i)
        {
            switch (i)
            {
            default:
                return;

            case -1: 
                GoogleApiClient googleapiclient = this.getGoogleApiClient();
                break;
            }
        }

        private SignOutDialogClickListener()
        {
            this$0 = ClientSettingsActivity.this;
            super();
        }

        SignOutDialogClickListener(byte byte0)
        {
            this();
        }
    }


    private String mAccountName;
    private String mClientGameId;

    public ClientSettingsActivity()
    {
        super(0);
    }

    private void displayGoogleAccountSettingProgressBar()
    {
        displaySettingProgressBar((ViewGroup)findViewById(0x7f0d0134));
    }

    private void displaySettingDetails(ViewGroup viewgroup, int i, String s)
    {
        viewgroup.setOnClickListener(this);
        Object obj = (ViewGroup)viewgroup.findViewById(0x7f0d013a);
        TextView textview = (TextView)((ViewGroup) (obj)).findViewById(0x7f0d013c);
        textview.setText(i);
        obj = (TextView)((ViewGroup) (obj)).findViewById(0x7f0d013d);
        View view = viewgroup.findViewById(0x7f0d013e);
        com.google.android.gms.games.ui.util.UiUtils.Fade.show(textview);
        com.google.android.gms.games.ui.util.UiUtils.Fade.show(((View) (obj)));
        viewgroup.setEnabled(true);
        ((TextView) (obj)).setText(s);
        view.setVisibility(8);
    }

    private void displaySettingProgressBar(ViewGroup viewgroup)
    {
        viewgroup.setOnClickListener(this);
        Object obj = (ViewGroup)viewgroup.findViewById(0x7f0d013a);
        TextView textview = (TextView)((ViewGroup) (obj)).findViewById(0x7f0d013c);
        obj = (TextView)((ViewGroup) (obj)).findViewById(0x7f0d013d);
        View view = viewgroup.findViewById(0x7f0d013e);
        textview.setVisibility(4);
        ((TextView) (obj)).setVisibility(4);
        viewgroup.setEnabled(false);
        view.setVisibility(0);
    }

    private void displaySharingSettingsProgressBar()
    {
        displaySettingProgressBar((ViewGroup)findViewById(0x7f0d0136));
    }

    protected final int getLogEventType()
    {
        return 5;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f040052;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    public final void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 1)
        {
            displayGoogleAccountSettingProgressBar();
            displaySharingSettingsProgressBar();
            getGoogleApiClient().reconnect();
            return;
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public final void onClick(View view)
    {
        int i = view.getId();
        if (i != 0x7f0d0134) goto _L2; else goto _L1
_L1:
        Object obj;
        view = getResources();
        obj = Games.getCurrentAccountName(getGoogleApiClient());
        if (obj != null) goto _L4; else goto _L3
_L3:
        GamesLog.w("ClientSettingsActivity", "We don't have a current account name, something went wrong. Finishing the activity");
        finish();
_L6:
        return;
_L4:
        view = view.getString(0x7f1000b1, new Object[] {
            obj
        });
        obj = new SignOutDialogClickListener((byte)0);
        PrebuiltDialogs.getGamesThemedBuilder(this).setTitle(0x7f1000b2).setPositiveButton(0x104000a, ((android.content.DialogInterface.OnClickListener) (obj))).setNegativeButton(0x1040000, ((android.content.DialogInterface.OnClickListener) (obj))).setMessage(view).show();
        return;
_L2:
        if (i == 0x7f0d0136)
        {
            view = new Account(mAccountName, "com.google");
            String s = mClientGameId;
            Preconditions.checkNotEmpty(s);
            s = (new StringBuilder("e")).append(Long.toHexString(Long.parseLong(s))).toString();
            String s1 = mClientPackageName;
            Intent intent = new Intent("com.google.android.gms.plus.action.MANAGE_APP");
            intent.putExtra("com.google.android.gms.plus.ACCOUNT", view);
            intent.putExtra("com.google.android.gms.plus.APP_ID", s);
            intent.putExtra("com.google.android.gms.plus.APP_PACKAGE", s1);
            intent.putExtra("com.google.android.gms.plus.APP_NAME", null);
            intent.putExtra("com.google.android.gms.plus.APP_ICON_URL", null);
            intent.putExtra("com.google.android.gms.plus.APP_IS_ASPEN", true);
            startActivityForResult(intent, 1);
            return;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        bundle = getGoogleApiClient();
        if (mClientGameId == null)
        {
            mClientGameId = Games.getAppId(bundle);
        }
        mAccountName = Games.getCurrentAccountName(bundle);
        if (mAccountName == null)
        {
            GamesLog.w("ClientSettingsActivity", "We don't have a current account name, something went wrong. Finishing the activity");
            finish();
            return;
        } else
        {
            displaySettingDetails((ViewGroup)findViewById(0x7f0d0134), 0x7f1000ab, mAccountName);
            displaySettingDetails((ViewGroup)findViewById(0x7f0d0136), 0x7f1000af, null);
            return;
        }
    }

    public final void onConnectionFailed(ConnectionResult connectionresult)
    {
        if (connectionresult.mStatusCode == 4)
        {
            setResult(10001);
            finish();
            return;
        } else
        {
            super.onConnectionFailed(connectionresult);
            return;
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setResult(-1);
        bundle = findViewById(0x7f0d0053);
        Object obj = bundle.getLayoutParams();
        obj.height = getHeaderHeight(this);
        bundle.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        bundle = PackageUtils.getVersionName(this, "com.google.android.gms");
        obj = (ViewGroup)findViewById(0x7f0d0138);
        ((ViewGroup) (obj)).findViewById(0x7f0d013e).setVisibility(8);
        if (!TextUtils.isEmpty(bundle))
        {
            ((TextView)((ViewGroup) (obj)).findViewById(0x7f0d013b)).setText(getString(0x7f100169, new Object[] {
                getString(0x7f10001f)
            }));
            ((TextView)((ViewGroup) (obj)).findViewById(0x7f0d013c)).setText(bundle);
            ((ViewGroup) (obj)).setVisibility(0);
        } else
        {
            ((ViewGroup) (obj)).setVisibility(8);
        }
        setTitle(0x7f1000aa);
        mShowGameNameAsTitle = false;
        ((TextView)((ViewGroup)((ViewGroup)findViewById(0x7f0d0134)).findViewById(0x7f0d013a)).findViewById(0x7f0d013b)).setText(0x7f1000ae);
        ((TextView)((ViewGroup)findViewById(0x7f0d0136)).findViewById(0x7f0d013b)).setText(0x7f1000b0);
        mShowGameIconInActionBar = true;
        displayGoogleAccountSettingProgressBar();
        displaySharingSettingsProgressBar();
    }

    public final void onResume()
    {
        getGoogleApiClient();
        super.onResume();
    }

    public final void onStart()
    {
        getGoogleApiClient();
        super.onStart();
    }


/*
    static void access$000(ClientSettingsActivity clientsettingsactivity)
    {
        GoogleApiClient googleapiclient = clientsettingsactivity.getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            DialogFragmentUtil.show(clientsettingsactivity, PrebuiltDialogs.newProgressDialog(0x7f1000b3), "com.google.android.gms.games.ui.dialog.progressDialog");
            Games.signOut(googleapiclient).setResultCallback(clientsettingsactivity. new _cls1());
            return;
        } else
        {
            GamesLog.e("ClientSettingsActivity", "Sign-out failed, GoogleApiClient not connected.");
            return;
        }
    }

*/
}
