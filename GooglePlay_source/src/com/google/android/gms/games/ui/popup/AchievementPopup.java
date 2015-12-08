// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.achievement.Achievement;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.ui.client.ClientUiProxyActivity;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.text.NumberFormat;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

public final class AchievementPopup extends BasePopup
{

    private final Achievement mAchievement;
    private TextView mAchievementNameView;
    private TextView mAchievementXpView;
    private MetagameAvatarView mAvatarView;

    private AchievementPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Bundle bundle)
    {
        super(gamesclientcontext, popuplocationinfo, 3000L, true);
        mAchievement = (Achievement)bundle.getParcelable("com.google.android.gms.games.ACHIEVEMENT");
        Preconditions.checkNotNull(mAchievement);
    }

    public static void show(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Bundle bundle)
    {
        gamesclientcontext = new AchievementPopup(gamesclientcontext, popuplocationinfo, bundle);
        sHandler.sendMessage(sHandler.obtainMessage(0, gamesclientcontext));
    }

    protected final void bindViewData()
    {
        Resources resources = getContext().getResources();
        mPopupContentView.setBackgroundResource(0x7f02004b);
        mAchievementNameView = (TextView)mPopupContentView.findViewById(0x7f0d0141);
        mAchievementNameView.setText(mAchievement.getName());
        mAchievementNameView.setTextColor(resources.getColor(0x7f0b008a));
        mAchievementNameView.setTextSize(0, resources.getDimensionPixelSize(0x7f0c0197));
        mAchievementNameView.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mAchievementXpView = (TextView)mPopupContentView.findViewById(0x7f0d0142);
        long l = mAchievement.getXpValue();
        TextView textview;
        if (l > 0L)
        {
            String s = NumberFormat.getInstance().format(l);
            mAchievementXpView.setText(getContext().getResources().getString(0x7f100098, new Object[] {
                s
            }));
            mAchievementXpView.setTextColor(resources.getColor(0x7f0b008c));
            mAchievementXpView.setTextSize(0, resources.getDimensionPixelSize(0x7f0c0198));
        } else
        {
            mAchievementXpView.setVisibility(8);
        }
        textview = (TextView)mPopupCurtainView.findViewById(0x7f0d01bc);
        textview.setText(resources.getString(0x7f100096));
        textview.setTextColor(resources.getColor(0x7f0b008a));
        textview.setTextSize(0, resources.getDimensionPixelSize(0x7f0c0197));
        textview.setEllipsize(android.text.TextUtils.TruncateAt.END);
        mAvatarView = (MetagameAvatarView)mPopupView.findViewById(0x7f0d01ba);
        mAvatarView.setData(getImageBitmap(mAchievement.getUnlockedImageUri()), getImageDefaultDrawable(0x7f020147));
        mPopupCurtainView.setVisibility(0);
        mPopupCurtainView.setBackgroundResource(0x7f02004b);
    }

    protected final int getClickedEvent()
    {
        return 25;
    }

    protected final int getDisplayedEvent()
    {
        return 24;
    }

    protected final String getTalkbackMessage()
    {
        return getContext().getString(0x7f10021f, new Object[] {
            mAchievement.getName(), Long.valueOf(mAchievement.getXpValue())
        });
    }

    protected final void handleClick()
    {
        Context context = getContext();
        Object obj = mGamesContext.mClientContext.mCallingPackageName;
        String s = mGamesContext.mClientContext.getResolvedAccountName();
        obj = createProxyIntent(context, "com.google.android.gms.games.VIEW_ACHIEVEMENT", ((String) (obj)), s);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.ACHIEVEMENT", mAchievement);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.SHOW_SEE_MORE", true);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        ClientUiProxyActivity.launchProxyIntent(context, ((Intent) (obj)));
    }

    protected final void hidePopup()
    {
        ArrayList arraylist = sPopupQueue;
        arraylist;
        JVM INSTR monitorenter ;
        int i = 1;
_L2:
        Object obj;
        if (i >= sPopupQueue.size())
        {
            break MISSING_BLOCK_LABEL_170;
        }
        obj = (BasePopup)sPopupQueue.get(i);
        if (!(obj instanceof AchievementPopup))
        {
            break MISSING_BLOCK_LABEL_177;
        }
        obj = (AchievementPopup)obj;
        if (i == 1)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        sPopupQueue.remove(i);
        sPopupQueue.add(1, obj);
        long l = mHidePopupAnimation.getDuration();
        mHidePopupAnimation = new AlphaAnimation(1.0F, 0.0F);
        mHidePopupAnimation.setAnimationListener(this);
        mHidePopupAnimation.setDuration(l);
        mHidePopupAnimation.setFillAfter(true);
        obj.mUseCurtain = false;
        ((AchievementPopup) (obj)).mPopupCurtainView.setVisibility(8);
        l = ((AchievementPopup) (obj)).mShowPopupAnimation.getDuration();
        obj.mShowPopupAnimation = new AlphaAnimation(0.0F, 1.0F);
        ((AchievementPopup) (obj)).mShowPopupAnimation.setAnimationListener(((android.view.animation.Animation.AnimationListener) (obj)));
        ((AchievementPopup) (obj)).mShowPopupAnimation.setDuration(l);
        ((AchievementPopup) (obj)).mShowPopupAnimation.setFillAfter(true);
        arraylist;
        JVM INSTR monitorexit ;
        super.hidePopup();
        return;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        Exception exception;
        exception;
        arraylist;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final void removeCurtain()
    {
        super.removeCurtain();
        if (mUseCurtain)
        {
            View view = mPopupCurtainView.findViewById(0x7f0d01bc);
            Animation animation = AnimationUtils.loadAnimation(getContext(), 0x7f050015);
            animation.setFillAfter(true);
            animation.setDuration(mRevealTextUnderCurtainAnimation.getDuration());
            view.startAnimation(animation);
            mAchievementNameView.startAnimation(mRevealTextUnderCurtainAnimation);
            mAchievementXpView.startAnimation(mRevealTextUnderCurtainAnimation);
            mAvatarView.startAnimation(mRevealImageUnderCurtainAnimation);
        }
    }
}
