// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.media.JPlayer;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.util.AndroidUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;

// Referenced classes of package com.netflix.mediaclient.media.JPlayer:
//            MediaDecoderBase, AdaptiveMediaDecoderHelper

public abstract class MediaDecoderPipe2 extends MediaDecoderBase
{
    protected class LocalStateNotifier
    {

        private static final int STATE_FLUSHED = 5;
        private static final int STATE_FLUSHING = 4;
        private static final int STATE_PAUSED = 1;
        private static final int STATE_PAUSING = 2;
        private static final int STATE_PLAYING = 3;
        private int mState;
        final MediaDecoderPipe2 this$0;

        boolean isFlushed()
        {
            this;
            JVM INSTR monitorenter ;
            int i = mState;
            boolean flag;
            if (i == 5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean isFlushing()
        {
            this;
            JVM INSTR monitorenter ;
            int i = mState;
            boolean flag;
            if (i == 4)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean isPaused()
        {
            boolean flag = true;
            this;
            JVM INSTR monitorenter ;
            int i = mState;
            if (i != 1)
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean isPausing()
        {
            this;
            JVM INSTR monitorenter ;
            int i = mState;
            boolean flag;
            if (i == 2)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        boolean isPlaying()
        {
            this;
            JVM INSTR monitorenter ;
            int i = mState;
            boolean flag;
            if (i == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            this;
            JVM INSTR monitorexit ;
            return flag;
            Exception exception;
            exception;
            throw exception;
        }

        void onFlushed()
        {
            this;
            JVM INSTR monitorenter ;
            mState = 5;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void onFlushing()
        {
            this;
            JVM INSTR monitorenter ;
            mState = 4;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void onPaused()
        {
            this;
            JVM INSTR monitorenter ;
            mState = 1;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void onPausing()
        {
            this;
            JVM INSTR monitorenter ;
            mState = 2;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        void onPlaying()
        {
            this;
            JVM INSTR monitorenter ;
            mState = 3;
            this;
            JVM INSTR monitorexit ;
            return;
            Exception exception;
            exception;
            throw exception;
        }

        protected LocalStateNotifier()
        {
            this$0 = MediaDecoderPipe2.this;
            super();
            mState = 1;
        }
    }


    private static final long INPUTBUFFER_TO = -1L;
    private static final int MSG_DECODER_FLUSH = 2;
    private static final int MSG_DECODER_GET_FRAME = 1;
    private static final int MSG_DECODER_INITIALIZED = 3;
    private static final int MSG_DECODER_STOP = 4;
    private static final long OUTPUTBUFFER_TO = -1L;
    private static final String TAG = "MediaDecoder2";
    protected static final long TIME_TO_NEXT_RETRY = 20L;
    protected static final boolean USE_ANDROID_L_API;
    private MediaDecoderBase.InputDataSource mDataSource;
    protected MediaCodec mDecoder;
    private boolean mDecoderPause;
    private boolean mEncrypted;
    private int mInputBufferCnt;
    private ByteBuffer mInputBuffers[];
    private LinkedList mInputBuffersQ;
    private Handler mInputHandler;
    private LocalStateNotifier mInputState;
    private HandlerThread mInputThread;
    private boolean mIsAudio;
    private int mOutputBufferCnt;
    protected android.media.MediaCodec.BufferInfo mOutputBufferInfo[];
    protected ByteBuffer mOutputBuffers[];
    protected LinkedList mOutputBuffersQ;
    private Handler mOutputHandler;
    private LocalStateNotifier mOutputState;
    private HandlerThread mOutputThread;
    private String mTag;

    public MediaDecoderPipe2(MediaDecoderBase.InputDataSource inputdatasource, String s, MediaFormat mediaformat, Surface surface, MediaCrypto mediacrypto)
        throws Exception
    {
        mDecoder = null;
        mInputState = new LocalStateNotifier();
        mOutputState = new LocalStateNotifier();
        StringBuilder stringbuilder = new StringBuilder("MediaDecoder2");
        if (s.startsWith("audio/"))
        {
            mIsAudio = true;
            stringbuilder.append("Audio");
            mTag = stringbuilder.toString();
        } else
        if (s.startsWith("video/"))
        {
            mIsAudio = false;
            stringbuilder.append("Video");
            mTag = stringbuilder.toString();
        } else
        if (Log.isLoggable(mTag, 6))
        {
            Log.e(mTag, (new StringBuilder()).append(s).append(" is not valid").toString());
        }
        Log.d(mTag, "creating ... ");
        mDataSource = inputdatasource;
        createDecoder(s, mediacrypto);
        if (mediacrypto != null)
        {
            mEncrypted = true;
        } else
        {
            mEncrypted = false;
        }
        configureDecoder(mediaformat, surface, mediacrypto);
        startDecoder();
        configureOutputBuffers();
        mState = -1;
    }

    private boolean configureDecoder(MediaFormat mediaformat, Surface surface, MediaCrypto mediacrypto)
    {
        mDecoder.configure(mediaformat, surface, mediacrypto, 0);
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("configureDecoder ").append(mediaformat).toString());
        }
        return true;
    }

    private void configureOutputBuffers()
    {
        try
        {
            mOutputBuffers = mDecoder.getOutputBuffers();
        }
        catch (Exception exception)
        {
            Log.e(mTag, "get un-known exception while getOutputBuffers()");
            mOutputBufferCnt = 0;
            return;
        }
        mOutputBufferCnt = mOutputBuffers.length;
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("has ").append(mOutputBufferCnt).append(" output buffers").toString());
        }
        mOutputBufferInfo = new android.media.MediaCodec.BufferInfo[mOutputBufferCnt];
    }

    private boolean createDecoder(String s, MediaCrypto mediacrypto)
    {
        if (!mIsAudio)
        {
            boolean flag;
            if (mediacrypto != null && mediacrypto.requiresSecureDecoderComponent(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (AndroidUtils.getAndroidVersion() > 18)
            {
                createVideoDecoderForK(s, flag);
            } else
            {
                createVideoDecoderPreK(s, flag);
            }
        }
        if (mDecoder == null)
        {
            mDecoder = MediaCodec.createDecoderByType(s);
            if (Log.isLoggable(mTag, 3))
            {
                Log.d(mTag, (new StringBuilder()).append("createDecoder ").append(s).toString());
            }
        }
        return true;
    }

    private void createInputThread()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Inputthread");
        String s;
        if (mIsAudio)
        {
            s = "Audio";
        } else
        {
            s = "Video";
        }
        mInputThread = new HandlerThread(stringbuilder.append(s).toString(), -2);
        mInputThread.start();
        mInputHandler = new Handler(mInputThread.getLooper()) {

            long frameReceived;
            final MediaDecoderPipe2 this$0;

            public void handleMessage(Message message)
            {
                message.what;
                JVM INSTR tableswitch 1 4: default 36
            //                           1 50
            //                           2 886
            //                           3 938
            //                           4 982;
                   goto _L1 _L2 _L3 _L4 _L5
_L1:
                Log.d(mTag, "outputthread handler had unknown message");
_L21:
                return;
_L2:
                int i = -1;
                if (!mInputBuffersQ.isEmpty() || mDecoderPause) goto _L7; else goto _L6
_L6:
                int j = mDecoder.dequeueInputBuffer(-1L);
                i = j;
_L9:
                if (i >= 0 && i < mInputBufferCnt)
                {
                    mInputBuffersQ.add(Integer.valueOf(i));
                } else
                {
                    Log.d(mTag, (new StringBuilder()).append("get invlaid buffer index ").append(i).append(" as a result of dequeueInputBuffer()").toString());
                }
_L7:
                if (mDecoderPause)
                {
                    Log.d(mTag, "inputthread pause");
                    return;
                }
                  goto _L8
                message;
                Log.d(mTag, (new StringBuilder()).append("get un-documented exception as a result of dequeueInputBuffer() ").append(message.getMessage()).toString());
                  goto _L9
_L8:
                if (mInputBuffersQ.isEmpty()) goto _L11; else goto _L10
_L10:
                j = ((Integer)mInputBuffersQ.peekFirst()).intValue();
                message = mInputBuffers[j];
                message = mDataSource.onRequestData(message);
                if (((MediaDecoderBase.InputDataSource.BufferMeta) (message)).size <= 0 && ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).flags == 0) goto _L13; else goto _L12
_L12:
                if (frameReceived <= 0L && Log.isLoggable(mTag, 3))
                {
                    Log.d(mTag, (new StringBuilder()).append("QueueInput ").append(j).append(" from ").append(((MediaDecoderBase.InputDataSource.BufferMeta) (message)).offset).append(" size= ").append(((MediaDecoderBase.InputDataSource.BufferMeta) (message)).size).append(" @").append(((MediaDecoderBase.InputDataSource.BufferMeta) (message)).timestamp).append(" ms").append(" flags ").append(((MediaDecoderBase.InputDataSource.BufferMeta) (message)).flags).toString());
                }
                if (mRefClock != null && ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).timestamp < mRefClock.get() && Log.isLoggable(mTag, 3))
                {
                    Log.d(mTag, (new StringBuilder()).append("STAT:DEC input late ").append(frameReceived).append(" at ").append(mRefClock.get()).append(" by ").append(((MediaDecoderBase.InputDataSource.BufferMeta) (message)).timestamp - mRefClock.get()).append(" ms").toString());
                }
                if ((((MediaDecoderBase.InputDataSource.BufferMeta) (message)).flags & 4) != 0)
                {
                    Log.d(mTag, "got decoder input BUFFER_FLAG_END_OF_STREAM");
                }
                if (!mEncrypted) goto _L15; else goto _L14
_L14:
                android.media.MediaCodec.CryptoInfo cryptoinfo;
                cryptoinfo = new android.media.MediaCodec.CryptoInfo();
                cryptoinfo.mode = 1;
                if (((MediaDecoderBase.InputDataSource.BufferMeta) (message)).nByteEncrypted.length != 0) goto _L17; else goto _L16
_L16:
                byte abyte0[] = new byte[16];
                i = 0;
                while (i < abyte0.length) 
                {
                    abyte0[i] = 0;
                    i++;
                }
                cryptoinfo.iv = abyte0;
                cryptoinfo.key = abyte0;
                cryptoinfo.numBytesOfClearData = (new int[] {
                    ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).size
                });
                cryptoinfo.numBytesOfEncryptedData = (new int[] {
                    0
                });
                cryptoinfo.numSubSamples = 1;
_L18:
                mDecoder.queueSecureInputBuffer(j, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).offset, cryptoinfo, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).timestamp * 1000L, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).flags);
_L19:
                mInputBuffersQ.removeFirst();
                frameReceived = frameReceived + 1L;
                mInputHandler.removeMessages(1);
                mInputHandler.sendEmptyMessage(1);
                return;
_L17:
                try
                {
                    cryptoinfo.iv = ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).iv;
                    cryptoinfo.key = ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).key;
                    cryptoinfo.numBytesOfClearData = ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).nByteInClear;
                    cryptoinfo.numBytesOfEncryptedData = ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).nByteEncrypted;
                    cryptoinfo.numSubSamples = ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).nSubsample;
                }
                // Misplaced declaration of an exception variable
                catch (Message message)
                {
                    Log.d(mTag, (new StringBuilder()).append("get un-documented exception as a result of queueInputBuffer() ").append(message).toString());
                    return;
                }
                  goto _L18
