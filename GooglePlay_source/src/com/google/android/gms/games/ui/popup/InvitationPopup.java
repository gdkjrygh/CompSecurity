// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

public final class InvitationPopup extends BasePopup
{

    private MetagameAvatarView mAvatarView;
    private final Invitation mInvitation;

    private InvitationPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Invitation invitation)
    {
        super(gamesclientcontext, popuplocationinfo, 3000L, false);
        mInvitation = invitation;
    }

    public static void show(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Invitation invitation)
    {
        gamesclientcontext = new InvitationPopup(gamesclientcontext, popuplocationinfo, invitation);
        sHandler.sendMessage(sHandler.obtainMessage(0, gamesclientcontext));
    }

    protected final void bindViewData()
    {
        Participant participant = mInvitation.getInviter();
        ((TextView)mPopupView.findViewById(0x7f0d0141)).setText(0x7f100199);
        ((TextView)mPopupView.findViewById(0x7f0d0142)).setText(participant.getDisplayName());
        Object obj = participant.getPlayer();
        int i;
        if (obj != null)
        {
            obj = ((Player) (obj)).getLevelInfo();
        } else
        {
            obj = null;
        }
        if (obj != null)
        {
            i = ((PlayerLevelInfo) (obj)).mCurrentLevel.mLevelNumber;
        } else
        {
            i = -1;
        }
        mAvatarView = (MetagameAvatarView)mPopupView.findViewById(0x7f0d01ba);
        mAvatarView.setData(getImageBitmap(participant.getIconImageUri()), getImageDefaultDrawable(0x7f0200db), i);
        if (obj != null)
        {
            mAvatarView.setupLevelProgressView(((PlayerLevelInfo) (obj)));
        }
    }

    protected final int getClickedEvent()
    {
        return 33;
    }

    protected final int getDisplayedEvent()
    {
        return 32;
    }

    protected final String getTalkbackMessage()
    {
        return getContext().getString(0x7f10019a, new Object[] {
            mInvitation.getInviter().getDisplayName()
        });
    }

    protected final void handleClick()
    {
    }
}
