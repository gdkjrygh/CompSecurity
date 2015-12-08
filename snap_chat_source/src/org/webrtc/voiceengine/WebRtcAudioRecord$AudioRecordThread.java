// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.media.AudioRecord;
import android.os.Process;
import java.nio.ByteBuffer;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioRecord, WebRtcAudioUtils

class keepAlive extends Thread
{

    private volatile boolean keepAlive;
    final WebRtcAudioRecord this$0;

    public void joinThread()
    {
        keepAlive = false;
        while (isAlive()) 
        {
            try
            {
                join();
            }
            catch (InterruptedException interruptedexception) { }
        }
    }

    public void run()
    {
        Process.setThreadPriority(-19);
        WebRtcAudioRecord.access$000((new StringBuilder("AudioRecordThread")).append(WebRtcAudioUtils.getThreadInfo()).toString());
        boolean flag;
        if (WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).getRecordingState() == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        WebRtcAudioRecord.access$200(flag);
        System.nanoTime();
        do
        {
            if (!keepAlive)
            {
                break;
            }
            int i = WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).read(WebRtcAudioRecord.access$300(WebRtcAudioRecord.this), WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).capacity());
            if (i == WebRtcAudioRecord.access$300(WebRtcAudioRecord.this).capacity())
            {
                WebRtcAudioRecord.access$500(WebRtcAudioRecord.this, i, WebRtcAudioRecord.access$400(WebRtcAudioRecord.this));
            } else
            {
                WebRtcAudioRecord.access$600((new StringBuilder("AudioRecord.read failed: ")).append(i).toString());
                if (i == -3)
                {
                    keepAlive = false;
                }
            }
        } while (true);
        try
        {
            WebRtcAudioRecord.access$100(WebRtcAudioRecord.this).stop();
            return;
        }
        catch (IllegalStateException illegalstateexception)
        {
            WebRtcAudioRecord.access$600((new StringBuilder("AudioRecord.stop failed: ")).append(illegalstateexception.getMessage()).toString());
        }
    }

    public (String s)
    {
        this$0 = WebRtcAudioRecord.this;
        super(s);
        keepAlive = true;
    }
}
