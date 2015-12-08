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
import com.google.android.gms.common.internal.g;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.ry;
import java.util.HashMap;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzh, zzj, m, zzi

public class zzk extends FrameLayout
    implements zzh
{

    private final ry a;
    private final FrameLayout b;
    private final m c = new m(this);
    private zzi d;
    private boolean e;
    private boolean f;
    private TextView g;
    private long h;
    private long i;
    private String j;
    private String k;

    public zzk(Context context, ry ry1, int l, dm dm, dk dk)
    {
        super(context);
        a = ry1;
        b = new FrameLayout(context);
        addView(b, new android.widget.FrameLayout.LayoutParams(-1, -1));
        com.google.android.gms.common.internal.g.a(ry1.g());
        d = ry1.g().zzoH.zza(context, ry1, l, dm, dk);
        if (d != null)
        {
            b.addView(d, new android.widget.FrameLayout.LayoutParams(-1, -1, 17));
        }
        g = new TextView(context);
        g.setBackgroundColor(0xff000000);
        b();
        c.b();
        if (d != null)
        {
            d.zza(this);
        }
        if (d == null)
        {
            zzh("AdVideoUnderlay Error", "Allocating player failed.");
        }
    }

    private transient void a(String s, String as[])
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", s);
        int i1 = as.length;
        int l = 0;
        s = null;
        while (l < i1) 
        {
            String s1 = as[l];
            if (s == null)
            {
                s = s1;
            } else
            {
                hashmap.put(s, s1);
                s = null;
            }
            l++;
        }
        a.a("onVideoEvent", hashmap);
    }

    private void b()
    {
        if (!c())
        {
            b.addView(g, new android.widget.FrameLayout.LayoutParams(-1, -1));
            b.bringChildToFront(g);
        }
    }

    private boolean c()
    {
        return g.getParent() != null;
    }

    private void d()
    {
        while (a.e() == null || !e || f) 
        {
            return;
        }
        a.e().getWindow().clearFlags(128);
        e = false;
    }

    public static void zzd(ry ry1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", "no_video_view");
        ry1.a("onVideoEvent", hashmap);
    }

    final void a()
    {
        long l;
        if (d != null)
        {
            if (h != (l = d.getCurrentPosition()) && l > 0L)
            {
                if (c())
                {
                    b.removeView(g);
                }
                a("timeupdate", new String[] {
                    "time", String.valueOf((float)l / 1000F)
                });
                h = l;
                return;
            }
        }
    }

    public void destroy()
    {
        c.a();
        if (d != null)
        {
            d.stop();
        }
        d();
    }

    public void onPaused()
    {
        a("pause", new String[0]);
        d();
    }

    public void pause()
    {
        if (d == null)
        {
            return;
        } else
        {
            d.pause();
            return;
        }
    }

    public void play()
    {
        if (d == null)
        {
            return;
        } else
        {
            d.play();
            return;
        }
    }

    public void seekTo(int l)
    {
        if (d == null)
        {
            return;
        } else
        {
            d.seekTo(l);
            return;
        }
    }

    public void setMimeType(String s)
    {
        j = s;
    }

    public void zza(float f1)
    {
        if (d == null)
        {
            return;
        } else
        {
            d.zza(f1);
            return;
        }
    }

    public void zzan(String s)
    {
        k = s;
    }

    public void zzd(int l, int i1, int j1, int k1)
    {
        if (j1 == 0 || k1 == 0)
        {
            return;
        } else
        {
            android.widget.FrameLayout.LayoutParams layoutparams = new android.widget.FrameLayout.LayoutParams(j1 + 2, k1 + 2);
            layoutparams.setMargins(l - 1, i1 - 1, 0, 0);
            b.setLayoutParams(layoutparams);
            requestLayout();
            return;
        }
    }

    public void zzd(MotionEvent motionevent)
    {
        if (d == null)
        {
            return;
        } else
        {
            d.dispatchTouchEvent(motionevent);
            return;
        }
    }

    public void zzeQ()
    {
    }

    public void zzeR()
    {
        while (d == null || i != 0L) 
        {
            return;
        }
        a("canplaythrough", new String[] {
            "duration", String.valueOf((float)d.getDuration() / 1000F), "videoWidth", String.valueOf(d.getVideoWidth()), "videoHeight", String.valueOf(d.getVideoHeight())
        });
    }

    public void zzeS()
    {
        if (a.e() != null && !e)
        {
            boolean flag;
            if ((a.e().getWindow().getAttributes().flags & 0x80) != 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f = flag;
            if (!f)
            {
                a.e().getWindow().addFlags(128);
                e = true;
            }
        }
    }

    public void zzeT()
    {
        a("ended", new String[0]);
        d();
    }

    public void zzeU()
    {
        b();
        i = h;
    }

    public void zzeV()
    {
        if (d == null)
        {
            return;
        }
        if (!TextUtils.isEmpty(k))
        {
            d.setMimeType(j);
            d.setVideoPath(k);
            return;
        } else
        {
            a("no_src", new String[0]);
            return;
        }
    }

    public void zzeW()
    {
        if (d == null)
        {
            return;
        } else
        {
            TextView textview = new TextView(d.getContext());
            textview.setText((new StringBuilder("AdMob - ")).append(d.zzer()).toString());
            textview.setTextColor(0xffff0000);
            textview.setBackgroundColor(-256);
            b.addView(textview, new android.widget.FrameLayout.LayoutParams(-2, -2, 17));
            b.bringChildToFront(textview);
            return;
        }
    }

    public void zzex()
    {
        if (d == null)
        {
            return;
        } else
        {
            d.zzex();
            return;
        }
    }

    public void zzey()
    {
        if (d == null)
        {
            return;
        } else
        {
            d.zzey();
            return;
        }
    }

    public void zzh(String s, String s1)
    {
        a("error", new String[] {
            "what", s, "extra", s1
        });
    }
}
