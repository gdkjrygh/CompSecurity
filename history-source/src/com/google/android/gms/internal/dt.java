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
//            gu, gq

public final class dt extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class a
    {

        private final Runnable mv;
        private volatile boolean st;

        static boolean a(a a1)
        {
            return a1.st;
        }

        public void cancel()
        {
            st = true;
            gq.wR.removeCallbacks(mv);
        }

        public void cs()
        {
            gq.wR.postDelayed(mv, 250L);
        }

        public a(dt dt1)
        {
            st = false;
            mv = new _cls1(this, dt1);
        }
    }


    private final gu mo;
    private final MediaController so;
    private final a sp = new a(this);
    private final VideoView sq;
    private long sr;
    private String ss;

    public dt(Context context, gu gu1)
    {
        super(context);
        mo = gu1;
        sq = new VideoView(context);
        gu1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(sq, gu1);
        so = new MediaController(context);
        sp.cs();
        sq.setOnCompletionListener(this);
        sq.setOnPreparedListener(this);
        sq.setOnErrorListener(this);
    }

    private static void a(gu gu1, String s1)
    {
        a(gu1, s1, ((Map) (new HashMap(1))));
    }

    public static void a(gu gu1, String s1, String s2)
    {
        HashMap hashmap;
        boolean flag;
        byte byte0;
        if (s2 == null)
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
        hashmap.put("what", s1);
        if (!flag)
        {
            hashmap.put("extra", s2);
        }
        a(gu1, "error", ((Map) (hashmap)));
    }

    private static void a(gu gu1, String s1, String s2, String s3)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s2, s3);
        a(gu1, s1, ((Map) (hashmap)));
    }

    private static void a(gu gu1, String s1, Map map)
    {
        map.put("event", s1);
        gu1.a("onVideoEvent", map);
    }

    public void C(String s1)
    {
        ss = s1;
    }

    public void b(MotionEvent motionevent)
    {
        sq.dispatchTouchEvent(motionevent);
    }

    public void cq()
    {
        if (!TextUtils.isEmpty(ss))
        {
            sq.setVideoPath(ss);
            return;
        } else
        {
            a(mo, "no_src", ((String) (null)));
            return;
        }
    }

    public void cr()
    {
        long l = sq.getCurrentPosition();
        if (sr != l)
        {
            float f = (float)l / 1000F;
            a(mo, "timeupdate", "time", String.valueOf(f));
            sr = l;
        }
    }

    public void destroy()
    {
        sp.cancel();
        sq.stopPlayback();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a(mo, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a(mo, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f = (float)sq.getDuration() / 1000F;
        a(mo, "canplaythrough", "duration", String.valueOf(f));
    }

    public void pause()
    {
        sq.pause();
    }

    public void play()
    {
        sq.start();
    }

    public void s(boolean flag)
    {
        if (flag)
        {
            sq.setMediaController(so);
            return;
        } else
        {
            so.hide();
            sq.setMediaController(null);
            return;
        }
    }

    public void seekTo(int i)
    {
        sq.seekTo(i);
    }

    // Unreferenced inner class com/google/android/gms/internal/dt$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        private final WeakReference su;
        final dt sv;
        final a sw;

        public void run()
        {
            dt dt1 = (dt)su.get();
            if (!a.a(sw) && dt1 != null)
            {
                dt1.cr();
                sw.cs();
            }
        }

            
            {
                sw = a1;
                sv = dt1;
                super();
                su = new WeakReference(sv);
            }
    }

}
