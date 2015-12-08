// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.d;
import com.google.android.gms.ads.f;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            b, eh

public final class ab
    implements SafeParcelable
{

    public static final b a = new b();
    public final int b;
    public final String c;
    public final int d;
    public final int e;
    public final boolean f;
    public final int g;
    public final int h;
    public final ab i[];

    public ab()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    ab(int j, String s, int k, int l, boolean flag, int i1, int j1, 
            ab aab[])
    {
        b = j;
        c = s;
        d = k;
        e = l;
        f = flag;
        g = i1;
        h = j1;
        i = aab;
    }

    public ab(Context context, d d1)
    {
        this(context, new d[] {
            d1
        });
    }

    public ab(Context context, d ad[])
    {
        boolean flag1 = false;
        super();
        d d1 = ad[0];
        b = 2;
        f = false;
        g = d1.b();
        d = d1.a();
        DisplayMetrics displaymetrics;
        int j;
        boolean flag;
        int k;
        int l;
        if (g == -1)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        if (d == -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (j != 0)
        {
            h = displaymetrics.widthPixels;
            k = (int)((float)h / displaymetrics.density);
        } else
        {
            k = g;
            h = eh.a(displaymetrics, g);
        }
        if (flag)
        {
            l = c(displaymetrics);
        } else
        {
            l = d;
        }
        e = eh.a(displaymetrics, l);
        if (j != 0 || flag)
        {
            c = (new StringBuilder()).append(k).append("x").append(l).append("_as").toString();
        } else
        {
            c = d1.toString();
        }
        if (ad.length > 1)
        {
            i = new ab[ad.length];
            for (j = ((flag1) ? 1 : 0); j < ad.length; j++)
            {
                i[j] = new ab(context, ad[j]);
            }

        } else
        {
            i = null;
        }
    }

    public ab(ab ab1, ab aab[])
    {
        this(2, ab1.c, ab1.d, ab1.e, ab1.f, ab1.g, ab1.h, aab);
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
        int j = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (j <= 400)
        {
            return 32;
        }
        return j > 720 ? 90 : 50;
    }

    public final d a()
    {
        return com.google.android.gms.ads.f.a(g, d, c);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        com.google.android.gms.internal.b.a(this, parcel, j);
    }

}
