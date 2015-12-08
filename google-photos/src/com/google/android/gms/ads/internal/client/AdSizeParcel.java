// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import jnr;
import joe;
import jof;
import jpx;

public final class AdSizeParcel
    implements SafeParcelable
{

    public static final joe CREATOR = new joe();
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

    public AdSizeParcel(int j, String s, int k, int l, boolean flag, int i1, int j1, 
            AdSizeParcel aadsizeparcel[], boolean flag1)
    {
        a = j;
        b = s;
        c = k;
        d = l;
        e = flag;
        f = i1;
        g = j1;
        h = aadsizeparcel;
        i = flag1;
    }

    public AdSizeParcel(Context context, jnr jnr1)
    {
        this(context, new jnr[] {
            jnr1
        });
    }

    private AdSizeParcel(Context context, jnr ajnr[])
    {
        DisplayMetrics displaymetrics;
        int j;
        boolean flag1 = true;
        super();
        ajnr = ajnr[0];
        a = 3;
        e = false;
        f = ((jnr) (ajnr)).a;
        c = ((jnr) (ajnr)).b;
        double d1;
        boolean flag;
        int k;
        if (f == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (c != -2)
        {
            flag1 = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        jof.a();
        if (!jpx.a(context)) goto _L2; else goto _L1
_L1:
        jof.a();
        if (!jpx.b(context)) goto _L2; else goto _L3
_L3:
        j = displaymetrics.widthPixels;
        jof.a();
        g = j - jpx.c(context);
_L4:
        d1 = (float)g / displaymetrics.density;
        k = (int)d1;
        j = k;
        if (d1 - (double)(int)d1 >= 0.01D)
        {
            j = k + 1;
        }
_L5:
        int l;
        if (flag1)
        {
            l = c(displaymetrics);
        } else
        {
            l = c;
        }
        jof.a();
        d = jpx.a(displaymetrics, l);
        if (flag || flag1)
        {
            b = (new StringBuilder()).append(j).append("x").append(l).append("_as").toString();
        } else
        {
            b = ajnr.toString();
        }
        h = null;
        i = false;
        return;
_L2:
        g = displaymetrics.widthPixels;
          goto _L4
        j = f;
        jof.a();
        g = jpx.a(displaymetrics, f);
          goto _L5
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

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
    {
        joe.a(this, parcel, j);
    }

}
