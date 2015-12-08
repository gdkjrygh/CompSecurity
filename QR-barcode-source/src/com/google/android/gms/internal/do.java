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
//            gv, gr

public final class do extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class a
    {

        private final Runnable mk;
        private volatile boolean sc;

        static boolean a(a a1)
        {
            return a1.sc;
        }

        public void cancel()
        {
            sc = true;
            gr.wC.removeCallbacks(mk);
        }

        public void cj()
        {
            gr.wC.postDelayed(mk, 250L);
        }

        public a(do do1)
        {
            sc = false;
            mk = new _cls1(this, do1);
        }
    }


    private final gv md;
    private final MediaController rX;
    private final a rY = new a(this);
    private final VideoView rZ;
    private long sa;
    private String sb;

    public do(Context context, gv gv1)
    {
        super(context);
        md = gv1;
        rZ = new VideoView(context);
        gv1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(rZ, gv1);
        rX = new MediaController(context);
        rY.cj();
        rZ.setOnCompletionListener(this);
        rZ.setOnPreparedListener(this);
        rZ.setOnErrorListener(this);
    }

    private static void a(gv gv1, String s)
    {
        a(gv1, s, ((Map) (new HashMap(1))));
    }

    public static void a(gv gv1, String s, String s1)
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
        a(gv1, "error", ((Map) (hashmap)));
    }

    private static void a(gv gv1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(gv1, s, ((Map) (hashmap)));
    }

    private static void a(gv gv1, String s, Map map)
    {
        map.put("event", s);
        gv1.a("onVideoEvent", map);
    }

    public void C(String s)
    {
        sb = s;
    }

    public void b(MotionEvent motionevent)
    {
        rZ.dispatchTouchEvent(motionevent);
    }

    public void ch()
    {
        if (!TextUtils.isEmpty(sb))
        {
            rZ.setVideoPath(sb);
            return;
        } else
        {
            a(md, "no_src", ((String) (null)));
            return;
        }
    }

    public void ci()
    {
        long l = rZ.getCurrentPosition();
        if (sa != l)
        {
            float f = (float)l / 1000F;
            a(md, "timeupdate", "time", String.valueOf(f));
            sa = l;
        }
    }

    public void destroy()
    {
        rY.cancel();
        rZ.stopPlayback();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a(md, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a(md, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f = (float)rZ.getDuration() / 1000F;
        a(md, "canplaythrough", "duration", String.valueOf(f));
    }

    public void pause()
    {
        rZ.pause();
    }

    public void play()
    {
        rZ.start();
    }

    public void q(boolean flag)
    {
        if (flag)
        {
            rZ.setMediaController(rX);
            return;
        } else
        {
            rX.hide();
            rZ.setMediaController(null);
            return;
        }
    }

    public void seekTo(int i)
    {
        rZ.seekTo(i);
    }

    // Unreferenced inner class com/google/android/gms/internal/do$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        private final WeakReference sd;
        final do se;
        final a sf;

        public void run()
        {
            do do1 = (do)sd.get();
            if (!a.a(sf) && do1 != null)
            {
                do1.ci();
                sf.cj();
            }
        }

            
            {
                sf = a1;
                se = do1;
                super();
                sd = new WeakReference(se);
            }
    }

}
