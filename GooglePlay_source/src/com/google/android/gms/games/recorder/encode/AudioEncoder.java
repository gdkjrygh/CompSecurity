// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import com.google.android.gms.games.util.VideoEncodingProfiles;
import com.google.android.gms.games.util.VideoUtils;
import java.io.IOException;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            BaseEncoder, AudioInput, MediaMux

public final class AudioEncoder extends BaseEncoder
    implements AudioInput.FillBufferCallback
{

    private final AudioInput mAudioInput;
    private boolean mNeedEosFlag;

    private AudioEncoder(MediaFormat mediaformat, AudioInput audioinput, MediaMux mediamux)
        throws IOException
    {
        super(mediaformat, mediamux);
        mAudioInput = audioinput;
        mAudioInput.setFillBufferResponseHandler(this);
    }

    public static AudioEncoder newInstance$49d0fefd(Context context, AudioInput audioinput, MediaMux mediamux)
    {
        context = VideoEncodingProfiles.getInstance(context).getAudioFormat$11e6a031();
        if (context == null)
        {
            GamesLog.e("AudioEncoder", "Audio quality level is not supported");
            return null;
        }
        try
        {
            context = new AudioEncoder(context, audioinput, mediamux);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            GamesLog.e("AudioEncoder", "Could not create audio encoder", context);
            return null;
        }
        return context;
    }

    public final void onBufferFilled$57db82$2e70e3b3(int i, int j, long l, int k)
    {
        if (j < 0)
        {
            break MISSING_BLOCK_LABEL_37;
        }
        mEncoder.queueInputBuffer(i, 0, j, l, k);
_L1:
        return;
        Exception exception;
        exception;
        GamesLog.e("AudioEncoder", "Error queuing input to audio encoder", exception);
        notifyError(9014);
        return;
        if (!mNeedEosFlag)
        {
            GamesLog.e("AudioEncoder", (new StringBuilder("Error reading audio data: ")).append(j).toString());
            notifyError(9014);
            return;
        }
          goto _L1
    }

    public final void onInputBufferAvailable(MediaCodec mediacodec, int i)
    {
        Preconditions.checkNotMainThread("onInputBufferAvailable called on main thread");
        if (i >= 0) goto _L2; else goto _L1
_L1:
        GamesLog.e("AudioEncoder", (new StringBuilder("Unexpected buffer index for codec: ")).append(i).toString());
_L4:
        return;
_L2:
        mediacodec = mEncoder.getInputBuffer(i);
        if (mediacodec != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        try
        {
            GamesLog.e("AudioEncoder", "Got a null buffer valid buffer should be present");
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaCodec mediacodec)
        {
            GamesLog.e("AudioEncoder", "Error obtaining input buffer for audio encoder", mediacodec);
        }
        if (mNeedEosFlag) goto _L4; else goto _L3
_L3:
        notifyError(9014);
        return;
        mAudioInput.fillBufferRequest(i, mediacodec);
        return;
    }

    protected final void signalEndOfStream()
    {
        VideoUtils.logChatty("AudioEncoder", "calling signalEndOfStream");
        mNeedEosFlag = true;
    }
}
