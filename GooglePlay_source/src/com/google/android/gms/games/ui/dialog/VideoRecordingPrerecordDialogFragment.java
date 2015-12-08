// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v7.app.AlertController;
import android.support.v7.app.AlertDialog;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.video.Videos;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiSharedPrefs;
import com.google.android.gms.games.util.VideoUtils;
import java.text.NumberFormat;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, GamesDialogBuilder, VideoRecordingLegalTextDialogFragment

public final class VideoRecordingPrerecordDialogFragment extends GamesDialogFragment
    implements android.widget.RadioGroup.OnCheckedChangeListener
{
    public static final class Config
    {

        public final String applicationId;
        public final String packageName;

        public static Config load(Bundle bundle)
        {
            return new Config(bundle.getString("APPLICATION_ID"), bundle.getString("PACKAGE_NAME"));
        }

        public final void save(Bundle bundle)
        {
            bundle.putString("APPLICATION_ID", applicationId);
            bundle.putString("PACKAGE_NAME", packageName);
        }

        public Config(String s, String s1)
        {
            applicationId = s;
            packageName = s1;
        }
    }


    Config mConfig;
    private boolean mHasAgreedToLegalText;
    private RadioGroup mQualitySelect;
    private TextView mTimeRemaining;

    public VideoRecordingPrerecordDialogFragment()
    {
    }

    private int getQuality()
    {
        return mQualitySelect.getCheckedRadioButtonId() != 0x7f0d02d2 ? 1 : 0;
    }

    private void updateTimeRemaining()
    {
        Resources resources = mParent.getResources();
        int i = getQuality();
        int j = VideoUtils.getEstimatedTimeRemainingSeconds(mParent, i);
        String s;
        Button button;
        AlertDialog alertdialog;
        if (i == 0)
        {
            i = 0x7f1002f5;
        } else
        {
            i = 0x7f1002f6;
        }
        s = resources.getString(i);
        alertdialog = (AlertDialog)super.mDialog;
        button = null;
        if (alertdialog != null)
        {
            button = alertdialog.mAlert.mButtonPositive;
        }
        if (button != null)
        {
            button.setEnabled(true);
        }
        if (j < 120)
        {
            String s1 = resources.getString(0x7f1002ee);
            j = resources.getColor(0x7f0b00d1);
            s = s1;
            i = j;
            if (button != null)
            {
                button.setEnabled(false);
                i = j;
                s = s1;
            }
        } else
        if (j < 300)
        {
            s = resources.getString(0x7f100301, new Object[] {
                s
            });
            i = resources.getColor(0x7f0b00d1);
        } else
        if (j < 3600)
        {
            i = j / 60;
            s = resources.getString(0x7f100300, new Object[] {
                s, NumberFormat.getIntegerInstance().format(i)
            });
            i = resources.getColor(0x7f0b00d2);
        } else
        {
            i = j / 3600;
            s = resources.getString(0x7f1002ff, new Object[] {
                s, NumberFormat.getIntegerInstance().format(i)
            });
            i = resources.getColor(0x7f0b00d2);
        }
        mTimeRemaining.setText(Html.fromHtml(s));
        mTimeRemaining.setTextColor(i);
    }

    protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        Resources resources = mParent.getResources();
        View view = mParent.getLayoutInflater().inflate(0x7f0400f3, null);
        TextView textview = (TextView)view.findViewById(0x7f0d01ff);
        textview.setText(Html.fromHtml(resources.getString(0x7f100302)));
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        mTimeRemaining = (TextView)view.findViewById(0x7f0d02d3);
        mQualitySelect = (RadioGroup)view.findViewById(0x7f0d02d0);
        int i;
        if (bundle != null)
        {
            mConfig = Config.load(bundle);
            mHasAgreedToLegalText = bundle.getBoolean("HAS_AGREED_TO_LEGAL_TEXT");
        } else
        {
            if (UiSharedPrefs.getPreferredVideoQuality(mParent) == 0)
            {
                mQualitySelect.check(0x7f0d02d2);
            } else
            {
                mQualitySelect.check(0x7f0d02d1);
            }
            bundle = mParent.mConfiguration.getCurrentAccountName();
            mHasAgreedToLegalText = UiSharedPrefs.hasAgreedToLegalText(mParent, bundle);
        }
        mQualitySelect.setOnCheckedChangeListener(this);
        updateTimeRemaining();
        if (mParent.getResources().getBoolean(0x7f0a0012))
        {
            gamesdialogbuilder.setBannerImage$2f921217();
            gamesdialogbuilder.setBannerImageAspectRatioAdjust$3479e5f3();
        }
        if (mHasAgreedToLegalText)
        {
            i = 0x7f1002f9;
        } else
        {
            i = 0x7f1002fa;
        }
        gamesdialogbuilder.setTitle(0x7f1002fe).setNegativeButton(0x7f1002f7, this).setPositiveButton(i, this).setView(view);
        return gamesdialogbuilder;
    }

    protected final int getPlaylogElementType()
    {
        return 301;
    }

    public final void onCheckedChanged(RadioGroup radiogroup, int i)
    {
        updateTimeRemaining();
    }

    public final void onClick(int i)
    {
        if (i != -1) goto _L2; else goto _L1
_L1:
        String s;
        UiSharedPrefs.setPreferredVideoQuality(mParent, getQuality());
        s = mParent.mConfiguration.getCurrentAccountName();
        if (s == null)
        {
            return;
        }
        if (UiSharedPrefs.hasAgreedToLegalText(mParent, s)) goto _L4; else goto _L3
_L3:
        GamesFragmentActivity gamesfragmentactivity = mParent;
        String s1 = mConfig.applicationId;
        String s2 = mConfig.packageName;
        GamesDialogFragment.GamesDialogFragmentCallbacks gamesdialogfragmentcallbacks = mCallbacks;
        VideoRecordingLegalTextDialogFragment videorecordinglegaltextdialogfragment = new VideoRecordingLegalTextDialogFragment();
        videorecordinglegaltextdialogfragment.mConfig = new Config(s1, s2);
        videorecordinglegaltextdialogfragment.setCallbacks(gamesdialogfragmentcallbacks);
        DialogFragmentUtil.show(gamesfragmentactivity, videorecordinglegaltextdialogfragment, "VideoRecordingLegalTextDialogFragment");
_L2:
        dismissInternal(false);
        return;
_L4:
        GoogleApiClient googleapiclient = mParent.getGoogleApiClient();
        if (googleapiclient.isConnected())
        {
            com.google.android.gms.games.video.VideoConfiguration videoconfiguration = (new com.google.android.gms.games.video.VideoConfiguration.Builder(getQuality())).build();
            if (googleapiclient.hasAuthenticatedScope(PlayGames.SCOPE_GAMES_1P))
            {
                PlayGames.Videos.launchGameForRecording(googleapiclient, mConfig.applicationId, mConfig.packageName, videoconfiguration);
            } else
            {
                Games.Videos.launchGameForRecordingRestricted(googleapiclient, mConfig.applicationId, mConfig.packageName, videoconfiguration);
                mParent.setResult(-1);
                mParent.finish();
            }
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    protected final void onPostCreateDialog(AlertDialog alertdialog)
    {
        super.onPostCreateDialog(alertdialog);
        alertdialog.setOnShowListener(new android.content.DialogInterface.OnShowListener() {

            final VideoRecordingPrerecordDialogFragment this$0;

            public final void onShow(DialogInterface dialoginterface)
            {
                updateTimeRemaining();
            }

            
            {
                this$0 = VideoRecordingPrerecordDialogFragment.this;
                super();
            }
        });
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mConfig.save(bundle);
        bundle.putBoolean("HAS_AGREED_TO_LEGAL_TEXT", mHasAgreedToLegalText);
    }

    public final void onStart()
    {
        super.onStart();
        Window window = super.mDialog.getWindow();
        Resources resources = mParent.getResources();
        android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
        if (resources.getBoolean(0x7f0a0012))
        {
            Display display = window.getWindowManager().getDefaultDisplay();
            DisplayMetrics displaymetrics = new DisplayMetrics();
            display.getMetrics(displaymetrics);
            int i;
            if (displaymetrics.widthPixels < displaymetrics.heightPixels)
            {
                i = displaymetrics.widthPixels;
            } else
            {
                i = displaymetrics.heightPixels;
            }
            layoutparams.width = i;
        } else
        {
            layoutparams.width = -1;
        }
        layoutparams.height = -2;
        window.setAttributes(layoutparams);
    }

}
