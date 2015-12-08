// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import android.media.AudioRecord;
import com.google.android.apps.gsa.shared.exception.GsaIOException;
import com.google.android.apps.gsa.shared.util.common.L;
import com.google.android.apps.gsa.speech.audio.a.a;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.google.android.apps.gsa.speech.audio:
//            h

public class g extends a
{

    private static AtomicInteger i = new AtomicInteger();
    public final int a;
    public final int b;
    public final int c;
    public final h d;
    public final boolean e;
    public final boolean f;
    public final Object g = new Object();
    public AudioRecord h;
    private final String j;
    private boolean k;
    private boolean l;
    private boolean m;

    public g(int i1, int j1, int k1, boolean flag, h h1, boolean flag1)
    {
        k = false;
        l = false;
        a = i1;
        c = k1;
        b = Math.max(AudioRecord.getMinBufferSize(i1, k1, 2), j1);
        f = flag;
        if (h1 == null)
        {
            h1 = new h();
        }
        d = h1;
        e = flag1;
        i1 = i.getAndIncrement();
        j = (new StringBuilder(33)).append("MicrophoneInputStream_").append(i1).toString();
    }

    private AudioRecord e()
    {
        if (k && h == null)
        {
            throw new GsaIOException("AudioRecord failed to initialize.", 0x60004);
        }
        if (l)
        {
            return h;
        }
        L.a(4, "MicrophoneInputStream", "mic_starting %s", new Object[] {
            this
        });
        if (!k)
        {
            h = d();
            k = true;
        }
        if (h == null)
        {
            throw new GsaIOException("AudioRecord failed to initialize.", 0x60004);
        }
        b();
        int i1;
        try
        {
            a();
        }
        catch (IllegalStateException illegalstateexception)
        {
            throw new GsaIOException("couldn't start recording", illegalstateexception, 0x60006);
        }
        i1 = h.getRecordingState();
        if (i1 != 3)
        {
            throw new GsaIOException((new StringBuilder(46)).append("couldn't start recording, state is:").append(i1).toString(), 0x60006);
        } else
        {
            l = true;
            L.a(4, "MicrophoneInputStream", "mic_started %s", new Object[] {
                this
            });
            return h;
        }
    }

    protected void a()
    {
        h.startRecording();
    }

    protected void b()
    {
    }

    protected void c()
    {
    }

    public void close()
    {
        synchronized (g)
        {
            if (h != null && !m)
            {
                L.a(4, "MicrophoneInputStream", "mic_close %s", new Object[] {
                    this
                });
                h.stop();
                c();
                h.release();
                m = true;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public AudioRecord d()
    {
        char c1 = '\006';
        if (e)
        {
            c1 = '\u07CF';
        }
        AudioRecord audiorecord;
        AudioRecord audiorecord1;
        try
        {
            audiorecord1 = new AudioRecord(c1, a, c, 2, b);
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            L.b("MicrophoneInputStream", "Failed to initialize AudioRecord", new Object[0]);
            return null;
        }
        audiorecord = audiorecord1;
        if (audiorecord1.getState() == 1)
        {
            break MISSING_BLOCK_LABEL_63;
        }
        L.a("MicrophoneInputStream", "Failed to initialize AudioRecord", new Object[0]);
        audiorecord1.release();
        audiorecord = null;
        return audiorecord;
    }

    public int read(byte abyte0[])
    {
        int i1;
        try
        {
            i1 = read(abyte0, 0, abyte0.length);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            throw new GsaIOException(abyte0, 0x60003);
        }
        return i1;
    }

    public int read(byte abyte0[], int i1, int j1)
    {
label0:
        {
            synchronized (g)
            {
                if (!m)
                {
                    break label0;
                }
            }
            return -1;
        }
        AudioRecord audiorecord = e();
        obj;
        JVM INSTR monitorexit ;
        i1 = audiorecord.read(abyte0, i1, j1);
        synchronized (g)
        {
            if (!m)
            {
                break MISSING_BLOCK_LABEL_70;
            }
        }
        return -1;
        obj;
        abyte0;
        JVM INSTR monitorexit ;
        throw obj;
        abyte0;
        obj;
        JVM INSTR monitorexit ;
        throw abyte0;
        abyte0;
        JVM INSTR monitorexit ;
        if (i1 < -1)
        {
            if (i1 == -3)
            {
                throw new GsaIOException("not open", 0x60005);
            }
            if (i1 == -2)
            {
                throw new GsaIOException("Bad offset/length arguments for buffer", 0x60002);
            } else
            {
                throw new GsaIOException((new StringBuilder(34)).append("Unexpected error code: ").append(i1).toString(), 0x60007);
            }
        } else
        {
            return i1;
        }
    }

}
