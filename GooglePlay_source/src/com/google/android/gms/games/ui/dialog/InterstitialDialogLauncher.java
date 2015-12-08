// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.dialog;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.widget.Toast;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.util.PanoUtils;

// Referenced classes of package com.google.android.gms.games.ui.dialog:
//            PrebuiltDialogs, VideoRecordingLegalTextDialogFragment, GamesDialogFragment

public class InterstitialDialogLauncher extends ClientFragmentActivity
    implements GamesDialogFragment.GamesDialogFragmentCallbacks
{

    private int mDialogId;
    private boolean mHasShownDialog;
    private boolean mShouldLaunchSettingForRecording;

    public InterstitialDialogLauncher()
    {
        super(0, 0x7f12000d);
        mHasShownDialog = false;
        mShouldLaunchSettingForRecording = false;
    }

    private void startVideoRecording()
    {
        GameEntity gameentity = (GameEntity)getIntent().getParcelableExtra("com.google.android.gms.games.GAME");
        Preconditions.checkNotNull(gameentity);
        PrebuiltDialogs.showVideoRecordingPrerecordDialog(this, gameentity.mApplicationId, gameentity.mInstancePackageName, this);
        mShouldLaunchSettingForRecording = false;
    }

    protected final int getLogEventType()
    {
        return 39;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f04008b;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        if (i == 2002)
        {
            if (j == -1)
            {
                if (getGoogleApiClient().isConnected())
                {
                    startVideoRecording();
                    return;
                } else
                {
                    mShouldLaunchSettingForRecording = true;
                    return;
                }
            } else
            {
                setResult(0);
                finish();
                return;
            }
        } else
        {
            super.onActivityResult(i, j, intent);
            return;
        }
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        if (mHasShownDialog) goto _L2; else goto _L1
_L1:
        mDialogId;
        JVM INSTR tableswitch 1 1: default 36
    //                   1 48;
           goto _L2 _L3
_L2:
        if (mShouldLaunchSettingForRecording)
        {
            startVideoRecording();
        }
        return;
_L3:
        bundle = (GameEntity)getIntent().getParcelableExtra("com.google.android.gms.games.GAME");
        Preconditions.checkNotNull(bundle);
        PrebuiltDialogs.showVideoRecordingPrerecordDialog(this, ((GameEntity) (bundle)).mApplicationId, ((GameEntity) (bundle)).mInstancePackageName, this);
        mHasShownDialog = true;
        if (true) goto _L2; else goto _L4
_L4:
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

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (PanoUtils.isPano(this))
        {
            GamesLog.e("DialogLauncher", "Phone/tablet activity on an Android TV device; bailing out...");
            Toast.makeText(this, 0x7f1002e8, 1);
            finish();
        } else
        {
            mDialogId = getIntent().getIntExtra("GAMES_DIALOG_ID", 0);
            if (mDialogId == 0)
            {
                setResult(7001);
                finish();
                return;
            }
        }
    }

    public final void onDialogCancel(GamesDialogFragment gamesdialogfragment)
    {
        gamesdialogfragment.dismissInternal(false);
        setResult(0);
        finish();
    }

    public final void onDialogNegativeClicked(GamesDialogFragment gamesdialogfragment)
    {
        gamesdialogfragment.dismissInternal(false);
        setResult(0);
        finish();
    }

    public final void onDialogNeutralClicked(GamesDialogFragment gamesdialogfragment)
    {
        gamesdialogfragment.dismissInternal(false);
        setResult(-1);
        finish();
    }

    public final void onDialogPositiveClicked(GamesDialogFragment gamesdialogfragment)
    {
        gamesdialogfragment.dismissInternal(false);
        if (gamesdialogfragment instanceof VideoRecordingLegalTextDialogFragment)
        {
            setResult(-1);
            finish();
        }
    }

    public void onStart()
    {
        getGoogleApiClient();
        super.onStart();
    }
}
