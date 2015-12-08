// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.webrtc.voiceengine;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Process;
import java.nio.ByteBuffer;

// Referenced classes of package org.webrtc.voiceengine:
//            WebRtcAudioUtils

class WebRtcAudioTrack
{
    class AudioTrackThread extends Thread
    {

        private volatile boolean keepAlive;
        final WebRtcAudioTrack this$0;

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
            boolean flag1;
            flag1 = true;
            Process.setThreadPriority(-19);
            WebRtcAudioTrack.Logd((new StringBuilder("AudioTrackThread")).append(WebRtcAudioUtils.getThreadInfo()).toString());
            audioTrack.play();
            int j;
            boolean flag;
            if (audioTrack.getPlayState() == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            try
            {
                WebRtcAudioTrack.assertTrue(flag);
            }
            catch (IllegalStateException illegalstateexception)
            {
                WebRtcAudioTrack.Loge((new StringBuilder("AudioTrack.play failed: ")).append(illegalstateexception.getMessage()).toString());
                return;
            }
            j = byteBuffer.capacity();
            while (keepAlive) 
            {
                nativeGetPlayoutData(j, nativeAudioTrack);
                int i;
                if (j <= byteBuffer.remaining())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                WebRtcAudioTrack.assertTrue(flag);
                if (WebRtcAudioUtils.runningOnLollipopOrHigher())
                {
                    i = audioTrack.write(byteBuffer, j, 0);
                } else
                {
                    i = audioTrack.write(byteBuffer.array(), byteBuffer.arrayOffset(), j);
                }
                if (i != j)
                {
                    WebRtcAudioTrack.Loge((new StringBuilder("AudioTrack.write failed: ")).append(i).toString());
                    if (i == -3)
                    {
                        keepAlive = false;
                    }
                }
                byteBuffer.rewind();
            }
            try
            {
                audioTrack.stop();
            }
            catch (IllegalStateException illegalstateexception1)
            {
                WebRtcAudioTrack.Loge((new StringBuilder("AudioTrack.stop failed: ")).append(illegalstateexception1.getMessage()).toString());
            }
            if (audioTrack.getPlayState() == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            WebRtcAudioTrack.assertTrue(flag);
            audioTrack.flush();
            return;
        }

        public AudioTrackThread(String s)
        {
            this$0 = WebRtcAudioTrack.this;
            super(s);
            keepAlive = true;
        }
    }


    private static final int BITS_PER_SAMPLE = 16;
    private static final int BUFFERS_PER_SECOND = 100;
    private static final int CALLBACK_BUFFER_SIZE_MS = 10;
    private static final boolean DEBUG = true;
    private static final String TAG = "WebRtcAudioTrack";
    private final AudioManager audioManager;
    private AudioTrackThread audioThread;
    private AudioTrack audioTrack;
    private ByteBuffer byteBuffer;
    private final Context context;
    private final long nativeAudioTrack;

    WebRtcAudioTrack(Context context1, long l)
    {
        audioTrack = null;
        audioThread = null;
        Logd((new StringBuilder("ctor")).append(WebRtcAudioUtils.getThreadInfo()).toString());
        context = context1;
        nativeAudioTrack = l;
        audioManager = (AudioManager)context1.getSystemService("audio");
        WebRtcAudioUtils.logDeviceInfo("WebRtcAudioTrack");
    }

    private int GetStreamMaxVolume()
    {
        Logd("GetStreamMaxVolume");
        boolean flag;
        if (audioManager != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        return audioManager.getStreamMaxVolume(0);
    }

    private int GetStreamVolume()
    {
        Logd("GetStreamVolume");
        boolean flag;
        if (audioManager != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        return audioManager.getStreamVolume(0);
    }

    private void InitPlayout(int i, int j)
    {
        boolean flag1 = true;
        Logd((new StringBuilder("InitPlayout(sampleRate=")).append(i).append(", channels=").append(j).append(")").toString());
        byteBuffer = ByteBuffer.allocateDirect((j << 1) * (i / 100));
        Logd((new StringBuilder("byteBuffer.capacity: ")).append(byteBuffer.capacity()).toString());
        nativeCacheDirectBufferAddress(byteBuffer, nativeAudioTrack);
        j = AudioTrack.getMinBufferSize(i, 4, 2);
        Logd((new StringBuilder("AudioTrack.getMinBufferSize: ")).append(j).toString());
        boolean flag;
        if (audioTrack == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        if (byteBuffer.capacity() < j)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        try
        {
            audioTrack = new AudioTrack(0, i, 4, 2, j, 1);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Logd(illegalargumentexception.getMessage());
            return;
        }
        if (audioTrack.getState() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        if (audioTrack.getPlayState() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        if (audioTrack.getStreamType() == 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
    }

    private static void Logd(String s)
    {
    }

    private static void Loge(String s)
    {
    }

    private boolean SetStreamVolume(int i)
    {
        Logd((new StringBuilder("SetStreamVolume(")).append(i).append(")").toString());
        boolean flag;
        if (audioManager != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        if (WebRtcAudioUtils.runningOnLollipopOrHigher() && audioManager.isVolumeFixed())
        {
            Loge("The device implements a fixed volume policy.");
            return false;
        } else
        {
            audioManager.setStreamVolume(0, i, 0);
            return true;
        }
    }

    private boolean StartPlayout()
    {
        boolean flag1 = false;
        Logd("StartPlayout");
        boolean flag;
        if (audioTrack != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        assertTrue(flag);
        flag = flag1;
        if (audioThread == null)
        {
            flag = true;
        }
        assertTrue(flag);
        audioThread = new AudioTrackThread("AudioTrackJavaThread");
        audioThread.start();
        return true;
    }

    private boolean StopPlayout()
    {
        Logd("StopPlayout");
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
        if (audioTrack != null)
        {
            audioTrack.release();
            audioTrack = null;
        }
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

    private native void nativeCacheDirectBufferAddress(ByteBuffer bytebuffer, long l);

    private native void nativeGetPlayoutData(int i, long l);







}
