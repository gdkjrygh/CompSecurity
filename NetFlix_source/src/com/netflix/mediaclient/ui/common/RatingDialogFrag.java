// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.common;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.fragment.NetflixDialogFrag;

public class RatingDialogFrag extends NetflixDialogFrag
    implements android.widget.RatingBar.OnRatingBarChangeListener, com.netflix.mediaclient.ui.mdx.MdxMiniPlayerFrag.MdxMiniPlayerDialog
{
    public static class Rating
    {

        public boolean user;
        public float value;

        public Rating()
        {
        }
    }


    public static final String INTENT_NAME = "ui_rating";
    public static final String PARAM_RATING = "rating";
    public static final String PARAM_RATING_USER = "rating_user";
    public static final String PARAM_VIDEO_ID = "videoId";
    public static final String PARAM_VIDEO_TITLE = "videoTitle";
    private static final String TAG = "mdxui";
    private boolean mIsUserRating;
    private float mRating;
    private RatingBar mRatingBar;
    private String mVideoId;
    private String mVideoTitle;

    public RatingDialogFrag()
    {
    }

    public static RatingDialogFrag newInstance(Rating rating, String s, String s1)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Playable ID can not be null!");
        } else
        {
            RatingDialogFrag ratingdialogfrag = new RatingDialogFrag();
            ratingdialogfrag.setStyle(1, 0x7f0d00cb);
            Bundle bundle = new Bundle();
            ratingdialogfrag.setArguments(bundle);
            bundle.putFloat("rating", rating.value);
            bundle.putBoolean("rating_user", rating.user);
            bundle.putString("videoId", s);
            bundle.putString("videoTitle", s1);
            return ratingdialogfrag;
        }
    }

    public boolean isLoadingData()
    {
        return false;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        mRating = getArguments().getFloat("rating");
        mIsUserRating = getArguments().getBoolean("rating_user");
        mVideoId = getArguments().getString("videoId");
        mVideoTitle = getArguments().getString("videoTitle");
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f030063, viewgroup, false);
        int i = 0x7f070141;
        if (mIsUserRating)
        {
            i = 0x7f070142;
        }
        mRatingBar = (RatingBar)layoutinflater.findViewById(i);
        mRatingBar.setOnRatingBarChangeListener(this);
        mRatingBar.setRating(mRating);
        mRatingBar.setVisibility(0);
        ((TextView)layoutinflater.findViewById(0x7f070140)).setText(getString(0x7f0c0185, new Object[] {
            mVideoTitle
        }));
        return layoutinflater;
    }

    public void onRatingChanged(RatingBar ratingbar, float f, boolean flag)
    {
        if (Log.isLoggable("mdxui", 3))
        {
            Log.d("mdxui", (new StringBuilder()).append("User change rating ").append(flag).append(" to ").append(f).toString());
        }
        if (!flag)
        {
            return;
        }
        ratingbar = getActivity();
        if (ratingbar == null)
        {
            Log.e("mdxui", "Activity is NULL, we can update rating!");
            return;
        } else
        {
            Intent intent = new Intent("ui_rating");
            intent.addCategory("LocalIntentNflxUi");
            intent.putExtra("rating", f);
            intent.putExtra("videoId", mVideoId);
            LocalBroadcastManager.getInstance(ratingbar).sendBroadcast(intent);
            dismissAllowingStateLoss();
            getFragmentManager().beginTransaction().remove(this).commit();
            return;
        }
    }
}
