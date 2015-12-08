// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.internal.util.client.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            h, j

public class AdSizeParcel
    implements SafeParcelable
{

    public static final h CREATOR = new h();
    public final int a;
    public final String b;
    public final int c;
    public final int d;
    public final boolean e;
    public final int f;
    public final int g;
    public final AdSizeParcel h[];
    public final boolean i;
    public final boolean j;

    public AdSizeParcel()
    {
        this(4, "interstitial_mb", 0, 0, true, 0, 0, null, false, false);
    }

    AdSizeParcel(int k, String s, int l, int i1, boolean flag, int j1, int k1, 
            AdSizeParcel aadsizeparcel[], boolean flag1, boolean flag2)
    {
        a = k;
        b = s;
        c = l;
        d = i1;
        e = flag;
        f = j1;
        g = k1;
        h = aadsizeparcel;
        i = flag1;
        j = flag2;
    }

    public AdSizeParcel(Context context, c c1)
    {
        this(context, new c[] {
            c1
        });
    }

    public AdSizeParcel(Context context, c ac[])
    {
        c c1;
        DisplayMetrics displaymetrics;
        int k;
        c1 = ac[0];
        a = 4;
        e = false;
        double d1;
        boolean flag;
        boolean flag1;
        int l;
        boolean flag2;
        if (c1.i == -3 && c1.j == -4)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j = flag2;
        if (j)
        {
            f = c.a.i;
            c = c.a.j;
        } else
        {
            f = c1.i;
            c = c1.j;
        }
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
        com.google.android.gms.ads.internal.client.j.a();
        if (!com.google.android.gms.ads.internal.util.client.a.a(context)) goto _L4; else goto _L3
_L3:
        com.google.android.gms.ads.internal.client.j.a();
        if (!com.google.android.gms.ads.internal.util.client.a.b(context)) goto _L4; else goto _L5
_L5:
        k = displaymetrics.widthPixels;
        com.google.android.gms.ads.internal.client.j.a();
        g = k - com.google.android.gms.ads.internal.util.client.a.c(context);
_L8:
        d1 = (float)g / displaymetrics.density;
        l = (int)d1;
        k = l;
        if (d1 - (double)(int)d1 >= 0.01D)
        {
            k = l + 1;
        }
          goto _L6
_L4:
        g = displaymetrics.widthPixels;
        continue; /* Loop/switch isn't completed */
_L2:
        k = f;
        com.google.android.gms.ads.internal.client.j.a();
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
        com.google.android.gms.ads.internal.client.j.a();
        d = com.google.android.gms.ads.internal.util.client.a.a(displaymetrics, i1);
        if (flag || flag1)
        {
            b = (new StringBuilder()).append(k).append("x").append(i1).append("_as").toString();
        } else
        if (j)
        {
            b = "320x50_mb";
        } else
        {
            b = c1.toString();
        }
        if (ac.length > 1)
        {
            h = new AdSizeParcel[ac.length];
            for (k = 0; k < ac.length; k++)
            {
                h[k] = new AdSizeParcel(context, ac[k]);
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

    public static int a(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int b(DisplayMetrics displaymetrics)
    {
        return (int)((float)c(displaymetrics) * displaymetrics.density);
    }

    private static int c(DisplayMetrics displaymetrics)
    {
        int k = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (k <= 400)
        {
            return 32;
        }
        return k > 720 ? 90 : 50;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        com.google.android.gms.ads.internal.client.h.a(this, parcel, k);
    }

}
