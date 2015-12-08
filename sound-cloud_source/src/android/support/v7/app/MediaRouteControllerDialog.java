// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.content.IntentSender;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaControllerCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;

// Referenced classes of package android.support.v7.app:
//            MediaRouterThemeHelper

public class MediaRouteControllerDialog extends Dialog
{
    private final class ClickListener
        implements android.view.View.OnClickListener
    {

        final MediaRouteControllerDialog this$0;

        public final void onClick(View view)
        {
            int i = view.getId();
            if (i != android.support.v7.mediarouter.R.id.stop && i != android.support.v7.mediarouter.R.id.disconnect) goto _L2; else goto _L1
_L1:
            if (mRoute.isSelected())
            {
                view = mRouter;
                if (i == android.support.v7.mediarouter.R.id.stop)
                {
                    i = 2;
                } else
                {
                    i = 1;
                }
                view.unselect(i);
            }
            dismiss();
_L4:
            return;
_L2:
            if (i != android.support.v7.mediarouter.R.id.play_pause)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (mMediaController != null && mState != null)
            {
                if (mState.getState() == 3)
                {
                    mMediaController.getTransportControls().pause();
                    return;
                } else
                {
                    mMediaController.getTransportControls().play();
                    return;
                }
            }
            continue; /* Loop/switch isn't completed */
            if (i != android.support.v7.mediarouter.R.id.settings) goto _L4; else goto _L3
_L3:
            view = mRoute.getSettingsIntent();
            if (view != null)
            {
                try
                {
                    view.sendIntent(null, 0, null, null, null);
                    dismiss();
                    return;
                }
                // Misplaced declaration of an exception variable
                catch (View view)
                {
                    return;
                }
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        private ClickListener()
        {
            this$0 = MediaRouteControllerDialog.this;
            super();
        }

        ClickListener(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class MediaControllerCallback extends android.support.v4.media.session.MediaControllerCompat.Callback
    {

        final MediaRouteControllerDialog this$0;

        public final void onMetadataChanged(MediaMetadataCompat mediametadatacompat)
        {
            MediaRouteControllerDialog mediaroutecontrollerdialog = MediaRouteControllerDialog.this;
            if (mediametadatacompat == null)
            {
                mediametadatacompat = null;
            } else
            {
                mediametadatacompat = mediametadatacompat.getDescription();
            }
            mediaroutecontrollerdialog.mDescription = mediametadatacompat;
            update();
        }

        public final void onPlaybackStateChanged(PlaybackStateCompat playbackstatecompat)
        {
            mState = playbackstatecompat;
            update();
        }

        public final void onSessionDestroyed()
        {
            if (mMediaController != null)
            {
                mMediaController.unregisterCallback(mControllerCallback);
                mMediaController = null;
            }
        }

        private MediaControllerCallback()
        {
            this$0 = MediaRouteControllerDialog.this;
            super();
        }

        MediaControllerCallback(_cls1 _pcls1)
        {
            this();
        }
    }

    private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
    {

        final MediaRouteControllerDialog this$0;

        public final void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            update();
        }

        public final void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            update();
        }

        public final void onRouteVolumeChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            if (routeinfo == mRoute)
            {
                updateVolume();
            }
        }

        private MediaRouterCallback()
        {
            this$0 = MediaRouteControllerDialog.this;
            super();
        }

        MediaRouterCallback(_cls1 _pcls1)
        {
            this();
        }
    }


    private static final String TAG = "MediaRouteControllerDialog";
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 250;
    private ImageView mArtView;
    private boolean mAttachedToWindow;
    private final MediaRouterCallback mCallback;
    private View mControlView;
    private MediaControllerCallback mControllerCallback;
    private boolean mCreated;
    private MediaDescriptionCompat mDescription;
    private Button mDisconnectButton;
    private MediaControllerCompat mMediaController;
    private Drawable mMediaRouteConnectingDrawable;
    private Drawable mMediaRouteOnDrawable;
    private ImageButton mPlayPauseButton;
    private final android.support.v7.media.MediaRouter.RouteInfo mRoute;
    private TextView mRouteNameView;
    private final MediaRouter mRouter;
    private ImageButton mSettingsButton;
    private PlaybackStateCompat mState;
    private Button mStopCastingButton;
    private TextView mSubtitleView;
    private TextView mTitleView;
    private View mTitlesWrapper;
    private boolean mVolumeControlEnabled;
    private LinearLayout mVolumeLayout;
    private SeekBar mVolumeSlider;
    private boolean mVolumeSliderTouched;

    public MediaRouteControllerDialog(Context context)
    {
        this(context, 0);
    }

    public MediaRouteControllerDialog(Context context, int i)
    {
        super(MediaRouterThemeHelper.createThemedContext(context), i);
        mVolumeControlEnabled = true;
        context = getContext();
        mControllerCallback = new MediaControllerCallback(null);
        mRouter = MediaRouter.getInstance(context);
        mCallback = new MediaRouterCallback(null);
        mRoute = mRouter.getSelectedRoute();
        setMediaSession(mRouter.getMediaSessionToken());
    }

    private Drawable getIconDrawable()
    {
        if (mRoute.isConnecting())
        {
            if (mMediaRouteConnectingDrawable == null)
            {
                mMediaRouteConnectingDrawable = MediaRouterThemeHelper.getThemeDrawable(getContext(), android.support.v7.mediarouter.R.attr.mediaRouteConnectingDrawable);
            }
            return mMediaRouteConnectingDrawable;
        }
        if (mMediaRouteOnDrawable == null)
        {
            mMediaRouteOnDrawable = MediaRouterThemeHelper.getThemeDrawable(getContext(), android.support.v7.mediarouter.R.attr.mediaRouteOnDrawable);
        }
        return mMediaRouteOnDrawable;
    }

    private boolean isVolumeControlAvailable()
    {
        return mVolumeControlEnabled && mRoute.getVolumeHandling() == 1;
    }

    private void setMediaSession(android.support.v4.media.session.MediaSessionCompat.Token token)
    {
        Object obj = null;
        if (mMediaController != null)
        {
            mMediaController.unregisterCallback(mControllerCallback);
            mMediaController = null;
        }
        while (token == null || !mAttachedToWindow) 
        {
            return;
        }
        try
        {
            mMediaController = new MediaControllerCompat(getContext(), token);
        }
        // Misplaced declaration of an exception variable
        catch (android.support.v4.media.session.MediaSessionCompat.Token token) { }
        if (mMediaController != null)
        {
            mMediaController.registerCallback(mControllerCallback);
        }
        if (mMediaController == null)
        {
            token = null;
        } else
        {
            token = mMediaController.getMetadata();
        }
        if (token == null)
        {
            token = null;
        } else
        {
            token = token.getDescription();
        }
        mDescription = token;
        if (mMediaController == null)
        {
            token = obj;
        } else
        {
            token = mMediaController.getPlaybackState();
        }
        mState = token;
        update();
    }

    private boolean update()
    {
        if (!mRoute.isSelected() || mRoute.isDefault())
        {
            dismiss();
        } else
        if (mCreated)
        {
            updateVolume();
            mRouteNameView.setText(mRoute.getName());
            if (mRoute.canDisconnect())
            {
                mDisconnectButton.setVisibility(0);
            } else
            {
                mDisconnectButton.setVisibility(8);
            }
            if (mRoute.getSettingsIntent() != null)
            {
                mSettingsButton.setVisibility(0);
            } else
            {
                mSettingsButton.setVisibility(8);
            }
            if (mControlView == null)
            {
                boolean flag;
                if (mDescription != null)
                {
                    CharSequence charsequence;
                    if (mDescription.getIconBitmap() != null)
                    {
                        mArtView.setImageBitmap(mDescription.getIconBitmap());
                        mArtView.setVisibility(0);
                    } else
                    if (mDescription.getIconUri() != null)
                    {
                        mArtView.setImageURI(mDescription.getIconUri());
                        mArtView.setVisibility(0);
                    } else
                    {
                        mArtView.setImageDrawable(null);
                        mArtView.setVisibility(8);
                    }
                    charsequence = mDescription.getTitle();
                    if (!TextUtils.isEmpty(charsequence))
                    {
                        mTitleView.setText(charsequence);
                        flag = true;
                    } else
                    {
                        mTitleView.setText(null);
                        mTitleView.setVisibility(8);
                        flag = false;
                    }
                    if (!TextUtils.isEmpty(mDescription.getSubtitle()))
                    {
                        mSubtitleView.setText(mDescription.getSubtitle());
                        flag = true;
                    } else
                    {
                        mSubtitleView.setText(null);
                        mSubtitleView.setVisibility(8);
                    }
                    if (!flag)
                    {
                        mTitlesWrapper.setVisibility(8);
                    } else
                    {
                        mTitlesWrapper.setVisibility(0);
                    }
                } else
                {
                    mArtView.setVisibility(8);
                    mTitlesWrapper.setVisibility(8);
                }
                if (mState != null)
                {
                    boolean flag1;
                    boolean flag2;
                    if (mState.getState() == 6 || mState.getState() == 3)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    if ((mState.getActions() & 516L) != 0L)
                    {
                        flag1 = true;
                    } else
                    {
                        flag1 = false;
                    }
                    if ((mState.getActions() & 514L) != 0L)
                    {
                        flag2 = true;
                    } else
                    {
                        flag2 = false;
                    }
                    if (flag && flag2)
                    {
                        mPlayPauseButton.setVisibility(0);
                        mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(getContext(), android.support.v7.mediarouter.R.attr.mediaRoutePauseDrawable));
                        mPlayPauseButton.setContentDescription(getContext().getResources().getText(android.support.v7.mediarouter.R.string.mr_media_route_controller_pause));
                    } else
                    if (!flag && flag1)
                    {
                        mPlayPauseButton.setVisibility(0);
                        mPlayPauseButton.setImageResource(MediaRouterThemeHelper.getThemeResource(getContext(), android.support.v7.mediarouter.R.attr.mediaRoutePlayDrawable));
                        mPlayPauseButton.setContentDescription(getContext().getResources().getText(android.support.v7.mediarouter.R.string.mr_media_route_controller_play));
                    } else
                    {
                        mPlayPauseButton.setVisibility(8);
                    }
                } else
                {
                    mPlayPauseButton.setVisibility(8);
                }
            }
            return true;
        }
        return false;
    }

