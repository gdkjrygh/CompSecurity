// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.content.Context;
import android.media.AudioRecord;
import android.media.MediaFormat;
import android.media.audiofx.AutomaticGainControl;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.VideoEncodingProfiles;
import com.google.android.gms.games.util.VideoUtils;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            AudioInput

public final class MicInput
    implements AudioInput
{
    private final class AudioInputInfo
    {

        ByteBuffer buffer;
        int bufferId;
        int byteCount;
        int flags;
        long ptsMicros;
        final MicInput this$0;

        private AudioInputInfo()
        {
            this$0 = MicInput.this;
            super();
        }

        AudioInputInfo(byte byte0)
        {
            this();
        }
    }


    final LinkedList mAudioFreeList = new LinkedList();
    AudioRecord mAudioRecord;
    final ConcurrentLinkedQueue mAudioRequestQueue = new ConcurrentLinkedQueue();
    final ConcurrentLinkedQueue mAudioResponseQueue = new ConcurrentLinkedQueue();
    final Handler mClientHandler;
    AudioInput.FillBufferCallback mFillBufferCallback;
    volatile boolean mHasSentEos;
    volatile boolean mIsEnabled;
    private boolean mIsReleased;
    private boolean mIsStarted;
    boolean mIsStopped;
    private final AutomaticGainControl mMicGainControl;
    final Handler mMicHandler;
    final Runnable mProcessAudioRequestsAction = new Runnable() {

        final MicInput this$0;

        public final void run()
        {
            Object obj;
            obj = MicInput.this;
            Preconditions.checkNotMainThread("processAudioInputRequests called on main thread");
            ((MicInput) (obj)).mMicHandler.removeCallbacks(((MicInput) (obj)).mProcessAudioRequestsAction);
_L1:
            AudioInputInfo audioinputinfo;
            do
            {
label0:
                {
label1:
                    {
                        if (!((MicInput) (obj)).mAudioRequestQueue.isEmpty())
                        {
                            try
                            {
                                audioinputinfo = (AudioInputInfo)((MicInput) (obj)).mAudioRequestQueue.remove();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                GamesLog.e("MicInput", "Audio request queue unexpectedly empty");
                                return;
                            }
                            if (!((MicInput) (obj)).mIsStopped)
                            {
                                break label0;
                            }
                            if (!((MicInput) (obj)).mHasSentEos)
                            {
                                break label1;
                            }
                            GamesLog.d("MicInput", "Dropping audio request because encoder is stopped");
                        }
                        return;
                    }
                    GamesLog.d("MicInput", "Sending end of stream audio response");
                    audioinputinfo.byteCount = 0;
                    audioinputinfo.flags = 4;
                    ((MicInput) (obj)).sendAudioInputResponse(audioinputinfo);
                    return;
                }
                if (audioinputinfo.buffer == null)
                {
                    GamesLog.e("MicInput", "The buffer is null");
                } else
                {
label2:
                    {
                        audioinputinfo.byteCount = 0;
                        if (((MicInput) (obj)).mAudioRecord != null)
                        {
                            break label2;
                        }
                        GamesLog.e("MicInput", "Skipping audio input request due to missing recorder");
                        ((MicInput) (obj)).sendAudioInputResponse(audioinputinfo);
                    }
                }
            } while (true);
            Object obj1;
            int l;
            audioinputinfo.ptsMicros = System.nanoTime() / 1000L;
            obj1 = audioinputinfo.buffer;
            l = ((MicInput) (obj)).mAudioRecord.read(((ByteBuffer) (obj1)), ((ByteBuffer) (obj1)).capacity());
            audioinputinfo.byteCount = l;
label3:
            {
                if (l >= 0)
                {
                    break label3;
                }
                try
                {
                    GamesLog.e("MicInput", (new StringBuilder("Error reading audio sample data: ")).append(l).toString());
                    ((MicInput) (obj)).sendAudioInputResponse(audioinputinfo);
                }
                // Misplaced declaration of an exception variable
                catch (Object obj1)
                {
                    GamesLog.e("MicInput", "Error reading mic data", ((Throwable) (obj1)));
                    audioinputinfo.byteCount = -1;
                    ((MicInput) (obj)).sendAudioInputResponse(audioinputinfo);
                }
            }
              goto _L1
            if (!((MicInput) (obj)).mIsEnabled)
            {
                if (((MicInput) (obj)).mZeroBuf == null || ((MicInput) (obj)).mZeroBuf.length < ((ByteBuffer) (obj1)).capacity())
                {
                    obj.mZeroBuf = new byte[((ByteBuffer) (obj1)).capacity()];
                }
                ((ByteBuffer) (obj1)).position(0);
                ((ByteBuffer) (obj1)).put(((MicInput) (obj)).mZeroBuf, 0, l);
            }
            ((MicInput) (obj)).sendAudioInputResponse(audioinputinfo);
              goto _L1
        }

            
            {
                this$0 = MicInput.this;
                super();
            }
    };
    final Runnable mProcessAudioResponsesAction = new Runnable() {

        final MicInput this$0;

        public final void run()
        {
            Object obj = MicInput.this;
            Preconditions.checkNotMainThread("processAudioInputResponses called on main thread");
            ((MicInput) (obj)).mClientHandler.removeCallbacks(((MicInput) (obj)).mProcessAudioResponsesAction);
            do
            {
                AudioInputInfo audioinputinfo;
label0:
                {
label1:
                    {
                        if (!((MicInput) (obj)).mAudioResponseQueue.isEmpty())
                        {
                            try
                            {
                                audioinputinfo = (AudioInputInfo)((MicInput) (obj)).mAudioResponseQueue.remove();
                            }
                            // Misplaced declaration of an exception variable
                            catch (Object obj)
                            {
                                GamesLog.e("MicInput", "Audio response queue unexpectedly empty");
                                return;
                            }
                            if (!((MicInput) (obj)).mIsStopped)
                            {
                                break label0;
                            }
                            if (!((MicInput) (obj)).mHasSentEos)
                            {
                                break label1;
                            }
                            GamesLog.d("MicInput", "Dropping audio response because encoder is stopped");
                        }
                        return;
                    }
                    GamesLog.d("MicInput", "Forcing an end of stream buffer to be sent");
                    audioinputinfo.flags = audioinputinfo.flags | 4;
                    obj.mHasSentEos = true;
                }
                if (((MicInput) (obj)).mFillBufferCallback != null)
                {
                    ((MicInput) (obj)).mFillBufferCallback.onBufferFilled$57db82$2e70e3b3(audioinputinfo.bufferId, audioinputinfo.byteCount, audioinputinfo.ptsMicros, audioinputinfo.flags);
                }
                audioinputinfo.buffer = null;
                audioinputinfo.byteCount = 0;
                audioinputinfo.ptsMicros = 0L;
                audioinputinfo.bufferId = -1;
                audioinputinfo.flags = 0;
                ((MicInput) (obj)).mAudioFreeList.addLast(audioinputinfo);
            } while (true);
        }

            
            {
                this$0 = MicInput.this;
                super();
            }
    };
    byte mZeroBuf[];

    private MicInput(MediaFormat mediaformat, Handler handler, Handler handler1)
    {
        mMicHandler = handler;
        mClientHandler = handler1;
        int i = mediaformat.getInteger("sample-rate");
        int k = mediaformat.getInteger("channel-mask");
        mAudioRecord = new AudioRecord(1, i, k, 2, AudioRecord.getMinBufferSize(i, k, 2) * 4);
        if (mAudioRecord.getState() != 1)
        {
            int j = AudioRecord.getMinBufferSize(44100, 16, 2);
            mAudioRecord.release();
            mAudioRecord = new AudioRecord(1, 44100, 16, 2, j * 4);
            if (mAudioRecord.getState() != 1)
            {
                throw new RuntimeException("Could not get an audio recorder for the mic");
            }
        }
        if (AutomaticGainControl.isAvailable())
        {
            mMicGainControl = AutomaticGainControl.create(mAudioRecord.getAudioSessionId());
            mMicGainControl.setEnabled(true);
            return;
        } else
        {
            mMicGainControl = null;
            return;
        }
    }

    public static MicInput newInstance$669e2dbe(Context context, Handler handler, Handler handler1)
    {
        context = VideoEncodingProfiles.getInstance(context).getAudioFormat$11e6a031();
        if (context == null)
        {
            GamesLog.e("MicInput", "Audio quality level is not supported");
            return null;
        }
        try
        {
            context = new MicInput(context, handler, handler1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("MicInput", "Could not create mic input", context);
            return null;
        }
        return context;
    }

    public final void fillBufferRequest(int i, ByteBuffer bytebuffer)
    {
        AudioInputInfo audioinputinfo;
        if (mAudioFreeList.isEmpty())
        {
            audioinputinfo = new AudioInputInfo((byte)0);
        } else
        {
            audioinputinfo = (AudioInputInfo)mAudioFreeList.removeFirst();
        }
        audioinputinfo.buffer = bytebuffer;
        audioinputinfo.bufferId = i;
        audioinputinfo.byteCount = 0;
        audioinputinfo.flags = 0;
        mAudioRequestQueue.add(audioinputinfo);
        mMicHandler.post(mProcessAudioRequestsAction);
    }

    public final boolean release()
    {
        VideoUtils.logChatty("MicInput", "Calling release");
        if (mIsReleased)
        {
            return true;
        }
        stop();
        try
        {
            if (mMicGainControl != null)
            {
                mMicGainControl.release();
            }
            mAudioRecord.release();
            mIsReleased = true;
        }
        catch (Exception exception)
        {
            GamesLog.d("MicInput", "Releasing audio recorder failed", exception);
        }
        return mIsReleased;
    }

    final void sendAudioInputResponse(AudioInputInfo audioinputinfo)
    {
        mAudioResponseQueue.add(audioinputinfo);
        mClientHandler.post(mProcessAudioResponsesAction);
    }

    public final void setFillBufferResponseHandler(AudioInput.FillBufferCallback fillbuffercallback)
    {
        mFillBufferCallback = fillbuffercallback;
    }

    public final void setIsEnabled(boolean flag)
    {
        mIsEnabled = flag;
    }

    public final boolean start()
    {
        VideoUtils.logChatty("MicInput", "Calling start");
        if (mIsReleased)
        {
            GamesLog.e("MicInput", "Cannot start once released");
            return false;
        }
        if (mIsStopped)
        {
            GamesLog.e("MicInput", "Cannot restart once stopped");
            return false;
        }
        if (mIsStarted)
        {
            return true;
        }
        try
        {
            mAudioRecord.startRecording();
            mIsStarted = true;
        }
        catch (IllegalStateException illegalstateexception)
        {
            GamesLog.e("MicInput", "Could not start audio recorder", illegalstateexception);
        }
        return mIsStarted;
    }

    public final boolean stop()
    {
        VideoUtils.logChatty("MicInput", "Calling stop");
        if (mIsReleased)
        {
            GamesLog.e("MicInput", "Cannot stop once released");
            return false;
        }
        if (!mIsStarted)
        {
            GamesLog.e("MicInput", "Encoder not started");
            return false;
        }
        if (mIsStopped)
        {
            return true;
        }
        try
        {
            if (mMicGainControl != null && mMicGainControl.getEnabled())
            {
                mMicGainControl.setEnabled(false);
            }
        }
        catch (Exception exception)
        {
            GamesLog.d("MicInput", "Error stopping auto gain control", exception);
        }
        try
        {
            if (mAudioRecord.getRecordingState() != 1)
            {
                mAudioRecord.stop();
            }
            mIsStopped = true;
        }
        catch (Exception exception1)
        {
            GamesLog.d("MicInput", "Error stopping audio recorder", exception1);
        }
        return mIsStopped;
    }
}
