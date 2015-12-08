// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.zza;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.internal:
//            zzbb, zzbe, zzhw

public final class zzba
    implements SafeParcelable
{

    public static final zzbb CREATOR = new zzbb();
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;
    public final String zzpa;
    public final boolean zzpb;
    public final zzba zzpc[];

    public zzba()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null);
    }

    zzba(int i, String s, int j, int k, boolean flag, int l, int i1, 
            zzba azzba[])
    {
        versionCode = i;
        zzpa = s;
        height = j;
        heightPixels = k;
        zzpb = flag;
        width = l;
        widthPixels = i1;
        zzpc = azzba;
    }

    public zzba(Context context, AdSize adsize)
    {
        this(context, new AdSize[] {
            adsize
        });
    }

    public zzba(Context context, AdSize aadsize[])
    {
        boolean flag1 = false;
        super();
        AdSize adsize = aadsize[0];
        versionCode = 2;
        zzpb = false;
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
            widthPixels = zza(displaymetrics);
            j = (int)((float)widthPixels / displaymetrics.density);
        } else
        {
            j = width;
            widthPixels = zzbe.zzbD().zza(displaymetrics, width);
        }
        if (flag)
        {
            k = zzc(displaymetrics);
        } else
        {
            k = height;
        }
        heightPixels = zzbe.zzbD().zza(displaymetrics, k);
        if (i != 0 || flag)
        {
            zzpa = (new StringBuilder()).append(j).append("x").append(k).append("_as").toString();
        } else
        {
            zzpa = adsize.toString();
        }
        if (aadsize.length > 1)
        {
            zzpc = new zzba[aadsize.length];
            for (i = ((flag1) ? 1 : 0); i < aadsize.length; i++)
            {
                zzpc[i] = new zzba(context, aadsize[i]);
            }

        } else
        {
            zzpc = null;
        }
    }

    public zzba(zzba zzba1, zzba azzba[])
    {
        this(2, zzba1.zzpa, zzba1.height, zzba1.heightPixels, zzba1.zzpb, zzba1.width, zzba1.widthPixels, azzba);
    }

    public static int zza(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int zzb(DisplayMetrics displaymetrics)
    {
        return (int)((float)zzc(displaymetrics) * displaymetrics.density);
    }

    private static int zzc(DisplayMetrics displaymetrics)
    {
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.internal.zzbb.zza(this, parcel, i);
    }

    public final AdSize zzbB()
    {
        return com.google.android.gms.ads.zza.zza(width, height, zzpa);
    }

}
