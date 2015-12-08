// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.android.widget.AdvancedImageView;
import com.netflix.mediaclient.servicemgr.PostPlayVideo;
import com.netflix.mediaclient.ui.common.PlayContextImp;
import com.netflix.mediaclient.ui.details.NetflixRatingBar;
import com.netflix.mediaclient.util.StringUtils;
import com.netflix.mediaclient.util.ViewUtils;
import com.netflix.mediaclient.util.gfx.ImageLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlay, PlayerActivity, VideoWindowForPostplay, VideoWindowForPostplayFactory

public final class PostPlayForMovies extends PostPlay
{
    private class ChangeRecommendation
        implements android.view.View.OnTouchListener
    {

        private int selection;
        final PostPlayForMovies this$0;

        public boolean onTouch(View view, MotionEvent motionevent)
        {
            if (Log.isLoggable("nf_postplay", 3))
            {
                Log.d("nf_postplay", (new StringBuilder()).append("BoxArt touched: ").append(selection).toString());
            }
            if (mVideoFullScreen.getAndSet(false))
            {
                Log.d("nf_postplay", "Video was full size, scale down");
                executeTransitionIn();
            }
            if (mPostPlayVideos.size() > selection)
            {
                mSelected = selection;
                updateUi((PostPlayVideo)mPostPlayVideos.get(selection), selection);
                return true;
            } else
            {
                Log.e("nf_postplay", (new StringBuilder()).append("PostPlay not found for index ").append(selection).toString());
                return false;
            }
        }

        private ChangeRecommendation(int i)
        {
            this$0 = PostPlayForMovies.this;
            super();
            selection = i;
        }

    }


    private final int LIST_SIZE = 3;
    private View mBackgroundContainer;
    private com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener mImageLoaderListener;
    private View mMetadata;
    private List mPlayButtons;
    private NetflixRatingBar mRatingBar;
    private List mRecommendationBoxArts;
    private int mSelected;
    private TextView mVideoDetails;
    private AtomicBoolean mVideoFullScreen;
    private VideoWindowForPostplay mVideoWindow;

    public PostPlayForMovies(PlayerActivity playeractivity)
    {
        super(playeractivity);
        mRecommendationBoxArts = new ArrayList(3);
        mPlayButtons = new ArrayList(3);
        mSelected = -1;
        mVideoFullScreen = new AtomicBoolean(true);
        mImageLoaderListener = new com.netflix.mediaclient.util.gfx.ImageLoader.ImageLoaderListener() {

            final PostPlayForMovies this$0;

            public void onErrorResponse(String s)
            {
                if (Log.isLoggable("nf_postplay", 5))
                {
                    Log.w("nf_postplay", (new StringBuilder()).append("Image failed to be retrieved ").append(s).toString());
                }
            }

            public void onResponse(Bitmap bitmap, String s)
            {
                if (Log.isLoggable("nf_postplay", 3))
                {
                    Log.d("nf_postplay", (new StringBuilder()).append("Image retrieved ").append(s).toString());
                }
            }

            
            {
                this$0 = PostPlayForMovies.this;
                super();
            }
        };
        init();
    }

    private void addBoxArt(int i, int j)
    {
        AdvancedImageView advancedimageview = (AdvancedImageView)mContext.findViewById(i);
        mRecommendationBoxArts.add(advancedimageview);
        if (advancedimageview == null)
        {
            Log.e("nf_postplay", (new StringBuilder()).append("Image not found for index ").append(j).toString());
            return;
        } else
        {
            advancedimageview.setBackgroundResource(0x7f020063);
            advancedimageview.setOnTouchListener(new ChangeRecommendation(j));
            return;
        }
    }

