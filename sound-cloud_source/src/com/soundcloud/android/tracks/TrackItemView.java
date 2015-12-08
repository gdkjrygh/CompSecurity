// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.soundcloud.android.utils.ViewUtils;

public class TrackItemView
{
    public static class Factory
    {

        public View createItemView(ViewGroup viewgroup)
        {
            viewgroup = LayoutInflater.from(viewgroup.getContext()).inflate(0x7f0300d2, viewgroup, false);
            viewgroup.setTag(new TrackItemView(viewgroup));
            return viewgroup;
        }

        public Factory()
        {
        }
    }

    public static interface OverflowListener
    {

        public abstract void onOverflow(View view);
    }


    private final TextView creator;
    private final TextView duration;
    private final ImageView image;
    private final TextView notAvailableOffline;
    private final View nowPlaying;
    private OverflowListener overflowListener;
    private final TextView playCount;
    private final View privateIndicator;
    private final TextView promoted;
    private final TextView reposter;
    private final TextView title;
    private final View upsell;

    public TrackItemView(View view)
    {
        creator = (TextView)view.findViewById(0x7f0f0018);
        title = (TextView)view.findViewById(0x7f0f001b);
        image = (ImageView)view.findViewById(0x7f0f006f);
        duration = (TextView)view.findViewById(0x7f0f001a);
        playCount = (TextView)view.findViewById(0x7f0f0017);
        reposter = (TextView)view.findViewById(0x7f0f0243);
        nowPlaying = view.findViewById(0x7f0f0251);
        privateIndicator = view.findViewById(0x7f0f00d3);
        upsell = view.findViewById(0x7f0f027b);
        promoted = (TextView)view.findViewById(0x7f0f027a);
        notAvailableOffline = (TextView)view.findViewById(0x7f0f027c);
        view.findViewById(0x7f0f00d2).setOnClickListener(new _cls1());
    }

    public Context getContext()
    {
        return title.getContext();
    }

    public ImageView getImage()
    {
        return image;
    }

    public void hideReposter()
    {
        reposter.setVisibility(8);
    }

    public void resetAdditionalInformation()
    {
        playCount.setVisibility(4);
        nowPlaying.setVisibility(4);
        privateIndicator.setVisibility(8);
        upsell.setVisibility(4);
        promoted.setVisibility(8);
        notAvailableOffline.setVisibility(8);
        ViewUtils.unsetTouchClickable(promoted);
    }

    public void setCreator(String s)
    {
        creator.setText(s);
    }

    public void setDuration(String s)
    {
        duration.setText(s);
    }

    public void setOverflowListener(OverflowListener overflowlistener)
    {
        overflowListener = overflowlistener;
    }

    public void setPromotedClickable(android.view.View.OnClickListener onclicklistener)
    {
        ViewUtils.setTouchClickable(promoted, onclicklistener);
    }

    public void setTitle(String s)
    {
        title.setText(s);
    }

    public void showNotAvailableOffline()
    {
        notAvailableOffline.setVisibility(0);
    }

    public void showNowPlaying()
    {
        nowPlaying.setVisibility(0);
    }

    public void showPlaycount(String s)
    {
        playCount.setText(s);
        playCount.setVisibility(0);
    }

    public void showPrivateIndicator()
    {
        privateIndicator.setVisibility(0);
    }

    public void showPromotedTrack(String s)
    {
        promoted.setVisibility(0);
        promoted.setText(s);
    }

    public void showReposter(String s)
    {
        reposter.setText(s);
        reposter.setVisibility(0);
    }

    public void showUpsell()
    {
        upsell.setVisibility(0);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final TrackItemView this$0;

        public void onClick(View view)
        {
            if (overflowListener != null)
            {
                overflowListener.onOverflow(view);
            }
        }

        _cls1()
        {
            this$0 = TrackItemView.this;
            super();
        }
    }

}
