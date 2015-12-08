// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.player;

import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.Log;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// Referenced classes of package com.yume.android.player:
//            B, as, at, au, 
//            av, aw, ax, ay, 
//            J

final class ar extends SurfaceView
    implements android.widget.MediaController.MediaPlayerControl
{

    private android.media.MediaPlayer.OnPreparedListener A;
    private android.media.MediaPlayer.OnCompletionListener B;
    private android.media.MediaPlayer.OnErrorListener C;
    private android.media.MediaPlayer.OnBufferingUpdateListener D;
    private android.view.SurfaceHolder.Callback E;
    int a;
    int b;
    SurfaceHolder c;
    MediaPlayer d;
    int e;
    int f;
    int g;
    int h;
    android.media.MediaPlayer.OnCompletionListener i;
    android.media.MediaPlayer.OnPreparedListener j;
    android.media.MediaPlayer.OnSeekCompleteListener k;
    int l;
    android.media.MediaPlayer.OnErrorListener m;
    int n;
    boolean o;
    boolean p;
    boolean q;
    FileDescriptor r;
    FileInputStream s;
    String t;
    B u;
    private String v;
    private Uri w;
    private int x;
    private android.media.MediaPlayer.OnSeekCompleteListener y;
    private android.media.MediaPlayer.OnVideoSizeChangedListener z;

    public ar(Context context)
    {
        super(context);
        v = "YuMeAndroidPlayer";
        a = 0;
        b = 0;
        c = null;
        d = null;
        s = null;
        t = null;
        u = com.yume.android.player.B.a();
        y = new as(this);
        z = new at(this);
        A = new au(this);
        B = new av(this);
        C = new aw(this);
        D = new ax(this);
        E = new ay(this);
        e = 0;
        f = 0;
        getHolder().addCallback(E);
        getHolder().setType(3);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        a = 0;
        b = 0;
    }

    private boolean c()
    {
        return d != null && a != -1 && a != 0 && a != 1;
    }

    public final void a()
    {
        r = null;
        w = null;
        n = 0;
        if (r != null)
        {
            b();
            requestLayout();
            invalidate();
        }
    }

    public final void a(Uri uri)
    {
        w = uri;
        r = null;
        n = 0;
        b();
        requestLayout();
        invalidate();
    }

    final void a(boolean flag)
    {
        try
        {
            if (d == null)
            {
                break MISSING_BLOCK_LABEL_40;
            }
            d.reset();
            d.release();
            d = null;
            a = 0;
        }
        catch (Exception exception)
        {
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_40;
        }
        b = 0;
    }

    final void b()
    {
        if ((w != null || t != null) && c != null) goto _L2; else goto _L1
_L1:
        Context context;
        return;
_L2:
        if ((context = J.D()) == null) goto _L1; else goto _L3
_L3:
        if (r == null && t != null)
        {
            s = null;
            IOException ioexception;
            try
            {
                s = new FileInputStream(new File(t));
            }
            catch (FileNotFoundException filenotfoundexception)
            {
                filenotfoundexception.printStackTrace();
            }
            try
            {
                if (s != null)
                {
                    r = s.getFD();
                    u.b((new StringBuilder("Setting Video File Descriptor: ")).append(r).toString());
                }
            }
            catch (IOException ioexception1)
            {
                ioexception1.printStackTrace();
            }
        }
        (new Intent("com.android.music.musicservicecommand")).putExtra("command", "pause");
        a(false);
        d = new MediaPlayer();
        d.setOnPreparedListener(A);
        d.setOnVideoSizeChangedListener(z);
        x = -1;
        d.setOnCompletionListener(B);
        d.setOnErrorListener(C);
        d.setOnBufferingUpdateListener(D);
        d.setOnSeekCompleteListener(y);
        l = 0;
        if (w == null) goto _L5; else goto _L4
_L4:
        d.setDataSource(context, w);
_L7:
        d.setDisplay(c);
        d.setAudioStreamType(3);
        d.setScreenOnWhilePlaying(true);
        d.prepareAsync();
        a = 1;
        return;
_L5:
        if (r == null) goto _L7; else goto _L6
_L6:
        IllegalArgumentException illegalargumentexception;
        if (!r.valid())
        {
            break MISSING_BLOCK_LABEL_444;
        }
        d.setDataSource(r);
          goto _L7
        try
        {
            u.c("Invalid Video File Descriptor.");
            C.onError(d, 1, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            Log.w(v, (new StringBuilder("Unable to open content: ")).append(w).toString(), ioexception);
            a = -1;
            b = -1;
            C.onError(d, 1, 0);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (IllegalArgumentException illegalargumentexception)
        {
            Log.w(v, (new StringBuilder("Unable to open content: ")).append(w).toString(), illegalargumentexception);
            a = -1;
            b = -1;
            C.onError(d, 1, 0);
            return;
        }
        catch (Exception exception)
        {
            C.onError(d, 1, 0);
        }
        return;
    }

    public final boolean canPause()
    {
        return o;
    }

    public final boolean canSeekBackward()
    {
        return p;
    }

    public final boolean canSeekForward()
    {
        return q;
    }

    public final int getBufferPercentage()
    {
        if (d != null)
        {
            return l;
        } else
        {
            return 0;
        }
    }

    public final int getCurrentPosition()
    {
        int i1;
        if (!c())
        {
            break MISSING_BLOCK_LABEL_18;
        }
        i1 = d.getCurrentPosition();
        return i1;
        Exception exception;
        exception;
        return 0;
    }

    public final int getDuration()
    {
        x = -1;
        int i1;
        if (!c())
        {
            break MISSING_BLOCK_LABEL_43;
        }
        if (x > 0)
        {
            return x;
        }
        x = d.getDuration();
        i1 = x;
        return i1;
        Exception exception;
        exception;
        return x;
    }

    public final boolean isPlaying()
    {
        return c() && d.isPlaying();
    }

    public final boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        return super.onKeyDown(i1, keyevent);
    }

    protected final void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        k1 = getDefaultSize(e, i1);
        l1 = getDefaultSize(f, j1);
        i1 = l1;
        j1 = k1;
        if (e <= 0) goto _L2; else goto _L1
_L1:
        i1 = l1;
        j1 = k1;
        if (f <= 0) goto _L2; else goto _L3
_L3:
        if (e * l1 <= f * k1) goto _L5; else goto _L4
_L4:
        i1 = (f * k1) / e;
        j1 = k1;
_L2:
        setMeasuredDimension(j1, i1);
        return;
_L5:
        i1 = l1;
        j1 = k1;
        if (e * l1 < f * k1)
        {
            j1 = (e * l1) / f;
            i1 = l1;
        }
        if (true) goto _L2; else goto _L6
_L6:
    }

    public final boolean onTouchEvent(MotionEvent motionevent)
    {
        return false;
    }

    public final boolean onTrackballEvent(MotionEvent motionevent)
    {
        return false;
    }

    public final void pause()
    {
        try
        {
            if (c() && d.isPlaying())
            {
                d.pause();
                a = 4;
            }
            b = 4;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

    public final void seekTo(int i1)
    {
        try
        {
            if (c())
            {
                d.seekTo(i1);
                n = 0;
                return;
            }
        }
        catch (Exception exception)
        {
            return;
        }
        n = i1;
        return;
    }

    public final void start()
    {
        try
        {
            if (c())
            {
                d.start();
                a = 3;
            }
            b = 3;
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }
}
