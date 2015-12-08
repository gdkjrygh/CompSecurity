// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.recorder.encode;

import android.media.AudioRecord;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.games.internal.GamesLog;
import java.nio.ByteBuffer;
import java.util.NoSuchElementException;
import java.util.concurrent.ConcurrentLinkedQueue;

// Referenced classes of package com.google.android.gms.games.recorder.encode:
//            MicInput

final class this._cls0
    implements Runnable
{

    final MicInput this$0;

    public final void run()
    {
        Object obj;
        obj = MicInput.this;
        Preconditions.checkNotMainThread("processAudioInputRequests called on main thread");
        ((MicInput) (obj)).mMicHandler.removeCallbacks(((MicInput) (obj)).mProcessAudioRequestsAction);
_L1:
        dioInputInfo dioinputinfo;
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
                            dioinputinfo = (dioInputInfo)((MicInput) (obj)).mAudioRequestQueue.remove();
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
                dioinputinfo.byteCount = 0;
                dioinputinfo.flags = 4;
                ((MicInput) (obj)).sendAudioInputResponse(dioinputinfo);
                return;
            }
            if (dioinputinfo.buffer == null)
            {
                GamesLog.e("MicInput", "The buffer is null");
            } else
            {
label2:
                {
                    dioinputinfo.byteCount = 0;
                    if (((MicInput) (obj)).mAudioRecord != null)
                    {
                        break label2;
                    }
                    GamesLog.e("MicInput", "Skipping audio input request due to missing recorder");
                    ((MicInput) (obj)).sendAudioInputResponse(dioinputinfo);
                }
            }
        } while (true);
        Object obj1;
        int i;
        dioinputinfo.ptsMicros = System.nanoTime() / 1000L;
        obj1 = dioinputinfo.buffer;
        i = ((MicInput) (obj)).mAudioRecord.read(((ByteBuffer) (obj1)), ((ByteBuffer) (obj1)).capacity());
        dioinputinfo.byteCount = i;
label3:
        {
            if (i >= 0)
            {
                break label3;
            }
            try
            {
                GamesLog.e("MicInput", (new StringBuilder("Error reading audio sample data: ")).append(i).toString());
                ((MicInput) (obj)).sendAudioInputResponse(dioinputinfo);
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1)
            {
                GamesLog.e("MicInput", "Error reading mic data", ((Throwable) (obj1)));
                dioinputinfo.byteCount = -1;
                ((MicInput) (obj)).sendAudioInputResponse(dioinputinfo);
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
            ((ByteBuffer) (obj1)).put(((MicInput) (obj)).mZeroBuf, 0, i);
        }
        ((MicInput) (obj)).sendAudioInputResponse(dioinputinfo);
          goto _L1
    }

    dioInputInfo()
    {
        this$0 = MicInput.this;
        super();
    }
}
