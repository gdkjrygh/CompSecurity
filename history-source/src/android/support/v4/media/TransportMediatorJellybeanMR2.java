// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.AudioManager;
import android.media.RemoteControlClient;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package android.support.v4.media:
//            TransportMediatorCallback

class TransportMediatorJellybeanMR2
    implements android.media.RemoteControlClient.OnGetPlaybackPositionListener, android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
{

    android.media.AudioManager.OnAudioFocusChangeListener mAudioFocusChangeListener;
    boolean mAudioFocused;
    final AudioManager mAudioManager;
    final Context mContext;
    boolean mFocused;
    final Intent mIntent;
    final BroadcastReceiver mMediaButtonReceiver = new BroadcastReceiver() {

        final TransportMediatorJellybeanMR2 this$0;

        public void onReceive(Context context1, Intent intent)
        {
            try
            {
                context1 = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
                mTransportCallback.handleKey(context1);
                return;
            }
            // Misplaced declaration of an exception variable
            catch (Context context1)
            {
                Log.w("TransportController", context1);
            }
        }

            
            {
                this$0 = TransportMediatorJellybeanMR2.this;
                super();
            }
    };
    PendingIntent mPendingIntent;
    int mPlayState;
    final String mReceiverAction;
    final IntentFilter mReceiverFilter = new IntentFilter();
    RemoteControlClient mRemoteControl;
    final View mTargetView;
    final TransportMediatorCallback mTransportCallback;
    final android.view.ViewTreeObserver.OnWindowAttachListener mWindowAttachListener = new android.view.ViewTreeObserver.OnWindowAttachListener() {

        final TransportMediatorJellybeanMR2 this$0;

        public void onWindowAttached()
        {
            windowAttached();
        }

        public void onWindowDetached()
        {
            windowDetached();
        }

            
            {
                this$0 = TransportMediatorJellybeanMR2.this;
                super();
            }
    };
    final android.view.ViewTreeObserver.OnWindowFocusChangeListener mWindowFocusListener = new android.view.ViewTreeObserver.OnWindowFocusChangeListener() {

        final TransportMediatorJellybeanMR2 this$0;

        public void onWindowFocusChanged(boolean flag)
        {
            if (flag)
            {
                gainFocus();
                return;
            } else
            {
                loseFocus();
                return;
            }
        }

            
            {
                this$0 = TransportMediatorJellybeanMR2.this;
                super();
            }
    };

    public TransportMediatorJellybeanMR2(Context context, AudioManager audiomanager, View view, TransportMediatorCallback transportmediatorcallback)
    {
        mAudioFocusChangeListener = new android.media.AudioManager.OnAudioFocusChangeListener() {

            final TransportMediatorJellybeanMR2 this$0;

            public void onAudioFocusChange(int i)
            {
                mTransportCallback.handleAudioFocusChange(i);
            }

            
            {
                this$0 = TransportMediatorJellybeanMR2.this;
                super();
            }
        };
        mPlayState = 0;
        mContext = context;
        mAudioManager = audiomanager;
        mTargetView = view;
        mTransportCallback = transportmediatorcallback;
        mReceiverAction = (new StringBuilder()).append(context.getPackageName()).append(":transport:").append(System.identityHashCode(this)).toString();
        mIntent = new Intent(mReceiverAction);
        mIntent.setPackage(context.getPackageName());
        mReceiverFilter.addAction(mReceiverAction);
        mTargetView.getViewTreeObserver().addOnWindowAttachListener(mWindowAttachListener);
        mTargetView.getViewTreeObserver().addOnWindowFocusChangeListener(mWindowFocusListener);
    }

    public void destroy()
    {
        windowDetached();
        mTargetView.getViewTreeObserver().removeOnWindowAttachListener(mWindowAttachListener);
        mTargetView.getViewTreeObserver().removeOnWindowFocusChangeListener(mWindowFocusListener);
    }

    void dropAudioFocus()
    {
        if (mAudioFocused)
        {
            mAudioFocused = false;
            mAudioManager.abandonAudioFocus(mAudioFocusChangeListener);
        }
    }

    void gainFocus()
    {
        if (!mFocused)
        {
            mFocused = true;
            mAudioManager.registerMediaButtonEventReceiver(mPendingIntent);
            mAudioManager.registerRemoteControlClient(mRemoteControl);
            if (mPlayState == 3)
            {
                takeAudioFocus();
            }
        }
    }

    public Object getRemoteControlClient()
    {
        return mRemoteControl;
    }

    void loseFocus()
    {
        dropAudioFocus();
        if (mFocused)
        {
            mFocused = false;
            mAudioManager.unregisterRemoteControlClient(mRemoteControl);
            mAudioManager.unregisterMediaButtonEventReceiver(mPendingIntent);
        }
    }

    public long onGetPlaybackPosition()
    {
        return mTransportCallback.getPlaybackPosition();
    }

    public void onPlaybackPositionUpdate(long l)
    {
        mTransportCallback.playbackPositionUpdate(l);
    }

    public void pausePlaying()
    {
        if (mPlayState == 3)
        {
            mPlayState = 2;
            mRemoteControl.setPlaybackState(2);
        }
        dropAudioFocus();
    }

    public void refreshState(boolean flag, long l, int i)
    {
        if (mRemoteControl != null)
        {
            RemoteControlClient remotecontrolclient = mRemoteControl;
            float f;
            byte byte0;
            if (flag)
            {
                byte0 = 3;
            } else
            {
                byte0 = 1;
            }
            if (flag)
            {
                f = 1.0F;
            } else
            {
                f = 0.0F;
            }
            remotecontrolclient.setPlaybackState(byte0, l, f);
            mRemoteControl.setTransportControlFlags(i);
        }
    }

    public void startPlaying()
    {
        if (mPlayState != 3)
        {
            mPlayState = 3;
            mRemoteControl.setPlaybackState(3);
        }
        if (mFocused)
        {
            takeAudioFocus();
        }
    }

    public void stopPlaying()
    {
        if (mPlayState != 1)
        {
            mPlayState = 1;
            mRemoteControl.setPlaybackState(1);
        }
        dropAudioFocus();
    }

    void takeAudioFocus()
    {
        if (!mAudioFocused)
        {
            mAudioFocused = true;
            mAudioManager.requestAudioFocus(mAudioFocusChangeListener, 3, 1);
        }
    }

    void windowAttached()
    {
        mContext.registerReceiver(mMediaButtonReceiver, mReceiverFilter);
        mPendingIntent = PendingIntent.getBroadcast(mContext, 0, mIntent, 0x10000000);
        mRemoteControl = new RemoteControlClient(mPendingIntent);
        mRemoteControl.setOnGetPlaybackPositionListener(this);
        mRemoteControl.setPlaybackPositionUpdateListener(this);
    }

    void windowDetached()
    {
        loseFocus();
        if (mPendingIntent != null)
        {
            mContext.unregisterReceiver(mMediaButtonReceiver);
            mPendingIntent.cancel();
            mPendingIntent = null;
            mRemoteControl = null;
        }
    }
}
