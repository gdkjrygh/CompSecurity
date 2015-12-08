// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.core.internal;

import android.media.AudioTrack;
import android.os.HandlerThread;
import android.os.Process;
import android.util.SparseArray;
import com.spotify.mobile.android.util.logging.Logger;
import gcl;
import gcp;
import ggi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

public class SoundDriver
    implements android.media.AudioTrack.OnPlaybackPositionUpdateListener
{

    private static final int BYTES_PER_SAMPLE = 2;
    private static final int DELAY_IN_WRITES_BEFORE_ENABLING_EQUALIZER = 32;
    private static final float DUCKING_LOWEST_VOLUME = 0.25F;
    private static final int DUCKING_RAMPDOWN_TIME_MS = 200;
    private static final int DUCKING_RAMPUP_TIME_MS = 1000;
    private static final int DUCKING_RAMP_TIME_DELTA_MS = 50;
    private static final boolean LOGGING_ENABLED = false;
    static final int MESSAGE_SET_VOLUME = 1;
    private static final int MINIMUM_WRITTEN_BEFORE_PLAY = 512;
    private static final int SPOTIFY_MAX_VOLUME = 65535;
    private static SparseArray sSessionToSoundDriverMap = new SparseArray();
    private static ArrayList sSoundDriverListeners = new ArrayList();
    private AudioTrack mAudioTrack;
    private int mBufferSizeInBytes;
    private int mBytesPerFrame;
    private int mChannelConfig;
    private boolean mCreateFailed;
    private final Object mDestructionMutex;
    private gcp mEqualizerEnableCountdown;
    private Runnable mEqualizerEnableNotifier = new Runnable() {

        final SoundDriver this$0;

        public void run()
        {
            if (mAudioTrack != null)
            {
                Iterator iterator = SoundDriver.sSoundDriverListeners.iterator();
                while (iterator.hasNext()) 
                {
                    ((SoundDriverListener)iterator.next()).onEqualizerShouldBeEnabled(mAudioTrack.getAudioSessionId());
                }
            }
        }

            
            {
                this$0 = SoundDriver.this;
                super();
            }
    };
    private int mFramesBufferedBeforePlay;
    private VolumeHandler mHandler;
    private HandlerThread mHandlerThread;
    private int mMarkerFallbackPosition;
    private NativeWrapper mNativeWrapper;
    private boolean mOpen;
    private boolean mPaused;
    private boolean mPlaying;
    private final Object mPositionMutex;
    private int mSampleRate;
    private int nThis;

    public SoundDriver()
    {
        mPositionMutex = new Object();
        mDestructionMutex = new Object();
        mEqualizerEnableCountdown = new gcp(mEqualizerEnableNotifier);
        mNativeWrapper = new DefaultNativeWrapper();
    }

    SoundDriver(NativeWrapper nativewrapper)
    {
        mPositionMutex = new Object();
        mDestructionMutex = new Object();
        mEqualizerEnableCountdown = new gcp(mEqualizerEnableNotifier);
        mNativeWrapper = nativewrapper;
    }

    public static void addListener(SoundDriverListener sounddriverlistener)
    {
        sSoundDriverListeners.add(sounddriverlistener);
    }

    private void createAudioTrack()
    {
        AudioTrack audiotrack = new AudioTrack(3, mSampleRate, mChannelConfig, 2, mBufferSizeInBytes, 1);
        if (audiotrack.getState() == 0)
        {
            mCreateFailed = true;
            return;
        }
        mCreateFailed = false;
        mAudioTrack = audiotrack;
        mAudioTrack.setPlaybackPositionUpdateListener(this, mHandler);
        synchronized (mPositionMutex)
        {
            mMarkerFallbackPosition = 0;
        }
        setAudioTrackVolume(AudioTrack.getMaxVolume(), mAudioTrack);
        sSessionToSoundDriverMap.put(mAudioTrack.getAudioSessionId(), this);
        dispatchOnAudioTrackCreated(mAudioTrack.getAudioSessionId());
        mEqualizerEnableCountdown.a.set(32);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void destroyAudioTrack()
    {
        if (mAudioTrack == null)
        {
            return;
        }
        synchronized (mDestructionMutex)
        {
            dispatchOnAudioTrackDestroyed(mAudioTrack.getAudioSessionId());
            sSessionToSoundDriverMap.delete(mAudioTrack.getAudioSessionId());
            mPlaying = false;
            mAudioTrack.setPlaybackPositionUpdateListener(null, mHandler);
            mAudioTrack.flush();
            mAudioTrack.stop();
            mAudioTrack.release();
            mAudioTrack = null;
            mHandler.removeMessages(1);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void dispatchOnAudioTrackCreated(int i)
    {
        for (Iterator iterator = sSoundDriverListeners.iterator(); iterator.hasNext(); ((SoundDriverListener)iterator.next()).onAudioTrackCreated(i)) { }
    }

    public static void dispatchOnAudioTrackDestroyed(int i)
    {
        for (Iterator iterator = sSoundDriverListeners.iterator(); iterator.hasNext(); ((SoundDriverListener)iterator.next()).onAudioTrackDestroyed(i)) { }
    }

    private void maybeStartPlayback()
    {
        if (!mPaused && mPlaying)
        {
            synchronized (mPositionMutex)
            {
                if (mFramesBufferedBeforePlay >= 512)
                {
                    mAudioTrack.play();
                    mFramesBufferedBeforePlay = 0;
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native void onBufferUnderrun();

    private native void onDestroy();

    private native void onFlush();

    public static void removeListener(SoundDriverListener sounddriverlistener)
    {
        sSoundDriverListeners.remove(sounddriverlistener);
    }

    private static void setAudioTrackVolume(float f, AudioTrack audiotrack)
    {
        if (gcl.j)
        {
            audiotrack.setVolume(f);
            return;
        } else
        {
            audiotrack.setStereoVolume(f, f);
            return;
        }
    }

    private void startDuckingAudio()
    {
        mHandler.removeMessages(1);
        for (int i = 0; i <= 200; i += 50)
        {
            float f = AudioTrack.getMaxVolume();
            float f1 = (200F - (float)i) / 200F;
            Message message = mHandler.obtainMessage(1, Float.valueOf(f * (f1 * 0.75F + 0.25F)));
            mHandler.sendMessageDelayed(message, i);
        }

    }

    public static void startDuckingAudio(int i)
    {
        SoundDriver sounddriver = (SoundDriver)sSessionToSoundDriverMap.get(i);
        if (sounddriver != null)
        {
            sounddriver.startDuckingAudio();
        }
    }

    private void stopDuckingAudio()
    {
        mHandler.removeMessages(1);
        for (int i = 0; i <= 1000; i += 50)
        {
            float f = AudioTrack.getMaxVolume();
            float f1 = (float)i / 1000F;
            Message message = mHandler.obtainMessage(1, Float.valueOf(f * (f1 * 0.75F + 0.25F)));
            mHandler.sendMessageDelayed(message, i);
        }

    }

    public static void stopDuckingAudio(int i)
    {
        SoundDriver sounddriver = (SoundDriver)sSessionToSoundDriverMap.get(i);
        if (sounddriver != null)
        {
            sounddriver.stopDuckingAudio();
        }
    }

    public void destroy()
    {
        mPlaying = false;
        mPaused = true;
        mOpen = false;
        if (mAudioTrack == null)
        {
            return;
        }
        destroyAudioTrack();
        mNativeWrapper.onDestroy();
        try
        {
            mHandlerThread.quit();
            mHandlerThread.join(1000L);
        }
        catch (InterruptedException interruptedexception)
        {
            Logger.a(interruptedexception, "Interrupted while waiting for notification thread to join", new Object[0]);
        }
        mHandlerThread = null;
        mHandler = null;
    }

    public void flush()
    {
        if (!mOpen)
        {
            throw new IllegalStateException("cannot call flush() on destroyed object");
        }
        mPlaying = false;
        mFramesBufferedBeforePlay = 0;
        if (!mCreateFailed) goto _L2; else goto _L1
_L1:
        createAudioTrack();
_L6:
        mNativeWrapper.onFlush();
_L4:
        return;
_L2:
        if (mAudioTrack == null) goto _L4; else goto _L3
_L3:
        mAudioTrack.pause();
        destroyAudioTrack();
        createAudioTrack();
        if (true) goto _L6; else goto _L5
_L5:
    }

    AudioTrack getAudioTrack()
    {
        return mAudioTrack;
    }

    public int getFreeSize()
    {
        if (mAudioTrack == null)
        {
            return 0;
        } else
        {
            return mBufferSizeInBytes - mBytesPerFrame * getQueuedSize();
        }
    }

    public int getPosition()
    {
        if (mAudioTrack == null)
        {
            return 0;
        } else
        {
            return Math.max(0, mAudioTrack.getPlaybackHeadPosition());
        }
    }

    public int getQueuedSize()
    {
        if (mAudioTrack == null)
        {
            return 0;
        }
        Object obj = mPositionMutex;
        obj;
        JVM INSTR monitorenter ;
        int j;
        if (!mPlaying)
        {
            break MISSING_BLOCK_LABEL_68;
        }
        j = mAudioTrack.getNotificationMarkerPosition();
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        i = mMarkerFallbackPosition;
        i = Math.max(0, i - mAudioTrack.getPlaybackHeadPosition());
        obj;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        i = mFramesBufferedBeforePlay;
        obj;
        JVM INSTR monitorexit ;
        return i;
    }

    public int getVolume()
    {
        return 65535;
    }

    public VolumeHandler getVolumeHandler()
    {
        return mHandler;
    }

    public boolean isPlaying()
    {
        while (mAudioTrack == null || !mPlaying || getQueuedSize() <= 0) 
        {
            return false;
        }
        return true;
    }

    public void onMarkerReached(AudioTrack audiotrack)
    {
        if (!mOpen)
        {
            return;
        }
        synchronized (mPositionMutex)
        {
            if (mOpen)
            {
                break MISSING_BLOCK_LABEL_30;
            }
        }
        return;
        audiotrack;
        obj;
        JVM INSTR monitorexit ;
        throw audiotrack;
        synchronized (mDestructionMutex)
        {
            if (ggi.a(audiotrack, mAudioTrack))
            {
                break MISSING_BLOCK_LABEL_53;
            }
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        int j = audiotrack.getNotificationMarkerPosition();
        int i;
        i = j;
        if (j != 0)
        {
            break MISSING_BLOCK_LABEL_74;
        }
        i = mMarkerFallbackPosition;
        if (audiotrack.getPlaybackHeadPosition() >= i)
        {
            mNativeWrapper.onBufferUnderrun();
        }
        obj1;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return;
        audiotrack;
        obj1;
        JVM INSTR monitorexit ;
        throw audiotrack;
    }

    public void onPeriodicNotification(AudioTrack audiotrack)
    {
    }

    public void open(int i, int j)
    {
        Process.setThreadPriority(-16);
        mSampleRate = i;
        int k;
        if (j == 1)
        {
            k = 4;
        } else
        {
            k = 12;
        }
        mChannelConfig = k;
        mBytesPerFrame = j * 2;
        mBufferSizeInBytes = mBytesPerFrame * i;
        mBufferSizeInBytes = Math.max(mBufferSizeInBytes, AudioTrack.getMinBufferSize(i, mChannelConfig, 2));
        mHandlerThread = new HandlerThread("SoundDriverHandlerThread");
        mHandlerThread.start();
        mHandler = new VolumeHandler(mHandlerThread.getLooper(), this);
        mOpen = true;
        createAudioTrack();
        if (mAudioTrack != null)
        {
            synchronized (mPositionMutex)
            {
                mAudioTrack.setNotificationMarkerPosition(0);
                mMarkerFallbackPosition = 0;
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void setPaused(boolean flag)
    {
        mPaused = flag;
        if (mAudioTrack == null)
        {
            return;
        }
        if (mPaused)
        {
            mAudioTrack.pause();
            return;
        } else
        {
            maybeStartPlayback();
            return;
        }
    }

    public void setVolume(int i)
    {
    }

    public void startPlayback()
    {
        mPlaying = true;
        mPlaying = true;
        maybeStartPlayback();
    }

    public void stopPlayback()
    {
        if (mAudioTrack == null)
        {
            return;
        } else
        {
            mAudioTrack.pause();
            return;
        }
    }

    public int write(byte abyte0[], int i)
    {
        while (mAudioTrack == null || (i = mAudioTrack.write(abyte0, 0, i)) <= 0) 
        {
            return 0;
        }
        maybeStartPlayback();
        abyte0 = mEqualizerEnableCountdown;
        if (((gcp) (abyte0)).a.get() > 0 && ((gcp) (abyte0)).a.getAndDecrement() == 1)
        {
            ((gcp) (abyte0)).b.run();
        }
        synchronized (mPositionMutex)
        {
            mAudioTrack.setNotificationMarkerPosition(mAudioTrack.getNotificationMarkerPosition() + i / mBytesPerFrame);
            mMarkerFallbackPosition = mMarkerFallbackPosition + i / mBytesPerFrame;
            if (mAudioTrack.getState() != 3)
            {
                mFramesBufferedBeforePlay = mFramesBufferedBeforePlay + i / mBytesPerFrame;
            }
        }
        return i;
        exception;
        abyte0;
        JVM INSTR monitorexit ;
        throw exception;
    }









    private class DefaultNativeWrapper
        implements NativeWrapper
    {

        final SoundDriver this$0;

        public void onBufferUnderrun()
        {
            SoundDriver.this.onBufferUnderrun();
        }

        public void onDestroy()
        {
            SoundDriver.this.onDestroy();
        }

        public void onFlush()
        {
            SoundDriver.this.onFlush();
        }

        private DefaultNativeWrapper()
        {
            this$0 = SoundDriver.this;
            super();
        }

    }


    private class VolumeHandler extends Handler
    {

        private final SoundDriver mSoundDriver;

        public void handleMessage(Message message)
        {
            synchronized (mSoundDriver.mDestructionMutex)
            {
                if (message.what == 1 && mSoundDriver.mAudioTrack != null)
                {
                    SoundDriver.setAudioTrackVolume(((Float)message.obj).floatValue(), mSoundDriver.mAudioTrack);
                }
            }
            super.handleMessage(message);
            return;
            message;
            obj;
            JVM INSTR monitorexit ;
            throw message;
        }

        private VolumeHandler(Looper looper, SoundDriver sounddriver)
        {
            super(looper);
            mSoundDriver = sounddriver;
        }

    }


    private class SoundDriverListener
    {

        public abstract void onAudioTrackCreated(int i);

        public abstract void onAudioTrackDestroyed(int i);

        public abstract void onEqualizerShouldBeEnabled(int i);
    }


    private class NativeWrapper
    {

        public abstract void onBufferUnderrun();

        public abstract void onDestroy();

        public abstract void onFlush();
    }

}
