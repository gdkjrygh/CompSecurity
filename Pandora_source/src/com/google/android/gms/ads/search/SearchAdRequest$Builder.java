// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;

// Referenced classes of package com.google.android.gms.ads.search:
//            SearchAdRequest

public static final class zzDT
{

    private int zzDO;
    private int zzDP;
    private int zzDQ;
    private int zzDR;
    private int zzDS;
    private int zzDT;
    private int zzDU;
    private String zzDV;
    private int zzDW;
    private String zzDX;
    private int zzDY;
    private int zzDZ;
    private String zzEa;
    private final com.google.android.gms.ads.internal.client. zzlZ = new com.google.android.gms.ads.internal.client.();
    private int zzsC;

    static int zza(zzDT zzdt)
    {
        return zzdt.zzDO;
    }

    static int zzb(zzDO zzdo)
    {
        return zzdo.zzsC;
    }

    static int zzc(zzsC zzsc)
    {
        return zzsc.zzDP;
    }

    static int zzd(zzDP zzdp)
    {
        return zzdp.zzDQ;
    }

    static int zze(zzDQ zzdq)
    {
        return zzdq.zzDR;
    }

    static int zzf(zzDR zzdr)
    {
        return zzdr.zzDS;
    }

    static int zzg(zzDS zzds)
    {
        return zzds.zzDT;
    }

    static int zzh(zzDT zzdt)
    {
        return zzdt.zzDU;
    }

    static String zzi(zzDU zzdu)
    {
        return zzdu.zzDV;
    }

    static int zzj(zzDV zzdv)
    {
        return zzdv.zzDW;
    }

    static String zzk(zzDW zzdw)
    {
        return zzdw.zzDX;
    }

    static int zzl(zzDX zzdx)
    {
        return zzdx.zzDY;
    }

    static int zzm(zzDY zzdy)
    {
        return zzdy.zzDZ;
    }

    static String zzn(zzDZ zzdz)
    {
        return zzdz.zzEa;
    }

    static com.google.android.gms.ads.internal.client. zzo(zzEa zzea)
    {
        return zzea.zzlZ;
    }

    public zzlZ addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        return this;
    }

    public zzlZ addNetworkExtras(NetworkExtras networkextras)
    {
        zzlZ.(networkextras);
        return this;
    }

    public zzlZ addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        return this;
    }

    public zzlZ addTestDevice(String s)
    {
        zzlZ.(s);
        return this;
    }

    public SearchAdRequest build()
    {
        return new SearchAdRequest(this, null);
    }

    public zzlZ setAnchorTextColor(int i)
    {
        zzDO = i;
        return this;
    }

    public zzDO setBackgroundColor(int i)
    {
        zzsC = i;
        zzDP = Color.argb(0, 0, 0, 0);
        zzDQ = Color.argb(0, 0, 0, 0);
        return this;
    }

    public zzDQ setBackgroundGradient(int i, int j)
    {
        zzsC = Color.argb(0, 0, 0, 0);
        zzDP = j;
        zzDQ = i;
        return this;
    }

    public zzDQ setBorderColor(int i)
    {
        zzDR = i;
        return this;
    }

    public zzDR setBorderThickness(int i)
    {
        zzDS = i;
        return this;
    }

    public zzDS setBorderType(int i)
    {
        zzDT = i;
        return this;
    }

    public zzDT setCallButtonColor(int i)
    {
        zzDU = i;
        return this;
    }

    public zzDU setCustomChannels(String s)
    {
        zzDV = s;
        return this;
    }

    public zzDV setDescriptionTextColor(int i)
    {
        zzDW = i;
        return this;
    }

    public zzDW setFontFace(String s)
    {
        zzDX = s;
        return this;
    }

    public zzDX setHeaderTextColor(int i)
    {
        zzDY = i;
        return this;
    }

    public zzDY setHeaderTextSize(int i)
    {
        zzDZ = i;
        return this;
    }

    public zzDZ setLocation(Location location)
    {
        zzlZ.(location);
        return this;
    }

    public zzlZ setQuery(String s)
    {
        zzEa = s;
        return this;
    }

    public zzEa setRequestAgent(String s)
    {
        zzlZ.(s);
        return this;
    }

    public zzlZ tagForChildDirectedTreatment(boolean flag)
    {
        zzlZ.(flag);
        return this;
    }

    public ()
    {
        zzDT = 0;
    }
}
