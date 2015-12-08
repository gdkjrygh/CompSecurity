// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.dialog.video;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.MediaRouteControllerDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.common.images.WebImage;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.callbacks.VideoCastConsumerImpl;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import java.util.List;

public class VideoMediaRouteControllerDialog extends MediaRouteControllerDialog
{

    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/dialog/video/VideoMediaRouteControllerDialog);
    private VideoCastConsumerImpl mCastConsumerImpl;
    private VideoCastManager mCastManager;
    private Context mContext;
    private TextView mEmptyText;
    private FetchBitmapTask mFetchBitmap;
    private ImageView mIcon;
    private View mIconContainer;
    private Uri mIconUri;
    private ProgressBar mLoading;
    private Drawable mPauseDrawable;
    private ImageView mPausePlay;
    private Drawable mPlayDrawable;
    protected int mState;
    private Drawable mStopDrawable;
    private int mStreamType;
    private TextView mSubTitle;
    private View mTextContainer;
    private TextView mTitle;

    public VideoMediaRouteControllerDialog(Context context)
    {
        super(context, com.google.android.libraries.cast.companionlibrary.R.style.CCLCastDialog);
        try
        {
            mContext = context;
            mCastManager = VideoCastManager.getInstance();
            mState = mCastManager.getPlaybackStatus();
            mCastConsumerImpl = new _cls1();
            mCastManager.addVideoCastConsumer(mCastConsumerImpl);
            mPauseDrawable = context.getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_media_route_controller_pause);
            mPlayDrawable = context.getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_media_route_controller_play);
            mStopDrawable = context.getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_media_route_controller_stop);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            LogUtils.LOGE(TAG, "Failed to update the content of dialog", context);
        }
    }

    public VideoMediaRouteControllerDialog(Context context, int i)
    {
        super(context, i);
    }

    private void adjustControlsVisibility(boolean flag)
    {
        boolean flag1 = false;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        mPausePlay.setVisibility(i);
        if (!flag)
        {
            flag1 = true;
        }
        setLoadingVisibility(flag1);
    }

    private Drawable getPauseStopDrawable()
    {
        switch (mStreamType)
        {
        default:
            return mPauseDrawable;

        case 1: // '\001'
            return mPauseDrawable;

        case 2: // '\002'
            return mStopDrawable;
        }
    }

    private void hideControls(boolean flag, int i)
    {
        boolean flag1 = false;
        TextView textview;
        byte byte0;
        int j;
        if (flag)
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        mIcon.setVisibility(byte0);
        mIconContainer.setVisibility(byte0);
        mTextContainer.setVisibility(byte0);
        textview = mEmptyText;
        j = i;
        if (i == 0)
        {
            j = com.google.android.libraries.cast.companionlibrary.R.string.ccl_no_media_info;
        }
        textview.setText(j);
        textview = mEmptyText;
        if (flag)
        {
            i = ((flag1) ? 1 : 0);
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
        if (flag)
        {
            mPausePlay.setVisibility(byte0);
        }
    }

    private void loadViews(View view)
    {
        mIcon = (ImageView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.iconView);
        mIconContainer = view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.iconContainer);
        mTextContainer = view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.textContainer);
        mPausePlay = (ImageView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.playPauseView);
        mTitle = (TextView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.titleView);
        mSubTitle = (TextView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.subTitleView);
        mLoading = (ProgressBar)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.loadingView);
        mEmptyText = (TextView)view.findViewById(com.google.android.libraries.cast.companionlibrary.R.id.emptyView);
    }

    private void onMediaCellClick()
    {
        mCastManager.onMediaRouteDialogCellClick(mContext);
        cancel();
    }

    private void setLoadingVisibility(boolean flag)
    {
        ProgressBar progressbar = mLoading;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        progressbar.setVisibility(i);
    }

    private void setUpCallbacks()
    {
        mPausePlay.setOnClickListener(new _cls3());
        mIcon.setOnClickListener(new _cls4());
        mTextContainer.setOnClickListener(new _cls5());
    }

    private void showTargetActivity()
    {
        if (mCastManager == null || mCastManager.getTargetActivity() == null) goto _L2; else goto _L1
_L1:
        mCastManager.onTargetActivityInvoked(mContext);
_L4:
        cancel();
_L2:
        return;
        Object obj;
        obj;
_L5:
        LogUtils.LOGE(TAG, "Failed to start the target activity due to network issues", ((Throwable) (obj)));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
          goto _L5
    }

    private void updateMetadata()
    {
        Object obj;
        try
        {
            obj = mCastManager.getRemoteMediaInformation();
            break MISSING_BLOCK_LABEL_8;
        }
        catch (TransientNetworkDisconnectionException transientnetworkdisconnectionexception) { }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        hideControls(true, com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection_short);
        return;
        if (obj == null)
        {
            hideControls(true, com.google.android.libraries.cast.companionlibrary.R.string.ccl_no_media_info);
            return;
        }
        mStreamType = ((m) (obj)).b;
        hideControls(false, 0);
        obj = ((m) (obj)).d;
        mTitle.setText(((n) (obj)).a("com.google.android.gms.cast.metadata.ARTIST"));
        mSubTitle.setText(((n) (obj)).a("com.google.android.gms.cast.metadata.TITLE"));
        if (((n) (obj)).b())
        {
            obj = ((WebImage)((n) (obj)).a.get(0)).getUrl();
        } else
        {
            obj = null;
        }
        setIcon(((Uri) (obj)));
        return;
    }

    private void updatePlayPauseState(int i)
    {
label0:
        {
label1:
            {
label2:
                {
label3:
                    {
                        if (mPausePlay != null)
                        {
                            switch (i)
                            {
                            default:
                                mPausePlay.setVisibility(4);
                                setLoadingVisibility(false);
                                break;

                            case 1: // '\001'
                                break label1;

                            case 2: // '\002'
                                break label3;

                            case 3: // '\003'
                                break label2;

                            case 4: // '\004'
                                break label0;
                            }
                        }
                        return;
                    }
                    mPausePlay.setImageDrawable(getPauseStopDrawable());
                    adjustControlsVisibility(true);
                    return;
                }
                mPausePlay.setImageDrawable(mPlayDrawable);
                adjustControlsVisibility(true);
                return;
            }
            mPausePlay.setVisibility(4);
            setLoadingVisibility(false);
            if (mState == 1 && mCastManager.getIdleReason() == 1)
            {
                hideControls(true, com.google.android.libraries.cast.companionlibrary.R.string.ccl_no_media_info);
                return;
            }
            switch (mStreamType)
            {
            default:
                return;

            case 1: // '\001'
                mPausePlay.setVisibility(4);
                setLoadingVisibility(false);
                return;

            case 2: // '\002'
                break;
            }
            if (mCastManager.getIdleReason() == 2)
            {
                mPausePlay.setImageDrawable(mPlayDrawable);
                adjustControlsVisibility(true);
                return;
            } else
            {
                mPausePlay.setVisibility(4);
                setLoadingVisibility(false);
                return;
            }
        }
        adjustControlsVisibility(false);
    }

    public View onCreateMediaControlView(Bundle bundle)
    {
        bundle = getLayoutInflater().inflate(com.google.android.libraries.cast.companionlibrary.R.layout.custom_media_route_controller_controls_dialog, null);
        loadViews(bundle);
        mState = mCastManager.getPlaybackStatus();
        updateMetadata();
        updatePlayPauseState(mState);
        setUpCallbacks();
        return bundle;
    }

    protected void onStop()
    {
        if (mCastManager != null)
        {
            mCastManager.removeVideoCastConsumer(mCastConsumerImpl);
            mCastManager = null;
        }
        if (mFetchBitmap != null)
        {
            mFetchBitmap.cancel(true);
            mFetchBitmap = null;
        }
        super.onStop();
    }

    public void setIcon(Uri uri)
    {
        if (mIconUri != null && mIconUri.equals(uri))
        {
            return;
        }
        mIconUri = uri;
        if (uri == null)
        {
            uri = BitmapFactory.decodeResource(mContext.getResources(), com.google.android.libraries.cast.companionlibrary.R.drawable.album_art_placeholder);
            mIcon.setImageBitmap(uri);
            return;
        }
        if (mFetchBitmap != null)
        {
            mFetchBitmap.cancel(true);
        }
        mFetchBitmap = new _cls2();
        mFetchBitmap.execute(mIconUri);
    }








