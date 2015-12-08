// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.widgets;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.cast.m;
import com.google.android.gms.cast.n;
import com.google.android.gms.cast.o;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.OnFailedListener;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.widgets:
//            IMiniController

public class MiniController extends RelativeLayout
    implements IMiniController
{
    public static interface OnMiniControllerChangedListener
        extends OnFailedListener
    {

        public abstract void onPlayPauseClicked(View view)
            throws CastException, TransientNetworkDisconnectionException, NoConnectionException;

        public abstract void onTargetActivityInvoked(Context context)
            throws TransientNetworkDisconnectionException, NoConnectionException;

        public abstract void onUpcomingPlayClicked(View view, o o1);

        public abstract void onUpcomingStopClicked(View view, o o1);
    }


    public static final int UNDEFINED_STATUS_CODE = -1;
    private FetchBitmapTask mFetchBitmapTask;
    private FetchBitmapTask mFetchUpcomingBitmapTask;
    private Handler mHandler;
    protected ImageView mIcon;
    private Uri mIconUri;
    private OnMiniControllerChangedListener mListener;
    protected ProgressBar mLoading;
    private View mMainContainer;
    private Drawable mPauseDrawable;
    private Drawable mPlayDrawable;
    protected ImageView mPlayPause;
    private ProgressBar mProgressBar;
    private Drawable mStopDrawable;
    private int mStreamType;
    protected TextView mSubTitle;
    protected TextView mTitle;
    private View mUpcomingContainer;
    private ImageView mUpcomingIcon;
    private Uri mUpcomingIconUri;
    private o mUpcomingItem;
    private View mUpcomingPlay;
    private View mUpcomingStop;
    private TextView mUpcomingTitle;

    public MiniController(Context context)
    {
        super(context);
        mStreamType = 1;
        loadViews();
    }

    public MiniController(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        mStreamType = 1;
        LayoutInflater.from(context).inflate(com.google.android.libraries.cast.companionlibrary.R.layout.mini_controller, this);
        mPauseDrawable = getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_mini_controller_pause);
        mPlayDrawable = getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_mini_controller_play);
        mStopDrawable = getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_mini_controller_stop);
        mHandler = new Handler();
        loadViews();
        setUpCallbacks();
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

    private void loadViews()
    {
        mIcon = (ImageView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.icon_view);
        mTitle = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.title_view);
        mSubTitle = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.subtitle_view);
        mPlayPause = (ImageView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.play_pause);
        mLoading = (ProgressBar)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.loading_view);
        mMainContainer = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.container_current);
        mProgressBar = (ProgressBar)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.progressBar);
        mUpcomingIcon = (ImageView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.icon_view_upcoming);
        mUpcomingTitle = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.title_view_upcoming);
        mUpcomingContainer = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.container_upcoming);
        mUpcomingPlay = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.play_upcoming);
        mUpcomingStop = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.stop_upcoming);
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
        mPlayPause.setOnClickListener(new _cls2());
        mMainContainer.setOnClickListener(new _cls3());
        mUpcomingPlay.setOnClickListener(new _cls4());
        mUpcomingStop.setOnClickListener(new _cls5());
    }

    private void setUpcomingIcon(Bitmap bitmap)
    {
        mUpcomingIcon.setImageBitmap(bitmap);
    }

    private void setUpcomingIcon(Uri uri)
    {
        if (mUpcomingIconUri != null && mUpcomingIconUri.equals(uri))
        {
            return;
        }
        mUpcomingIconUri = uri;
        if (mFetchUpcomingBitmapTask != null)
        {
            mFetchUpcomingBitmapTask.cancel(true);
        }
        mFetchUpcomingBitmapTask = new _cls7();
        mFetchUpcomingBitmapTask.execute(uri);
    }

    private void setUpcomingTitle(String s)
    {
        mUpcomingTitle.setText(s);
    }

    public boolean isVisible()
    {
        return isShown();
    }

    protected void onDetachedFromWindow()
    {
        super.onDetachedFromWindow();
        if (mFetchBitmapTask != null)
        {
            mFetchBitmapTask.cancel(true);
            mFetchBitmapTask = null;
        }
    }

    public void removeOnMiniControllerChangedListener(OnMiniControllerChangedListener onminicontrollerchangedlistener)
    {
        if (onminicontrollerchangedlistener != null && mListener == onminicontrollerchangedlistener)
        {
            mListener = null;
        }
    }

    public void setCurrentVisibility(boolean flag)
    {
        View view = mMainContainer;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
    }

    public final void setIcon(Bitmap bitmap)
    {
        mIcon.setImageBitmap(bitmap);
    }

    public void setIcon(Uri uri)
    {
        if (mIconUri != null && mIconUri.equals(uri))
        {
            return;
        }
        mIconUri = uri;
        if (mFetchBitmapTask != null)
        {
            mFetchBitmapTask.cancel(true);
        }
        mFetchBitmapTask = new _cls6();
        mFetchBitmapTask.execute(uri);
    }

    public void setOnMiniControllerChangedListener(OnMiniControllerChangedListener onminicontrollerchangedlistener)
    {
        if (onminicontrollerchangedlistener != null)
        {
            mListener = onminicontrollerchangedlistener;
        }
    }

    public void setPlaybackStatus(int i, int j)
    {
        switch (i)
        {
        default:
            mPlayPause.setVisibility(4);
            setLoadingVisibility(false);
            return;

        case 2: // '\002'
            mPlayPause.setVisibility(0);
            mPlayPause.setImageDrawable(getPauseStopDrawable());
            setLoadingVisibility(false);
            return;

        case 3: // '\003'
            mPlayPause.setVisibility(0);
            mPlayPause.setImageDrawable(mPlayDrawable);
            setLoadingVisibility(false);
            return;

        case 1: // '\001'
            switch (mStreamType)
            {
            default:
                return;

            case 1: // '\001'
                mPlayPause.setVisibility(4);
                setLoadingVisibility(false);
                return;

            case 2: // '\002'
                break;
            }
            if (j == 2)
            {
                mPlayPause.setVisibility(0);
                mPlayPause.setImageDrawable(mPlayDrawable);
                setLoadingVisibility(false);
                return;
            } else
            {
                mPlayPause.setVisibility(4);
                setLoadingVisibility(false);
                return;
            }

        case 4: // '\004'
            mPlayPause.setVisibility(4);
            setLoadingVisibility(true);
            return;
        }
    }

    public void setProgress(final int progress, final int duration)
    {
        if (mStreamType == 2 || mProgressBar == null)
        {
            return;
        } else
        {
            mHandler.post(new _cls1());
            return;
        }
    }

    public void setProgressVisibility(boolean flag)
    {
        if (mProgressBar == null)
        {
            return;
        }
        ProgressBar progressbar = mProgressBar;
        int i;
        if (flag && mStreamType != 2)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        progressbar.setVisibility(i);
    }

    public void setStreamType(int i)
    {
        mStreamType = i;
    }

    public void setSubtitle(String s)
    {
        mSubTitle.setText(s);
    }

    public void setTitle(String s)
    {
        mTitle.setText(s);
    }

    public void setUpcomingItem(o o1)
    {
        mUpcomingItem = o1;
        if (o1 != null)
        {
            o1 = o1.a;
            if (o1 != null)
            {
                setUpcomingTitle(((m) (o1)).d.a("com.google.android.gms.cast.metadata.TITLE"));
                setUpcomingIcon(Utils.getImageUri(o1, 0));
            }
            return;
        } else
        {
            setUpcomingTitle("");
            setUpcomingIcon(((Uri) (null)));
            return;
        }
    }

    public void setUpcomingVisibility(boolean flag)
    {
        boolean flag1 = false;
        View view = mUpcomingContainer;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        view.setVisibility(i);
        if (!flag)
        {
            flag1 = true;
        }
        setProgressVisibility(flag1);
    }