_L15:
                mDecoder.queueInputBuffer(j, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).offset, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).size, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).timestamp * 1000L, ((MediaDecoderBase.InputDataSource.BufferMeta) (message)).flags);
                  goto _L19
_L13:
                mInputHandler.removeMessages(1);
                mInputHandler.sendEmptyMessageDelayed(1, 20L);
                return;
                  goto _L18
_L11:
                mInputHandler.removeMessages(1);
                mInputHandler.sendEmptyMessageDelayed(1, 20L);
                return;
_L3:
                mInputBuffersQ.clear();
                synchronized (mInputState)
                {
                    mInputState.notify();
                }
                Log.d(mTag, "flush input done");
                return;
                exception;
                message;
                JVM INSTR monitorexit ;
                throw exception;
_L4:
                Log.d(mTag, "input is initialized");
                if (mEventListener == null) goto _L21; else goto _L20
_L20:
                mEventListener.onDecoderReady(mIsAudio);
                return;
_L5:
                Log.d(mTag, "input is stopped");
                return;
            }

            
            {
                this$0 = MediaDecoderPipe2.this;
                super(looper);
                frameReceived = 0L;
            }
        };
    }

    private void createOutputThread()
    {
        StringBuilder stringbuilder = (new StringBuilder()).append("Outputthread");
        String s;
        if (mIsAudio)
        {
            s = "Audio";
        } else
        {
            s = "Video";
        }
        mOutputThread = new HandlerThread(stringbuilder.append(s).toString(), -2);
        mOutputThread.start();
        mOutputHandler = new Handler(mOutputThread.getLooper()) {

            long frameDecoded;
            final MediaDecoderPipe2 this$0;

            public void handleMessage(Message message)
            {
                switch (message.what)
                {
                default:
                    Log.d(mTag, "outputthread handler had unknown message");
                    return;

                case 1: // '\001'
                    if (mDecoderPause)
                    {
                        Log.d(mTag, "outputthread pause");
                        return;
                    }
                    message = new android.media.MediaCodec.BufferInfo();
                    int i;
                    try
                    {
                        i = mDecoder.dequeueOutputBuffer(message, -1L);
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        Log.d(mTag, (new StringBuilder()).append("get un-documented exception as a result of dequeueOutputBuffer() ").append(message.getMessage()).toString());
                        return;
                    }
                    if (i != -1)
                    {
                        if (i == -3)
                        {
                            Log.d(mTag, "OUTPUT_BUFFERS_CHANGED");
                            configureOutputBuffers();
                        } else
                        if (i == -2)
                        {
                            message = mDecoder.getOutputFormat();
                            if (Log.isLoggable(mTag, 3))
                            {
                                Log.d(mTag, (new StringBuilder()).append("OUTPUT_FORMAT_CHANGED ").append(message).toString());
                            }
                        } else
                        if (i >= 0 && i < mOutputBufferCnt)
                        {
                            addToRenderer(i, message);
                            if ((((android.media.MediaCodec.BufferInfo) (message)).flags & 4) != 0)
                            {
                                Log.d(mTag, "got decoder output BUFFER_FLAG_END_OF_STREAM");
                            }
                            if (frameDecoded <= 0L && Log.isLoggable(mTag, 3))
                            {
                                Log.d(mTag, (new StringBuilder()).append("DequeueOutputBuffer ").append(i).append(" size= ").append(((android.media.MediaCodec.BufferInfo) (message)).size).append(" @").append(((android.media.MediaCodec.BufferInfo) (message)).presentationTimeUs / 1000L).append(" ms").toString());
                            }
                            if (mRefClock != null && ((android.media.MediaCodec.BufferInfo) (message)).presentationTimeUs / 1000L <= mRefClock.get() && Log.isLoggable(mTag, 3))
                            {
                                Log.d(mTag, (new StringBuilder()).append("STAT:DEC output late ").append(frameDecoded).append(" at ").append(mRefClock.get()).append(" by ").append(((android.media.MediaCodec.BufferInfo) (message)).presentationTimeUs / 1000L - mRefClock.get()).append(" ms").toString());
                            }
                            frameDecoded = frameDecoded + 1L;
                            int j;
                            if (mIsAudio)
                            {
                                i = mOutputBufferCnt - 1;
                            } else
                            {
                                i = 1;
                            }
                            if (i <= 0)
                            {
                                j = 1;
                            } else
                            {
                                j = i;
                                if (i >= 4)
                                {
                                    j = 4;
                                }
                            }
                            if (frameDecoded == (long)j && mEventListener != null)
                            {
                                mEventListener.onDecoderStarted(mIsAudio);
                            }
                        } else
                        {
                            Log.e(mTag, (new StringBuilder()).append(i).append(" is not valid").toString());
                        }
                    }
                    mOutputHandler.removeMessages(1);
                    mOutputHandler.sendEmptyMessage(1);
                    return;

                case 2: // '\002'
                    synchronized (mOutputState)
                    {
                        mOutputState.notify();
                    }
                    frameDecoded = 0L;
                    Log.d(mTag, "flush output done");
                    return;

                case 3: // '\003'
                    Log.d(mTag, "output is initialized");
                    return;

                case 4: // '\004'
                    Log.d(mTag, "output stopping...");
                    try
                    {
                        mDecoder.stop();
                    }
                    // Misplaced declaration of an exception variable
                    catch (Message message)
                    {
                        Log.d(mTag, (new StringBuilder()).append("get un-documented exception as a result of stop() ").append(message.getMessage()).toString());
                    }
                    synchronized (mOutputState)
                    {
                        mOutputState.notify();
                    }
                    Log.d(mTag, "output is stopped");
                    return;
                }
                exception;
                message;
                JVM INSTR monitorexit ;
                throw exception;
                exception1;
                message;
                JVM INSTR monitorexit ;
                throw exception1;
            }

            
            {
                this$0 = MediaDecoderPipe2.this;
                super(looper);
                frameDecoded = 0L;
            }
        };
    }

    private void createVideoDecoderForK(String s, boolean flag)
    {
        String s2 = AdaptiveMediaDecoderHelper.getAdaptivePlaybackDecoderName(s);
        if (s2 == null)
        {
            Log.e(mTag, (new StringBuilder()).append("createVideoDecoderForK ").append(s).append("has no adaptive decoder").toString());
            return;
        }
        String s1 = s2;
        if (flag)
        {
            s1 = (new StringBuilder()).append(s2).append(".secure").toString();
        }
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("createVideoDecoderForK ").append(s).append(", name ").append(s1).toString());
        }
        try
        {
            mDecoder = MediaCodec.createByCodecName(s1);
            return;
        }
        catch (Exception exception)
        {
            Log.d(mTag, (new StringBuilder()).append("createVideoDecoderForK ").append(s).append(", name ").append(s1).append(" failed").toString());
        }
        mDecoder = null;
    }

    private void createVideoDecoderPreK(String s, boolean flag)
    {
        Object obj;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_168;
        }
        try
        {
            Log.d(mTag, "try OMX.qcom.video.decoder.avc.smoothstreaming.secure");
            mDecoder = MediaCodec.createByCodecName("OMX.qcom.video.decoder.avc.smoothstreaming.secure");
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(mTag, "createSecureDecoder OMX.qcom.video.decoder.avc.smoothstreaming.secure failed");
            mDecoder = null;
        }
        if (mDecoder != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        obj = getSecureDecoderNameForMime(s);
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("createSecureDecoder ").append(s).append(", name ").append(((String) (obj))).toString());
        }
        mDecoder = MediaCodec.createByCodecName(((String) (obj)));
        return;
        Exception exception;
        exception;
        Log.e(mTag, (new StringBuilder()).append("createSecureDecoder ").append(s).append(", name ").append(((String) (obj))).append(" failed").toString());
        mDecoder = null;
        return;
        try
        {
            Log.d(mTag, "try OMX.qcom.video.decoder.avc.smoothstreaming");
            mDecoder = MediaCodec.createByCodecName("OMX.qcom.video.decoder.avc.smoothstreaming");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(mTag, "createSecureDecoder OMX.qcom.video.decoder.avc.smoothstreaming failed");
        }
        mDecoder = null;
        return;
    }

    private String getSecureDecoderNameForMime(String s)
    {
        int k = MediaCodecList.getCodecCount();
        int i = 0;
        while (i < k) 
        {
            MediaCodecInfo mediacodecinfo = MediaCodecList.getCodecInfoAt(i);
            if (!mediacodecinfo.isEncoder())
            {
                String as[] = mediacodecinfo.getSupportedTypes();
                int j = 0;
                while (j < as.length) 
                {
                    if (as[j].equalsIgnoreCase(s))
                    {
                        return (new StringBuilder()).append(mediacodecinfo.getName()).append(".secure").toString();
                    }
                    j++;
                }
            }
            i++;
        }
        return null;
    }

    private boolean startDecoder()
    {
        mDecoder.start();
        mInputBuffers = mDecoder.getInputBuffers();
        mInputBufferCnt = mInputBuffers.length;
        if (Log.isLoggable(mTag, 3))
        {
            Log.d(mTag, (new StringBuilder()).append("has ").append(mInputBufferCnt).append(" input buffers").toString());
        }
        mInputBuffersQ = new LinkedList();
        mOutputBuffersQ = new LinkedList();
        createInputThread();
        createOutputThread();
        mInputHandler.sendEmptyMessageDelayed(3, 20L);
        return true;
    }

    abstract void addToRenderer(int i, android.media.MediaCodec.BufferInfo bufferinfo);

    abstract void createRenderer();

    public void flush()
    {
        Object obj;
        try
        {
            mDecoder.flush();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d(mTag, (new StringBuilder()).append("get un-documented exception as a result of flush() ").append(((Exception) (obj)).getMessage()).toString());
        }
        Log.d(mTag, "flushinput");
        if (mInputHandler == null)
        {
            break MISSING_BLOCK_LABEL_57;
        }
        obj = mInputState;
        obj;
        JVM INSTR monitorenter ;
        mInputHandler.removeMessages(1);
        mInputHandler.sendEmptyMessage(2);
        mInputState.wait();
_L4:
        Log.d(mTag, "flushoutput");
        if (mOutputHandler == null)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        obj = mOutputState;
        obj;
        JVM INSTR monitorenter ;
        mOutputHandler.removeMessages(1);
        mOutputHandler.sendEmptyMessage(2);
        mOutputState.wait();
_L2:
        flushRenderer();
        return;
        Object obj1;
        obj1;
        Log.d("MediaDecoder2", "flushinput interrupted");
        continue; /* Loop/switch isn't completed */
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        obj1;
        Log.d("MediaDecoder2", "flushoutput interrupted");
        if (true) goto _L2; else goto _L1
_L1:
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        if (true) goto _L4; else goto _L3
_L3:
    }

    abstract void flushRenderer();

    void hexprint(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < abyte0.length; i++)
        {
            stringbuilder.append(String.format("%02x  ", new Object[] {
                Byte.valueOf(abyte0[i])
            }));
        }

        Log.d(mTag, stringbuilder.toString());
    }

    void hexprint(int ai[])
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < ai.length; i++)
        {
            stringbuilder.append(String.format("%04x  ", new Object[] {
                Integer.valueOf(ai[i])
            }));
        }

        Log.d(mTag, stringbuilder.toString());
    }

    public void pause()
    {
        Log.d(mTag, "pause()");
        mDecoderPause = true;
        pauseRenderer();
    }

    abstract void pauseRenderer();

    public void restart()
    {
        Log.d(mTag, "restart()");
        mDecoderPause = false;
        mInputHandler.sendEmptyMessage(1);
        mOutputHandler.sendEmptyMessage(1);
    }

    public void start()
    {
        Log.d(mTag, "start()");
        mDecoderPause = false;
        mInputHandler.sendEmptyMessage(1);
        mOutputHandler.sendEmptyMessage(1);
        createRenderer();
        startRenderer();
    }

    abstract void startRenderer();

    public void stop()
    {
        Object obj;
        Log.d(mTag, "stop()");
        try
        {
            mDecoder.stop();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.d(mTag, (new StringBuilder()).append("get un-documented exception as a result of stop() ").append(((Exception) (obj)).getMessage()).toString());
        }
        stopRenderer();
        if (mInputHandler != null)
        {
            mInputHandler.removeMessages(1);
            mInputHandler.removeMessages(2);
        }
        if (mInputThread != null)
        {
            mInputThread.quit();
        }
        Log.d(mTag, "input thread stopped");
        if (mOutputHandler == null)
        {
            break MISSING_BLOCK_LABEL_118;
        }
        mOutputHandler.removeMessages(1);
        mOutputHandler.removeMessages(2);
        obj = mOutputState;
        obj;
        JVM INSTR monitorenter ;
        mOutputHandler.sendEmptyMessage(4);
        mOutputState.wait();
_L1:
        if (mOutputThread != null)
        {
            mOutputThread.quit();
        }
        Log.d(mTag, "output thread stopped");
        Object obj1;
        try
        {
            if (mInputThread != null)
            {
                mInputThread.join();
            }
            if (mOutputThread != null)
            {
                mOutputThread.join();
            }
        }
        catch (InterruptedException interruptedexception)
        {
            Log.e(mTag, "input/output thread is interrupted");
        }
        Log.d(mTag, "release()");
        try
        {
            mDecoder.release();
            return;
        }
        catch (Exception exception)
        {
            Log.d(mTag, "get un-documented exception as a result of releas()");
        }
        break MISSING_BLOCK_LABEL_272;
        obj1;
        Log.d("MediaDecoder2", "stop output interrupted");
          goto _L1
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    abstract void stopRenderer();

    public void unpause()
    {
        Log.d(mTag, "unpause()");
        mDecoderPause = false;
        mInputHandler.sendEmptyMessage(1);
        mOutputHandler.sendEmptyMessage(1);
        unpauseRenderer();
    }

    abstract void unpauseRenderer();

    static 
    {
        boolean flag;
        if (AndroidUtils.getAndroidVersion() > 19)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        USE_ANDROID_L_API = flag;
    }














}
