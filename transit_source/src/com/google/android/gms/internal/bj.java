// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.media.MediaPlayer;
import android.os.Handler;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import android.widget.MediaController;
import android.widget.VideoView;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.android.gms.internal:
//            cq, cm

public final class bj extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class a
    {

        private final Runnable el;
        private volatile boolean gg;

        static boolean a(a a1)
        {
            return a1.gg;
        }

        public void ab()
        {
            cm.hO.postDelayed(el, 250L);
        }

        public void cancel()
        {
            gg = true;
            cm.hO.removeCallbacks(el);
        }

        public a(bj bj1)
        {
            gg = false;
            el = new _cls1(this, bj1);
        }
    }


    private final cq fG;
    private final MediaController gb;
    private final a gc = new a(this);
    private final VideoView gd;
    private long ge;
    private String gf;

    public bj(Context context, cq cq1)
    {
        super(context);
        fG = cq1;
        gd = new VideoView(context);
        cq1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(gd, cq1);
        gb = new MediaController(context);
        gc.ab();
        gd.setOnCompletionListener(this);
        gd.setOnPreparedListener(this);
        gd.setOnErrorListener(this);
    }

    private static void a(cq cq1, String s)
    {
        a(cq1, s, ((Map) (new HashMap(1))));
    }

    public static void a(cq cq1, String s, String s1)
    {
        HashMap hashmap;
        boolean flag;
        byte byte0;
        if (s1 == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            byte0 = 2;
        } else
        {
            byte0 = 3;
        }
        hashmap = new HashMap(byte0);
        hashmap.put("what", s);
        if (!flag)
        {
            hashmap.put("extra", s1);
        }
        a(cq1, "error", ((Map) (hashmap)));
    }

    private static void a(cq cq1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(cq1, s, ((Map) (hashmap)));
    }

    private static void a(cq cq1, String s, Map map)
    {
        map.put("event", s);
        cq1.a("onVideoEvent", map);
    }

    public void Z()
    {
        if (!TextUtils.isEmpty(gf))
        {
            gd.setVideoPath(gf);
            return;
        } else
        {
            a(fG, "no_src", ((String) (null)));
            return;
        }
    }

    public void aa()
    {
        long l = gd.getCurrentPosition();
        if (ge != l)
        {
            float f1 = (float)l / 1000F;
            a(fG, "timeupdate", "time", String.valueOf(f1));
            ge = l;
        }
    }

    public void b(MotionEvent motionevent)
    {
        gd.dispatchTouchEvent(motionevent);
    }

    public void destroy()
    {
        gc.cancel();
        gd.stopPlayback();
    }

    public void f(boolean flag)
    {
        if (flag)
        {
            gd.setMediaController(gb);
            return;
        } else
        {
            gb.hide();
            gd.setMediaController(null);
            return;
        }
    }

    public void i(String s)
    {
        gf = s;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a(fG, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int j, int k)
    {
        a(fG, String.valueOf(j), String.valueOf(k));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f1 = (float)gd.getDuration() / 1000F;
        a(fG, "canplaythrough", "duration", String.valueOf(f1));
    }

    public void pause()
    {
        gd.pause();
    }

    public void play()
    {
        gd.start();
    }

    public void seekTo(int j)
    {
        gd.seekTo(j);
    }

    // Unreferenced inner class com/google/android/gms/internal/bj$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        private final WeakReference gh;
        final bj gi;
        final a gj;

        public void run()
        {
            bj bj1 = (bj)gh.get();
            if (!a.a(gj) && bj1 != null)
            {
                bj1.aa();
                gj.ab();
            }
        }

            
            {
                gj = a1;
                gi = bj1;
                super();
                gh = new WeakReference(gi);
            }
    }

}