/*
    static FetchBitmapTask access$402(VideoMediaRouteControllerDialog videomediaroutecontrollerdialog, FetchBitmapTask fetchbitmaptask)
    {
        videomediaroutecontrollerdialog.mFetchBitmap = fetchbitmaptask;
        return fetchbitmaptask;
    }

*/




    private class _cls1 extends VideoCastConsumerImpl
    {

        final VideoMediaRouteControllerDialog this$0;

        public void onRemoteMediaPlayerMetadataUpdated()
        {
            updateMetadata();
        }

        public void onRemoteMediaPlayerStatusUpdated()
        {
            mState = mCastManager.getPlaybackStatus();
            updatePlayPauseState(mState);
        }

        _cls1()
        {
            this$0 = VideoMediaRouteControllerDialog.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final VideoMediaRouteControllerDialog this$0;

        public void onClick(View view)
        {
            if (mCastManager == null)
            {
                return;
            }
            try
            {
                adjustControlsVisibility(false);
                mCastManager.togglePlayback();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                adjustControlsVisibility(true);
                LogUtils.LOGE(VideoMediaRouteControllerDialog.TAG, "Failed to toggle playback", view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            adjustControlsVisibility(true);
            LogUtils.LOGE(VideoMediaRouteControllerDialog.TAG, "Failed to toggle playback due to network issues", view);
        }

        _cls3()
        {
            this$0 = VideoMediaRouteControllerDialog.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final VideoMediaRouteControllerDialog this$0;

        public void onClick(View view)
        {
            onMediaCellClick();
        }

        _cls4()
        {
            this$0 = VideoMediaRouteControllerDialog.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final VideoMediaRouteControllerDialog this$0;

        public void onClick(View view)
        {
            onMediaCellClick();
        }

        _cls5()
        {
            this$0 = VideoMediaRouteControllerDialog.this;
            super();
        }
    }


    private class _cls2 extends FetchBitmapTask
    {

        final VideoMediaRouteControllerDialog this$0;

        protected void onPostExecute(Bitmap bitmap)
        {
            mIcon.setImageBitmap(bitmap);
            if (this == mFetchBitmap)
            {
                mFetchBitmap = null;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        _cls2()
        {
            this$0 = VideoMediaRouteControllerDialog.this;
            super();
        }
    }

}
