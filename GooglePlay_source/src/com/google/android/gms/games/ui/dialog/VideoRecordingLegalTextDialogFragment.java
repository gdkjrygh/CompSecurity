// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.app.Dialog;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.client.PlayGames;
import com.google.android.gms.games.client.video.Videos;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.util.UiSharedPrefs;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            GamesDialogFragment, GamesDialogBuilder

public final class VideoRecordingLegalTextDialogFragment extends GamesDialogFragment
{

    VideoRecordingPrerecordDialogFragment.Config mConfig;

    public VideoRecordingLegalTextDialogFragment()
    {
    }

    protected final android.support.v7.app.AlertDialog.Builder createDialog(GamesDialogBuilder gamesdialogbuilder, Bundle bundle)
    {
        Resources resources = mParent.getResources();
        if (bundle != null)
        {
            mConfig = VideoRecordingPrerecordDialogFragment.Config.load(bundle);
        }
        bundle = mParent.getLayoutInflater().inflate(0x7f0400ed, null);
        TextView textview = (TextView)bundle.findViewById(0x7f0d01ff);
        textview.setText(Html.fromHtml(resources.getString(0x7f100302)));
        textview.setMovementMethod(LinkMovementMethod.getInstance());
        if (resources.getBoolean(0x7f0a0012))
        {
            gamesdialogbuilder.setBannerImage$2f921217();
            gamesdialogbuilder.setBannerImageAspectRatioAdjust$3479e5f3();
        }
        return gamesdialogbuilder.setTitle(0x7f1002ed).setNegativeButton(0x7f1002eb, this).setPositiveButton(0x7f1002ec, this).setView(bundle);
    }

    protected final int getPlaylogElementType()
    {
        return 300;
    }

    public final void onClick(int i)
    {
        if (i == -1)
        {
            Object obj = mParent.mConfiguration.getCurrentAccountName();
            if (obj == null)
            {
                return;
            }
            UiSharedPrefs.setAgreedToLegalText$607b2e89(mParent, ((String) (obj)));
            obj = mParent.getGoogleApiClient();
            if (((GoogleApiClient) (obj)).isConnected())
            {
                com.google.android.gms.games.video.VideoConfiguration videoconfiguration = (new com.google.android.gms.games.video.VideoConfiguration.Builder(UiSharedPrefs.getPreferredVideoQuality(mParent))).build();
                if (((GoogleApiClient) (obj)).hasAuthenticatedScope(PlayGames.SCOPE_GAMES_1P))
                {
                    PlayGames.Videos.launchGameForRecording(((GoogleApiClient) (obj)), mConfig.applicationId, mConfig.packageName, videoconfiguration);
                } else
                {
                    Games.Videos.launchGameForRecordingRestricted(((GoogleApiClient) (obj)), mConfig.applicationId, mConfig.packageName, videoconfiguration);
                }
            }
        }
        dismissInternal(false);
    }

    public final void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        mConfig.save(bundle);
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