    private void addPlayButton(int j, final int i)
    {
        View view = mContext.findViewById(j);
        mPlayButtons.add(view);
        if (view == null)
        {
            Log.e("nf_postplay", (new StringBuilder()).append("Play button not found for index ").append(i).toString());
            return;
        } else
        {
            view.setOnClickListener(new android.view.View.OnClickListener() {

                final PostPlayForMovies this$0;
                final int val$i;

                public void onClick(View view1)
                {
                    if (mSelected != i)
                    {
                        Log.e("nf_postplay", "This should NOT happen. This movie was NOT selected before");
                    }
                    handlePlayNow(false);
                }

            
            {
                this$0 = PostPlayForMovies.this;
                i = j;
                super();
            }
            });
            return;
        }
    }

    private void executeTransitionIn()
    {
        ViewUtils.setVisibility(mMetadata, true);
        ViewUtils.setVisibility(mPlayButton, true);
        if (mVideoWindow.canVideoVindowResize())
        {
            setBackgroundImageVisible(true);
        }
        mVideoWindow.animateIn();
    }

    private void executeTransitionOut()
    {
        mVideoWindow.animateOut(null);
        setBackgroundImageVisible(false);
        mVideoFullScreen.set(false);
    }

    private void init()
    {
        mVideoWindow = VideoWindowForPostplayFactory.createVideoWindow(mContext);
        addBoxArt(0x7f07017f, 0);
        addBoxArt(0x7f070181, 1);
        addBoxArt(0x7f070183, 2);
        addPlayButton(0x7f070180, 0);
        addPlayButton(0x7f070182, 1);
        addPlayButton(0x7f070184, 2);
    }

    private void updateUi(PostPlayVideo postplayvideo, int i)
    {
        if (postplayvideo != null)
        {
            String s1 = postplayvideo.getTitle();
            String s = s1;
            if (s1 == null)
            {
                s = "";
            }
            s1 = postplayvideo.getStoryUrl();
            String s2 = String.format(mContext.getResources().getString(0x7f0c01c2), new Object[] {
                s
            });
            if (!StringUtils.isEmpty(s1))
            {
                NetflixActivity.getImageLoader(mContext).showImg(mBackground, s1, com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, s2, true, true, 1);
            }
            int j = 0;
            while (j < 3) 
            {
                View view = (View)mPlayButtons.get(j);
                if (j == i)
                {
                    ViewUtils.setVisibility(view, com.netflix.mediaclient.util.ViewUtils.Visibility.VISIBLE);
                } else
                {
                    ViewUtils.setVisibility(view, com.netflix.mediaclient.util.ViewUtils.Visibility.GONE);
                }
                j++;
            }
            if (Log.isLoggable("nf_postplay", 3))
            {
                Log.d("nf_postplay", (new StringBuilder()).append("Title: ").append(s).toString());
            }
            if (mTitle != null)
            {
                mTitle.setText(s);
            }
            if (mSynopsis != null)
            {
                if (postplayvideo.getSynopsis() != null)
                {
                    mSynopsis.setText(postplayvideo.getSynopsis());
                } else
                {
                    mSynopsis.setText("");
                }
            }
            if (Log.isLoggable("nf_postplay", 3))
            {
                Log.d("nf_postplay", (new StringBuilder()).append("Synopsis: ").append(postplayvideo.getSynopsis()).toString());
            }
            if (mRatingBar != null)
            {
                mRatingBar.setDetails(postplayvideo);
            }
            if (mVideoDetails != null)
            {
                mVideoDetails.setText(StringUtils.getBasicInfoString(mContext, postplayvideo));
                return;
            }
        }
    }

    protected void doTransitionToPostPlay()
    {
        if (mPostPlayDismissed)
        {
            Log.d("nf_postplay", "Second time postplay");
            executeTransitionIn();
            mVideoWindow.setVisible(false);
            return;
        } else
        {
            Log.d("nf_postplay", "First time postplay");
            return;
        }
    }

