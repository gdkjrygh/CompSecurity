// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.content.Context;
import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.os.Process;
import java.nio.ByteBuffer;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioUtils

class WebRtcAudioRecord
{
    class AudioRecordThread extends Thread
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
            WebRtcAudioRecord.Logd((new StringBuilder("AudioRecordThread")).append(WebRtcAudioUtils.getThreadInfo()).toString());
            boolean flag;
            if (audioRecord.getRecordingState() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            WebRtcAudioRecord.assertTrue(flag);
            System.nanoTime();
            do
            {
                if (!keepAlive)
                {
                    break;
                }
                int i = audioRecord.read(byteBuffer, byteBuffer.capacity());
                if (i == byteBuffer.capacity())
                {
                    nativeDataIsRecorded(i, nativeAudioRecord);
                } else
                {
                    WebRtcAudioRecord.Loge((new StringBuilder("AudioRecord.read failed: ")).append(i).toString());
                    if (i == -3)
                    {
                        keepAlive = false;
                    }
                }
            } while (true);
            try
            {
                audioRecord.stop();
                return;
            }
            catch (IllegalStateException illegalstateexception)
            {
                WebRtcAudioRecord.Loge((new StringBuilder("AudioRecord.stop failed: ")).append(illegalstateexception.getMessage()).toString());
            }
        }

        public AudioRecordThread(String s)
        {
            this$0 = WebRtcAudioRecord.this;
            super(s);
            keepAlive = true;
        }
    }


    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioRecord";
    private AcousticEchoCanceler aec;
    private AudioRecord audioRecord;
    private AudioRecordThread audioThread;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final long nativeAudioRecord;
    private boolean useBuiltInAEC;

    WebRtcAudioRecord(Context context1, long l)
    {
        audioRecord = null;
        audioThread = null;
        aec = null;
        useBuiltInAEC = false;
        Logd((new StringBuilder("ctor")).append(WebRtcAudioUtils.getThreadInfo()).toString());
        context = context1;
        nativeAudioRecord = l;
    }

    private boolean EnableBuiltInAEC(boolean flag)
    {
        Logd((new StringBuilder("EnableBuiltInAEC(")).append(flag).append(')').toString());
        assertTrue(WebRtcAudioUtils.isAcousticEchoCancelerApproved());
        useBuiltInAEC = flag;
        if (aec != null)
        {
            if (aec.setEnabled(flag) != 0)
            {
                Loge("AcousticEchoCanceler.setEnabled failed");
                return false;
            }
            Logd((new StringBuilder("AcousticEchoCanceler.getEnabled: ")).append(aec.getEnabled()).toString());
        }
        return true;
    }

    private int InitRecording(int i, int j)
    {
        boolean flag2 = true;
        Logd((new StringBuilder("InitRecording(sampleRate=")).append(i).append(", channels=").append(j).append(")").toString());
        if (!WebRtcAudioUtils.hasPermission(context, "android.permission.RECORD_AUDIO"))
        {
            Loge("RECORD_AUDIO permission is missing");
            return -1;
        }
        int k = i / 100;
        byteBuffer = ByteBuffer.allocateDirect((j << 1) * k);
        Logd((new StringBuilder("byteBuffer.capacity: ")).append(byteBuffer.capacity()).toString());
        nativeCacheDirectBufferAddress(byteBuffer, nativeAudioRecord);
        j = AudioRecord.getMinBufferSize(i, 16, 2);
        Logd((new StringBuilder("AudioRecord.getMinBufferSize: ")).append(j).toString());
        if (aec != null)
        {
            aec.release();
            aec = null;
        }
        boolean flag;
        if (audioRecord == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        j = Math.max(byteBuffer.capacity(), j);
        Logd((new StringBuilder("bufferSizeInBytes: ")).append(j).toString());
        try
        {
            audioRecord = new AudioRecord(7, i, 16, 2, j);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logd(illegalargumentexception.getMessage());
            return -1;
        }
        if (audioRecord.getState() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        Logd((new StringBuilder("AudioRecord session ID: ")).append(audioRecord.getAudioSessionId()).append(", audio format: ").append(audioRecord.getAudioFormat()).append(", channels: ").append(audioRecord.getChannelCount()).append(", sample rate: ").append(audioRecord.getSampleRate()).toString());
        Logd((new StringBuilder("AcousticEchoCanceler.isAvailable: ")).append(builtInAECIsAvailable()).toString());
        if (!builtInAECIsAvailable())
        {
            return k;
        }
        if (WebRtcAudioUtils.deviceIsBlacklistedForHwAecUsage())
        {
            boolean flag1;
            if (!useBuiltInAEC)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            assertTrue(flag1);
        }
        aec = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
        if (aec == null)
        {
            Loge("AcousticEchoCanceler.create failed");
            return -1;
        }
        if (aec.setEnabled(useBuiltInAEC) != 0)
        {
            Loge("AcousticEchoCanceler.setEnabled failed");
            return -1;
        } else
        {
            android.media.audiofx.AudioEffect.Descriptor descriptor = aec.getDescriptor();
            Logd((new StringBuilder("AcousticEchoCanceler name: ")).append(descriptor.name).append(", implementor: ").append(descriptor.implementor).append(", uuid: ").append(descriptor.uuid).toString());
            Logd((new StringBuilder("AcousticEchoCanceler.getEnabled: ")).append(aec.getEnabled()).toString());
            return k;
        }
    }

    private static void Logd(String s)
    {
    }

    private static void Loge(String s)
    {
    }

    private boolean StartRecording()
    {
        Logd("StartRecording");
        boolean flag;
        if (audioRecord != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        if (audioThread == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        try
        {
            audioRecord.startRecording();
        }
        catch (IllegalStateException illegalstateexception)
        {
            Loge((new StringBuilder("AudioRecord.startRecording failed: ")).append(illegalstateexception.getMessage()).toString());
            return false;
        }
        if (audioRecord.getRecordingState() != 3)
        {
            Loge("AudioRecord.startRecording failed");
            return false;
        } else
        {
            audioThread = new AudioRecordThread("AudioRecordJavaThread");
            audioThread.start();
            return true;
        }
    }

    private boolean StopRecording()
    {
        Logd("StopRecording");
        boolean flag;
        if (audioThread != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        audioThread.joinThread();
        audioThread = null;
        if (aec != null)
        {
            aec.release();
            aec = null;
        }
        audioRecord.release();
        audioRecord = null;
        return true;
    }

    private static void assertTrue(boolean flag)
    {
        if (!flag)
        {
            throw new AssertionError("Expected condition to be true");
        } else
        {
            return;
        }
    }

    private static boolean builtInAECIsAvailable()
    {
        return WebRtcAudioUtils.isAcousticEchoCancelerSupported();
    }

    private native void nativeCacheDirectBufferAddress(ByteBuffer bytebuffer, long l);

    private native void nativeDataIsRecorded(int i, long l);







}
