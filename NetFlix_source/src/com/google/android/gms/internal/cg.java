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
//            dz, dv

public final class cg extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    private static final class a
    {

        private final Runnable kW;
        private volatile boolean ox;

        static boolean a(a a1)
        {
            return a1.ox;
        }

        public void aW()
        {
            dv.rp.postDelayed(kW, 250L);
        }

        public void cancel()
        {
            ox = true;
            dv.rp.removeCallbacks(kW);
        }

        public a(cg cg1)
        {
            ox = false;
            kW = new _cls1(this, cg1);
        }
    }


    private final dz lC;
    private final MediaController os;
    private final a ot = new a(this);
    private final VideoView ou;
    private long ov;
    private String ow;

    public cg(Context context, dz dz1)
    {
        super(context);
        lC = dz1;
        ou = new VideoView(context);
        dz1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(ou, dz1);
        os = new MediaController(context);
        ot.aW();
        ou.setOnCompletionListener(this);
        ou.setOnPreparedListener(this);
        ou.setOnErrorListener(this);
    }

    private static void a(dz dz1, String s)
    {
        a(dz1, s, ((Map) (new HashMap(1))));
    }

    public static void a(dz dz1, String s, String s1)
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
        a(dz1, "error", ((Map) (hashmap)));
    }

    private static void a(dz dz1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        a(dz1, s, ((Map) (hashmap)));
    }

    private static void a(dz dz1, String s, Map map)
    {
        map.put("event", s);
        dz1.a("onVideoEvent", map);
    }

    public void aU()
    {
        if (!TextUtils.isEmpty(ow))
        {
            ou.setVideoPath(ow);
            return;
        } else
        {
            a(lC, "no_src", ((String) (null)));
            return;
        }
    }

    public void aV()
    {
        long l = ou.getCurrentPosition();
        if (ov != l)
        {
            float f = (float)l / 1000F;
            a(lC, "timeupdate", "time", String.valueOf(f));
            ov = l;
        }
    }

    public void b(MotionEvent motionevent)
    {
        ou.dispatchTouchEvent(motionevent);
    }

    public void destroy()
    {
        ot.cancel();
        ou.stopPlayback();
    }

    public void k(boolean flag)
    {
        if (flag)
        {
            ou.setMediaController(os);
            return;
        } else
        {
            os.hide();
            ou.setMediaController(null);
            return;
        }
    }

    public void o(String s)
    {
        ow = s;
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        a(lC, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        a(lC, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f = (float)ou.getDuration() / 1000F;
        a(lC, "canplaythrough", "duration", String.valueOf(f));
    }

    public void pause()
    {
        ou.pause();
    }

    public void play()
    {
        ou.start();
    }

    public void seekTo(int i)
    {
        ou.seekTo(i);
    }

    // Unreferenced inner class com/google/android/gms/internal/cg$a$1

/* anonymous class */
    class a._cls1
        implements Runnable
    {

        final a oA;
        private final WeakReference oy;
        final cg oz;

        public void run()
        {
            cg cg1 = (cg)oy.get();
            if (!a.a(oA) && cg1 != null)
            {
                cg1.aV();
                oA.aW();
            }
        }

            
            {
                oA = a1;
                oz = cg1;
                super();
                oy = new WeakReference(oz);
            }
    }

}
