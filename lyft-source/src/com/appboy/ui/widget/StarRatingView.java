// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.appboy.Constants;
import com.appboy.support.AppboyLogger;
import java.util.ArrayList;
import java.util.List;

public class StarRatingView extends LinearLayout
{

    private static final int MAX_NUMBER_OF_STARS = 5;
    private static final String TAG;
    private float mRating;
    private List mStarRating;

    public StarRatingView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mRating = 0.0F;
        setOrientation(0);
        mStarRating = new ArrayList(5);
        for (int i = 0; i < 5; i++)
        {
            attributeset = new ImageView(context);
            attributeset.setTag(Integer.valueOf(0));
            addView(attributeset, new android.view.ViewGroup.LayoutParams(-2, -2));
            mStarRating.add(attributeset);
        }

        setRating(mRating);
    }

    List getImageViewList()
    {
        return mStarRating;
    }

    public float getRating()
    {
        return mRating;
    }

    public boolean setRating(float f)
    {
        if (f < 0.0F || f > 5F)
        {
            AppboyLogger.e(TAG, String.format("Unable to set rating to %f. Rating must be between 0 and %d", new Object[] {
                Float.valueOf(f), Integer.valueOf(5)
            }));
            return false;
        }
        mRating = f;
        int l = (int)Math.floor(mRating);
        int k = (int)Math.ceil(mRating);
        int i = 0;
        int j;
        do
        {
            j = k;
            if (i >= l)
            {
                break;
            }
            ImageView imageview = (ImageView)mStarRating.get(i);
            imageview.setTag(Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_full_star));
            imageview.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_full_star);
            i++;
        } while (true);
        for (; j < mStarRating.size(); j++)
        {
            ImageView imageview1 = (ImageView)mStarRating.get(j);
            imageview1.setTag(Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_empty_star));
            imageview1.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_empty_star);
        }

        f -= l;
        if (f > 0.0F)
        {
            ImageView imageview2 = (ImageView)mStarRating.get(l);
            if (f < 0.25F)
            {
                imageview2.setTag(Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_empty_star));
                imageview2.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_empty_star);
            } else
            if (f < 0.75F)
            {
                imageview2.setTag(Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_half_star));
                imageview2.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_half_star);
            } else
            {
                imageview2.setTag(Integer.valueOf(com.appboy.ui.R.drawable.com_appboy_rating_full_star));
                imageview2.setImageResource(com.appboy.ui.R.drawable.com_appboy_rating_full_star);
            }
        }
        return true;
    }

    static 
    {
        TAG = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/ui/widget/StarRatingView.getName()
        });
    }
}
