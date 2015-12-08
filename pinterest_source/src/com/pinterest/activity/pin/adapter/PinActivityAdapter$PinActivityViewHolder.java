// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.pinterest.activity.board.view.FollowBoardButton;
import com.pinterest.kit.view.BoardView;
import com.pinterest.ui.imageview.WebImageView;

public class Q extends android.support.v7.widget.ewHolder
{

    ImageView addCommentVw;
    TextView boardName;
    TextView boardStats;
    BoardView boardVw;
    LinearLayout commentBubbleVw;
    TextView commentStatsVw;
    TextView dateTv;
    FollowBoardButton followBoardButton;
    TextView pinnerComment;
    WebImageView pinnerIv;
    TextView pinnerName;
    LinearLayout pinnerVw;

    public Q(View view)
    {
        super(view);
        ButterKnife.a(this, view);
    }
}
