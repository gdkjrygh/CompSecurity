// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.client;

import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

// Referenced classes of package com.google.android.gms.ads.internal.client:
//            zzi, zzl

public class AdSizeParcel
    implements SafeParcelable
{

    public static final zzi CREATOR = new zzi();
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;
    public final String zzte;
    public final boolean zztf;
    public final AdSizeParcel zztg[];
    public final boolean zzth;
    public final boolean zzti;

    public AdSizeParcel()
    {
        this(4, "interstitial_mb", 0, 0, true, 0, 0, null, false, false);
    }

    AdSizeParcel(int i, String s, int j, int k, boolean flag, int l, int i1, 
            AdSizeParcel aadsizeparcel[], boolean flag1, boolean flag2)
    {
        versionCode = i;
        zzte = s;
        height = j;
        heightPixels = k;
        zztf = flag;
        width = l;
        widthPixels = i1;
        zztg = aadsizeparcel;
        zzth = flag1;
        zzti = flag2;
    }

    public AdSizeParcel(Context context, AdSize adsize)
    {
        this(context, new AdSize[] {
            adsize
        });
    }

    public AdSizeParcel(Context context, AdSize aadsize[])
    {
        AdSize adsize = aadsize[0];
        versionCode = 4;
        zztf = false;
        zzti = adsize.isFluid();
        DisplayMetrics displaymetrics;
        int i;
        boolean flag;
        boolean flag1;
        int j;
        if (zzti)
        {
            width = AdSize.BANNER.getWidth();
            height = AdSize.BANNER.getHeight();
        } else
        {
            width = adsize.getWidth();
            height = adsize.getHeight();
        }
        if (width == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (height == -2)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        displaymetrics = context.getResources().getDisplayMetrics();
        if (flag)
        {
            double d;
            if (zzl.zzcF().zzS(context) && zzl.zzcF().zzT(context))
            {
                widthPixels = zza(displaymetrics) - zzl.zzcF().zzU(context);
            } else
            {
                widthPixels = zza(displaymetrics);
            }
            d = (float)widthPixels / displaymetrics.density;
            j = (int)d;
            i = j;
            if (d - (double)(int)d >= 0.01D)
            {
                i = j + 1;
            }
        } else
        {
            i = width;
            widthPixels = zzl.zzcF().zza(displaymetrics, width);
        }
        if (flag1)
        {
            j = a(displaymetrics);
        } else
        {
            j = height;
        }
        heightPixels = zzl.zzcF().zza(displaymetrics, j);
        if (flag || flag1)
        {
            zzte = (new StringBuilder()).append(i).append("x").append(j).append("_as").toString();
        } else
        if (zzti)
        {
            zzte = "320x50_mb";
        } else
        {
            zzte = adsize.toString();
        }
        if (aadsize.length > 1)
        {
            zztg = new AdSizeParcel[aadsize.length];
            for (i = 0; i < aadsize.length; i++)
            {
                zztg[i] = new AdSizeParcel(context, aadsize[i]);
            }

        } else
        {
            zztg = null;
        }
        zzth = false;
    }

    public AdSizeParcel(AdSizeParcel adsizeparcel, AdSizeParcel aadsizeparcel[])
    {
        this(4, adsizeparcel.zzte, adsizeparcel.height, adsizeparcel.heightPixels, adsizeparcel.zztf, adsizeparcel.width, adsizeparcel.widthPixels, aadsizeparcel, adsizeparcel.zzth, adsizeparcel.zzti);
    }

    private static int a(DisplayMetrics displaymetrics)
    {
        int i = (int)((float)displaymetrics.heightPixels / displaymetrics.density);
        if (i <= 400)
        {
            return 32;
        }
        return i > 720 ? 90 : 50;
    }

    public static int zza(DisplayMetrics displaymetrics)
    {
        return displaymetrics.widthPixels;
    }

    public static int zzb(DisplayMetrics displaymetrics)
    {
        return (int)((float)a(displaymetrics) * displaymetrics.density);
    }

    public static AdSizeParcel zzcC()
    {
        return new AdSizeParcel(4, "reward_mb", 0, 0, false, 0, 0, null, false, false);
    }

    public static AdSizeParcel zzs(Context context)
    {
        return new AdSizeParcel(4, "320x50_mb", 0, 0, false, 0, 0, null, true, false);
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        zzi.a(this, parcel, i);
    }

    public AdSize zzcD()
    {
        return com.google.android.gms.ads.zza.zza(width, height, zzte);
    }

}
