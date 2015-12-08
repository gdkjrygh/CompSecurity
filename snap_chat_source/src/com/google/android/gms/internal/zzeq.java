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
//            zzic, zzhw

public class zzeq extends FrameLayout
    implements android.media.MediaPlayer.OnCompletionListener, android.media.MediaPlayer.OnErrorListener, android.media.MediaPlayer.OnPreparedListener
{
    static final class zza
    {

        private final Runnable zzmG;
        private volatile boolean zzuF;

        static boolean zza(zza zza1)
        {
            return zza1.zzuF;
        }

        public final void cancel()
        {
            zzuF = true;
            zzhw.zzzG.removeCallbacks(zzmG);
        }

        public final void zzdq()
        {
            zzhw.zzzG.postDelayed(zzmG, 250L);
        }

        public zza(zzeq zzeq1)
        {
            zzuF = false;
            zzmG = new _cls1(this, zzeq1);
        }
    }


    private final zzic zzmu;
    private final MediaController zzuA;
    private final zza zzuB = new zza(this);
    private final VideoView zzuC;
    private long zzuD;
    private String zzuE;

    public zzeq(Context context, zzic zzic1)
    {
        super(context);
        zzmu = zzic1;
        zzuC = new VideoView(context);
        zzic1 = new android.widget.FrameLayout.LayoutParams(-1, -1, 17);
        addView(zzuC, zzic1);
        zzuA = new MediaController(context);
        zzuB.zzdq();
        zzuC.setOnCompletionListener(this);
        zzuC.setOnPreparedListener(this);
        zzuC.setOnErrorListener(this);
    }

    private static void zza(zzic zzic1, String s)
    {
        zza(zzic1, s, ((Map) (new HashMap(1))));
    }

    public static void zza(zzic zzic1, String s, String s1)
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
        zza(zzic1, "error", ((Map) (hashmap)));
    }

    private static void zza(zzic zzic1, String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap(2);
        hashmap.put(s1, s2);
        zza(zzic1, s, ((Map) (hashmap)));
    }

    private static void zza(zzic zzic1, String s, Map map)
    {
        map.put("event", s);
        zzic1.zzb("onVideoEvent", map);
    }

    public void destroy()
    {
        zzuB.cancel();
        zzuC.stopPlayback();
    }

    public void onCompletion(MediaPlayer mediaplayer)
    {
        zza(zzmu, "ended");
    }

    public boolean onError(MediaPlayer mediaplayer, int i, int j)
    {
        zza(zzmu, String.valueOf(i), String.valueOf(j));
        return true;
    }

    public void onPrepared(MediaPlayer mediaplayer)
    {
        float f = (float)zzuC.getDuration() / 1000F;
        zza(zzmu, "canplaythrough", "duration", String.valueOf(f));
    }

    public void pause()
    {
        zzuC.pause();
    }

    public void play()
    {
        zzuC.start();
    }

    public void seekTo(int i)
    {
        zzuC.seekTo(i);
    }

    public void zzK(String s)
    {
        zzuE = s;
    }

    public void zzb(MotionEvent motionevent)
    {
        zzuC.dispatchTouchEvent(motionevent);
    }

    public void zzdo()
    {
        if (!TextUtils.isEmpty(zzuE))
        {
            zzuC.setVideoPath(zzuE);
            return;
        } else
        {
            zza(zzmu, "no_src", ((String) (null)));
            return;
        }
    }

    public void zzdp()
    {
        long l = zzuC.getCurrentPosition();
        if (zzuD != l)
        {
            float f = (float)l / 1000F;
            zza(zzmu, "timeupdate", "time", String.valueOf(f));
            zzuD = l;
        }
    }

    public void zzu(boolean flag)
    {
        if (flag)
        {
            zzuC.setMediaController(zzuA);
            return;
        } else
        {
            zzuA.hide();
            zzuC.setMediaController(null);
            return;
        }
    }

    // Unreferenced inner class com/google/android/gms/internal/zzeq$zza$1

/* anonymous class */
    class zza._cls1
        implements Runnable
    {

        private final WeakReference zzuG;
        final zzeq zzuH;
        final zza zzuI;

        public void run()
        {
            zzeq zzeq1 = (zzeq)zzuG.get();
            if (!zza.zza(zzuI) && zzeq1 != null)
            {
                zzeq1.zzdp();
                zzuI.zzdq();
            }
        }

            
            {
                zzuI = zza1;
                zzuH = zzeq1;
                super();
                zzuG = new WeakReference(zzuH);
            }
    }

}
