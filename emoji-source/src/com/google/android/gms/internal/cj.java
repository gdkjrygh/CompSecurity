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
//            ex, et

public final class cj extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class a
    {

        private final Runnable lg;
        private volatile boolean oN;

        static boolean a(a a1)
        {
            return a1.oN;
        }

        public void bc()
        {
            et.sv.postDelayed(lg, 250L);
        }

        public void cancel()
        {
            oN = true;
            et.sv.removeCallbacks(lg);
        }

        public a(cj cj1)
        {
            oN = false;
            lg = new _cls1(this, cj1);
        }
    }


    private final ex lN;
    private final MediaController oI;
    private final a oJ = new a(this);
    private final VideoView oK;
    private long oL;
    private String oM;

    public cj(Context context, ex ex1)
    {
        super(context);
        lN = ex1;
        oK = new VideoView(context);
        ex1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(oK, ex1);
        oI = new MediaController(context);
        oJ.bc();
        oK.setOnCompletionListener(this);
        oK.setOnPreparedListener(this);
        oK.setOnErrorListener(this);
    }

    private static void a(ex ex1, String s)
    {
        a(ex1, s, ((Map) (new HashMap(1))));
    }

    public static void a(ex ex1, String s, String s1)
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
        a(ex1, "error", ((Map) (hashmap)));
    }

    private static void a(ex ex1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(ex1, s, ((Map) (hashmap)));
    }

    private static void a(ex ex1, String s, Map map)
    {
        map.put("event", s);
        ex1.a("onVideoEvent", map);
    }

    public void b(MotionEvent motionevent)
    {
        oK.dispatchTouchEvent(motionevent);
    }

    public void ba()
    {
        if (!TextUtils.isEmpty(oM))
        {
            oK.setVideoPath(oM);
            return;
        } else
        {
            a(lN, "no_src", ((String) (null)));
            return;
        }
    }

    public void bb()
    {
        long l1 = oK.getCurrentPosition();
        if (oL != l1)
        {
            float f = (float)l1 / 1000F;
            a(lN, "timeupdate", "time", String.valueOf(f));
            oL = l1;
        }
    }

    public void destroy()
    {
        oJ.cancel();
        oK.stopPlayback();
    }

    public void l(boolean flag)
    {
        if (flag)
        {
            oK.setMediaController(oI);
            return;
        } else
        {
            oI.hide();
            oK.setMediaController(null);
            return;
        }
    }

    public void o(String s)
    {
        oM = s;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a(lN, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a(lN, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f = (float)oK.getDuration() / 1000F;
        a(lN, "canplaythrough", "duration", String.valueOf(f));
    }

    public void pause()
    {
        oK.pause();
    }

    public void play()
    {
        oK.start();
    }

    public void seekTo(int i)
    {
        oK.seekTo(i);
    }

    // Unreferenced inner class com/google/android/gms/internal/cj$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        private final WeakReference oO;
        final cj oP;
        final a oQ;

        public void run()
        {
            cj cj1 = (cj)oO.get();
            if (!a.a(oQ) && cj1 != null)
            {
                cj1.bb();
                oQ.bc();
            }
        }

            
            {
                oQ = a1;
                oP = cj1;
                super();
                oO = new WeakReference(oP);
            }
    }

}
