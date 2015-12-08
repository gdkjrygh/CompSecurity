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
//            ey, eu

public final class ck extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class a
    {

        private final Runnable le;
        private volatile boolean oL;

        static boolean a(a a1)
        {
            return a1.oL;
        }

        public void aX()
        {
            eu.ss.postDelayed(le, 250L);
        }

        public void cancel()
        {
            oL = true;
            eu.ss.removeCallbacks(le);
        }

        public a(ck ck1)
        {
            oL = false;
            le = new _cls1(this, ck1);
        }
    }


    private final ey lL;
    private final MediaController oG;
    private final a oH = new a(this);
    private final VideoView oI;
    private long oJ;
    private String oK;

    public ck(Context context, ey ey1)
    {
        super(context);
        lL = ey1;
        oI = new VideoView(context);
        ey1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(oI, ey1);
        oG = new MediaController(context);
        oH.aX();
        oI.setOnCompletionListener(this);
        oI.setOnPreparedListener(this);
        oI.setOnErrorListener(this);
    }

    private static void a(ey ey1, String s)
    {
        a(ey1, s, ((Map) (new HashMap(1))));
    }

    public static void a(ey ey1, String s, String s1)
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
        a(ey1, "error", ((Map) (hashmap)));
    }

    private static void a(ey ey1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(ey1, s, ((Map) (hashmap)));
    }

    private static void a(ey ey1, String s, Map map)
    {
        map.put("event", s);
        ey1.a("onVideoEvent", map);
    }

    public void aV()
    {
        if (!TextUtils.isEmpty(oK))
        {
            oI.setVideoPath(oK);
            return;
        } else
        {
            a(lL, "no_src", ((String) (null)));
            return;
        }
    }

    public void aW()
    {
        long l1 = oI.getCurrentPosition();
        if (oJ != l1)
        {
            float f = (float)l1 / 1000F;
            a(lL, "timeupdate", "time", String.valueOf(f));
            oJ = l1;
        }
    }

    public void b(MotionEvent motionevent)
    {
        oI.dispatchTouchEvent(motionevent);
    }

    public void destroy()
    {
        oH.cancel();
        oI.stopPlayback();
    }

    public void l(boolean flag)
    {
        if (flag)
        {
            oI.setMediaController(oG);
            return;
        } else
        {
            oG.hide();
            oI.setMediaController(null);
            return;
        }
    }

    public void o(String s)
    {
        oK = s;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a(lL, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a(lL, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f = (float)oI.getDuration() / 1000F;
        a(lL, "canplaythrough", "duration", String.valueOf(f));
    }

    public void pause()
    {
        oI.pause();
    }

    public void play()
    {
        oI.start();
    }

    public void seekTo(int i)
    {
        oI.seekTo(i);
    }

    // Unreferenced inner class com/google/android/gms/internal/ck$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        private final WeakReference oM;
        final ck oN;
        final a oO;

        public void run()
        {
            ck ck1 = (ck)oM.get();
            if (!a.a(oO) && ck1 != null)
            {
                ck1.aW();
                oO.aX();
            }
        }

            
            {
                oO = a1;
                oN = ck1;
                super();
                oM = new WeakReference(oN);
            }
    }

}
