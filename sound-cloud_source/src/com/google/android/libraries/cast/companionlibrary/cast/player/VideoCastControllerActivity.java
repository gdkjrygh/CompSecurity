// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.cast.player;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.SeekBar;
import android.widget.TextView;
import com.google.android.libraries.cast.companionlibrary.cast.VideoCastManager;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.tracks.ui.TracksChooserDialog;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;
import com.google.android.libraries.cast.companionlibrary.widgets.MiniController;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.cast.player:
//            VideoCastController, VideoCastControllerFragment, OnVideoCastControllerListener

public class VideoCastControllerActivity extends ActionBarActivity
    implements VideoCastController
{

    public static final String DIALOG_TAG = "dialog";
    private static final String TAG = LogUtils.makeLogTag(com/google/android/libraries/cast/companionlibrary/cast/player/VideoCastControllerActivity);
    public static final String TASK_TAG = "task";
    private VideoCastManager mCastManager;
    private ImageButton mClosedCaptionIcon;
    private View mControllers;
    private TextView mEnd;
    private TextView mLine2;
    private OnVideoCastControllerListener mListener;
    private TextView mLiveText;
    private ProgressBar mLoading;
    private MiniController mMini;
    private int mNextPreviousVisibilityPolicy;
    private View mPageView;
    private Drawable mPauseDrawable;
    private Drawable mPlayDrawable;
    private ImageButton mPlayPause;
    private View mPlaybackControls;
    private SeekBar mSeekbar;
    private ImageButton mSkipNext;
    private ImageButton mSkipPrevious;
    private TextView mStart;
    private Drawable mStopDrawable;
    private int mStreamType;
    private Toolbar mToolbar;
    private double mVolumeIncrement;

    public VideoCastControllerActivity()
    {
        mNextPreviousVisibilityPolicy = 2;
    }

    private void loadAndSetupViews()
    {
        mPauseDrawable = getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_pause_circle_white_80dp);
        mPlayDrawable = getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_play_circle_white_80dp);
        mStopDrawable = getResources().getDrawable(com.google.android.libraries.cast.companionlibrary.R.drawable.ic_stop_circle_white_80dp);
        mPageView = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.pageview);
        mPlayPause = (ImageButton)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.play_pause_toggle);
        mLiveText = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.live_text);
        mStart = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.start_text);
        mEnd = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.end_text);
        mSeekbar = (SeekBar)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.seekbar);
        mLine2 = (TextView)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.textview2);
        mLoading = (ProgressBar)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.progressbar1);
        mControllers = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.controllers);
        mClosedCaptionIcon = (ImageButton)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.cc);
        mSkipNext = (ImageButton)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.next);
        mSkipPrevious = (ImageButton)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.previous);
        mPlaybackControls = findViewById(com.google.android.libraries.cast.companionlibrary.R.id.playback_controls);
        mMini = (MiniController)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.miniController1);
        mMini.setCurrentVisibility(false);
        setClosedCaptionState(2);
        mPlayPause.setOnClickListener(new _cls1());
        mSeekbar.setOnSeekBarChangeListener(new _cls2());
        mClosedCaptionIcon.setOnClickListener(new _cls3());
        mSkipNext.setOnClickListener(new _cls4());
        mSkipPrevious.setOnClickListener(new _cls5());
    }

    private void setUpActionBar(String s)
    {
        mToolbar = (Toolbar)findViewById(com.google.android.libraries.cast.companionlibrary.R.id.toolbar);
        setSupportActionBar(mToolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    private void showTracksChooserDialog()
        throws TransientNetworkDisconnectionException, NoConnectionException
    {
        FragmentTransaction fragmenttransaction = getSupportFragmentManager().beginTransaction();
        android.support.v4.app.Fragment fragment = getSupportFragmentManager().findFragmentByTag("dialog");
        if (fragment != null)
        {
            fragmenttransaction.remove(fragment);
        }
        fragmenttransaction.addToBackStack(null);
        TracksChooserDialog.newInstance(mCastManager.getRemoteMediaInformation()).show(fragmenttransaction, "dialog");
    }

    public void adjustControllersForLiveStream(boolean flag)
    {
        int i = 0;
        TextView textview;
        byte byte0;
        if (flag)
        {
            byte0 = 4;
        } else
        {
            byte0 = 0;
        }
        textview = mLiveText;
        if (!flag)
        {
            i = 4;
        }
        textview.setVisibility(i);
        mStart.setVisibility(byte0);
        mEnd.setVisibility(byte0);
        mSeekbar.setVisibility(byte0);
    }

    public void closeActivity()
    {
        finish();
    }

    public boolean dispatchKeyEvent(KeyEvent keyevent)
    {
        return mCastManager.onDispatchVolumeKeyEvent(keyevent, mVolumeIncrement) || super.dispatchKeyEvent(keyevent);
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setContentView(com.google.android.libraries.cast.companionlibrary.R.layout.cast_activity);
        loadAndSetupViews();
        mCastManager = VideoCastManager.getInstance();
        mVolumeIncrement = mCastManager.getVolumeStep();
        Object obj = getIntent().getExtras();
        if (obj == null)
        {
            finish();
            return;
        }
        setUpActionBar(((Bundle) (obj)).getBundle("media").getString("com.google.android.gms.cast.metadata.TITLE"));
        bundle = getSupportFragmentManager();
        VideoCastControllerFragment videocastcontrollerfragment = (VideoCastControllerFragment)bundle.findFragmentByTag("task");
        if (videocastcontrollerfragment == null)
        {
            obj = VideoCastControllerFragment.newInstance(((Bundle) (obj)));
            bundle.beginTransaction().add(((android.support.v4.app.Fragment) (obj)), "task").commit();
            mListener = ((OnVideoCastControllerListener) (obj));
            setOnVideoCastControllerChangedListener(mListener);
            return;
        } else
        {
            mListener = videocastcontrollerfragment;
            mListener.onConfigurationChanged();
            return;
        }
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(com.google.android.libraries.cast.companionlibrary.R.menu.cast_player_menu, menu);
        mCastManager.addMediaRouterButton(menu, com.google.android.libraries.cast.companionlibrary.R.id.media_route_menu_item);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() == 0x102002c)
        {
            finish();
        }
        return true;
    }

    protected void onPause()
    {
        mCastManager.removeMiniController(mMini);
        super.onPause();
    }

    public void onQueueItemsUpdated(int i, int j)
    {
        boolean flag;
        if (j > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (j < i - 1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        switch (mNextPreviousVisibilityPolicy)
        {
        default:
            LogUtils.LOGE(TAG, "onQueueItemsUpdated(): Invalid NextPreviousPolicy has been set");
            return;

        case 1: // '\001'
            if (i != 0)
            {
                mSkipNext.setVisibility(0);
                mSkipNext.setEnabled(true);
            } else
            {
                mSkipNext.setVisibility(4);
            }
            if (flag)
            {
                mSkipPrevious.setVisibility(0);
                mSkipPrevious.setEnabled(true);
                return;
            } else
            {
                mSkipPrevious.setVisibility(4);
                return;
            }

        case 3: // '\003'
            mSkipNext.setVisibility(0);
            mSkipNext.setEnabled(true);
            mSkipPrevious.setVisibility(0);
            mSkipPrevious.setEnabled(true);
            return;

        case 2: // '\002'
            break;
        }
        if (i != 0)
        {
            mSkipNext.setVisibility(0);
            mSkipNext.setEnabled(true);
        } else
        {
            mSkipNext.setVisibility(0);
            mSkipNext.setEnabled(false);
        }
        if (flag)
        {
            mSkipPrevious.setVisibility(0);
            mSkipPrevious.setEnabled(true);
            return;
        } else
        {
            mSkipPrevious.setVisibility(0);
            mSkipPrevious.setEnabled(false);
            return;
        }
    }

    protected void onResume()
    {
        super.onResume();
        mCastManager.addMiniController(mMini);
    }

    public void setClosedCaptionState(int i)
    {
        switch (i)
        {
        default:
            LogUtils.LOGE(TAG, (new StringBuilder("setClosedCaptionState(): Invalid state requested: ")).append(i).toString());
            return;

        case 1: // '\001'
            mClosedCaptionIcon.setVisibility(0);
            mClosedCaptionIcon.setEnabled(true);
            return;

        case 2: // '\002'
            mClosedCaptionIcon.setVisibility(0);
            mClosedCaptionIcon.setEnabled(false);
            return;

        case 3: // '\003'
            mClosedCaptionIcon.setVisibility(8);
            break;
        }
    }

    public void setImage(Bitmap bitmap)
    {
label0:
        {
            if (bitmap != null)
            {
                if (!(mPageView instanceof ImageView))
                {
                    break label0;
                }
                ((ImageView)mPageView).setImageBitmap(bitmap);
            }
            return;
        }
        mPageView.setBackgroundDrawable(new BitmapDrawable(getResources(), bitmap));
    }

    public void setNextPreviousVisibilityPolicy(int i)
    {
        mNextPreviousVisibilityPolicy = i;
    }

    public void setOnVideoCastControllerChangedListener(OnVideoCastControllerListener onvideocastcontrollerlistener)
    {
    }

    public void setPlaybackStatus(int i)
    {
        LogUtils.LOGD(TAG, (new StringBuilder("setPlaybackStatus(): state = ")).append(i).toString());
        switch (i)
        {
        default:
            return;

        case 2: // '\002'
            mLoading.setVisibility(4);
            mPlaybackControls.setVisibility(0);
            if (mStreamType == 2)
            {
                mPlayPause.setImageDrawable(mStopDrawable);
            } else
            {
                mPlayPause.setImageDrawable(mPauseDrawable);
            }
            mLine2.setText(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
                mCastManager.getDeviceName()
            }));
            mControllers.setVisibility(0);
            return;

        case 3: // '\003'
            mControllers.setVisibility(0);
            mLoading.setVisibility(4);
            mPlaybackControls.setVisibility(0);
            mPlayPause.setImageDrawable(mPlayDrawable);
            mLine2.setText(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
                mCastManager.getDeviceName()
            }));
            return;

        case 1: // '\001'
            mLoading.setVisibility(4);
            mPlayPause.setImageDrawable(mPlayDrawable);
            mPlaybackControls.setVisibility(0);
            mLine2.setText(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_casting_to_device, new Object[] {
                mCastManager.getDeviceName()
            }));
            return;

        case 4: // '\004'
            mPlaybackControls.setVisibility(4);
            mLoading.setVisibility(0);
            mLine2.setText(getString(com.google.android.libraries.cast.companionlibrary.R.string.ccl_loading));
            return;
        }
    }

    public void setStreamType(int i)
    {
        mStreamType = i;
    }

    public void setSubTitle(String s)
    {
        mLine2.setText(s);
    }

    public void setTitle(String s)
    {
        mToolbar.setTitle(s);
    }

    public void showLoading(boolean flag)
    {
        ProgressBar progressbar = mLoading;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        progressbar.setVisibility(i);
    }

    public void updateControllersStatus(boolean flag)
    {
        boolean flag1 = false;
        View view = mControllers;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 4;
        }
        view.setVisibility(i);
        if (flag)
        {
            flag = flag1;
            if (mStreamType == 2)
            {
                flag = true;
            }
            adjustControllersForLiveStream(flag);
        }
    }

    public void updateSeekbar(int i, int j)
    {
        mSeekbar.setProgress(i);
        mSeekbar.setMax(j);
        mStart.setText(Utils.formatMillis(i));
        mEnd.setText(Utils.formatMillis(j));
    }






    private class _cls1
        implements android.view.View.OnClickListener
    {

        final VideoCastControllerActivity this$0;

        public void onClick(View view)
        {
            try
            {
                mListener.onPlayPauseClicked(view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to toggle playback due to temporary network issue", view);
                Utils.showToast(VideoCastControllerActivity.this, com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection_trans);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to toggle playback due to network issues", view);
                Utils.showToast(VideoCastControllerActivity.this, com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_no_connection);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to toggle playback due to other issues", view);
            }
            Utils.showToast(VideoCastControllerActivity.this, com.google.android.libraries.cast.companionlibrary.R.string.ccl_failed_perform_action);
        }

        _cls1()
        {
            this$0 = VideoCastControllerActivity.this;
            super();
        }
    }


    private class _cls2
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        final VideoCastControllerActivity this$0;

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            mStart.setText(Utils.formatMillis(i));
            try
            {
                if (mListener != null)
                {
                    mListener.onProgressChanged(seekbar, i, flag);
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SeekBar seekbar)
            {
                LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to set the progress result", seekbar);
            }
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            try
            {
                if (mListener != null)
                {
                    mListener.onStartTrackingTouch(seekbar);
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SeekBar seekbar)
            {
                LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to start seek", seekbar);
            }
            finish();
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
            try
            {
                if (mListener != null)
                {
                    mListener.onStopTrackingTouch(seekbar);
                }
                return;
            }
            // Misplaced declaration of an exception variable
            catch (SeekBar seekbar)
            {
                LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to complete seek", seekbar);
            }
            finish();
        }

        _cls2()
        {
            this$0 = VideoCastControllerActivity.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final VideoCastControllerActivity this$0;

        public void onClick(View view)
        {
            try
            {
                showTracksChooserDialog();
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to get the media", view);
        }

        _cls3()
        {
            this$0 = VideoCastControllerActivity.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final VideoCastControllerActivity this$0;

        public void onClick(View view)
        {
            try
            {
                mListener.onSkipNextClicked(view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to move to the next item in the queue", view);
        }

        _cls4()
        {
            this$0 = VideoCastControllerActivity.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final VideoCastControllerActivity this$0;

        public void onClick(View view)
        {
            try
            {
                mListener.onSkipPreviousClicked(view);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            // Misplaced declaration of an exception variable
            catch (View view) { }
            LogUtils.LOGE(VideoCastControllerActivity.TAG, "Failed to move to the previous item in the queue", view);
        }

        _cls5()
        {
            this$0 = VideoCastControllerActivity.this;
            super();
        }
    }

}
