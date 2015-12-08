// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.media;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Process;
import android.util.Log;
import java.nio.ByteBuffer;

class AudioRecordInput
{
    private class AudioRecordThread extends Thread
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
                mAudioRecord.startRecording();
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
                int i = mAudioRecord.read(mBuffer, mBuffer.capacity());
                if (i > 0)
                {
                    nativeOnData(mNativeAudioRecordInputStream, i, mHardwareDelayBytes);
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
                mAudioRecord.stop();
                return;
            }
            catch (IllegalStateException illegalstateexception1)
            {
                Log.e("AudioRecordInput", "stop failed", illegalstateexception1);
            }
        }

        private AudioRecordThread()
        {
            this$0 = AudioRecordInput.this;
            super();
            mKeepAlive = true;
        }

    }


    private static final boolean DEBUG = false;
    private static final int HARDWARE_DELAY_MS = 100;
    private static final String TAG = "AudioRecordInput";
    private AcousticEchoCanceler mAEC;
    private AudioRecord mAudioRecord;
    private AudioRecordThread mAudioRecordThread;
    private final int mBitsPerSample;
    private ByteBuffer mBuffer;
    private final int mChannels;
    private final int mHardwareDelayBytes;
    private final long mNativeAudioRecordInputStream;
    private final int mSampleRate;
    private final boolean mUsePlatformAEC;

    private AudioRecordInput(long l, int i, int j, int k, int i1, boolean flag)
    {
        mNativeAudioRecordInputStream = l;
        mSampleRate = i;
        mChannels = j;
        mBitsPerSample = k;
        mHardwareDelayBytes = (((i * 100) / 1000) * k) / 8;
        mUsePlatformAEC = flag;
        mBuffer = ByteBuffer.allocateDirect(i1);
        nativeCacheDirectBufferAddress(mNativeAudioRecordInputStream, mBuffer);
    }

    private void close()
    {
        if (mAudioRecordThread != null)
        {
            Log.e("AudioRecordInput", "close() called before stop().");
        } else
        if (mAudioRecord != null)
        {
            if (mAEC != null)
            {
                mAEC.release();
                mAEC = null;
            }
            mAudioRecord.release();
            mAudioRecord = null;
            return;
        }
    }

    private static AudioRecordInput createAudioRecordInput(long l, int i, int j, int k, int i1, boolean flag)
    {
        return new AudioRecordInput(l, i, j, k, i1, flag);
    }

    private native void nativeCacheDirectBufferAddress(long l, ByteBuffer bytebuffer);

    private native void nativeOnData(long l, int i, int j);

    private boolean open()
    {
        if (mAudioRecord != null)
        {
            Log.e("AudioRecordInput", "open() called twice without a close()");
            return false;
        }
        byte byte0;
        byte byte1;
        int j;
        if (mChannels == 1)
        {
            byte0 = 16;
        } else
        if (mChannels == 2)
        {
            byte0 = 12;
        } else
        {
            Log.e("AudioRecordInput", (new StringBuilder()).append("Unsupported number of channels: ").append(mChannels).toString());
            return false;
        }
        if (mBitsPerSample == 8)
        {
            byte1 = 3;
        } else
        if (mBitsPerSample == 16)
        {
            byte1 = 2;
        } else
        {
            Log.e("AudioRecordInput", (new StringBuilder()).append("Unsupported bits per sample: ").append(mBitsPerSample).toString());
            return false;
        }
        j = AudioRecord.getMinBufferSize(mSampleRate, byte0, byte1);
        if (j < 0)
        {
            Log.e("AudioRecordInput", (new StringBuilder()).append("getMinBufferSize error: ").append(j).toString());
            return false;
        }
        j = Math.max(mBuffer.capacity(), j);
        try
        {
            mAudioRecord = new AudioRecord(7, mSampleRate, byte0, byte1, j);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.e("AudioRecordInput", "AudioRecord failed", illegalargumentexception);
            return false;
        }
        if (AcousticEchoCanceler.isAvailable())
        {
            mAEC = AcousticEchoCanceler.create(mAudioRecord.getAudioSessionId());
            if (mAEC == null)
            {
                Log.e("AudioRecordInput", "AcousticEchoCanceler.create failed");
                return false;
            }
            int i = mAEC.setEnabled(mUsePlatformAEC);
            if (i != 0)
            {
                Log.e("AudioRecordInput", (new StringBuilder()).append("setEnabled error: ").append(i).toString());
                return false;
            }
        }
        return true;
    }

    private void start()
    {
        if (mAudioRecord == null)
        {
            Log.e("AudioRecordInput", "start() called before open().");
        } else
        if (mAudioRecordThread == null)
        {
            mAudioRecordThread = new AudioRecordThread();
            mAudioRecordThread.start();
            return;
        }
    }

    private void stop()
    {
        if (mAudioRecordThread == null)
        {
            return;
        } else
        {
            mAudioRecordThread.joinRecordThread();
            mAudioRecordThread = null;
            return;
        }
    }





}
