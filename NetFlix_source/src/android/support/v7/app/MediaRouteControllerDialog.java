// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.SeekBar;

// Referenced classes of package android.support.v7.app:
//            MediaRouterThemeHelper

public class MediaRouteControllerDialog extends Dialog
{
    private final class MediaRouterCallback extends android.support.v7.media.MediaRouter.Callback
    {

        final MediaRouteControllerDialog this$0;

        public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            update();
        }

        public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
        {
            update();
        }

        public void onRouteVolumeChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
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

    }


    private static final String TAG = "MediaRouteControllerDialog";
    private static final int VOLUME_UPDATE_DELAY_MILLIS = 250;
    private final MediaRouterCallback mCallback;
    private View mControlView;
    private boolean mCreated;
    private Drawable mCurrentIconDrawable;
    private Button mDisconnectButton;
    private Drawable mMediaRouteConnectingDrawable;
    private Drawable mMediaRouteOnDrawable;
    private final android.support.v7.media.MediaRouter.RouteInfo mRoute;
    private final MediaRouter mRouter;
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
        super(MediaRouterThemeHelper.createThemedContext(context, true), i);
        mVolumeControlEnabled = true;
        mRouter = MediaRouter.getInstance(getContext());
        mCallback = new MediaRouterCallback();
        mRoute = mRouter.getSelectedRoute();
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

    private boolean update()
    {
        boolean flag = true;
        if (!mRoute.isSelected() || mRoute.isDefault())
        {
            dismiss();
            flag = false;
        } else
        {
            setTitle(mRoute.getName());
            updateVolume();
            Drawable drawable = getIconDrawable();
            if (drawable != mCurrentIconDrawable)
            {
                mCurrentIconDrawable = drawable;
                drawable.setVisible(false, true);
                getWindow().setFeatureDrawable(3, drawable);
                return true;
            }
        }
        return flag;
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
        mRouter.addCallback(MediaRouteSelector.EMPTY, mCallback, 2);
        update();
    }

    protected void onCreate(Bundle bundle)
    {
label0:
        {
            super.onCreate(bundle);
            getWindow().requestFeature(3);
            setContentView(android.support.v7.mediarouter.R.layout.mr_media_route_controller_dialog);
            mVolumeLayout = (LinearLayout)findViewById(android.support.v7.mediarouter.R.id.media_route_volume_layout);
            mVolumeSlider = (SeekBar)findViewById(android.support.v7.mediarouter.R.id.media_route_volume_slider);
            mVolumeSlider.setOnSeekBarChangeListener(new android.widget.SeekBar.OnSeekBarChangeListener() {

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

            
            {
                this$0 = MediaRouteControllerDialog.this;
                super();
            }
            });
            mDisconnectButton = (Button)findViewById(android.support.v7.mediarouter.R.id.media_route_disconnect_button);
            mDisconnectButton.setOnClickListener(new android.view.View.OnClickListener() {

                final MediaRouteControllerDialog this$0;

                public void onClick(View view)
                {
                    if (mRoute.isSelected())
                    {
                        mRouter.getDefaultRoute().select();
                    }
                    dismiss();
                }

            
            {
                this$0 = MediaRouteControllerDialog.this;
                super();
            }
            });
            mCreated = true;
            if (update())
            {
                mControlView = onCreateMediaControlView(bundle);
                bundle = (FrameLayout)findViewById(android.support.v7.mediarouter.R.id.media_route_control_frame);
                if (mControlView == null)
                {
                    break label0;
                }
                bundle.addView(mControlView);
                bundle.setVisibility(0);
            }
            return;
        }
        bundle.setVisibility(8);
    }

    public View onCreateMediaControlView(Bundle bundle)
    {
        return null;
    }

    public void onDetachedFromWindow()
    {
        mRouter.removeCallback(mCallback);
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
    static boolean access$102(MediaRouteControllerDialog mediaroutecontrollerdialog, boolean flag)
    {
        mediaroutecontrollerdialog.mVolumeSliderTouched = flag;
        return flag;
    }

*/






    // Unreferenced inner class android/support/v7/app/MediaRouteControllerDialog$1$1

/* anonymous class */
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

            
            {
                this$1 = _cls1.this;
                super();
            }
    }

}
