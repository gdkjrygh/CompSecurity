// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.media.AudioTrack;
import android.util.Log;
import java.util.Locale;

public class ctr
    implements ctp
{

    private static final String a = ctr.getSimpleName();
    private cub b;
    private boolean c;
    private long d;
    private int e;
    private int f;
    private int g;

    public ctr()
    {
    }

    public final int a(byte abyte0[], int i, int j)
    {
        int k = 0;
        c.a(b, "mAudioTrack", "must call initialize() first");
        if (c)
        {
            long l1 = f();
            if (l1 < 30000L)
            {
                Log.w(a, String.format(Locale.ENGLISH, "Audio sink buffer running low: %d ms (%d bytes)", new Object[] {
                    Long.valueOf(l1 / 1000L), Integer.valueOf(e())
                }));
            }
        }
        Object obj = b;
        int l = ((cub) (obj)).a();
        l = ((cub) (obj)).c - l;
        if (l > 0)
        {
            j = Math.min(j, l);
            k = ((cub) (obj)).b.write(abyte0, i, j);
            if (k < 0)
            {
                obj = cub.a;
                int i1 = abyte0.length;
                Log.e(((String) (obj)), (new StringBuilder(117)).append("Error writing bytes: error code ").append(k).append(", audioData size ").append(i1).append(", offset ").append(i).append(", bytesToWrite ").append(j).toString());
                throw new RuntimeException("Error writing bytes to the underlying AudioTrack");
            }
            if (k != j)
            {
                Log.w(cub.a, (new StringBuilder(56)).append("Expected to write ").append(j).append(" but only wrote ").append(k).toString());
            }
            obj.d = ((cub) (obj)).d + k;
        }
        return k;
    }

    public final void a()
    {
        if (b != null)
        {
            b.b.release();
            b = null;
        }
    }

    public final void a(int i, int j, int k)
    {
        c.b(b, "mAudioTrack", "sink can only be initialized once");
        e = 2;
        f = 44100;
        g = 2;
        a(0L);
    }

    public final void a(long l)
    {
        int i;
        int j;
        int k;
        d = b.b(l, "presentationTimeUs");
        c.a(c, "mIsPlaying", false);
        a();
        i = e;
        j = f;
        k = g;
        i;
        JVM INSTR tableswitch 1 2: default 68
    //                   1 94
    //                   2 162;
           goto _L1 _L2 _L3
_L1:
        throw b.a((new StringBuilder(41)).append("unsupported bytes per sample: ").append(i).toString());
_L2:
        byte byte0 = 3;
_L8:
        k;
        JVM INSTR tableswitch 1 6: default 136
    //                   1 168
    //                   2 224
    //                   3 136
    //                   4 136
    //                   5 136
    //                   6 230;
           goto _L4 _L5 _L6 _L4 _L4 _L4 _L7
_L4:
        throw b.a((new StringBuilder(38)).append("unsupported channel count: ").append(k).toString());
_L3:
        byte0 = 2;
          goto _L8
_L5:
        char c1 = '\004';
_L10:
        int i1 = AudioTrack.getMinBufferSize(j, c1, byte0);
        b = new cub(3, j, c1, byte0, Math.max(i1, Math.min(b.a(0xf4240L, i, k, j), i1 * 8)), 1);
        return;
_L6:
        c1 = '\f';
        continue; /* Loop/switch isn't completed */
_L7:
        c1 = '\374';
        if (true) goto _L10; else goto _L9
_L9:
    }

    public final void b()
    {
        if (b != null)
        {
            b.b.pause();
        }
        c = false;
    }

    public final void c()
    {
        if (b != null)
        {
            b.b.play();
        }
        c = true;
    }

    public final long d()
    {
        c.a(b, "mAudioTrack", "must call initialize() first");
        cub cub1 = b;
        return ((long)cub1.b.getPlaybackHeadPosition() * 0xf4240L) / (long)cub1.b.getSampleRate() + d;
    }

    public final int e()
    {
        c.a(b, "mAudioTrack", "must call initialize() first");
        return b.a();
    }

    public final long f()
    {
        c.a(b, "mAudioTrack", "must call initialize() first");
        cub cub1 = b;
        long l = cub1.a();
        int i = cub1.e;
        return (l * 0xf4240L) / (long)(cub1.b.getSampleRate() * i);
    }

    public final boolean g()
    {
        while (b == null || b.c - b.a() != 0) 
        {
            return false;
        }
        return true;
    }

    public final void h()
    {
    }

}
