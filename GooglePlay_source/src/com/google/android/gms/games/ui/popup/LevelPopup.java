// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.popup;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import com.google.android.gms.common.internal.Asserts;
import com.google.android.gms.common.internal.ClientContext;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerLevel;
import com.google.android.gms.games.PlayerLevelInfo;
import com.google.android.gms.games.broker.GamesClientContext;
import com.google.android.gms.games.ui.client.ClientUiProxyActivity;
import com.google.android.gms.games.ui.util.UiUtils;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;

// Referenced classes of package com.google.android.gms.games.ui.popup:
//            BasePopup

public class LevelPopup extends BasePopup
    implements android.view.View.OnClickListener
{
    private static final class HCAnimatedLevelPopup extends LevelPopup
        implements android.animation.ValueAnimator.AnimatorUpdateListener
    {

        private float endARGB[];
        private float mAnimationValue;
        private final Animation mLevelExpandShrinkAnimation;
        private TextView mLevelIconView;
        private float startARGB[];
        private int tempARGB[];

        protected final void bindViewData()
        {
            bindViewData();
            mLevelIconView = (TextView)mAvatarView.findViewById(0x7f0d01c3);
            PlayerLevelInfo playerlevelinfo = mPrePlayer.getLevelInfo();
            mAvatarView.setupLevelProgressView(playerlevelinfo);
            int i = playerlevelinfo.mCurrentLevel.mLevelNumber;
            mAvatarView = (MetagameAvatarView)mPopupView.findViewById(0x7f0d01ba);
            mAvatarView.setData(getImageBitmap(mPrePlayer.getIconImageUri()), getImageDefaultDrawable(0x7f0200db), i);
        }

        public final void onAnimationEnd(Animation animation)
        {
            onAnimationEnd(animation);
            if (animation == mShowPopupAnimation)
            {
                mLevelIconView.startAnimation(mLevelExpandShrinkAnimation);
                mAvatarView.startLevelProgressAnimation(mResources.getInteger(0x7f0e0010), true);
                animation = mPrePlayer.getLevelInfo();
                PlayerLevelInfo playerlevelinfo = mPostPlayer.getLevelInfo();
                int i = UiUtils.getLevelColor(mResources, ((PlayerLevelInfo) (animation)).mCurrentLevel.mLevelNumber);
                int j = UiUtils.getLevelColor(mResources, playerlevelinfo.mCurrentLevel.mLevelNumber);
                startARGB = new float[4];
                startARGB[0] = Color.alpha(i);
                startARGB[1] = Color.red(i);
                startARGB[2] = Color.green(i);
                startARGB[3] = Color.blue(i);
                endARGB = new float[4];
                endARGB[0] = Color.alpha(j);
                endARGB[1] = Color.red(j);
                endARGB[2] = Color.green(j);
                endARGB[3] = Color.blue(j);
                tempARGB = new int[4];
                animation = ValueAnimator.ofFloat(new float[] {
                    0.0F, 1.0F
                });
                animation.addUpdateListener(this);
                animation.setDuration(mResources.getInteger(0x7f0e0011));
                animation.setInterpolator(new DecelerateInterpolator());
                (new Handler(Looper.getMainLooper())).postDelayed(animation. new Runnable() {

                    final HCAnimatedLevelPopup this$0;
                    final ValueAnimator val$animator;

                    public final void run()
                    {
                        animator.start();
                    }

            
            {
                this$0 = final_hcanimatedlevelpopup;
                animator = ValueAnimator.this;
                super();
            }
                }, mResources.getInteger(0x7f0e0010));
            }
        }

        public final void onAnimationUpdate(ValueAnimator valueanimator)
        {
            if (mAnimationValue == -1F)
            {
                int i = mPostPlayer.getLevelInfo().mCurrentLevel.mLevelNumber;
                mLevelIconView.setText(String.valueOf(i));
            }
            mAnimationValue = ((Float)valueanimator.getAnimatedValue()).floatValue();
            for (int j = 0; j < tempARGB.length; j++)
            {
                tempARGB[j] = (int)(startARGB[j] + (endARGB[j] - startARGB[j]) * mAnimationValue);
            }

            int k = Color.argb(tempARGB[0], tempARGB[1], tempARGB[2], tempARGB[3]);
            mAvatarView.setLevelBackgroundColor(k);
        }

        private HCAnimatedLevelPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player, Player player1)
        {
            super(gamesclientcontext, popuplocationinfo, player, player1, (byte)0);
            mAnimationValue = -1F;
            mLevelExpandShrinkAnimation = AnimationUtils.loadAnimation(getContext(), 0x7f050016);
            mLevelExpandShrinkAnimation.setAnimationListener(this);
        }

        HCAnimatedLevelPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player, Player player1, byte byte0)
        {
            this(gamesclientcontext, popuplocationinfo, player, player1);
        }
    }


    private static final String TAG = com/google/android/gms/games/ui/popup/LevelPopup.getSimpleName();
    protected MetagameAvatarView mAvatarView;
    protected GamesClientContext mGamesContext;
    protected final Player mPostPlayer;
    protected final Player mPrePlayer;
    protected Resources mResources;

    private LevelPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player, Player player1)
    {
        super(gamesclientcontext, popuplocationinfo, 3000L, false);
        mPrePlayer = player;
        mPostPlayer = player1;
        mResources = gamesclientcontext.mContext.getResources();
        mGamesContext = gamesclientcontext;
    }

    LevelPopup(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player, Player player1, byte byte0)
    {
        this(gamesclientcontext, popuplocationinfo, player, player1);
    }

    public static void show(GamesClientContext gamesclientcontext, com.google.android.gms.games.internal.PopupManager.PopupLocationInfo popuplocationinfo, Player player, Player player1)
    {
        Asserts.checkNotNull(player.getLevelInfo(), "No pre-update level info!");
        Asserts.checkNotNull(player1.getLevelInfo(), "No post-update level info!");
        if (PlatformVersion.checkVersion(11))
        {
            gamesclientcontext = new HCAnimatedLevelPopup(gamesclientcontext, popuplocationinfo, player, player1, (byte)0);
        } else
        {
            gamesclientcontext = new LevelPopup(gamesclientcontext, popuplocationinfo, player, player1);
        }
        sHandler.sendMessage(sHandler.obtainMessage(0, gamesclientcontext));
    }

    protected void bindViewData()
    {
        mPopupContentView.setOnClickListener(this);
        int i = mPostPlayer.getLevelInfo().mCurrentLevel.mLevelNumber;
        ((TextView)mPopupView.findViewById(0x7f0d0141)).setText(mResources.getString(0x7f1001d7, new Object[] {
            String.valueOf(i)
        }));
        ((TextView)mPopupView.findViewById(0x7f0d0142)).setText(0x7f1001d5);
        mAvatarView = (MetagameAvatarView)mPopupView.findViewById(0x7f0d01ba);
        mAvatarView.setData(getImageBitmap(mPostPlayer.getIconImageUri()), getImageDefaultDrawable(0x7f0200db), i);
    }

    protected final int getClickedEvent()
    {
        return 27;
    }

    protected final int getDisplayedEvent()
    {
        return 26;
    }

    protected final String getTalkbackMessage()
    {
        return getContext().getString(0x7f1001d6, new Object[] {
            Integer.valueOf(mPostPlayer.getLevelInfo().mCurrentLevel.mLevelNumber)
        });
    }

    protected final void handleClick()
    {
        Context context = getContext();
        Object obj = mGamesContext.mClientContext.mCallingPackageName;
        String s = mGamesContext.mClientContext.getResolvedAccountName();
        obj = createProxyIntent(context, "com.google.android.gms.games.VIEW_PROFILE", ((String) (obj)), s);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.PLAYER", mPostPlayer);
        ((Intent) (obj)).putExtra("com.google.android.gms.games.ACCOUNT_NAME", s);
        ClientUiProxyActivity.launchProxyIntent(context, ((Intent) (obj)));
    }

}