    public void endOfPlay()
    {
        super.endOfPlay();
        mVideoWindow.setVisible(false);
        if (mSelected < 0)
        {
            mSelected = 0;
        }
        updateUi((PostPlayVideo)mPostPlayVideos.get(mSelected), mSelected);
        setBackgroundImageVisible(true);
        ViewUtils.setVisibility(mMetadata, true);
        ViewUtils.setVisibility(mPlayButton, true);
    }

    void findViews()
    {
        mRatingBar = (NetflixRatingBar)mContext.findViewById(0x7f07017e);
        mVideoDetails = (TextView)mContext.findViewById(0x7f07017d);
        mBackgroundContainer = mContext.findViewById(0x7f070185);
        mMetadata = mContext.findViewById(0x7f07017c);
    }

    protected void handlePlayNow(boolean flag)
    {
        Log.d("nf_postplay", "Play recommendation");
        if (mSelected < 0)
        {
            Log.e("nf_postplay", "Error state, movie was not selected");
        } else
        {
            PostPlayVideo postplayvideo = (PostPlayVideo)mPostPlayVideos.get(mSelected);
            if (postplayvideo != null)
            {
                PlayContextImp playcontextimp = new PlayContextImp(postplayvideo.getPostPlayRequestId(), postplayvideo.getPostPlayTrackId(), 0, 0);
                mContext.playNextVideo(postplayvideo, playcontextimp, flag);
                return;
            }
        }
    }

    public void init(String s)
    {
        if (mContext.isTablet())
        {
            Log.d("nf_postplay", "Fetch data for tablet only");
            super.init(s);
            return;
        } else
        {
            Log.d("nf_postplay", "Fetch data for tablet only, skip for phone");
            return;
        }
    }

    protected boolean isPostPlayEnabled()
    {
        return super.isPostPlayEnabled() && mContext.isTablet();
    }

    public void postPlayDismissed()
    {
        super.postPlayDismissed();
        executeTransitionOut();
    }

    public void setBackgroundImageVisible(boolean flag)
    {
label0:
        {
            if (mBackgroundContainer != null)
            {
                if (!flag)
                {
                    break label0;
                }
                mBackgroundContainer.setVisibility(0);
            }
            return;
        }
        mBackgroundContainer.setVisibility(4);
    }

    protected void updateOnPostPlayVideosFetched(List list)
    {
        if (list == null || list.size() < 1)
        {
            Log.e("nf_postplay", "We do not have any data! Do nothing!");
        } else
        {
            int i = 0;
            while (i < list.size()) 
            {
                PostPlayVideo postplayvideo = (PostPlayVideo)list.get(i);
                if (postplayvideo != null)
                {
                    Object obj = (AdvancedImageView)mRecommendationBoxArts.get(i);
                    if (obj != null)
                    {
                        ((AdvancedImageView) (obj)).setVisibility(0);
                        String s = postplayvideo.getTitle();
                        obj = s;
                        if (s == null)
                        {
                            obj = "";
                        }
                        if (postplayvideo.getStoryUrl() != null)
                        {
                            NetflixActivity.getImageLoader(mContext).getImg(postplayvideo.getStoryUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, 1920, 1080, mImageLoaderListener);
                        }
                        obj = String.format(mContext.getResources().getString(0x7f0c01c2), new Object[] {
                            obj
                        });
                        if (postplayvideo.getHighResolutionLandscapeBoxArtUrl() != null)
                        {
                            NetflixActivity.getImageLoader(mContext).showImg((AdvancedImageView)mRecommendationBoxArts.get(i), postplayvideo.getHighResolutionLandscapeBoxArtUrl(), com.netflix.mediaclient.servicemgr.IClientLogging.AssetType.merchStill, ((String) (obj)), true, true, 1);
                        }
                    }
                } else
                {
                    ((AdvancedImageView)mRecommendationBoxArts.get(i)).setVisibility(8);
                }
                i++;
            }
        }
    }



/*
    static int access$102(PostPlayForMovies postplayformovies, int i)
    {
        postplayformovies.mSelected = i;
        return i;
    }

*/



}
