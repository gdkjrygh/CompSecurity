// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.dg;

import android.content.Context;
import android.media.MediaPlayer;
import p.cw.c;
import p.dd.aj;
import p.df.a;
import p.df.b;

// Referenced classes of package p.dg:
//            f, e

public class i
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{

    static final boolean a;
    private e b;
    private Runnable c;
    private final c d;
    private final f e;

    public i(c c1)
    {
        d = c1;
        e = d.h();
        if (!a && e == null)
        {
            throw new AssertionError();
        } else
        {
            return;
        }
    }

    private void a(MediaPlayer mediaplayer, String s)
    {
        float f1 = 1.0F;
        if (com.pandora.radio.util.i.a(s))
        {
            break MISSING_BLOCK_LABEL_75;
        }
        float f3 = Float.parseFloat(s);
        float f2 = (float)Math.pow(10D, f3 / 100F) * 0.95F;
        a(String.format("gain=%s; adjusted track volume=%s", new Object[] {
            Float.valueOf(f3), Float.valueOf(f2)
        }));
        if (f2 <= 1.0F)
        {
            f1 = f2;
        }
        mediaplayer.setVolume(f1, f1);
        return;
        mediaplayer;
        a("Exception setting volume", ((Throwable) (mediaplayer)));
        return;
    }

    private void a(String s, Throwable throwable)
    {
        a(s, false, throwable);
    }

    private void a(String s, boolean flag)
    {
        a(s, flag, ((Throwable) (null)));
    }

    private void a(String s, boolean flag, Throwable throwable)
    {
        s = (new StringBuilder()).append("SAMPLE: ").append(s).toString();
        if (flag)
        {
            p.df.a.a("SampleTrack", s, throwable);
            return;
        } else
        {
            p.df.a.c("SampleTrack", s, throwable);
            return;
        }
    }

    private void a(boolean flag, boolean flag1)
    {
        if (b != null)
        {
            e.c();
            try
            {
                if (b.a() == e.a.e)
                {
                    b.stop();
                }
            }
            catch (IllegalStateException illegalstateexception)
            {
                a("Exception stopping media player", ((Throwable) (illegalstateexception)));
            }
            if (flag)
            {
                d.a(new aj(p.dd.aj.a.b));
            }
            b.reset();
            b.release();
        }
        if (flag1)
        {
            d();
        }
        b = null;
        c = null;
    }

    private void d()
    {
        Runnable runnable = c;
        if (runnable != null)
        {
            runnable.run();
        }
    }

    public void a()
    {
        a(true, false);
    }

    void a(String s)
    {
        a(s, false);
    }

    public void a(String s, String s1, Context context, Runnable runnable)
    {
        if (!a && com.pandora.radio.util.i.a(s))
        {
            throw new AssertionError();
        }
        if (!a && context == null)
        {
            throw new AssertionError();
        }
        c = runnable;
        if (b != null)
        {
            a(false, false);
        } else
        {
            d.a(new aj(p.dd.aj.a.a));
        }
        b = new e(d);
        a(b, s1, s);
    }

    protected void a(e e1, String s, String s1)
    {
        try
        {
            e1.setAudioStreamType(3);
            e1.setOnCompletionListener(this);
            e1.setOnErrorListener(this);
            e1.setOnPreparedListener(this);
            a(((MediaPlayer) (b)), s);
            a((new StringBuilder()).append("setting MediaPlayer datasource: ").append(s1).toString());
            e1.setDataSource(s1);
            p.df.b.a("Sample.LoadRunnable: calling MediaPlayer.prepareAsync()");
            e1.prepareAsync();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            a((new StringBuilder()).append("Exception during mediaplayer load - ").append(s.getMessage()).toString(), ((Throwable) (s)));
        }
        onCompletion(e1);
    }

    public void b()
    {
        a(true, true);
    }

    public boolean c()
    {
        return b != null && b.isPlaying();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        b();
    }

    public boolean onError(MediaPlayer mediaplayer, int j, int k)
    {
        mediaplayer = new StringBuilder();
        mediaplayer.append("MEDIA PLAYER ERROR: ");
        j;
        JVM INSTR lookupswitch 3: default 52
    //                   1: 124
    //                   100: 114
    //                   200: 104;
           goto _L1 _L2 _L3 _L4
_L1:
        mediaplayer.append(" Non standard (");
        mediaplayer.append(j);
        mediaplayer.append(")");
_L6:
        mediaplayer.append(" extra=").append(p.da.a.a(k));
        a(mediaplayer.toString());
        onCompletion(b);
        return true;
_L4:
        mediaplayer.append("MEDIA_ERROR_NOT_VALID_FOR_PROGRESSIVE_PLAYBACK");
        continue; /* Loop/switch isn't completed */
_L3:
        mediaplayer.append("MEDIA_ERROR_SERVER_DIED");
        continue; /* Loop/switch isn't completed */
_L2:
        mediaplayer.append("MEDIA_ERROR_UNKNOWN");
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        p.df.b.a("media player prepared");
        e.a(2);
        try
        {
            mediaplayer.start();
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            a("Exception starting media player", mediaplayer);
            b();
        }
        p.df.b.a("MediaPlayer started");
        p.df.b.b();
    }

    static 
    {
        boolean flag;
        if (!p/dg/i.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
