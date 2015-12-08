// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.ui;

import Fa;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.MediaController;
import android.widget.VideoView;
import com.snapchat.android.Timber;
import java.io.IOException;
import java.util.Map;

public class TextureVideoView extends TextureView
    implements android.widget.MediaController.MediaPlayerControl
{

    private android.media.MediaPlayer.OnPreparedListener A = new android.media.MediaPlayer.OnPreparedListener() {

        private TextureVideoView a;

        public final void onPrepared(MediaPlayer mediaplayer)
        {
            if (TextureVideoView.a(a) == 1) goto _L2; else goto _L1
_L1:
            return;
_L2:
            int i1;
            TextureVideoView.a(a, 2);
            TextureVideoView.b(a);
            if (TextureVideoView.c(a) != null)
            {
                TextureVideoView.c(a).onPrepared(TextureVideoView.d(a));
            }
            if (TextureVideoView.e(a) != null)
            {
                TextureVideoView.e(a).setEnabled(true);
            }
            TextureVideoView.a(a, mediaplayer);
            i1 = TextureVideoView.f(a);
            if (i1 != 0)
            {
                a.seekTo(i1);
            }
            if (a.a == 0 || a.b == 0)
            {
                continue; /* Loop/switch isn't completed */
            }
            if (TextureVideoView.g(a) != 3)
            {
                continue; /* Loop/switch isn't completed */
            }
            a.start();
            if (TextureVideoView.e(a) == null) goto _L1; else goto _L3
_L3:
            TextureVideoView.e(a).show();
            return;
            if (a.isPlaying() || i1 == 0 && a.getCurrentPosition() <= 0 || TextureVideoView.e(a) == null) goto _L1; else goto _L4
_L4:
            TextureVideoView.e(a).show(0);
            return;
            if (TextureVideoView.g(a) != 3) goto _L1; else goto _L5
_L5:
            a.start();
            return;
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnCompletionListener B = new android.media.MediaPlayer.OnCompletionListener() {

        private TextureVideoView a;

        public final void onCompletion(MediaPlayer mediaplayer)
        {
            if (TextureVideoView.h(a))
            {
                TextureVideoView.a(a, 5);
                TextureVideoView.b(a, 5);
                if (TextureVideoView.e(a) != null)
                {
                    TextureVideoView.e(a).hide();
                }
                if (TextureVideoView.i(a) != null)
                {
                    TextureVideoView.i(a).onCompletion(TextureVideoView.d(a));
                    return;
                }
            }
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnSeekCompleteListener C = new android.media.MediaPlayer.OnSeekCompleteListener() {

        private TextureVideoView a;

        public final void onSeekComplete(MediaPlayer mediaplayer)
        {
            if (TextureVideoView.j(a) != null)
            {
                TextureVideoView.j(a).onSeekComplete(mediaplayer);
            }
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnInfoListener D = new android.media.MediaPlayer.OnInfoListener() {

        private TextureVideoView a;

        public final boolean onInfo(MediaPlayer mediaplayer, int i1, int j1)
        {
            if (TextureVideoView.k(a) != null)
            {
                TextureVideoView.k(a).onInfo(mediaplayer, i1, j1);
            }
            return true;
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnErrorListener E = new android.media.MediaPlayer.OnErrorListener() {

        private TextureVideoView a;

        public final boolean onError(MediaPlayer mediaplayer, int i1, int j1)
        {
            if (TextureVideoView.d(a) != null)
            {
                TextureVideoView.a(a, -1);
                TextureVideoView.b(a, -1);
                if (TextureVideoView.e(a) != null)
                {
                    TextureVideoView.e(a).hide();
                }
                if (TextureVideoView.l(a) != null && TextureVideoView.l(a).onError(TextureVideoView.d(a), i1, j1))
                {
                    return true;
                }
            }
            return true;
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    private android.media.MediaPlayer.OnBufferingUpdateListener F = new android.media.MediaPlayer.OnBufferingUpdateListener() {

        private TextureVideoView a;

        public final void onBufferingUpdate(MediaPlayer mediaplayer, int i1)
        {
            TextureVideoView.c(a, i1);
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    private android.view.TextureView.SurfaceTextureListener G = new android.view.TextureView.SurfaceTextureListener() {

        private TextureVideoView a;

        public final void onSurfaceTextureAvailable(SurfaceTexture surfacetexture, int i1, int j1)
        {
            TextureVideoView.m(a);
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfacetexture)
        {
            if (TextureVideoView.e(a) != null)
            {
                TextureVideoView.e(a).hide();
            }
            TextureVideoView.n(a);
            return false;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfacetexture, int i1, int j1)
        {
            boolean flag1 = true;
            boolean flag;
            if (TextureVideoView.g(a) == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (a.a == i1 && a.b == j1)
            {
                i1 = ((flag1) ? 1 : 0);
            } else
            {
                i1 = 0;
            }
            if (TextureVideoView.d(a) != null && flag && i1 != 0)
            {
                if (TextureVideoView.f(a) != 0)
                {
                    a.seekTo(TextureVideoView.f(a));
                }
                a.start();
            }
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfacetexture)
        {
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    public boolean g;
    private String h;
    private Uri i;
    private Map j;
    private int k;
    private int l;
    private MediaPlayer m;
    private int n;
    private Surface o;
    private MediaController p;
    private android.media.MediaPlayer.OnCompletionListener q;
    private android.media.MediaPlayer.OnSeekCompleteListener r;
    private android.media.MediaPlayer.OnPreparedListener s;
    private int t;
    private android.media.MediaPlayer.OnErrorListener u;
    private android.media.MediaPlayer.OnInfoListener v;
    private int w;
    private boolean x;
    private boolean y;
    private android.media.MediaPlayer.OnVideoSizeChangedListener z = new android.media.MediaPlayer.OnVideoSizeChangedListener() {

        private TextureVideoView a;

        public final void onVideoSizeChanged(MediaPlayer mediaplayer, int i1, int j1)
        {
            TextureVideoView.a(a, mediaplayer);
            if (a.a != 0 && a.b != 0)
            {
                a.requestLayout();
            }
        }

            
            {
                a = TextureVideoView.this;
                super();
            }
    };

    public TextureVideoView(Context context)
    {
        super(context);
        h = "TextureVideoView";
        k = 0;
        l = 0;
        m = null;
        y = true;
        g = false;
        c();
    }

    public TextureVideoView(Context context, AttributeSet attributeset)
    {
        this(context, attributeset, 0);
        c();
    }

    public TextureVideoView(Context context, AttributeSet attributeset, int i1)
    {
        super(context, attributeset, i1);
        h = "TextureVideoView";
        k = 0;
        l = 0;
        m = null;
        y = true;
        g = false;
        c();
    }

    static int a(TextureVideoView texturevideoview)
    {
        return texturevideoview.k;
    }

    static int a(TextureVideoView texturevideoview, int i1)
    {
        texturevideoview.k = i1;
        return i1;
    }

    static void a(TextureVideoView texturevideoview, MediaPlayer mediaplayer)
    {
        try
        {
            texturevideoview.a = mediaplayer.getVideoWidth();
        }
        catch (IllegalStateException illegalstateexception)
        {
            texturevideoview.a = 0;
        }
        try
        {
            texturevideoview.b = mediaplayer.getVideoHeight();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (MediaPlayer mediaplayer)
        {
            texturevideoview.b = 0;
        }
    }

    private void a(boolean flag)
    {
        if (m != null)
        {
            m.reset();
            m.release();
            m = null;
            k = 0;
            if (flag)
            {
                l = 0;
            }
        }
        if (o != null)
        {
            o.release();
            o = null;
        }
    }

    static int b(TextureVideoView texturevideoview, int i1)
    {
        texturevideoview.l = i1;
        return i1;
    }

    static boolean b(TextureVideoView texturevideoview)
    {
        texturevideoview.x = true;
        return true;
    }

    static int c(TextureVideoView texturevideoview, int i1)
    {
        texturevideoview.t = i1;
        return i1;
    }

    static android.media.MediaPlayer.OnPreparedListener c(TextureVideoView texturevideoview)
    {
        return texturevideoview.s;
    }

    private void c()
    {
        a = 0;
        b = 0;
        setSurfaceTextureListener(G);
        setFocusable(true);
        setFocusableInTouchMode(true);
        requestFocus();
        k = 0;
        l = 0;
    }

    static MediaPlayer d(TextureVideoView texturevideoview)
    {
        return texturevideoview.m;
    }

    private void d()
    {
        if (i == null || getSurfaceTexture() == null)
        {
            return;
        }
        if (!g)
        {
            ((AudioManager)getContext().getSystemService("audio")).requestAudioFocus(null, 3, 1);
        }
        a(false);
        if (!y) goto _L2; else goto _L1
_L1:
        m = new Fa();
_L3:
        if (n == 0)
        {
            break MISSING_BLOCK_LABEL_362;
        }
        m.setAudioSessionId(n);
_L4:
        IOException ioexception;
        m.setOnPreparedListener(A);
        m.setOnVideoSizeChangedListener(z);
        m.setOnCompletionListener(B);
        m.setOnSeekCompleteListener(C);
        m.setOnErrorListener(E);
        m.setOnInfoListener(D);
        m.setOnBufferingUpdateListener(F);
        t = 0;
        m.setDataSource(getContext(), i, j);
        o = new Surface(getSurfaceTexture());
        m.setSurface(o);
        m.setAudioStreamType(3);
        m.setScreenOnWhilePlaying(true);
        m.prepareAsync();
        k = 1;
        e();
        return;
_L2:
        try
        {
            m = new MediaPlayer();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            Timber.e(h, "Unable to open content %s: %s", new Object[] {
                i, ioexception
            });
            k = -1;
            l = -1;
            E.onError(m, 1, 0);
            return;
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            Timber.e(h, "Unable to open content %s: %s", new Object[] {
                i, illegalargumentexception
            });
            k = -1;
            l = -1;
            E.onError(m, 1, 0);
            return;
        }
          goto _L3
        n = m.getAudioSessionId();
          goto _L4
    }

    static MediaController e(TextureVideoView texturevideoview)
    {
        return texturevideoview.p;
    }

    private void e()
    {
        if (m != null && p != null)
        {
            Object obj;
            if (getParent() instanceof View)
            {
                obj = (View)getParent();
            } else
            {
                obj = this;
            }
            p.setAnchorView(((View) (obj)));
            p.setEnabled(g());
        }
    }

    static int f(TextureVideoView texturevideoview)
    {
        return texturevideoview.w;
    }

    private void f()
    {
        if (p.isShowing())
        {
            p.hide();
            return;
        } else
        {
            p.show();
            return;
        }
    }

    static int g(TextureVideoView texturevideoview)
    {
        return texturevideoview.l;
    }

    private boolean g()
    {
        return m != null && k != -1 && k != 0 && k != 1;
    }

    static boolean h(TextureVideoView texturevideoview)
    {
        return texturevideoview.g();
    }

    static android.media.MediaPlayer.OnCompletionListener i(TextureVideoView texturevideoview)
    {
        return texturevideoview.q;
    }

    static android.media.MediaPlayer.OnSeekCompleteListener j(TextureVideoView texturevideoview)
    {
        return texturevideoview.r;
    }

    static android.media.MediaPlayer.OnInfoListener k(TextureVideoView texturevideoview)
    {
        return texturevideoview.v;
    }

    static android.media.MediaPlayer.OnErrorListener l(TextureVideoView texturevideoview)
    {
        return texturevideoview.u;
    }

    static void m(TextureVideoView texturevideoview)
    {
        texturevideoview.d();
    }

    static void n(TextureVideoView texturevideoview)
    {
        texturevideoview.a(true);
    }

    protected Matrix a(int i1)
    {
        return null;
    }

    public final void a()
    {
        if (m != null)
        {
            m.stop();
            m.release();
            m = null;
            k = 0;
            l = 0;
        }
        if (o != null)
        {
            o.release();
            o = null;
        }
    }

    public final void b()
    {
        a();
        i = null;
    }

    public boolean canPause()
    {
        return x;
    }

    public boolean canSeekBackward()
    {
        return false;
    }

    public boolean canSeekForward()
    {
        return false;
    }

    public int getAudioSessionId()
    {
        if (n == 0)
        {
            MediaPlayer mediaplayer = new MediaPlayer();
            n = mediaplayer.getAudioSessionId();
            mediaplayer.release();
        }
        return n;
    }

    public int getBufferPercentage()
    {
        if (m != null)
        {
            return t;
        } else
        {
            return 0;
        }
    }

    public int getCurrentPosition()
    {
        if (g())
        {
            return m.getCurrentPosition();
        } else
        {
            return 0;
        }
    }

    public int getDuration()
    {
        if (g())
        {
            return m.getDuration();
        } else
        {
            return -1;
        }
    }

    public boolean isPlaying()
    {
        return g() && m.isPlaying();
    }

    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityevent)
    {
        super.onInitializeAccessibilityEvent(accessibilityevent);
        accessibilityevent.setClassName(android/widget/VideoView.getName());
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilitynodeinfo)
    {
        super.onInitializeAccessibilityNodeInfo(accessibilitynodeinfo);
        accessibilitynodeinfo.setClassName(android/widget/VideoView.getName());
    }

    public boolean onKeyDown(int i1, KeyEvent keyevent)
    {
        boolean flag;
        if (i1 != 4 && i1 != 24 && i1 != 25 && i1 != 164 && i1 != 82 && i1 != 5 && i1 != 6)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!g() || !flag || p == null)
        {
            break MISSING_BLOCK_LABEL_182;
        }
        if (i1 != 79 && i1 != 85) goto _L2; else goto _L1
_L1:
        if (!m.isPlaying()) goto _L4; else goto _L3
_L3:
        pause();
        p.show();
_L6:
        return true;
_L4:
        start();
        p.hide();
        return true;
_L2:
        if (i1 != 126)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!m.isPlaying())
        {
            start();
            p.hide();
            return true;
        }
        if (true) goto _L6; else goto _L5
_L5:
        if (i1 != 86 && i1 != 127)
        {
            break; /* Loop/switch isn't completed */
        }
        if (m.isPlaying())
        {
            pause();
            p.show();
            return true;
        }
        if (true) goto _L6; else goto _L7
_L7:
        f();
        return super.onKeyDown(i1, keyevent);
    }

    protected void onMeasure(int i1, int j1)
    {
        int k1;
        int l1;
        int i2;
        int j2;
        i2 = getDefaultSize(a, i1);
        j2 = getDefaultSize(b, j1);
        k1 = j2;
        l1 = i2;
        if (a <= 0) goto _L2; else goto _L1
_L1:
        k1 = j2;
        l1 = i2;
        if (b <= 0) goto _L2; else goto _L3
_L3:
        l1 = android.view.View.MeasureSpec.getMode(i1);
        i2 = android.view.View.MeasureSpec.getSize(i1);
        j2 = android.view.View.MeasureSpec.getMode(j1);
        i1 = android.view.View.MeasureSpec.getSize(j1);
        if (l1 != 0x40000000 || j2 != 0x40000000) goto _L5; else goto _L4
_L4:
        if (a * i1 >= b * i2) goto _L7; else goto _L6
_L6:
        l1 = (a * i1) / b;
        k1 = i1;
_L2:
        setMeasuredDimension(l1, Math.max(1, k1));
        return;
_L7:
        k1 = i1;
        l1 = i2;
        if (a * i1 > b * i2)
        {
            k1 = (b * i2) / a;
            l1 = i2;
        }
        continue; /* Loop/switch isn't completed */
_L5:
        if (l1 == 0x40000000)
        {
            j1 = (b * i2) / a;
            if (j2 == 0x80000000)
            {
                k1 = i1;
                l1 = i2;
                if (j1 > i1)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            k1 = j1;
            l1 = i2;
            continue; /* Loop/switch isn't completed */
        }
        if (j2 == 0x40000000)
        {
            j1 = (a * i1) / b;
            if (l1 == 0x80000000)
            {
                k1 = i1;
                l1 = i2;
                if (j1 > i2)
                {
                    continue; /* Loop/switch isn't completed */
                }
            }
            l1 = j1;
            k1 = i1;
        } else
        {
            j1 = a;
            k1 = b;
            Matrix matrix;
            if (j2 == 0x80000000 && k1 > i1)
            {
                j1 = (a * i1) / b;
            } else
            {
                i1 = k1;
            }
            if (l1 == 0x80000000 && j1 > i2)
            {
                i1 = (b * i2) / a;
                j1 = i2;
            }
            Math.max(1, i1);
            matrix = a(j1);
            k1 = i1;
            l1 = j1;
            if (matrix != null)
            {
                setTransform(matrix);
                k1 = i1;
                l1 = j1;
            }
        }
        if (true) goto _L2; else goto _L8
_L8:
    }

    public boolean onTouchEvent(MotionEvent motionevent)
    {
        if (g() && p != null)
        {
            f();
        }
        return false;
    }

    public boolean onTrackballEvent(MotionEvent motionevent)
    {
        if (g() && p != null)
        {
            f();
        }
        return false;
    }

    public void pause()
    {
        if (g() && m.isPlaying())
        {
            m.pause();
            k = 4;
        }
        l = 4;
    }

    public void seekTo(int i1)
    {
        if (g())
        {
            m.seekTo(i1);
            w = 0;
            return;
        } else
        {
            w = i1;
            return;
        }
    }

    public void setLooping(boolean flag)
    {
        if (m != null)
        {
            m.setLooping(flag);
        }
    }

    public void setMediaController(MediaController mediacontroller)
    {
        if (p != null)
        {
            p.hide();
        }
        p = mediacontroller;
        e();
    }

    public void setOnCompletionListener(android.media.MediaPlayer.OnCompletionListener oncompletionlistener)
    {
        q = oncompletionlistener;
    }

    public void setOnErrorListener(android.media.MediaPlayer.OnErrorListener onerrorlistener)
    {
        u = onerrorlistener;
    }

    public void setOnInfoListener(android.media.MediaPlayer.OnInfoListener oninfolistener)
    {
        v = oninfolistener;
    }

    public void setOnPreparedListener(android.media.MediaPlayer.OnPreparedListener onpreparedlistener)
    {
        s = onpreparedlistener;
    }

    public void setOnSeekCompleteListener(android.media.MediaPlayer.OnSeekCompleteListener onseekcompletelistener)
    {
        r = onseekcompletelistener;
    }

    public void setShouldMute(boolean flag)
    {
        g = flag;
    }

    public void setShouldUseAsyncMediaPlayer(boolean flag)
    {
        y = flag;
    }

    public void setVideoPath(String s1)
    {
        if (s1 != null)
        {
            setVideoURI(Uri.parse(s1));
        }
    }

    public void setVideoURI(Uri uri)
    {
        setVideoURI(uri, null);
    }

    public void setVideoURI(Uri uri, Map map)
    {
        i = uri;
        j = map;
        w = 0;
        d();
        requestLayout();
        invalidate();
    }

    public void setViewport(int i1, int j1, int k1, int l1)
    {
        c = i1;
        d = j1;
        e = k1;
        f = l1;
    }

    public void start()
    {
        if (g())
        {
            m.start();
            k = 3;
        }
        l = 3;
    }
}
