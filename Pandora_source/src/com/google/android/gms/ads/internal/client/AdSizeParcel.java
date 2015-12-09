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
//            zzg, zzj

public final class AdSizeParcel
    implements SafeParcelable
{

    public static final zzg CREATOR = new zzg();
    public final int height;
    public final int heightPixels;
    public final int versionCode;
    public final int width;
    public final int widthPixels;
    public final String zzpX;
    public final boolean zzpY;
    public final AdSizeParcel zzpZ[];
    public final boolean zzqa;

    public AdSizeParcel()
    {
        this(2, "interstitial_mb", 0, 0, true, 0, 0, null, false);
    }

    AdSizeParcel(int i, String s, int j, int k, boolean flag, int l, int i1, 
            AdSizeParcel aadsizeparcel[], boolean flag1)
    {
        versionCode = i;
        zzpX = s;
        height = j;
        heightPixels = k;
        zzpY = flag;
        width = l;
        widthPixels = i1;
        zzpZ = aadsizeparcel;
        zzqa = flag1;
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
        versionCode = 2;
        zzpY = false;
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
            if (zzj.zzbJ().zzE(context) && zzj.zzbJ().zzF(context))
            {
                widthPixels = zza(displaymetrics) - zzj.zzbJ().zzG(context);
            } else
            {
                widthPixels = zza(displaymetrics);
            }
            j = (int)((float)widthPixels / displaymetrics.density);
        } else
        {
            j = width;
            widthPixels = zzj.zzbJ().zza(displaymetrics, width);
        }
        if (flag)
        {
            k = zzc(displaymetrics);
        } else
        {
            k = height;
        }
        heightPixels = zzj.zzbJ().zza(displaymetrics, k);
        if (i != 0 || flag)
        {
            zzpX = (new StringBuilder()).append(j).append("x").append(k).append("_as").toString();
        } else
        {
            zzpX = adsize.toString();
        }
        if (aadsize.length > 1)
        {
            zzpZ = new AdSizeParcel[aadsize.length];
            for (i = 0; i < aadsize.length; i++)
            {
                zzpZ[i] = new AdSizeParcel(context, aadsize[i]);
            }

        } else
        {
            zzpZ = null;
        }
        zzqa = false;
    }

    public AdSizeParcel(AdSizeParcel adsizeparcel, AdSizeParcel aadsizeparcel[])
    {
        this(2, adsizeparcel.zzpX, adsizeparcel.height, adsizeparcel.heightPixels, adsizeparcel.zzpY, adsizeparcel.width, adsizeparcel.widthPixels, aadsizeparcel, adsizeparcel.zzqa);
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

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        com.google.android.gms.ads.internal.client.zzg.zza(this, parcel, i);
    }

    public AdSize zzbH()
    {
        return com.google.android.gms.ads.zza.zza(width, height, zzpX);
    }

}
