// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.a;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            al, dv

public final class ak
    implements SafeParcelable
{

    public static final al CREATOR = new al();
    public final int height;
    public final int heightPixels;
    public final String lS;
    public final boolean lT;
    public final ak lU[];
    public final int versionCode;
    public final int width;
    public final int widthPixels;

    public ak()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    ak(int i, String s, int j, int k, boolean flag, int l, int i1, 
            ak aak[])
    {
        versionCode = i;
        lS = s;
        height = j;
        heightPixels = k;
        lT = flag;
        width = l;
        widthPixels = i1;
        lU = aak;
    }

    public ak(Context context, AdSize adsize)
    {
        this(context, new AdSize[] {
            adsize
        });
    }

    public ak(Context context, AdSize aadsize[])
    {
        boolean flag1 = false;
        super();
        AdSize adsize = aadsize[0];
        versionCode = 2;
        lT = false;
        width = adsize.getWidth();
        height = adsize.getHeight();
        DisplayMetrics displaymetrics;
        int i;
        boolean flag;
        int j;
        int k;
        if (width == -1)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (height == -2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (i != 0)
        {
            widthPixels = a(displaymetrics);
            j = (int)((float)widthPixels / displaymetrics.density);
        } else
        {
            j = width;
            widthPixels = com.google.android.gms.internal.dv.a(displaymetrics, width);
        }
        if (flag)
        {
            k = c(displaymetrics);
        } else
        {
            k = height;
        }
        heightPixels = com.google.android.gms.internal.dv.a(displaymetrics, k);
        if (i != 0 || flag)
        {
            lS = (new StringBuilder()).append(j).append("x").append(k).append("_as").toString();
        } else
        {
            lS = adsize.toString();
        }
        if (aadsize.length > 1)
        {
            lU = new ak[aadsize.length];
            for (i = ((flag1) ? 1 : 0); i < aadsize.length; i++)
            {
                lU[i] = new ak(context, aadsize[i]);
            }

        } else
        {
            lU = null;
        }
    }

    public ak(ak ak1, ak aak[])
    {
        this(2, ak1.lS, ak1.height, ak1.heightPixels, ak1.lT, ak1.width, ak1.widthPixels, aak);
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
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public AdSize aA()
    {
        return com.google.android.gms.ads.a.a(width, height, lS);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.al.a(this, parcel, i);
    }

}
