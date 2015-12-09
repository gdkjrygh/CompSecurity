// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.card;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.ui.ImageLoader;
import com.google.android.gms.games.ui.transition.SharedElementTransition;
import com.google.android.gms.games.ui.widget.MetagameAvatarView;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.ui.card:
//            OnyxBaseCardView

public final class OnyxScoreComparisonCardView extends OnyxBaseCardView
    implements OnyxCardViewDefinition.HasBannerImage, OnyxCardViewDefinition.HasIcon
{

    private OnyxCardViewDefinition.BannerImageClickListener mBannerImageClickListener;
    private int mIconDefaultResId;
    private LoadingImageView mIconImage;
    private Uri mIconUri;
    private ArrayList mScoreComparisonBarViews;
    private ViewGroup mScoreComparisonBarsContainer;

    public OnyxScoreComparisonCardView(Context context)
    {
        super(context);
    }

    public OnyxScoreComparisonCardView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
    }

    public OnyxScoreComparisonCardView(Context context, AttributeSet attributeset, int i)
    {
        super(context, attributeset, i);
    }

    public final void addBannerImageSharedViews(SharedElementTransition sharedelementtransition)
    {
    }

    public final void clearData()
    {
        super.clearData();
        mIconImage.setVisibility(8);
        mSubtitleView.setText("");
        mSubtitleView.setSingleLine(true);
    }

    public final void onClick(View view)
    {
        super.onClick(view);
    }

    protected final void onFinishInflate()
    {
        super.onFinishInflate();
        mIconImage = (LoadingImageView)findViewById(0x7f0d0210);
        mScoreComparisonBarsContainer = (ViewGroup)findViewById(0x7f0d021a);
        mScoreComparisonBarViews = new ArrayList();
        if (mScoreComparisonBarsContainer != null)
        {
            int j = mScoreComparisonBarsContainer.getChildCount();
            for (int i = 0; i < j; i++)
            {
                Object obj = mScoreComparisonBarsContainer.getChildAt(i);
                if (obj == null)
                {
                    continue;
                }
                obj = ((View) (obj)).findViewById(0x7f0d026f);
                if (obj == null)
                {
                    continue;
                }
                mScoreComparisonBarViews.add(obj);
                obj = (MetagameAvatarView)((View) (obj)).findViewById(0x7f0d0273);
                if (obj != null)
                {
                    ((MetagameAvatarView) (obj)).setShadowStrokeWidth(0);
                    ((MetagameAvatarView) (obj)).setOutlineStrokeWidthResId(0x7f0c010b);
                }
            }

        }
    }

    public final void setBannerImageClickListener(OnyxCardViewDefinition.BannerImageClickListener bannerimageclicklistener)
    {
        mBannerImageClickListener = bannerimageclicklistener;
    }

    public final void setIconImage(Uri uri, int i)
    {
        mIconImage.setVisibility(0);
        mImageLoader.loadImage(mIconImage, uri, i);
        mIconUri = uri;
        mIconDefaultResId = i;
    }
}
