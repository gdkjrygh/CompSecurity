// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.common.quests;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.CharArrayBuffer;
import android.graphics.drawable.Drawable;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.quest.Milestone;
import com.google.android.gms.games.quest.Quest;
import com.google.android.gms.games.ui.GamesFragmentActivity;
import com.google.android.gms.games.ui.GamesUiConfiguration;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.util.UiUtils;

// Referenced classes of package com.google.android.gms.games.ui.common.quests:
//            QuestUiUtils

public final class InternalQuestViewHolder
{

    private final Button mAcceptButton;
    private final TextView mAcceptedTimeLeftDestView;
    private final TextView mAcceptedTimeLeftView;
    final View mBackgroundGuardView;
    private final LoadingImageView mBannerImageView;
    public final View mCardView;
    private final Button mClaimButton;
    private final TextView mDescriptionView;
    private final CharArrayBuffer mDescriptionViewBuffer = new CharArrayBuffer(500);
    private final View mDivider;
    private final LoadingImageView mIconImageView;
    private boolean mIsClientUi;
    private final TextView mNameView;
    private final CharArrayBuffer mNameViewBuffer = new CharArrayBuffer(100);
    private final Button mPlayButton;
    private final ProgressBar mProgressBar;
    private final TextView mProgressText;
    private final TextView mTimeLeftView;

    public InternalQuestViewHolder(View view)
    {
        mBannerImageView = (LoadingImageView)view.findViewById(0x7f0d02b7);
        mBackgroundGuardView = view.findViewById(0x7f0d02b8);
        mIconImageView = (LoadingImageView)view.findViewById(0x7f0d02bc);
        mProgressText = (TextView)view.findViewById(0x7f0d02b9);
        mProgressBar = (ProgressBar)view.findViewById(0x7f0d02ba);
        mNameView = (TextView)view.findViewById(0x7f0d0257);
        mDescriptionView = (TextView)view.findViewById(0x7f0d0256);
        mTimeLeftView = (TextView)view.findViewById(0x7f0d02b1);
        mAcceptedTimeLeftDestView = (TextView)view.findViewById(0x7f0d02b2);
        mAcceptedTimeLeftView = (TextView)view.findViewById(0x7f0d02b3);
        mAcceptButton = (Button)view.findViewById(0x7f0d02b5);
        mClaimButton = (Button)view.findViewById(0x7f0d02b6);
        mDivider = view.findViewById(0x7f0d025a);
        mPlayButton = (Button)view.findViewById(0x7f0d01ac);
        mCardView = view.findViewById(0x7f0d0255);
    }

