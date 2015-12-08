// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.util.Pair;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.drm.DrmManagerRegistry;
import com.netflix.mediaclient.service.configuration.drm.WidevineMediaDrmEngine;
import com.netflix.mediaclient.util.AndroidUtils;
import java.nio.ByteBuffer;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoder2Audio, MediaDecoderBase, AdaptiveMediaDecoderHelper, MediaDecoder2Video

public class JPlayer2
{
    public class DecoderListener
        implements MediaDecoderBase.EventListener
    {

        final JPlayer2 this$0;

        public void onDecoderReady(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag) goto _L2; else goto _L1
_L1:
            Log.d("NF_JPlayer2", "AUDIO init'd");
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            Log.d("NF_JPlayer2", "VIDEO init'd");
            notifyReady();
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void onDecoderStarted(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag) goto _L2; else goto _L1
_L1:
            Log.d("NF_JPlayer2", "AUDIO ready");
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            Log.d("NF_JPlayer2", "VIDEO ready");
            mAudioPipe.unpause();
            mVideoPipe.unpause();
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void onEndOfStream(boolean flag)
        {
            notifyEndOfStream(flag);
            if (flag)
            {
                Log.d("NF_JPlayer2", "AUDIO END_OF_STREAM");
                return;
            } else
            {
                Log.d("NF_JPlayer2", "VIDEO END_OF_STREAM");
                return;
            }
        }

        public void onFlushed(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag) goto _L2; else goto _L1
_L1:
            Log.d("NF_JPlayer2", "AUDIO flushed");
            notifyReady();
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            Log.d("NF_JPlayer2", "VIDEO flushed");
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void onPasued(boolean flag)
        {
            this;
            JVM INSTR monitorenter ;
            if (!flag) goto _L2; else goto _L1
_L1:
            Log.d("NF_JPlayer2", "AUDIO paused");
            notifyReady();
_L4:
            this;
            JVM INSTR monitorexit ;
            return;
_L2:
            Log.d("NF_JPlayer2", "VIDEO paused");
            if (true) goto _L4; else goto _L3
_L3:
            Exception exception;
            exception;
            throw exception;
        }

        public void onSampleRendered(boolean flag, long l, long l1)
        {
            this;
            JVM INSTR monitorenter ;
            updatePosition(flag, l1);
            if (!flag);
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        public DecoderListener()
        {
            this$0 = JPlayer2.this;
            super();
        }
    }

    public class MediaDataSource
        implements MediaDecoderBase.InputDataSource
    {

        static final boolean TYPE_AUDIO = true;
        static final boolean TYPE_VIDEO = false;
        private boolean mIsAudio;
        final JPlayer2 this$0;

        public MediaDecoderBase.InputDataSource.BufferMeta onRequestData(ByteBuffer bytebuffer)
        {
            MediaDecoderBase.InputDataSource.BufferMeta buffermeta = new MediaDecoderBase.InputDataSource.BufferMeta();
            buffermeta.size = 0;
            buffermeta.flags = 0;
            if (bytebuffer.isDirect())
            {
                getBufferDirect(bytebuffer, mIsAudio, buffermeta);
            } else
            {
                Log.e("NF_JPlayer2", "WITH NON-DIRECT BYTEBUFFER");
                byte abyte0[] = bytebuffer.array();
                if (abyte0 == null)
                {
                    buffermeta.size = 0;
                    buffermeta.flags = 4;
                    Log.e("NF_JPlayer2", "can't get bytearray");
                    return buffermeta;
                }
                getBuffer(abyte0, mIsAudio, buffermeta);
            }
            bytebuffer.limit(buffermeta.size);
            bytebuffer.position(0);
            return buffermeta;
        }

        MediaDataSource(boolean flag)
        {
            this$0 = JPlayer2.this;
            super();
            mIsAudio = flag;
        }
    }


    static final int INIT_ERROR = -1;
    static final int STATE_FLUSHED = 3;
    static final int STATE_INIT = -1;
    static final int STATE_PAUSED = 2;
    static final int STATE_PLAYING = 1;
    static final int STATE_STOPPED = 0;
    private static final String TAG = "NF_JPlayer2";
    private MediaDecoderBase mAudioPipe;
    private MediaCrypto mCrypto;
    private DecoderListener mDecoderListener;
    private int mMaxVideoBitrate;
    private long mNativePlayer;
    private volatile int mState;
    private Surface mSurface;
    private MediaDecoderBase mVideoPipe;

    public JPlayer2(Surface surface)
    {
        mState = -1;
        mMaxVideoBitrate = -1;
        mDecoderListener = new DecoderListener();
        mSurface = surface;
    }

    public JPlayer2(Surface surface, MediaCrypto mediacrypto)
    {
        this(surface);
        mCrypto = mediacrypto;
    }

    private void configureAudioPipe()
        throws Exception
    {
        Log.d("NF_JPlayer2", "configureAudioPipe");
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", "audio/mp4a-latm");
        mediaformat.setInteger("max-input-size", 1536);
        mediaformat.setInteger("channel-count", 2);
        mediaformat.setInteger("sample-rate", 48000);
        mediaformat.setInteger("is-adts", 1);
        mAudioPipe = new MediaDecoder2Audio(new MediaDataSource(true), "audio/mp4a-latm", mediaformat);
        mAudioPipe.setEventListener(mDecoderListener);
    }

    private void configureVideoPipe()
        throws Exception
    {
        Log.d("NF_JPlayer2", "configureVideoPipe");
        if (DrmManagerRegistry.isWidevineDrmAllowed() && mCrypto == null)
        {
            mCrypto = DrmManagerRegistry.getWidevineMediaDrmEngine().getMediaCrypto();
        }
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", "video/avc");
        if (AndroidUtils.getAndroidVersion() > 18)
        {
            int i = mMaxVideoBitrate;
            Pair pair;
            boolean flag;
            if (mCrypto != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            pair = AdaptiveMediaDecoderHelper.getRequiredMaximumResolution(i, flag);
            if (Log.isLoggable("NF_JPlayer2", 3))
            {
                Log.d("NF_JPlayer2", (new StringBuilder()).append("video max resolution is ").append(pair.first).append(" x ").append(pair.second).toString());
            }
            mediaformat.setInteger("max-width", ((Integer)pair.first).intValue());
            mediaformat.setInteger("max-height", ((Integer)pair.second).intValue());
            mediaformat.setInteger("width", ((Integer)pair.first).intValue());
            mediaformat.setInteger("height", ((Integer)pair.second).intValue());
        } else
        {
            mediaformat.setInteger("max-input-size", 0x100000);
            mediaformat.setInteger("width", 1920);
            mediaformat.setInteger("height", 1080);
        }
        if (mVideoPipe == null)
        {
            mVideoPipe = new MediaDecoder2Video(new MediaDataSource(false), "video/avc", mediaformat, mSurface, mCrypto);
            mVideoPipe.setEventListener(mDecoderListener);
            Log.d("NF_JPlayer2", "video pipe is ready");
            return;
        } else
        {
            Log.d("NF_JPlayer2", "video pipe is not ready, wait...");
            return;
        }
    }

    private void getBuffer(byte abyte0[], boolean flag, MediaDecoderBase.InputDataSource.BufferMeta buffermeta)
    {
        this;
        JVM INSTR monitorenter ;
        if (mState != 0)
        {
            nativeGetBuffer(abyte0, flag, buffermeta);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    private void getBufferDirect(ByteBuffer bytebuffer, boolean flag, MediaDecoderBase.InputDataSource.BufferMeta buffermeta)
    {
        this;
        JVM INSTR monitorenter ;
        if (mState != 0)
        {
            nativeGetBufferDirect(bytebuffer, flag, buffermeta);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        bytebuffer;
        throw bytebuffer;
    }

    private native void nativeGetBuffer(byte abyte0[], boolean flag, MediaDecoderBase.InputDataSource.BufferMeta buffermeta);

    private native void nativeGetBufferDirect(ByteBuffer bytebuffer, boolean flag, MediaDecoderBase.InputDataSource.BufferMeta buffermeta);

    private native long nativeGetPlayer();

    private native void nativeNotifyEndOfStream(boolean flag);

    private native void nativeNotifyError(int i, String s);

    private native void nativeNotifyReady();

    private native void nativeReleasePlayer(long l);

    private native void nativeUpdatePosition(boolean flag, long l);

    private void notifyEndOfStream(boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        if (mState != 0)
        {
            nativeNotifyEndOfStream(flag);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void notifyReady()
    {
        this;
        JVM INSTR monitorenter ;
        if (mState != 0)
        {
            nativeNotifyReady();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void updatePosition(boolean flag, long l)
    {
        this;
        JVM INSTR monitorenter ;
        if (mState != 0)
        {
            nativeUpdatePosition(flag, l);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void videoToBackground()
    {
        if (mVideoPipe != null)
        {
            mVideoPipe.stop();
        }
        mVideoPipe = null;
    }

    private void videoToForeground()
    {
        Log.d("NF_JPlayer2", "new surface, reconfigure decoder ");
        try
        {
            configureVideoPipe();
        }
        catch (Exception exception)
        {
            nativeNotifyError(-1, android.util.Log.getStackTraceString(exception));
        }
        if (mVideoPipe.isDecoderCreated())
        {
            MediaDecoderBase.Clock clock = mAudioPipe.getClock();
            mVideoPipe.setReferenceClock(clock);
            mVideoPipe.start();
            return;
        } else
        {
            Log.e("NF_JPlayer2", "VideoDecoder initialization failed at PAUSED, exiting...");
            mVideoPipe = null;
            return;
        }
    }

    public void Flush()
    {
        if (mVideoPipe != null)
        {
            mVideoPipe.flush();
        }
        if (mAudioPipe != null)
        {
            mAudioPipe.flush();
        }
        mState = 3;
        Log.d("NF_JPlayer2", "Flush called");
    }

    public void Pause()
    {
        if (mVideoPipe != null)
        {
            mVideoPipe.pause();
        }
        if (mAudioPipe != null)
        {
            mAudioPipe.pause();
        }
        mState = 2;
        Log.d("NF_JPlayer2", "Pause called");
    }

    public void Play()
    {
        mState;
        JVM INSTR tableswitch -1 3: default 40
    //                   -1 102
    //                   0 40
    //                   1 40
    //                   2 59
    //                   3 221;
           goto _L1 _L2 _L1 _L1 _L3 _L4
_L1:
        Log.d("NF_JPlayer2", "can not call Play ");
_L6:
        Log.d("NF_JPlayer2", "Play called");
        return;
_L3:
        if (mVideoPipe != null)
        {
            if (mAudioPipe != null)
            {
                mAudioPipe.unpause();
            }
            mVideoPipe.unpause();
        } else
        {
            videoToForeground();
        }
        mState = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (mAudioPipe != null)
        {
            MediaDecoderBase.Clock clock = mAudioPipe.getClock();
            mAudioPipe.setReferenceClock(clock);
            mAudioPipe.start();
        } else
        {
            Log.e("NF_JPlayer2", "mAudioPipe is null");
        }
        if (mVideoPipe != null)
        {
            if (mVideoPipe.isDecoderCreated())
            {
                MediaDecoderBase.Clock clock1 = mAudioPipe.getClock();
                mVideoPipe.setReferenceClock(clock1);
                mVideoPipe.start();
            } else
            {
                Log.e("NF_JPlayer2", "VideoDecoder initialization failed, exiting...");
                mVideoPipe = null;
            }
        } else
        {
            Log.e("NF_JPlayer2", "mVideoPipe is null");
        }
        mState = 1;
        continue; /* Loop/switch isn't completed */
_L4:
        if (mAudioPipe != null)
        {
            mAudioPipe.restart();
        }
        if (mVideoPipe != null)
        {
            mVideoPipe.restart();
        } else
        {
            videoToForeground();
        }
        mState = 1;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void Start()
    {
        if (mState == -1)
        {
            try
            {
                configureAudioPipe();
                configureVideoPipe();
            }
            catch (Exception exception)
            {
                exception.printStackTrace();
                nativeNotifyError(-1, android.util.Log.getStackTraceString(exception));
            }
        }
        Log.d("NF_JPlayer2", "Start called");
    }

    public void Stop()
    {
        if (mVideoPipe != null)
        {
            mVideoPipe.stop();
        }
        if (mAudioPipe != null)
        {
            mAudioPipe.stop();
        }
        mVideoPipe = null;
        mAudioPipe = null;
        if (mCrypto != null)
        {
            DrmManagerRegistry.getWidevineMediaDrmEngine().releaseMediaCrypto();
            mCrypto = null;
        }
        mState = 0;
        Log.d("NF_JPlayer2", "Stop called");
    }

    public long getNativePlayer()
    {
        mNativePlayer = nativeGetPlayer();
        return mNativePlayer;
    }

    public void release()
    {
        nativeReleasePlayer(mNativePlayer);
    }

    public void setMaxVideoBitrate(int i)
    {
        mMaxVideoBitrate = i;
    }

    public void updateSurface(Surface surface)
    {
        Log.d("NF_JPlayer2", "updateSurface");
        if (mSurface == surface)
        {
            return;
        }
        mSurface = surface;
        if (mSurface == null)
        {
            videoToBackground();
            Log.d("NF_JPlayer2", "surface becomes null");
        }
        Log.d("NF_JPlayer2", "updateSurface done");
    }







}
