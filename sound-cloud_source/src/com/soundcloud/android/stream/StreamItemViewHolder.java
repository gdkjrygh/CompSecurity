// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import a.a;
import android.content.Context;
import android.text.SpannableString;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ToggleButton;

public class StreamItemViewHolder
{
    public static interface CardEngagementClickListener
    {

        public abstract void onLikeClick(View view);

        public abstract void onRepostClick(View view);
    }

    public static interface OverflowListener
    {

        public abstract void onOverflow(View view);
    }


    private CardEngagementClickListener clickListener;
    TextView createdAt;
    TextView creator;
    TextView duration;
    TextView headerText;
    ImageView image;
    ToggleButton likeButton;
    View nowPlaying;
    View overflowButton;
    private OverflowListener overflowListener;
    TextView playCount;
    View privateIndicator;
    View privateSeparator;
    TextView promotedItem;
    TextView promoter;
    ToggleButton repostButton;
    TextView reposter;
    TextView title;
    ImageView userImage;

    public StreamItemViewHolder(View view)
    {
        a.a(this, view);
    }

    public Context getContext()
    {
        return title.getContext();
    }

    public ImageView getImage()
    {
        return image;
    }

    public ImageView getUserImage()
    {
        userImage.setVisibility(0);
        return userImage;
    }

    public void hideUserImage()
    {
        userImage.setVisibility(8);
    }

    public void like()
    {
        if (clickListener != null)
        {
            clickListener.onLikeClick(likeButton);
        }
    }

    public void repost()
    {
        if (clickListener != null)
        {
            clickListener.onRepostClick(repostButton);
        }
    }

    public void resetAdditionalInformation()
    {
        playCount.setVisibility(8);
        nowPlaying.setVisibility(8);
        duration.setVisibility(8);
        repostButton.setVisibility(8);
    }

    public void resetCardView()
    {
        headerText.setVisibility(8);
        reposter.setVisibility(8);
        createdAt.setVisibility(8);
        promotedItem.setVisibility(8);
        promoter.setVisibility(8);
        togglePrivateIndicator(false);
        promoter.setOnClickListener(null);
        userImage.setOnClickListener(null);
        headerText.setOnClickListener(null);
        creator.setOnClickListener(null);
    }

    public void setArtist(String s)
    {
        creator.setText(s);
    }

    public void setArtistClickable(android.view.View.OnClickListener onclicklistener)
    {
        creator.setOnClickListener(onclicklistener);
    }

    public void setCreatedAt(String s)
    {
        createdAt.setText(s);
        createdAt.setVisibility(0);
    }

    public void setCreatorClickable(android.view.View.OnClickListener onclicklistener)
    {
        headerText.setOnClickListener(onclicklistener);
        userImage.setOnClickListener(onclicklistener);
    }

    public void setEngagementClickListener(CardEngagementClickListener cardengagementclicklistener)
    {
        clickListener = cardengagementclicklistener;
    }

    public void setHeaderText(SpannableString spannablestring)
    {
        headerText.setText(spannablestring);
        headerText.setVisibility(0);
    }

    public void setOverflowListener(OverflowListener overflowlistener)
    {
        overflowListener = overflowlistener;
    }

    public void setPromotedHeader(SpannableString spannablestring)
    {
        promotedItem.setText(spannablestring);
        promotedItem.setVisibility(0);
    }

    public void setPromoterClickable(android.view.View.OnClickListener onclicklistener)
    {
        promoter.setOnClickListener(onclicklistener);
        userImage.setOnClickListener(onclicklistener);
    }

    public void setPromoterHeader(String s, SpannableString spannablestring)
    {
        promoter.setText(s);
        promoter.setVisibility(0);
        promotedItem.setText(spannablestring);
        promotedItem.setVisibility(0);
    }

    public void setRepostHeader(String s, SpannableString spannablestring)
    {
        headerText.setText(s);
        headerText.setVisibility(0);
        reposter.setText(spannablestring);
        reposter.setVisibility(0);
    }

    public void setTitle(String s)
    {
        title.setText(s);
    }

    public void showDuration(String s)
    {
        duration.setText(s);
        duration.setVisibility(0);
    }

    public void showLikeStats(String s, boolean flag)
    {
        likeButton.setTextOn(s);
        likeButton.setTextOff(s);
        likeButton.setChecked(flag);
    }

    public void showNowPlaying()
    {
        nowPlaying.setVisibility(0);
    }

    public void showOverflow()
    {
        if (overflowListener != null)
        {
            overflowListener.onOverflow(overflowButton);
        }
    }

    public void showPlayCount(String s)
    {
        playCount.setText(s);
        playCount.setVisibility(0);
    }

    public void showRepostStats(String s, boolean flag)
    {
        repostButton.setTextOn(s);
        repostButton.setTextOff(s);
        repostButton.setChecked(flag);
        repostButton.setVisibility(0);
    }

    public void togglePrivateIndicator(boolean flag)
    {
        boolean flag1 = false;
        View view = privateIndicator;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        view = privateSeparator;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }
}
