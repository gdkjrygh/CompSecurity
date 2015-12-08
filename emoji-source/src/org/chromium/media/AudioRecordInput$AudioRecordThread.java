// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.media.AudioRecord;
import android.os.Process;
import android.util.Log;
import java.nio.ByteBuffer;

// Referenced classes of package org.chromium.media:
//            AudioRecordInput

private class <init> extends Thread
{

    private volatile boolean mKeepAlive;
    final AudioRecordInput this$0;

    public void joinRecordThread()
    {
        mKeepAlive = false;
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
        try
        {
            AudioRecordInput.access$000(AudioRecordInput.this).startRecording();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Log.e("AudioRecordInput", "startRecording failed", illegalstateexception);
            return;
        }
        do
        {
            if (!mKeepAlive)
            {
                break;
            }
            int i = AudioRecordInput.access$000(AudioRecordInput.this).read(AudioRecordInput.access$100(AudioRecordInput.this), AudioRecordInput.access$100(AudioRecordInput.this).capacity());
            if (i > 0)
            {
                AudioRecordInput.access$400(AudioRecordInput.this, AudioRecordInput.access$200(AudioRecordInput.this), i, AudioRecordInput.access$300(AudioRecordInput.this));
            } else
            {
                Log.e("AudioRecordInput", (new StringBuilder()).append("read failed: ").append(i).toString());
                if (i == -3)
                {
                    mKeepAlive = false;
                }
            }
        } while (true);
        try
        {
            AudioRecordInput.access$000(AudioRecordInput.this).stop();
            return;
        }
        catch (IllegalStateException illegalstateexception1)
        {
            Log.e("AudioRecordInput", "stop failed", illegalstateexception1);
        }
    }

    private ()
    {
        this$0 = AudioRecordInput.this;
        super();
        mKeepAlive = true;
    }

    mKeepAlive(mKeepAlive mkeepalive)
    {
        this();
    }
}
