// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

public final class QuestPopup extends BasePopup
{

    private MetagameAvatarView mAvatarView;
    private final Bundle mBundle;
    private TextView mQuestTextView;
    private int mState;

    private QuestPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Bundle bundle)
    {
        boolean flag;
        if (bundle.getInt("com.google.android.gms.games.extra.state") == 4)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        super(gamesclientcontext, popuplocationinfo, 3000L, flag);
        mBundle = (Bundle)Preconditions.checkNotNull(bundle);
        mState = mBundle.getInt("com.google.android.gms.games.extra.state");
    }

    public static void show(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Bundle bundle)
    {
        gamesclientcontext = new QuestPopup(gamesclientcontext, popuplocationinfo, bundle);
        sHandler.sendMessage(sHandler.obtainMessage(0, gamesclientcontext));
    }

    protected final void bindViewData()
    {
        Resources resources;
        resources = getContext().getResources();
        mPopupView.findViewById(0x7f0d0142).setVisibility(8);
        mQuestTextView = (TextView)mPopupView.findViewById(0x7f0d0141);
        mQuestTextView.setTextColor(resources.getColor(0x7f0b008a));
        mQuestTextView.setTextSize(0, resources.getDimensionPixelSize(0x7f0c0197));
        mQuestTextView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mQuestTextView.setPadding(0, 0, 0, 0);
        mState;
        JVM INSTR tableswitch 3 4: default 112
    //                   3 141
    //                   4 200;
           goto _L1 _L2 _L3
_L1:
        GamesLog.wtf(getContext(), "QuestPopup", (new StringBuilder("Unrecognized state provided: ")).append(mState).toString());
        return;
_L2:
        mQuestTextView.setText(resources.getString(0x7f100177));
_L5:
        mAvatarView = (MetagameAvatarView)mPopupView.findViewById(0x7f0d01ba);
        mAvatarView.setData(getImageBitmap((Uri)mBundle.getParcelable("com.google.android.gms.games.extra.imageUri")), getImageDefaultDrawable(0x7f020157));
        return;
_L3:
        mPopupCurtainView.setVisibility(0);
        TextView textview = (TextView)mPopupCurtainView.findViewById(0x7f0d01bc);
        textview.setText(resources.getString(0x7f100178));
        textview.setTextColor(resources.getColor(0x7f0b008a));
        textview.setTextSize(0, resources.getDimensionPixelSize(0x7f0c0197));
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mQuestTextView.setText(mBundle.getString("com.google.android.gms.games.extra.name"));
        if (true) goto _L5; else goto _L4
_L4:
    }

    protected final int getClickedEvent()
    {
        return 31;
    }

    protected final int getDisplayedEvent()
    {
        return 30;
    }

    protected final String getTalkbackMessage()
    {
        switch (mState)
        {
        default:
            GamesLog.wtf(getContext(), "QuestPopup", (new StringBuilder("Unrecognized state provided: ")).append(mState).toString());
            return "";

        case 3: // '\003'
            return getContext().getString(0x7f100177);

        case 4: // '\004'
            return getContext().getString(0x7f100178);
        }
    }

    protected final void removeCurtain()
    {
        super.removeCurtain();
        if (mState == 4)
        {
            mQuestTextView.startAnimation(mRevealTextUnderCurtainAnimation);
            mAvatarView.startAnimation(mRevealImageUnderCurtainAnimation);
        }
    }
}
