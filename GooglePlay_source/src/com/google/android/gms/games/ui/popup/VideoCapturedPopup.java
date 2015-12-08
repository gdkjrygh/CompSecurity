// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.ui.client.ClientUiProxyActivity;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

public final class VideoCapturedPopup extends BasePopup
{
    public static interface VideoCapturedPopupClickListener
    {

        public abstract void onVideoCapturedPopupClicked();
    }


    private final Game mGame;
    private final VideoCapturedPopupClickListener mListener;
    private final Uri mVideoUri;

    private VideoCapturedPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Bundle bundle, VideoCapturedPopupClickListener videocapturedpopupclicklistener)
    {
        super(gamesclientcontext, popuplocationinfo, 6000L, false, true);
        mGame = (Game)Preconditions.checkNotNull(bundle.getParcelable("com.google.android.gms.games.GAME"));
        mVideoUri = (Uri)Preconditions.checkNotNull(bundle.getParcelable("com.google.android.gms.games.VIDEO_URI"));
        mListener = (VideoCapturedPopupClickListener)Preconditions.checkNotNull(videocapturedpopupclicklistener);
    }

    public static void show(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Bundle bundle, VideoCapturedPopupClickListener videocapturedpopupclicklistener)
    {
        gamesclientcontext = new VideoCapturedPopup(gamesclientcontext, popuplocationinfo, bundle, videocapturedpopupclicklistener);
        sHandler.sendMessage(sHandler.obtainMessage(0, gamesclientcontext));
    }

    protected final void bindViewData()
    {
        mPopupContentView.setBackgroundResource(0x7f02004d);
        ((TextView)mPopupView.findViewById(0x7f0d0141)).setText(0x7f1002c8);
        ((TextView)mPopupView.findViewById(0x7f0d0142)).setText(0x7f1002c9);
        mPopupView.findViewById(0x7f0d01ba).setVisibility(8);
    }

    protected final int getClickedEvent()
    {
        return 38;
    }

    protected final int getDisplayedEvent()
    {
        return 37;
    }

    protected final String getTalkbackMessage()
    {
        return getContext().getString(0x7f1002c9);
    }

    protected final void handleClick()
    {
        Context context = getContext();
        Object obj = mGamesContext.mClientContext.mCallingPackageName;
        String s = mGamesContext.mClientContext.mResolvedAccount.name;
        obj = createProxyIntent(context, "com.google.android.gms.games.VIEW_VIDEO_CAPTURED", ((String) (obj)), s);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.GAME", (Parcelable)mGame.freeze());
        ((Intent) (obj)).putExtra("com.google.android.gms.games.VIDEO_URI", mVideoUri);
        ClientUiProxyActivity.launchProxyIntent(context, ((Intent) (obj)));
        hideCurrentPopupImmediate();
        mListener.onVideoCapturedPopupClicked();
    }
}
