// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.view.View;
import android.view.animation.Animation;
import android.widget.TextView;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.ui.GamesSettingsDebugActivity;
import com.google.android.gms.games.ui.client.ClientUiProxyActivity;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

public final class WelcomePopup extends BasePopup
{

    private long mAnimationLength;
    private MetagameAvatarView mAvatarView;
    private final Player mPlayer;

    private WelcomePopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player)
    {
        super(gamesclientcontext, popuplocationinfo, 2000L, false);
        mPlayer = player;
        mAnimationLength = getContext().getResources().getInteger(0x7f0e0063);
    }

    public static void show(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player)
    {
        gamesclientcontext = new WelcomePopup(gamesclientcontext, popuplocationinfo, player);
        sHandler.sendMessage(sHandler.obtainMessage(0, gamesclientcontext));
    }

    protected final void bindViewData()
    {
        Object obj = (TextView)mPopupView.findViewById(0x7f0d0141);
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(getContext().getString(0x7f100290));
        String s = GamesSettingsDebugActivity.getSelectedServerFromG();
        if (!GamesSettingsDebugActivity.isProdServer() && s != null)
        {
            stringbuilder.append(" (").append(s).append(")");
        }
        ((TextView) (obj)).setText(stringbuilder.toString());
        ((TextView)mPopupView.findViewById(0x7f0d0142)).setText(mPlayer.getDisplayName());
        obj = mPlayer.getLevelInfo();
        int i;
        if (obj != null)
        {
            i = ((PlayerLevelInfo) (obj)).mCurrentLevel.mLevelNumber;
        } else
        {
            i = -1;
        }
        mAvatarView = (MetagameAvatarView)mPopupView.findViewById(0x7f0d01ba);
        mAvatarView.setData(getImageBitmap(mPlayer.getIconImageUri()), getImageDefaultDrawable(0x7f0200db), i);
        if (obj != null)
        {
            mAvatarView.setupLevelProgressView(((PlayerLevelInfo) (obj)));
        }
    }

    protected final int getClickedEvent()
    {
        return 29;
    }

    protected final int getDisplayedEvent()
    {
        return 28;
    }

    protected final String getTalkbackMessage()
    {
        return getContext().getString(0x7f100220, new Object[] {
            mPlayer.getDisplayName()
        });
    }

    protected final void handleClick()
    {
        Context context = getContext();
        Object obj = mGamesContext.mClientContext.mCallingPackageName;
        String s = mGamesContext.mClientContext.mResolvedAccount.name;
        obj = createProxyIntent(context, "com.google.android.gms.games.VIEW_PROFILE", ((String) (obj)), s);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.PLAYER", mPlayer);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        ClientUiProxyActivity.launchProxyIntent(context, ((Intent) (obj)));
    }

    public final void onAnimationEnd(Animation animation)
    {
        super.onAnimationEnd(animation);
        if (animation == mShowPopupAnimation)
        {
            mAvatarView.startLevelProgressAnimation(mAnimationLength, false);
        }
    }
}
