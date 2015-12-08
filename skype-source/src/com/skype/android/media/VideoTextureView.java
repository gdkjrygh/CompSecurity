// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.media;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.widget.MediaController;
import java.io.IOException;
import java.util.Map;

// Referenced classes of package com.skype.android.media:
//            ScaleMode

public class VideoTextureView extends TextureView
    implements android.media.MediaPlayer.OnBufferingUpdateListener, android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnPreparedListener, android.media.MediaPlayer.OnVideoSizeChangedListener, android.view.TextureView.SurfaceTextureListener, android.widget.MediaController.MediaPlayerControl
{

    private MediaPlayer a;
    private MediaController b;
    private SurfaceTexture c;
    private Surface d;
    private Uri e;
    private Map f;
    private boolean g;
    private boolean h;
    private boolean i;
    private int j;
    private int k;
    private int l;
    private int m;
    private ScaleMode n;
    private android.media.MediaPlayer.OnBufferingUpdateListener o;
    private android.media.MediaPlayer.OnPreparedListener p;
    private android.media.MediaPlayer.OnCompletionListener q;
    private android.media.MediaPlayer.OnErrorListener r;
    private android.media.MediaPlayer.OnInfoListener s;

    public VideoTextureView(Context context)
    {
        this(context, null);
    }

    public VideoTextureView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        j = 0;
        k = 0;
        m = 3;
        n = ScaleMode.a;
        setSurfaceTextureListener(this);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }

    private void b()
    {
        char c1;
        c1 = '\001';
        if (e == null || c == null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        c();
        d = new Surface(c);
        a = new MediaPlayer();
        a.setScreenOnWhilePlaying(true);
        a.setOnPreparedListener(this);
        a.setOnCompletionListener(this);
        a.setOnVideoSizeChangedListener(this);
        a.setOnBufferingUpdateListener(this);
        a.setOnErrorListener(r);
        a.setOnInfoListener(s);
        a.setDataSource(getContext(), e, f);
        a.setSurface(d);
        a.setLooping(i);
        a.setAudioStreamType(m);
        a.prepareAsync();
        l = 0;
        setMediaController(b);
_L1:
        return;
        Exception exception;
        exception;
        exception.printStackTrace();
        if (r != null)
        {
            if (exception instanceof IOException)
            {
                c1 = '\uFC14';
            }
            r.onError(a, c1, 0);
            return;
        }
          goto _L1
    }

    private void c()
    {
        if (a != null)
        {
            a.reset();
            a.release();
            a = null;
        }
        if (d != null)
        {
            d.release();
            d = null;
        }
    }

    public final void a()
    {
        if (a != null)
        {
            a.stop();
            a.release();
            h = false;
            a = null;
        }
    }

    public boolean canPause()
    {
        return g;
    }

    public boolean canSeekBackward()
    {
        return g;
    }

    public boolean canSeekForward()
    {
        return g;
    }

    public int getAudioSessionId()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getAudioSessionId();
        }
    }

    public int getBufferPercentage()
    {
        return l;
    }

    public int getCurrentPosition()
    {
        if (a == null)
        {
            return 0;
        } else
        {
            return a.getCurrentPosition();
        }
    }

    public int getDuration()
    {
        if (a == null)
        {
            return -1;
        } else
        {
            return a.getDuration();
        }
    }

    public boolean isPlaying()
    {
        return a != null && a.isPlaying();
    }

    public void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
    {
        l = i1;
        if (o != null)
        {
            o.onBufferingUpdate(mediaplayer, i1);
        }
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        if (b != null)
        {
            b.hide();
        }
        if (q != null)
        {
            q.onCompletion(a);
        }
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        k1 = android.view.View.MeasureSpec.getSize(i1);
        l1 = android.view.View.MeasureSpec.getSize(j1);
        i1 = l1;
        j1 = k1;
        if (j <= 0) goto _L2; else goto _L1
_L1:
        i1 = l1;
        j1 = k1;
        if (k <= 0) goto _L2; else goto _L3
_L3:
        float f1;
        float f2;
        f1 = (float)k1 / (float)j;
        f2 = (float)l1 / (float)k;
        static final class _cls1
        {

            static final int a[];

            static 
            {
                a = new int[ScaleMode.values().length];
                try
                {
                    a[ScaleMode.b.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[ScaleMode.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1.a[n.ordinal()];
        JVM INSTR tableswitch 1 2: default 92
    //                   1 105
    //                   2 203;
           goto _L4 _L5 _L6
_L4:
        j1 = k1;
        i1 = l1;
_L2:
        setMeasuredDimension(j1, i1);
        return;
_L5:
        Matrix matrix = getTransform(null);
        f1 = Math.max(f1, f2);
        i1 = (int)((float)j * f1);
        j1 = (int)((float)k * f1);
        f1 = (float)i1 / (float)k1;
        f2 = (float)j1 / (float)l1;
        float f3 = (k1 - i1) / 2;
        float f4 = (l1 - j1) / 2;
        matrix.setScale(f1, f2);
        matrix.postTranslate(f3, f4);
        setTransform(matrix);
        i1 = l1;
        j1 = k1;
        continue; /* Loop/switch isn't completed */
_L6:
        f1 = Math.min(f1, f2);
        j1 = (int)((float)j * f1);
        i1 = (int)((float)k * f1);
        if (true) goto _L2; else goto _L7
_L7:
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        g = true;
        if (p != null)
        {
            p.onPrepared(a);
        }
        if (b != null)
        {
            b.setEnabled(true);
        }
        j = mediaplayer.getVideoWidth();
        k = mediaplayer.getVideoHeight();
        if (b != null)
        {
            b.show();
        }
        requestLayout();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
    {
        c = surfacetexture;
        b();
        requestLayout();
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
    {
        c = null;
        if (b != null)
        {
            b.hide();
        }
        c();
        return false;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
    {
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
    {
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (b != null)
        {
            if (b.isShowing())
            {
                b.hide();
            } else
            {
                b.show();
            }
        }
        return false;
    }

    public void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
    {
        j = mediaplayer.getVideoWidth();
        k = mediaplayer.getVideoHeight();
        requestLayout();
    }

    public void pause()
    {
        if (a != null && a.isPlaying())
        {
            a.pause();
            h = true;
        }
    }

    public void seekTo(int i1)
    {
        if (a != null)
        {
            a.seekTo(i1);
        }
    }

    public void setAudioStreamType(int i1)
    {
        m = i1;
    }

    public void setLooping(boolean flag)
    {
        i = flag;
        if (a != null)
        {
            a.setLooping(flag);
        }
    }

    public void setMediaController(MediaController mediacontroller)
    {
        if (mediacontroller != null)
        {
            b = mediacontroller;
            b.setMediaPlayer(this);
            MediaController mediacontroller1 = b;
            if (getParent() == null)
            {
                mediacontroller = this;
            } else
            {
                mediacontroller = (View)getParent();
            }
            mediacontroller1.setAnchorView(mediacontroller);
        }
    }

    public void setOnBufferingUpdateListener(android.media.MediaPlayer.OnBufferingUpdateListener onbufferingupdatelistener)
    {
        o = onbufferingupdatelistener;
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        q = oncompletionlistener;
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        r = onerrorlistener;
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener oninfolistener)
    {
        s = oninfolistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        p = onpreparedlistener;
    }

    public void setScaleMode(ScaleMode scalemode)
    {
        n = scalemode;
        requestLayout();
    }

    public void setVideoPath(String s1)
    {
        setVideoURI(Uri.parse(s1));
    }

    public void setVideoURI(Uri uri)
    {
        setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, Map map)
    {
        e = uri;
        f = map;
        b();
        requestLayout();
    }

    public void setVolume(float f1, float f2)
    {
        if (a != null)
        {
            a.setVolume(f1, f2);
        }
    }

    public void start()
    {
        if (a != null)
        {
            a.start();
            h = false;
        }
    }
}
