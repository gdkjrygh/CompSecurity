// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


// Referenced classes of package com.google.android.gms.ads.formats:
//            NativeAdOptions

public static final class zznX
{

    private boolean zznV;
    private int zznW;
    private boolean zznX;

    static boolean zza(zznX zznx)
    {
        return zznx.zznV;
    }

    static int zzb(zznV zznv)
    {
        return zznv.zznW;
    }

    static boolean zzc(zznW zznw)
    {
        return zznw.zznX;
    }

    public NativeAdOptions build()
    {
        return new NativeAdOptions(this, null);
    }

    public zznX setImageOrientation(int i)
    {
        zznW = i;
        return this;
    }

    public zznW setRequestMultipleImages(boolean flag)
    {
        zznX = flag;
        return this;
    }

    public zznX setReturnUrlsForImageAssets(boolean flag)
    {
        zznV = flag;
        return this;
    }

    public ()
    {
        zznV = false;
        zznW = 0;
        zznX = false;
    }
}
