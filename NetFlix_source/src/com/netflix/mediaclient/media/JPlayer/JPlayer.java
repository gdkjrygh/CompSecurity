// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaFormat;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.netflix.mediaclient.util.AndroidUtils;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            AudioDecoderPipe, MediaDecoderPipe, VideoDecoderPipe

public class JPlayer
{
    public class AudioDataSource
        implements MediaDecoderPipe.InputDataSource
    {

        static final boolean $assertionsDisabled;
        final JPlayer this$0;

        public MediaDecoderPipe.InputDataSource.BufferMeta onRequestData(ByteBuffer bytebuffer)
        {
            MediaDecoderPipe.InputDataSource.BufferMeta buffermeta = new MediaDecoderPipe.InputDataSource.BufferMeta();
            InputBufInfo inputbufinfo = new InputBufInfo();
            int i;
            if (bytebuffer.isDirect())
            {
                i = nativeGetBufferDirect(bytebuffer, true, inputbufinfo);
            } else
            {
                Log.e("NF_JPlayer", "WITH NON-DIRECT BYTEBUFFER");
                byte abyte0[] = bytebuffer.array();
                if (abyte0 == null)
                {
                    buffermeta.size = 0;
                    buffermeta.flags = 256;
                    Log.e("NF_JPlayer", "can't get bytearray");
                    return buffermeta;
                }
                i = nativeGetBuffer(abyte0, true, inputbufinfo);
            }
            if (!$assertionsDisabled && i != inputbufinfo.mDataSize)
            {
                throw new AssertionError();
            } else
            {
                buffermeta.timestamp = inputbufinfo.mTimeStamp;
                buffermeta.flags = inputbufinfo.mFlags;
                buffermeta.size = inputbufinfo.mDataSize;
                bytebuffer.limit(inputbufinfo.mDataSize);
                bytebuffer.position(0);
                return buffermeta;
            }
        }

        static 
        {
            boolean flag;
            if (!com/netflix/mediaclient/media/JPlayer/JPlayer.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public AudioDataSource()
        {
            this$0 = JPlayer.this;
            super();
        }
    }

    public class InputBufInfo
    {

        int mDataSize;
        long mDebug;
        int mFlags;
        long mTimeStamp;
        final JPlayer this$0;

        public InputBufInfo()
        {
            this$0 = JPlayer.this;
            super();
        }
    }

    public static interface JplayerListener
    {

        public abstract Surface onGetTextureSurface();

        public abstract void onSurface2Visibility(boolean flag);
    }

    public class VideoDataSource
        implements MediaDecoderPipe.InputDataSource
    {

        static final boolean $assertionsDisabled;
        final JPlayer this$0;

        public MediaDecoderPipe.InputDataSource.BufferMeta onRequestData(ByteBuffer bytebuffer)
        {
            MediaDecoderPipe.InputDataSource.BufferMeta buffermeta = new MediaDecoderPipe.InputDataSource.BufferMeta();
            InputBufInfo inputbufinfo = new InputBufInfo();
            int i;
            if (bytebuffer.isDirect())
            {
                i = nativeGetBufferDirect(bytebuffer, false, inputbufinfo);
            } else
            {
                Log.e("NF_JPlayer", "WITH NON-DIRECT BYTEBUFFER");
                byte abyte0[] = bytebuffer.array();
                if (abyte0 == null)
                {
                    buffermeta.size = 0;
                    buffermeta.flags = 256;
                    Log.e("NF_JPlayer", "can't get bytearray");
                    return buffermeta;
                }
                i = nativeGetBuffer(abyte0, false, inputbufinfo);
            }
            if (!$assertionsDisabled && i != inputbufinfo.mDataSize)
            {
                throw new AssertionError();
            }
            buffermeta.offset = 0;
            buffermeta.timestamp = inputbufinfo.mTimeStamp;
            if ((inputbufinfo.mFlags & 4) != 0)
            {
                if (mEnablePlatformDrs)
                {
                    buffermeta.flags = 1;
                    buffermeta.size = inputbufinfo.mDataSize;
                } else
                {
                    buffermeta.flags = 256;
                    buffermeta.size = 0;
                    configureVideoPipe();
                    mSwitchingPending = true;
                }
            } else
            {
                buffermeta.flags = inputbufinfo.mFlags;
                buffermeta.size = inputbufinfo.mDataSize;
            }
            bytebuffer.limit(inputbufinfo.mDataSize);
            bytebuffer.position(0);
            return buffermeta;
        }

        static 
        {
            boolean flag;
            if (!com/netflix/mediaclient/media/JPlayer/JPlayer.desiredAssertionStatus())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            $assertionsDisabled = flag;
        }

        public VideoDataSource()
        {
            this$0 = JPlayer.this;
            super();
        }
    }

    public class VideoEventListener
        implements MediaDecoderPipe.EventListener
    {

        final JPlayer this$0;

        public void onDecoderStarted()
        {
            if (mAudioPipe != null && mAudioPipe.isPauseded())
            {
                mAudioPipe.unpause();
            }
        }

        public void onStartRender()
        {
            if (mVideoPipe != mVideoPipe1)
            {
                Log.d("NF_JPlayer", "mVideoPipe2 is current");
                if (mJplayerListener != null)
                {
                    mJplayerListener.onSurface2Visibility(true);
                }
                if (mVideoPipe1 != null && !mVideoPipe1.isStopped())
                {
                    mVideoPipe1.stop();
                }
                mVideoPipe1 = null;
                return;
            }
            Log.d("NF_JPlayer", "mVideoPipe1 is current");
            if (mJplayerListener != null)
            {
                mJplayerListener.onSurface2Visibility(false);
            }
            if (mVideoPipe2 != null && !mVideoPipe2.isStopped())
            {
                mVideoPipe2.stop();
            }
            mVideoPipe2 = null;
        }

        public void onStop()
        {
        }

        public VideoEventListener()
        {
            this$0 = JPlayer.this;
            super();
        }
    }


    static final int INIT_AUDIO_ERROR = -1;
    static final int INIT_VIDEO_ERROR = -2;
    static final int RUNTIME_ERROR = -3;
    static final int SD_HEIGHT = 480;
    static final int SD_WIDTH = 720;
    static final int STATE_INIT = -1;
    static final int STATE_PAUSED = 2;
    static final int STATE_PLAYING = 1;
    static final int STATE_STOPPED = 0;
    private static final String TAG = "NF_JPlayer";
    private String mAudioErrStack;
    private MediaDecoderPipe mAudioPipe;
    private boolean mEnablePlatformDrs;
    private boolean mFlushed;
    private boolean mInitialAudioInit;
    private boolean mInitialVideoInit;
    private JSONObject mJPlayerConfig;
    private JplayerListener mJplayerListener;
    VideoEventListener mListener;
    private long mNativePlayer;
    private volatile int mState;
    private Surface mSurface1;
    private Surface mSurface2;
    private SurfaceHolder mSurfaceHolder;
    private boolean mSwitchingPending;
    private MediaDecoderPipe mVideoPipe;
    private MediaDecoderPipe mVideoPipe1;
    private MediaDecoderPipe mVideoPipe2;

    public JPlayer(Surface surface, JSONObject jsonobject)
    {
        mEnablePlatformDrs = false;
        mState = -1;
        mFlushed = false;
        mInitialVideoInit = false;
        mInitialAudioInit = false;
        mAudioErrStack = "";
        mJPlayerConfig = null;
        mListener = new VideoEventListener();
        mJPlayerConfig = jsonobject;
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", "audio/mp4a-latm");
        mediaformat.setInteger("max-input-size", 1536);
        mediaformat.setInteger("channel-count", 2);
        mediaformat.setInteger("sample-rate", 48000);
        try
        {
            mAudioPipe = new AudioDecoderPipe(new AudioDataSource(), "audio/mp4a-latm", mediaformat, null, "1", jsonobject);
            mInitialAudioInit = true;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            mAudioErrStack = Log.getStackTraceString(jsonobject);
        }
        mSurface1 = surface;
    }

    public JPlayer(SurfaceHolder surfaceholder, JSONObject jsonobject)
    {
        mEnablePlatformDrs = false;
        mState = -1;
        mFlushed = false;
        mInitialVideoInit = false;
        mInitialAudioInit = false;
        mAudioErrStack = "";
        mJPlayerConfig = null;
        mListener = new VideoEventListener();
        mJPlayerConfig = jsonobject;
        MediaFormat mediaformat = new MediaFormat();
        mediaformat.setString("mime", "audio/mp4a-latm");
        mediaformat.setInteger("max-input-size", 1536);
        mediaformat.setInteger("channel-count", 2);
        mediaformat.setInteger("sample-rate", 48000);
        try
        {
            mAudioPipe = new AudioDecoderPipe(new AudioDataSource(), "audio/mp4a-latm", mediaformat, null, "1", jsonobject);
            mInitialAudioInit = true;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            jsonobject.printStackTrace();
            mAudioErrStack = Log.getStackTraceString(jsonobject);
        }
        mSurfaceHolder = surfaceholder;
    }

    private void configureVideoPipe()
    {
        Log.d("NF_JPlayer", "start video pipe");
        (new Thread(new Runnable() {

            final JPlayer this$0;

            public void run()
            {
                Object obj;
                obj = new MediaFormat();
                ((MediaFormat) (obj)).setString("mime", "video/avc");
                if (AndroidUtils.getAndroidVersion() > 18)
                {
                    ((MediaFormat) (obj)).setInteger("max-width", 720);
                    ((MediaFormat) (obj)).setInteger("max-height", 480);
                    ((MediaFormat) (obj)).setInteger("width", 720);
                    ((MediaFormat) (obj)).setInteger("height", 480);
                } else
                {
                    ((MediaFormat) (obj)).setInteger("max-input-size", 0x20000);
                    ((MediaFormat) (obj)).setInteger("width", 720);
                    ((MediaFormat) (obj)).setInteger("height", 480);
                }
_L3:
                if (mVideoPipe1 != null && (mVideoPipe == mVideoPipe1 || !mVideoPipe1.isStopped())) goto _L2; else goto _L1
_L1:
                Log.d("NF_JPlayer", "mVideoPipe1 is idle");
                try
                {
                    mVideoPipe1 = new VideoDecoderPipe(new VideoDataSource(), "video/avc", ((MediaFormat) (obj)), mSurface1, "1", mJPlayerConfig);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj)
                {
                    Log.e("NF_JPlayer", Log.getStackTraceString(((Throwable) (obj))));
                    if (!mInitialVideoInit)
                    {
                        nativeNotifyError(-2, Log.getStackTraceString(((Throwable) (obj))));
                    }
                    mVideoPipe = null;
                    return;
                }
                mVideoPipe = mVideoPipe1;
                mInitialVideoInit = true;
                mVideoPipe1.setEventListener(mListener);
_L4:
                InterruptedException interruptedexception;
                if (mVideoPipe.isDecoderCreated())
                {
                    obj = mAudioPipe.getClock();
                    mVideoPipe.start();
                    mVideoPipe.setReferenceClock(((MediaDecoderPipe.Clock) (obj)));
                    return;
                } else
                {
                    Log.e("NF_JPlayer", "VideoDecoder initialization failed, exiting...");
                    mVideoPipe = null;
                    return;
                }
_L2:
                if (mVideoPipe2 != null && (mVideoPipe == mVideoPipe2 || !mVideoPipe2.isStopped()))
                {
                    break MISSING_BLOCK_LABEL_541;
                }
                Log.d("NF_JPlayer", "mVideoPipe2 is idle");
                if (mSurface2 != null)
                {
                    break MISSING_BLOCK_LABEL_440;
                }
                if (mJplayerListener != null)
                {
                    mSurface2 = mJplayerListener.onGetTextureSurface();
                }
                if (mSurface2 != null)
                {
                    break MISSING_BLOCK_LABEL_440;
                }
                Log.d("NF_JPlayer", "TextureSurface is not ready, wait...");
                Thread.sleep(10L);
                  goto _L3
                obj;
                Log.d("NF_JPlayer", "configureVideoPipe interrupted");
                  goto _L4
                try
                {
                    mVideoPipe2 = new VideoDecoderPipe(new VideoDataSource(), "video/avc", ((MediaFormat) (obj)), mSurface2, "2", mJPlayerConfig);
                }
                catch (Exception exception)
                {
                    mVideoPipe = null;
                    Log.e("NF_JPlayer", Log.getStackTraceString(exception));
                    return;
                }
                mVideoPipe = mVideoPipe2;
                mVideoPipe2.setEventListener(mListener);
                  goto _L4
                Thread.sleep(50L);
                Log.d("NF_JPlayer", "video pipe is not ready, wait...");
                  goto _L3
                interruptedexception;
                Log.d("NF_JPlayer", "configureVideoPipe interrupted");
                  goto _L4
            }

            
            {
                this$0 = JPlayer.this;
                super();
            }
        }, "configure video pipe")).start();
    }

    private native int nativeGetBuffer(byte abyte0[], boolean flag, InputBufInfo inputbufinfo);

    private native int nativeGetBufferDirect(ByteBuffer bytebuffer, boolean flag, InputBufInfo inputbufinfo);

    private native long nativeGetPlayer();

    private native void nativeNotifyError(int i, String s);

    private native void nativeReleasePlayer(long l);

    private void setVideoCsd(byte abyte0[], MediaFormat mediaformat)
    {
        InputBufInfo inputbufinfo;
        ByteBuffer bytebuffer;
        inputbufinfo = new InputBufInfo();
        bytebuffer = ByteBuffer.wrap(abyte0);
        inputbufinfo.mDataSize = abyte0.length;
        if (1 != inputbufinfo.mFlags) goto _L2; else goto _L1
_L1:
        int i;
        bytebuffer.limit(inputbufinfo.mDataSize);
        bytebuffer.position(0);
        abyte0 = new byte[inputbufinfo.mDataSize];
        bytebuffer.get(abyte0);
        i = 1;
_L6:
        if (i < inputbufinfo.mDataSize - 3 && (abyte0[i] != 0 || abyte0[i + 1] != 0 || abyte0[i + 2] != 0 || abyte0[i + 3] != 1)) goto _L4; else goto _L3
_L3:
        ByteBuffer bytebuffer1 = ByteBuffer.wrap(abyte0, 0, i - 1);
        abyte0 = ByteBuffer.wrap(Arrays.copyOfRange(abyte0, i, inputbufinfo.mDataSize - 1));
        mediaformat.setByteBuffer("csd-0", bytebuffer1);
        if (Log.isLoggable("NF_JPlayer", 3))
        {
            Log.d("NF_JPlayer", (new StringBuilder()).append("csd-0: ").append(bytebuffer1).toString());
        }
        mediaformat.setByteBuffer("csd-1", abyte0);
        if (Log.isLoggable("NF_JPlayer", 3))
        {
            Log.d("NF_JPlayer", (new StringBuilder()).append("csd-1: ").append(abyte0).toString());
        }
_L2:
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void Flush()
    {
        if (mVideoPipe != null)
        {
            mVideoPipe.flush();
        }
        if (mVideoPipe == mVideoPipe1 || mVideoPipe1 == null) goto _L2; else goto _L1
_L1:
        mVideoPipe1.flush();
_L4:
        if (mAudioPipe != null)
        {
            mAudioPipe.flush();
        }
        mFlushed = true;
        Log.d("NF_JPlayer", "Flush called");
        return;
_L2:
        if (mVideoPipe != mVideoPipe2 && mVideoPipe2 != null)
        {
            mVideoPipe2.flush();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public long GetPTS()
    {
        long l = -1L;
        if (mAudioPipe != null)
        {
            l = mAudioPipe.getClock().get();
        }
        return l;
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
        Log.d("NF_JPlayer", "Pause called");
    }

    public void Play()
    {
        mState;
        JVM INSTR tableswitch -1 2: default 36
    //                   -1 94
    //                   0 94
    //                   1 36
    //                   2 51;
           goto _L1 _L2 _L2 _L1 _L3
_L1:
        mFlushed = false;
        Log.d("NF_JPlayer", "Play called");
        return;
_L3:
        if (!mFlushed && mAudioPipe != null)
        {
            mAudioPipe.unpause();
        }
        if (mVideoPipe != null)
        {
            mVideoPipe.unpause();
        }
        mState = 1;
        continue; /* Loop/switch isn't completed */
_L2:
        if (mAudioPipe != null)
        {
            mAudioPipe.start();
            MediaDecoderPipe.Clock clock = mAudioPipe.getClock();
            mAudioPipe.setReferenceClock(clock);
            mAudioPipe.pause();
        } else
        {
            Log.e("NF_JPlayer", "mAudioPipe is null");
        }
        configureVideoPipe();
        mState = 1;
        if (true) goto _L1; else goto _L4
_L4:
    }

    public void Start()
    {
        Log.d("NF_JPlayer", "Start called");
        if (!mInitialAudioInit)
        {
            nativeNotifyError(-1, mAudioErrStack);
        }
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
        mState = 0;
        mFlushed = false;
        Log.d("NF_JPlayer", "Stop called");
    }

    public long getNativePlayer()
    {
        mNativePlayer = nativeGetPlayer();
        return mNativePlayer;
    }

    public void release()
    {
        nativeReleasePlayer(mNativePlayer);
        mJplayerListener = null;
    }

    public void setEnablePlatformDrs(boolean flag)
    {
        mEnablePlatformDrs = flag;
        if (Log.isLoggable("NF_JPlayer", 3))
        {
            Log.d("NF_JPlayer", (new StringBuilder()).append("setEnablePlatformDrs: ").append(flag).toString());
        }
    }

    public void setJplayerListener(JplayerListener jplayerlistener)
    {
        mJplayerListener = jplayerlistener;
        if (mJplayerListener == null)
        {
            Log.e("NF_JPlayer", "setJplayerListener mJplayerListener is null");
            return;
        } else
        {
            Log.d("NF_JPlayer", "setJplayerListener ");
            mJplayerListener.onSurface2Visibility(false);
            return;
        }
    }

    public void setSurface(Surface surface)
    {
        Log.d("NF_JPlayer", "setSurface");
        mSurface2 = surface;
    }







/*
    static boolean access$1202(JPlayer jplayer, boolean flag)
    {
        jplayer.mInitialVideoInit = flag;
        return flag;
    }

*/




/*
    static Surface access$1402(JPlayer jplayer, Surface surface)
    {
        jplayer.mSurface2 = surface;
        return surface;
    }

*/




/*
    static boolean access$402(JPlayer jplayer, boolean flag)
    {
        jplayer.mSwitchingPending = flag;
        return flag;
    }

*/



/*
    static MediaDecoderPipe access$502(JPlayer jplayer, MediaDecoderPipe mediadecoderpipe)
    {
        jplayer.mVideoPipe = mediadecoderpipe;
        return mediadecoderpipe;
    }

*/



/*
    static MediaDecoderPipe access$602(JPlayer jplayer, MediaDecoderPipe mediadecoderpipe)
    {
        jplayer.mVideoPipe1 = mediadecoderpipe;
        return mediadecoderpipe;
    }

*/




/*
    static MediaDecoderPipe access$802(JPlayer jplayer, MediaDecoderPipe mediadecoderpipe)
    {
        jplayer.mVideoPipe2 = mediadecoderpipe;
        return mediadecoderpipe;
    }

*/

}