    public final void populateViews(Context context, ImageLoader imageloader, Quest quest, GamesFragmentActivity gamesfragmentactivity)
    {
        String s;
        String s1;
        int i;
        long l1;
        boolean flag;
        boolean flag1;
        boolean flag2;
        boolean flag3;
        mIsClientUi = gamesfragmentactivity.mConfiguration.isClientUi();
        if (gamesfragmentactivity.mConfiguration.isDestinationUi())
        {
            android.net.Uri uri;
            int j;
            if (gamesfragmentactivity.getResources().getConfiguration().fontScale > 1.0F)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                mDescriptionView.setMaxLines(2);
            }
        }
        l1 = System.currentTimeMillis();
        j = quest.getState();
        flag1 = false;
        flag2 = false;
        flag = false;
        i = 0;
        flag3 = false;
        j;
        JVM INSTR tableswitch 1 6: default 124
    //                   1 699
    //                   2 724
    //                   3 766
    //                   4 812
    //                   5 881
    //                   6 862;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7
_L6:
        break MISSING_BLOCK_LABEL_881;
_L1:
        GamesLog.w("InternalQuestVH", (new StringBuilder("populateViews: unexpected state: ")).append(j).toString());
        s1 = "";
        s = "";
_L8:
        if (!gamesfragmentactivity.mIsPlusEnabled)
        {
            flag1 = false;
            flag2 = false;
            flag = false;
        }
        uri = quest.getBannerImageUri();
        gamesfragmentactivity = uri;
        if (uri == null)
        {
            gamesfragmentactivity = quest.getGame().getFeaturedImageUri();
        }
        mBackgroundGuardView.setVisibility(8);
        imageloader.loadImage(mBannerImageView, gamesfragmentactivity, 0x7f020171, new com.google.android.gms.common.images.ImageManager.OnImageLoadedListener() {

            final InternalQuestViewHolder this$0;

            public final void onImageLoaded$482c40fe(Drawable drawable)
            {
                mBackgroundGuardView.setVisibility(0);
            }

            
            {
                this$0 = InternalQuestViewHolder.this;
                super();
            }
        });
        imageloader.loadImage(mIconImageView, quest.getIconImageUri(), 0x7f0200da);
        imageloader = quest.getCurrentMilestone();
        l1 = imageloader.getCurrentProgress();
        long l2 = imageloader.getTargetProgress();
        imageloader = context.getString(0x7f1002b2, new Object[] {
            String.valueOf(l1), String.valueOf(l2)
        });
        mProgressText.setText(Html.fromHtml(imageloader));
        int k;
        int l;
        boolean flag4;
        if (i != 0)
        {
            l = 100;
            k = 0x7f02017d;
        } else
        {
            l = (int)((100L * l1) / l2);
            k = 0x7f02017c;
        }
        mProgressBar.setProgress(l);
        imageloader = context.getResources();
        mProgressBar.setProgressDrawable(imageloader.getDrawable(k));
        quest.getName(mNameViewBuffer);
        mNameView.setText(mNameViewBuffer.data, 0, mNameViewBuffer.sizeCopied);
        quest.getDescription(mDescriptionViewBuffer);
        mDescriptionView.setText(mDescriptionViewBuffer.data, 0, mDescriptionViewBuffer.sizeCopied);
        mTimeLeftView.setText(s1);
        mAcceptedTimeLeftDestView.setText(s);
        mAcceptedTimeLeftView.setText(s);
        if (mIsClientUi)
        {
            mAcceptedTimeLeftDestView.setVisibility(8);
            UiUtils.setVisible(flag3, 8, new View[] {
                mAcceptedTimeLeftView
            });
        } else
        {
            UiUtils.setVisible(flag3, 8, new View[] {
                mAcceptedTimeLeftDestView
            });
            mAcceptedTimeLeftView.setVisibility(8);
        }
        if (i != 0)
        {
            i = 0x7f0b00c1;
        } else
        {
            i = 0x7f0b0257;
        }
        mTimeLeftView.setTextColor(imageloader.getColor(i));
        if (flag1 || flag2 || flag)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        UiUtils.setVisible(flag4, 8, new View[] {
            mDivider
        });
        UiUtils.setVisible(flag1, 8, new View[] {
            mAcceptButton
        });
        mAcceptButton.setTag(quest);
        UiUtils.setVisible(flag2, 8, new View[] {
            mClaimButton
        });
        mClaimButton.setTag(quest);
        UiUtils.setVisible(flag, 8, new View[] {
            mPlayButton
        });
        mPlayButton.setTag(quest);
        if (flag3)
        {
            context = context.getString(0x7f100298, new Object[] {
                quest.getName(), quest.getGame().getDisplayName(), Long.valueOf(l1), Long.valueOf(l2), s, quest.getDescription()
            });
        } else
        {
            context = context.getString(0x7f1002b1, new Object[] {
                quest.getName(), quest.getGame().getDisplayName(), Long.valueOf(l1), Long.valueOf(l2), s1, quest.getDescription()
            });
        }
        mCardView.setContentDescription(context);
        return;
_L2:
        s1 = QuestUiUtils.getTimeLeftString(context, quest.getStartTimestamp(), l1, false);
        s = "";
        flag = false;
          goto _L8
_L3:
        s1 = QuestUiUtils.getTimeLeftString(context, quest.getEndTimestamp(), l1, true);
        s = "";
        flag1 = mIsClientUi;
        if (!flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L8
_L4:
        s1 = context.getString(0x7f1002b5);
        s = QuestUiUtils.getTimeLeftString(context, quest.getEndTimestamp(), l1, true);
        flag3 = true;
        if (!mIsClientUi)
        {
            flag = true;
        } else
        {
            flag = false;
        }
          goto _L8
_L5:
        if (3 == quest.getCurrentMilestone().getState())
        {
            s1 = context.getString(0x7f1002b8);
            s = "";
            flag2 = true;
        } else
        {
            s1 = context.getString(0x7f1002b8);
            s = "";
        }
          goto _L8
_L7:
        s1 = context.getString(0x7f1002b9);
        s = "";
        i = 1;
          goto _L8
        s1 = context.getString(0x7f1002b9);
        s = "";
        i = 1;
          goto _L8
    }

    public final void setOnClickListener(android.view.View.OnClickListener onclicklistener)
    {
        mAcceptButton.setOnClickListener(onclicklistener);
        mClaimButton.setOnClickListener(onclicklistener);
        mPlayButton.setOnClickListener(onclicklistener);
    }
}