    private void updateVolume()
    {
label0:
        {
            if (!mVolumeSliderTouched)
            {
                if (!isVolumeControlAvailable())
                {
                    break label0;
                }
                mVolumeLayout.setVisibility(0);
                mVolumeSlider.setMax(mRoute.getVolumeMax());
                mVolumeSlider.setProgress(mRoute.getVolume());
            }
            return;
        }
        mVolumeLayout.setVisibility(8);
    }

    public View getMediaControlView()
    {
        return mControlView;
    }

    public android.support.v4.media.session.MediaSessionCompat.Token getMediaSession()
    {
        if (mMediaController == null)
        {
            return null;
        } else
        {
            return mMediaController.getSessionToken();
        }
    }

    public android.support.v7.media.MediaRouter.RouteInfo getRoute()
    {
        return mRoute;
    }

    public boolean isVolumeControlEnabled()
    {
        return mVolumeControlEnabled;
    }

    public void onAttachedToWindow()
    {
        super.onAttachedToWindow();
        mAttachedToWindow = true;
        mRouter.addCallback(MediaRouteSelector.EMPTY, mCallback, 2);
        setMediaSession(mRouter.getMediaSessionToken());
    }

    protected void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        getWindow().requestFeature(1);
        setContentView(android.support.v7.mediarouter.R.layout.mr_media_route_controller_material_dialog_b);
        ClickListener clicklistener = new ClickListener(null);
        mDisconnectButton = (Button)findViewById(android.support.v7.mediarouter.R.id.disconnect);
        mDisconnectButton.setOnClickListener(clicklistener);
        mStopCastingButton = (Button)findViewById(android.support.v7.mediarouter.R.id.stop);
        mStopCastingButton.setOnClickListener(clicklistener);
        mSettingsButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.settings);
        mSettingsButton.setOnClickListener(clicklistener);
        mArtView = (ImageView)findViewById(android.support.v7.mediarouter.R.id.art);
        mTitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.title);
        mSubtitleView = (TextView)findViewById(android.support.v7.mediarouter.R.id.subtitle);
        mTitlesWrapper = findViewById(android.support.v7.mediarouter.R.id.text_wrapper);
        mPlayPauseButton = (ImageButton)findViewById(android.support.v7.mediarouter.R.id.play_pause);
        mPlayPauseButton.setOnClickListener(clicklistener);
        mRouteNameView = (TextView)findViewById(android.support.v7.mediarouter.R.id.route_name);
        mVolumeLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.media_route_volume_layout);
        mVolumeSlider = (SeekBar)findViewById(android.support.v7.mediarouter.R.id.media_route_volume_slider);
        mVolumeSlider.setOnSeekBarChangeListener(new _cls1());
        mCreated = true;
        if (update())
        {
            mControlView = onCreateMediaControlView(bundle);
            bundle = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.media_route_control_frame);
            if (mControlView != null)
            {
                bundle.findViewById(android.support.v7.mediarouter.R.id.default_control_frame).setVisibility(8);
                bundle.addView(mControlView);
            }
        }
    }

    public View onCreateMediaControlView(Bundle bundle)
    {
        return null;
    }

    public void onDetachedFromWindow()
    {
        mRouter.removeCallback(mCallback);
        setMediaSession(null);
        mAttachedToWindow = false;
        super.onDetachedFromWindow();
    }

    public boolean onKeyDown(int i, KeyEvent keyevent)
    {
        if (i == 25 || i == 24)
        {
            keyevent = mRoute;
            if (i == 25)
            {
                i = -1;
            } else
            {
                i = 1;
            }
            keyevent.requestUpdateVolume(i);
            return true;
        } else
        {
            return super.onKeyDown(i, keyevent);
        }
    }

    public boolean onKeyUp(int i, KeyEvent keyevent)
    {
        if (i == 25 || i == 24)
        {
            return true;
        } else
        {
            return super.onKeyUp(i, keyevent);
        }
    }

    public void setVolumeControlEnabled(boolean flag)
    {
        if (mVolumeControlEnabled != flag)
        {
            mVolumeControlEnabled = flag;
            if (mCreated)
            {
                updateVolume();
            }
        }
    }



