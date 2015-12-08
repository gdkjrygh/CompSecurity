// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.client.requests;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v4.util.ArrayMap;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Games;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.logging.GamesPlayLogger;
import com.google.android.gms.games.request.Requests;
import com.google.android.gms.games.ui.G;
import com.google.android.gms.games.ui.client.ClientFragmentActivity;
import com.google.android.gms.games.ui.client.players.SelectPlayersMetadataProvider;
import com.google.android.gms.games.ui.dialog.PrebuiltDialogs;
import com.google.android.gms.games.ui.util.DialogFragmentUtil;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.people.People;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public final class SendRequestActivity extends ClientFragmentActivity
    implements android.view.View.OnClickListener, ResultCallback, com.google.android.gms.games.ui.client.players.SelectPlayersFragment.SelectPlayersListener, SelectPlayersMetadataProvider
{

    private LoadingImageView mItemIconView;
    private TextView mItemNameView;
    private byte mPayload[];
    private ArrayList mPreselectedPlayerIds;
    private int mRequestLifetime;
    private int mRequestType;
    private ArrayMap mSelectedPlayers;
    private View mSendBar;
    private ImageView mSendButton;
    private boolean mShowNearbySearch;

    public SendRequestActivity()
    {
        super(0, 0x7f12000d);
    }

    protected final void addApisToGoogleApiClient(com.google.android.gms.common.api.GoogleApiClient.Builder builder)
    {
        super.addApisToGoogleApiClient(builder);
        com.google.android.gms.people.People.PeopleOptions1p.Builder builder1 = new com.google.android.gms.people.People.PeopleOptions1p.Builder();
        builder1.clientApplicationId = 118;
        builder.addApi(People.API_1P, builder1.build());
    }

    public final boolean allowAutoMatch()
    {
        return false;
    }

    public final boolean allowNearbySearch()
    {
        return mShowNearbySearch;
    }

    public final int getBottomPadding()
    {
        Resources resources = getResources();
        return resources.getDimensionPixelSize(0x7f0c01c2) + resources.getDimensionPixelSize(0x7f0c01c0);
    }

    public final int getHeaderMode()
    {
        return 2;
    }

    protected final int getLogEventType()
    {
        return 11;
    }

    public final int getMaxParticipants()
    {
        return 8;
    }

    public final int getMinParticipants()
    {
        return 1;
    }

    public final ArrayList getPreselectedPlayerIds()
    {
        return mPreselectedPlayerIds;
    }

    public final int getRecentPlayersType()
    {
        return -1;
    }

    protected final int getWrappableContentResId()
    {
        return 0x7f0400cc;
    }

    public final boolean hasPlayHeader()
    {
        return true;
    }

    protected final void modifyGamesOptions(com.google.android.gms.games.Games.GamesOptions.Builder builder)
    {
        super.modifyGamesOptions(builder);
        builder.addProxyApi("copresence");
    }

    public final void onClick(View view)
    {
        if (view.getId() != 0x7f0d0282) goto _L2; else goto _L1
_L1:
        com.google.android.gms.common.api.GoogleApiClient googleapiclient;
        ArrayList arraylist;
        googleapiclient = getGoogleApiClient();
        if (UiUtils.checkClientDisconnected(googleapiclient, this))
        {
            GamesLog.w("SendRequestActivity", "onSend: not connected; ignoring...");
            return;
        }
        arraylist = new ArrayList(mSelectedPlayers.size());
        view = new ArrayMap(mSelectedPlayers.size());
        String s1;
        for (Iterator iterator = mSelectedPlayers.keySet().iterator(); iterator.hasNext(); view.put(s1, ((Pair)mSelectedPlayers.get(s1)).second))
        {
            s1 = (String)iterator.next();
            arraylist.add(s1);
        }

        String s = Games.getCurrentAccountName(getGoogleApiClient());
        GameEntity gameentity = super.mClientGame;
        GamesPlayLogger.logPlayerSelections(this, super.mClientPackageName, gameentity.getApplicationId(), s, view, 0);
        mRequestType;
        JVM INSTR tableswitch 1 2: default 188
    //                   1 262
    //                   2 215;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(mRequestType).toString());
_L5:
        view = PrebuiltDialogs.newProgressDialog(0x7f100231);
_L6:
        DialogFragmentUtil.show(this, view, "com.google.android.gms.games.ui.dialog.progressDialogSendRequest");
        Games.Requests.sendRequestRestricted(googleapiclient, super.mClientGame.mApplicationId, arraylist, mRequestType, mPayload, mRequestLifetime).setResultCallback(this);
        return;
_L4:
        view = PrebuiltDialogs.newProgressDialog(0x7f100230);
        if (true) goto _L6; else goto _L2
_L2:
        GamesLog.w("SendRequestActivity", (new StringBuilder("onClick: unexpected view: ")).append(view).append(", id ").append(view.getId()).toString());
        return;
    }

    public final void onConnected(Bundle bundle)
    {
        super.onConnected(bundle);
        int i = Games.Requests.getMaxPayloadSize(getGoogleApiClient());
        if (mPayload.length > i)
        {
            GamesLog.e("SendRequestActivity", (new StringBuilder("Payload size cannot be greater than ")).append(i).append("!").toString());
            finish();
        }
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        trackFragments();
        mShowGameNameAsTitle = false;
        mItemNameView = (TextView)findViewById(0x7f0d0283);
        mSendBar = findViewById(0x7f0d0282);
        mSendButton = (ImageView)findViewById(0x7f0d0284);
        mItemIconView = (LoadingImageView)findViewById(0x7f0d0286);
        bundle = getIntent();
        mRequestType = bundle.getIntExtra("com.google.android.gms.games.REQUEST_TYPE", -1);
        mRequestType;
        JVM INSTR tableswitch 1 2: default 108
    //                   1 216
    //                   2 178;
           goto _L1 _L2 _L3
_L1:
        boolean flag;
        GamesLog.e("SendRequestActivity", (new StringBuilder("Invalid request type: ")).append(mRequestType).toString());
        flag = false;
_L4:
        if (!flag)
        {
            GamesLog.e("SendRequestActivity", "Error parsing intent; bailing out...");
            finish();
        }
        bundle = findViewById(0x7f0d0053);
        android.view.ViewGroup.LayoutParams layoutparams = bundle.getLayoutParams();
        layoutparams.height = getHeaderHeight(this);
        bundle.setLayoutParams(layoutparams);
        return;
_L3:
        setTitle(0x7f100278);
_L5:
        mPayload = bundle.getByteArrayExtra("com.google.android.gms.games.PAYLOAD");
        if (mPayload == null)
        {
            GamesLog.e("SendRequestActivity", "Payload cannot be null!");
            flag = false;
        } else
        {
            mRequestLifetime = bundle.getIntExtra("com.google.android.gms.games.REQUEST_LIFETIME", -1);
            if (mRequestLifetime != -1 && mRequestLifetime <= 0)
            {
                flag = false;
            } else
            {
                Object obj = bundle.getStringExtra("com.google.android.gms.games.REQUEST_ITEM_NAME");
                if (TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    GamesLog.e("SendRequestActivity", "The item name cannot be empty!");
                    flag = false;
                } else
                {
                    mItemNameView.setText(((CharSequence) (obj)));
                    obj = (Bitmap)bundle.getParcelableExtra("com.google.android.gms.games.REQUEST_ITEM_ICON");
                    if (obj == null)
                    {
                        GamesLog.e("SendRequestActivity", "The item icon cannot be null!");
                        flag = false;
                    } else
                    {
                        mItemIconView.setImageBitmap(((Bitmap) (obj)));
                        mPreselectedPlayerIds = bundle.getStringArrayListExtra("players");
                        mShowNearbySearch = bundle.getBooleanExtra("com.google.android.gms.games.SHOW_NEARBY_SEARCH", false);
                        if (!((Boolean)G.allowNearbyPlayerSearch.get()).booleanValue())
                        {
                            mShowNearbySearch = false;
                        }
                        flag = true;
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L2
_L2:
        setTitle(0x7f100277);
          goto _L5
    }

    public final volatile void onResult(Result result)
    {
        int i;
        i = ((com.google.android.gms.games.request.Requests.SendRequestResult)result).getStatus().mStatusCode;
        DialogFragmentUtil.dismiss(this, "com.google.android.gms.games.ui.dialog.progressDialogSendRequest");
        if (!UiUtils.isNetworkError(i)) goto _L2; else goto _L1
_L1:
        mRequestType;
        JVM INSTR tableswitch 1 2: default 52
    //                   1 95
    //                   2 79;
           goto _L3 _L4 _L5
_L3:
        throw new IllegalArgumentException((new StringBuilder("Invalid request type: ")).append(mRequestType).toString());
_L5:
        i = 0x7f100203;
_L6:
        DialogFragmentUtil.show(this, PrebuiltDialogs.newNetworkErrorDialog(i), "com.google.android.gms.games.ui.dialog.networkErrorDialog");
        return;
_L4:
        i = 0x7f100202;
        if (true) goto _L6; else goto _L2
_L2:
        setResult(-1);
        finish();
        return;
    }

    public final boolean onSearchRequested()
    {
        return onFragmentSearchRequested();
    }

    public final void onSelectedPlayersChanged(ArrayMap arraymap, int i)
    {
        mSelectedPlayers = arraymap;
        if (mSelectedPlayers.size() > 0)
        {
            mSendButton.setImageResource(0x7f0201cc);
            mSendBar.setOnClickListener(this);
            return;
        } else
        {
            mSendButton.setImageResource(0x7f0201cb);
            mSendBar.setOnClickListener(null);
            return;
        }
    }

    public final boolean showIdentitySharingCard()
    {
        return false;
    }

    public final boolean updateSubtitle()
    {
        return false;
    }
}
