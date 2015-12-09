// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.gms.ads.internal.zzd;
import com.google.android.gms.common.internal.e;
import com.google.android.gms.internal.bc;
import com.google.android.gms.internal.bd;
import com.google.android.gms.internal.hs;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzh, zzj, zzq, zzi

public class zzk extends FrameLayout
    implements zzh
{

    private final FrameLayout zzBb;
    private final zzq zzBc = new zzq(this);
    private zzi zzBd;
    private boolean zzBe;
    private boolean zzBf;
    private TextView zzBg;
    private long zzBh;
    private long zzBi;
    private String zzBj;
    private final hs zzoL;
    private String zzxs;

    public zzk(Context context, hs hs1, int i, bd bd, bc bc)
    {
        super(context);
        zzoL = hs1;
        zzBb = new FrameLayout(context);
        addView(zzBb);
        e.a(hs1.e());
        zzBd = hs1.e().zzoG.zza(context, hs1, i, bd, bc);
        zzBb.addView(zzBd, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        zzBg = new TextView(context);
        zzBg.setBackgroundColor(0xff000000);
        zzeS();
        zzBc.zzfa();
        zzBd.zza(this);
    }

    private transient void zza(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int j = as.length;
        int i = 0;
        s = null;
        while (i < j) 
        {
            String s1 = as[i];
            if (s == null)
            {
                s = s1;
            } else
            {
                hashmap.put(s, s1);
                s = null;
            }
            i++;
        }
        zzoL.a("onVideoEvent", hashmap);
    }

    public static void zzd(hs hs1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        hs1.a("onVideoEvent", hashmap);
    }

    private void zzeS()
    {
        if (!zzeU())
        {
            zzBb.addView(zzBg, new android.widget.FrameLayout.LayoutParams(-1, -1));
            zzBb.bringChildToFront(zzBg);
        }
    }

    private void zzeT()
    {
        if (zzeU())
        {
            zzBb.removeView(zzBg);
        }
    }

    private boolean zzeU()
    {
        return zzBg.getParent() != null;
    }

    private void zzeV()
    {
        if (zzoL.c() != null && !zzBe)
        {
            boolean flag;
            if ((zzoL.c().getWindow().getAttributes().flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            zzBf = flag;
            if (!zzBf)
            {
                zzoL.c().getWindow().addFlags(128);
                zzBe = true;
                return;
            }
        }
    }

    private void zzeW()
    {
        while (zzoL.c() == null || !zzBe || zzBf) 
        {
            return;
        }
        zzoL.c().getWindow().clearFlags(128);
        zzBe = false;
    }

    public void destroy()
    {
        zzBc.cancel();
        zzBd.stop();
        zzeW();
    }

    public void onPaused()
    {
        zza("pause", new String[0]);
        zzeW();
    }

    public void pause()
    {
        zzBd.pause();
    }

    public void play()
    {
        zzBd.play();
    }

    public void seekTo(int i)
    {
        zzBd.seekTo(i);
    }

    public void setMimeType(String s)
    {
        zzBj = s;
    }

    public void zza(float f)
    {
        zzBd.zza(f);
    }

    public void zzak(String s)
    {
        zzxs = s;
    }

    public void zzd(MotionEvent motionevent)
    {
        zzBd.dispatchTouchEvent(motionevent);
    }

    public void zze(int i, int j, int k, int l)
    {
        if (k == 0 || l == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(k + 2, l + 2);
            layoutparams.setMargins(i - 1, j - 1, 0, 0);
            zzBb.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    public void zzeK()
    {
    }

    public void zzeL()
    {
        if (zzBi == 0L)
        {
            zza("canplaythrough", new String[] {
                "duration", String.valueOf((float)zzBd.getDuration() / 1000F), "videoWidth", String.valueOf(zzBd.getVideoWidth()), "videoHeight", String.valueOf(zzBd.getVideoHeight())
            });
        }
    }

    public void zzeM()
    {
        zzeV();
    }

    public void zzeN()
    {
        zza("ended", new String[0]);
        zzeW();
    }

    public void zzeO()
    {
        zzeS();
        zzBi = zzBh;
    }

    public void zzeP()
    {
        if (!TextUtils.isEmpty(zzxs))
        {
            zzBd.setMimeType(zzBj);
            zzBd.setVideoPath(zzxs);
            return;
        } else
        {
            zza("no_src", new String[0]);
            return;
        }
    }

    public void zzeQ()
    {
        TextView textview = new TextView(zzBd.getContext());
        textview.setText((new StringBuilder()).append("AdMob - ").append(zzBd.zzek()).toString());
        textview.setTextColor(0xffff0000);
        textview.setBackgroundColor(-256);
        zzBb.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
        zzBb.bringChildToFront(textview);
    }

    void zzeR()
    {
        long l = zzBd.getCurrentPosition();
        if (zzBh != l && l > 0L)
        {
            zzeT();
            zza("timeupdate", new String[] {
                "time", String.valueOf((float)l / 1000F)
            });
            zzBh = l;
        }
    }

    public void zzeq()
    {
        zzBd.zzeq();
    }

    public void zzer()
    {
        zzBd.zzer();
    }

    public void zzh(String s, String s1)
    {
        zza("error", new String[] {
            "what", s, "extra", s1
        });
    }
}
