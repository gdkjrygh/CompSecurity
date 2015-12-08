// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.media.AudioRecord;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.NoiseSuppressor;
import android.os.Handler;
import android.os.Process;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

// Referenced classes of package com.skype.android.media:
//            AsyncComponent, d, AudioFilter, e, 
//            Component

class AudioRecordComponent extends AsyncComponent
{

    private static final Logger log = Logger.getLogger("SKPCM");
    private Set audioFilters;
    private AudioRecord audioRecord;
    private int bufferIndex;
    private ByteBuffer buffers[];
    private Set effects;
    private d settings;
    private Component sink;

    AudioRecordComponent(Component component, d d1)
    {
        super("SKPCM");
        sink = component;
        settings = d1;
        effects = new HashSet();
    }

    static d createDeviceCompatibleSettings(int i, int j)
    {
        byte byte0;
        int i1;
        int j1;
        int k1;
label0:
        {
            int ai[] = new int[4];
            int[] _tmp = ai;
            ai[0] = 44100;
            ai[1] = 16000;
            ai[2] = 11025;
            ai[3] = 8000;
            int l1 = ai[0];
            int k;
            int l;
            if (j == 1)
            {
                byte0 = 16;
            } else
            {
                byte0 = 12;
            }
            k = 0;
            j = AudioRecord.getMinBufferSize(l1, byte0, 2);
            l = 0;
            do
            {
                k1 = j;
                j1 = l1;
                i1 = k;
                if (k != 0)
                {
                    break label0;
                }
                k1 = j;
                j1 = l1;
                i1 = k;
                if (l >= 4)
                {
                    break label0;
                }
                j = AudioRecord.getMinBufferSize(l1, byte0, 2);
                AudioRecord audiorecord = new AudioRecord(i, ai[l], byte0, 2, j);
                k = audiorecord.getState();
                audiorecord.release();
                if (k != 0)
                {
                    break;
                }
                log.warning((new StringBuilder("audio format 2 @ ")).append(ai[l]).append(" not supported").toString());
                l++;
            } while (true);
            j1 = ai[l];
            i1 = k;
            k1 = j;
        }
        if (i1 == 0)
        {
            throw new IllegalStateException("No valid audio record configuration");
        } else
        {
            return new d(j1, byte0, k1, i);
        }
    }

    private void readAudioBuffer()
    {
        ByteBuffer bytebuffer;
        if (audioRecord == null || audioRecord.getRecordingState() != 3)
        {
            break MISSING_BLOCK_LABEL_237;
        }
        if (bufferIndex >= buffers.length)
        {
            bufferIndex = 0;
        }
        ByteBuffer abytebuffer[] = buffers;
        int i = bufferIndex;
        bufferIndex = i + 1;
        bytebuffer = abytebuffer[i];
        int j = audioRecord.read(bytebuffer, bytebuffer.capacity());
        this;
        JVM INSTR monitorenter ;
        ByteBuffer bytebuffer1 = bytebuffer;
        Iterator iterator;
        if (audioFilters == null)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        bytebuffer.position(0);
        bytebuffer.limit(j);
        iterator = audioFilters.iterator();
_L1:
        bytebuffer1 = bytebuffer;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_146;
        }
        bytebuffer = ((AudioFilter)iterator.next()).a(bytebuffer, j, settings.b());
          goto _L1
        this;
        JVM INSTR monitorexit ;
        bytebuffer1.position(0);
        bytebuffer1.limit(j);
        Handler handler = getHandler();
        if (audioRecord.getRecordingState() == 3 && handler != null && !handler.hasMessages(e.j.ordinal()))
        {
            send(e.j);
        }
        if (sink != null && !sink.send(e.k, bytebuffer1))
        {
            log.info("couldn't send to sink");
            stop();
        }
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void release()
    {
        stop();
    }

    private void start()
    {
        int j = settings.g();
        int k = settings.b();
        int l = settings.c();
        int i1 = settings.d();
        int j1 = settings.a();
        buffers = new ByteBuffer[4];
        for (int i = 0; i < 4; i++)
        {
            buffers[i] = ByteBuffer.allocateDirect(j1);
        }

        audioRecord = new AudioRecord(j, k, l, i1, j1);
        audioRecord.setNotificationMarkerPosition(j1);
        audioRecord.startRecording();
        send(e.j);
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            if (settings.f() && AcousticEchoCanceler.isAvailable())
            {
                AcousticEchoCanceler acousticechocanceler = AcousticEchoCanceler.create(audioRecord.getAudioSessionId());
                if (!acousticechocanceler.getEnabled())
                {
                    acousticechocanceler.setEnabled(true);
                }
                effects.add(acousticechocanceler);
            }
            if (settings.e() && NoiseSuppressor.isAvailable())
            {
                NoiseSuppressor noisesuppressor = NoiseSuppressor.create(audioRecord.getAudioSessionId());
                if (!noisesuppressor.getEnabled())
                {
                    noisesuppressor.setEnabled(true);
                }
                effects.add(noisesuppressor);
            }
        }
        Process.setThreadPriority(-19);
    }

    private void stop()
    {
        if (audioRecord == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        getHandler().removeMessages(e.j.ordinal());
        audioRecord.stop();
        audioRecord.release();
        audioRecord = null;
        for (Iterator iterator = effects.iterator(); iterator.hasNext(); ((AudioEffect)iterator.next()).release()) { }
        break MISSING_BLOCK_LABEL_173;
        Object obj;
        obj;
        ((IllegalStateException) (obj)).printStackTrace();
        audioRecord.release();
        audioRecord = null;
        for (Iterator iterator1 = effects.iterator(); iterator1.hasNext(); ((AudioEffect)iterator1.next()).release()) { }
        break MISSING_BLOCK_LABEL_173;
        iterator1;
        audioRecord.release();
        audioRecord = null;
        for (Iterator iterator2 = effects.iterator(); iterator2.hasNext(); ((AudioEffect)iterator2.next()).release()) { }
        throw iterator1;
    }

    public boolean handle(e e1, Object obj)
    {
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[e.values().length];
                try
                {
                    a[e.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[e.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[e.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[e.j.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1.a[e1.ordinal()])
        {
        default:
            return false;

        case 1: // '\001'
            start();
            return true;

        case 2: // '\002'
            stop();
            return true;

        case 3: // '\003'
            release();
            return true;

        case 4: // '\004'
            readAudioBuffer();
            break;
        }
        return true;
    }

    public void setAudioFilters(Set set)
    {
        this;
        JVM INSTR monitorenter ;
        audioFilters = set;
        this;
        JVM INSTR monitorexit ;
        return;
        set;
        throw set;
    }

}