/*
    static PlaybackStateCompat access$1002(MediaRouteControllerDialog mediaroutecontrollerdialog, PlaybackStateCompat playbackstatecompat)
    {
        mediaroutecontrollerdialog.mState = playbackstatecompat;
        return playbackstatecompat;
    }

*/


/*
    static MediaDescriptionCompat access$1102(MediaRouteControllerDialog mediaroutecontrollerdialog, MediaDescriptionCompat mediadescriptioncompat)
    {
        mediaroutecontrollerdialog.mDescription = mediadescriptioncompat;
        return mediadescriptioncompat;
    }

*/




/*
    static boolean access$302(MediaRouteControllerDialog mediaroutecontrollerdialog, boolean flag)
    {
        mediaroutecontrollerdialog.mVolumeSliderTouched = flag;
        return flag;
    }

*/







/*
    static MediaControllerCompat access$802(MediaRouteControllerDialog mediaroutecontrollerdialog, MediaControllerCompat mediacontrollercompat)
    {
        mediaroutecontrollerdialog.mMediaController = mediacontrollercompat;
        return mediacontrollercompat;
    }

*/


    private class _cls1
        implements android.widget.SeekBar.OnSeekBarChangeListener
    {

        private final Runnable mStopTrackingTouch = new _cls1();
        final MediaRouteControllerDialog this$0;

        public void onProgressChanged(SeekBar seekbar, int i, boolean flag)
        {
            if (flag)
            {
                mRoute.requestSetVolume(i);
            }
        }

        public void onStartTrackingTouch(SeekBar seekbar)
        {
            if (mVolumeSliderTouched)
            {
                mVolumeSlider.removeCallbacks(mStopTrackingTouch);
                return;
            } else
            {
                mVolumeSliderTouched = true;
                return;
            }
        }

        public void onStopTrackingTouch(SeekBar seekbar)
        {
            mVolumeSlider.postDelayed(mStopTrackingTouch, 250L);
        }

        _cls1()
        {
            this$0 = MediaRouteControllerDialog.this;
            super();
            class _cls1
                implements Runnable
            {

                final _cls1 this$1;

                public void run()
                {
                    if (mVolumeSliderTouched)
                    {
                        mVolumeSliderTouched = false;
                        updateVolume();
                    }
                }

                _cls1()
                {
                    this$1 = _cls1.this;
                    super();
                }
            }

        }
    }

}
