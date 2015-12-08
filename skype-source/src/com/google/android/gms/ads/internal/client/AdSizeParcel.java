// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            k, n

public final class AdSizeParcel
    implements SafeParcelable
{

    public static final k CREATOR = new k();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final AdSizeParcel h[];
    public final boolean i;

    public AdSizeParcel()
    {
        this(3, "interstitial_mb", 0, 0, true, 0, 0, null, false);
    }

    AdSizeParcel(int j, String s, int l, int i1, boolean flag, int j1, int k1, 
            AdSizeParcel aadsizeparcel[], boolean flag1)
    {
        a = j;
        b = s;
        c = l;
        d = i1;
        e = flag;
        f = j1;
        g = k1;
        h = aadsizeparcel;
        i = flag1;
    }

    public AdSizeParcel(Context context, d d1)
    {
        this(context, new d[] {
            d1
        });
    }

    public AdSizeParcel(Context context, d ad[])
    {
        d d2;
        DisplayMetrics displaymetrics;
        int j;
        d2 = ad[0];
        a = 3;
        e = false;
        f = d2.b();
        c = d2.a();
        double d1;
        boolean flag;
        boolean flag1;
        int l;
        if (f == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c == -2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (!flag) goto _L2; else goto _L1
_L1:
        com.google.android.gms.ads.internal.client.n.a();
        if (!com.google.android.gms.ads.internal.util.client.a.c(context)) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.client.n.a();
        if (!com.google.android.gms.ads.internal.util.client.a.d(context)) goto _L4; else goto _L5
_L5:
        j = displaymetrics.widthPixels;
        com.google.android.gms.ads.internal.client.n.a();
        g = j - com.google.android.gms.ads.internal.util.client.a.e(context);
_L8:
        d1 = (float)g / displaymetrics.density;
        l = (int)d1;
        j = l;
        if (d1 - (double)(int)d1 >= 0.01D)
        {
            j = l + 1;
        }
          goto _L6
_L4:
        g = displaymetrics.widthPixels;
        continue; /* Loop/switch isn't completed */
_L2:
        j = f;
        com.google.android.gms.ads.internal.client.n.a();
        g = com.google.android.gms.ads.internal.util.client.a.a(displaymetrics, f);
_L6:
        int i1;
        if (flag1)
        {
            i1 = c(displaymetrics);
        } else
        {
            i1 = c;
        }
        com.google.android.gms.ads.internal.client.n.a();
        d = com.google.android.gms.ads.internal.util.client.a.a(displaymetrics, i1);
        if (flag || flag1)
        {
            b = (new StringBuilder()).append(j).append("x").append(i1).append("_as").toString();
        } else
        {
            b = d2.toString();
        }
        if (ad.length > 1)
        {
            h = new AdSizeParcel[ad.length];
            for (j = 0; j < ad.length; j++)
            {
                h[j] = new AdSizeParcel(context, ad[j]);
            }

        } else
        {
            h = null;
        }
        i = false;
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public AdSizeParcel(AdSizeParcel adsizeparcel, AdSizeParcel aadsizeparcel[])
    {
        this(3, adsizeparcel.b, adsizeparcel.c, adsizeparcel.d, adsizeparcel.e, adsizeparcel.f, adsizeparcel.g, aadsizeparcel, adsizeparcel.i);
    }

    public static int a(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static AdSizeParcel a()
    {
        return new AdSizeParcel(3, "320x50_mb", 0, 0, false, 0, 0, null, true);
    }

    public static int b(DisplayMetrics displaymetrics)
    {
        return (int)((float)c(displaymetrics) * displaymetrics.density);
    }

    private static int c(DisplayMetrics displaymetrics)
    {
        int j = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (j <= 400)
        {
            return 32;
        }
        return j > 720 ? 90 : 50;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.ads.internal.client.k.a(this, parcel, j);
    }

}
