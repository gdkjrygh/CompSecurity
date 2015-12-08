// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.TextureView;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.util.client.zzb;
import com.google.android.gms.internal.cx;
import com.google.android.gms.internal.cy;
import com.google.android.gms.internal.df;
import com.google.android.gms.internal.dk;
import com.google.android.gms.internal.dm;
import com.google.android.gms.internal.qa;
import com.google.android.gms.internal.qo;
import com.google.android.gms.internal.qp;
import com.google.android.gms.internal.qq;
import com.google.android.gms.internal.wg;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzi

public class zzp
{

    private final Context a;
    private final String b;
    private final VersionInfoParcel c;
    private final dk d;
    private final dm e;
    private final qo f = (new qq()).a("min_1", 4.9406564584124654E-324D, 1.0D).a("1_5", 1.0D, 5D).a("5_10", 5D, 10D).a("10_20", 10D, 20D).a("20_30", 20D, 30D).a("30_max", 30D, 1.7976931348623157E+308D).a();
    private final long g[];
    private final String h[];
    private dk i;
    private dk j;
    private dk k;
    private dk l;
    private boolean m;
    private zzi n;
    private boolean o;
    private boolean p;
    private long q;

    public zzp(Context context, VersionInfoParcel versioninfoparcel, String s, dm dm, dk dk)
    {
        q = -1L;
        a = context;
        c = versioninfoparcel;
        b = s;
        e = dm;
        d = dk;
        context = cy.v;
        context = (String)com.google.android.gms.ads.internal.zzp.zzbE().a(context);
        if (context == null)
        {
            h = new String[0];
            g = new long[0];
        } else
        {
            context = TextUtils.split(context, ",");
            h = new String[context.length];
            g = new long[context.length];
            int i1 = 0;
            while (i1 < context.length) 
            {
                try
                {
                    g[i1] = Long.parseLong(context[i1]);
                }
                // Misplaced declaration of an exception variable
                catch (VersionInfoParcel versioninfoparcel)
                {
                    com.google.android.gms.ads.internal.util.client.zzb.zzd("Unable to parse frame hash target time number.", versioninfoparcel);
                    g[i1] = -1L;
                }
                i1++;
            }
        }
    }

    public void onStop()
    {
        com.google.android.gms.internal.cq cq = cy.u;
        if (((Boolean)com.google.android.gms.ads.internal.zzp.zzbE().a(cq)).booleanValue() && !o)
        {
            Bundle bundle = new Bundle();
            bundle.putString("type", "native-player-metrics");
            bundle.putString("request", b);
            bundle.putString("player", n.zzer());
            qp qp1;
            for (Iterator iterator = f.a().iterator(); iterator.hasNext(); bundle.putString((new StringBuilder("fps_p_")).append(qp1.a).toString(), Double.toString(qp1.d)))
            {
                qp1 = (qp)iterator.next();
                bundle.putString((new StringBuilder("fps_c_")).append(qp1.a).toString(), Integer.toString(qp1.e));
            }

            for (int i1 = 0; i1 < g.length; i1++)
            {
                String s = h[i1];
                if (s != null)
                {
                    bundle.putString((new StringBuilder("fh_")).append(Long.valueOf(g[i1])).toString(), s);
                }
            }

            com.google.android.gms.ads.internal.zzp.zzbv();
            qa.a(a, c.zzJu, "gmob-apps", bundle, true);
            o = true;
        }
    }

    public void zza(zzi zzi1)
    {
        df.a(e, d, new String[] {
            "vpc"
        });
        i = df.a(e);
        n = zzi1;
    }

    public void zzb(zzi zzi1)
    {
        if (k != null && l == null)
        {
            df.a(e, k, new String[] {
                "vff"
            });
            df.a(e, d, new String[] {
                "vtt"
            });
            l = df.a(e);
        }
        long l2 = com.google.android.gms.ads.internal.zzp.zzbz().c();
        if (m && p && q != -1L)
        {
            double d1 = (double)TimeUnit.SECONDS.toNanos(1L) / (double)(l2 - q);
            f.a(d1);
        }
        p = m;
        q = l2;
        com.google.android.gms.internal.cq cq = cy.w;
        l2 = ((Long)com.google.android.gms.ads.internal.zzp.zzbE().a(cq)).longValue();
        long l3 = zzi1.getCurrentPosition();
        int i1 = 0;
        do
        {
label0:
            {
                if (i1 < h.length)
                {
                    if (h[i1] != null || l2 <= Math.abs(l3 - g[i1]))
                    {
                        break label0;
                    }
                    String as[] = h;
                    zzi1 = zzi1.getBitmap(8, 8);
                    l3 = 0L;
                    l2 = 63L;
                    for (int j1 = 0; j1 < 8;)
                    {
                        int k1 = 0;
                        long l4 = l2;
                        l2 = l3;
                        l3 = l4;
                        while (k1 < 8) 
                        {
                            int l1 = zzi1.getPixel(k1, j1);
                            int i2 = Color.blue(l1);
                            int j2 = Color.red(l1);
                            if (Color.green(l1) + (i2 + j2) > 128)
                            {
                                l4 = 1L;
                            } else
                            {
                                l4 = 0L;
                            }
                            l2 |= l4 << (int)l3;
                            l3--;
                            k1++;
                        }
                        j1++;
                        l4 = l2;
                        l2 = l3;
                        l3 = l4;
                    }

                    as[i1] = String.format("%016X", new Object[] {
                        Long.valueOf(l3)
                    });
                }
                return;
            }
            i1++;
        } while (true);
    }

    public void zzeR()
    {
        if (i == null || j != null)
        {
            return;
        } else
        {
            df.a(e, i, new String[] {
                "vfr"
            });
            j = df.a(e);
            return;
        }
    }

    public void zzfe()
    {
        m = true;
        if (j != null && k == null)
        {
            df.a(e, j, new String[] {
                "vfp"
            });
            k = df.a(e);
        }
    }

    public void zzff()
    {
        m = false;
    }
}