/*
    static FetchBitmapTask access$402(MiniController minicontroller, FetchBitmapTask fetchbitmaptask)
    {
        minicontroller.mFetchBitmapTask = fetchbitmaptask;
        return fetchbitmaptask;
    }

*/




/*
    static FetchBitmapTask access$602(MiniController minicontroller, FetchBitmapTask fetchbitmaptask)
    {
        minicontroller.mFetchUpcomingBitmapTask = fetchbitmaptask;
        return fetchbitmaptask;
    }

*/

    private class _cls2
        implements android.view.View.OnClickListener
    {

        final MiniController this$0;

        public void onClick(View view)
        {
            if (mListener == null)
            {
                break MISSING_BLOCK_LABEL_31;
            }
            setLoadingVisibility(true);
            mListener.onPlayPauseClicked(view);
            return;
            view;
            mListener.onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_perform_action, -1);
            return;
            view;
            mListener.onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection_trans, -1);
            return;
            view;
            mListener.onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection, -1);
            return;
        }

        _cls2()
        {
            this$0 = MiniController.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final MiniController this$0;

        public void onClick(View view)
        {
            if (mListener == null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            setLoadingVisibility(false);
            mListener.onTargetActivityInvoked(mIcon.getContext());
            return;
            view;
            mListener.onFailed(com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_perform_action, -1);
            return;
        }

        _cls3()
        {
            this$0 = MiniController.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final MiniController this$0;

        public void onClick(View view)
        {
            if (mListener != null)
            {
                mListener.onUpcomingPlayClicked(view, mUpcomingItem);
            }
        }

        _cls4()
        {
            this$0 = MiniController.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final MiniController this$0;

        public void onClick(View view)
        {
            if (mListener != null)
            {
                mListener.onUpcomingStopClicked(view, mUpcomingItem);
            }
        }

        _cls5()
        {
            this$0 = MiniController.this;
            super();
        }
    }


    private class _cls7 extends FetchBitmapTask
    {

        final MiniController this$0;

        protected void onPostExecute(Bitmap bitmap)
        {
            Bitmap bitmap1 = bitmap;
            if (bitmap == null)
            {
                bitmap1 = BitmapFactory.decodeResource(getResources(), com.google.android.libraries.cast.companionlibrary.R.drawable.album_art_placeholder);
            }
            setUpcomingIcon(bitmap1);
            if (this == mFetchUpcomingBitmapTask)
            {
                mFetchUpcomingBitmapTask = null;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        _cls7()
        {
            this$0 = MiniController.this;
            super();
        }
    }


    private class _cls6 extends FetchBitmapTask
    {

        final MiniController this$0;

        protected void onPostExecute(Bitmap bitmap)
        {
            Bitmap bitmap1 = bitmap;
            if (bitmap == null)
            {
                bitmap1 = BitmapFactory.decodeResource(getResources(), com.google.android.libraries.cast.companionlibrary.R.drawable.album_art_placeholder);
            }
            setIcon(bitmap1);
            if (this == mFetchBitmapTask)
            {
                mFetchBitmapTask = null;
            }
        }

        protected volatile void onPostExecute(Object obj)
        {
            onPostExecute((Bitmap)obj);
        }

        _cls6()
        {
            this$0 = MiniController.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final MiniController this$0;
        final int val$duration;
        final int val$progress;

        public void run()
        {
            mProgressBar.setMax(duration);
            mProgressBar.setProgress(progress);
        }

        _cls1()
        {
            this$0 = MiniController.this;
            duration = i;
            progress = j;
            super();
        }
    }

}
