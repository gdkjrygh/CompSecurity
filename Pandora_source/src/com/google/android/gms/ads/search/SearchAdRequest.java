// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest
{
    public static final class Builder
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
        private final com.google.android.gms.ads.internal.client.zzt.zza zzlZ = new com.google.android.gms.ads.internal.client.zzt.zza();
        private int zzsC;

        static int zza(Builder builder)
        {
            return builder.zzDO;
        }

        static int zzb(Builder builder)
        {
            return builder.zzsC;
        }

        static int zzc(Builder builder)
        {
            return builder.zzDP;
        }

        static int zzd(Builder builder)
        {
            return builder.zzDQ;
        }

        static int zze(Builder builder)
        {
            return builder.zzDR;
        }

        static int zzf(Builder builder)
        {
            return builder.zzDS;
        }

        static int zzg(Builder builder)
        {
            return builder.zzDT;
        }

        static int zzh(Builder builder)
        {
            return builder.zzDU;
        }

        static String zzi(Builder builder)
        {
            return builder.zzDV;
        }

        static int zzj(Builder builder)
        {
            return builder.zzDW;
        }

        static String zzk(Builder builder)
        {
            return builder.zzDX;
        }

        static int zzl(Builder builder)
        {
            return builder.zzDY;
        }

        static int zzm(Builder builder)
        {
            return builder.zzDZ;
        }

        static String zzn(Builder builder)
        {
            return builder.zzEa;
        }

        static com.google.android.gms.ads.internal.client.zzt.zza zzo(Builder builder)
        {
            return builder.zzlZ;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            zzlZ.zzb(class1, bundle);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zzlZ.zza(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zzlZ.zza(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zzlZ.zzu(s);
            return this;
        }

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i)
        {
            zzDO = i;
            return this;
        }

        public Builder setBackgroundColor(int i)
        {
            zzsC = i;
            zzDP = Color.argb(0, 0, 0, 0);
            zzDQ = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i, int j)
        {
            zzsC = Color.argb(0, 0, 0, 0);
            zzDP = j;
            zzDQ = i;
            return this;
        }

        public Builder setBorderColor(int i)
        {
            zzDR = i;
            return this;
        }

        public Builder setBorderThickness(int i)
        {
            zzDS = i;
            return this;
        }

        public Builder setBorderType(int i)
        {
            zzDT = i;
            return this;
        }

        public Builder setCallButtonColor(int i)
        {
            zzDU = i;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            zzDV = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i)
        {
            zzDW = i;
            return this;
        }

        public Builder setFontFace(String s)
        {
            zzDX = s;
            return this;
        }

        public Builder setHeaderTextColor(int i)
        {
            zzDY = i;
            return this;
        }

        public Builder setHeaderTextSize(int i)
        {
            zzDZ = i;
            return this;
        }

        public Builder setLocation(Location location)
        {
            zzlZ.zza(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            zzEa = s;
            return this;
        }

        public Builder setRequestAgent(String s)
        {
            zzlZ.zzy(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zzlZ.zzl(flag);
            return this;
        }

        public Builder()
        {
            zzDT = 0;
        }
    }


    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final int zzDO;
    private final int zzDP;
    private final int zzDQ;
    private final int zzDR;
    private final int zzDS;
    private final int zzDT;
    private final int zzDU;
    private final String zzDV;
    private final int zzDW;
    private final String zzDX;
    private final int zzDY;
    private final int zzDZ;
    private final String zzEa;
    private final zzt zzlY;
    private final int zzsC;

    private SearchAdRequest(Builder builder)
    {
        zzDO = Builder.zza(builder);
        zzsC = Builder.zzb(builder);
        zzDP = Builder.zzc(builder);
        zzDQ = Builder.zzd(builder);
        zzDR = Builder.zze(builder);
        zzDS = Builder.zzf(builder);
        zzDT = Builder.zzg(builder);
        zzDU = Builder.zzh(builder);
        zzDV = Builder.zzi(builder);
        zzDW = Builder.zzj(builder);
        zzDX = Builder.zzk(builder);
        zzDY = Builder.zzl(builder);
        zzDZ = Builder.zzm(builder);
        zzEa = Builder.zzn(builder);
        zzlY = new zzt(Builder.zzo(builder), this);
    }


    public int getAnchorTextColor()
    {
        return zzDO;
    }

    public int getBackgroundColor()
    {
        return zzsC;
    }

    public int getBackgroundGradientBottom()
    {
        return zzDP;
    }

    public int getBackgroundGradientTop()
    {
        return zzDQ;
    }

    public int getBorderColor()
    {
        return zzDR;
    }

    public int getBorderThickness()
    {
        return zzDS;
    }

    public int getBorderType()
    {
        return zzDT;
    }

    public int getCallButtonColor()
    {
        return zzDU;
    }

    public String getCustomChannels()
    {
        return zzDV;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return zzlY.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return zzDW;
    }

    public String getFontFace()
    {
        return zzDX;
    }

    public int getHeaderTextColor()
    {
        return zzDY;
    }

    public int getHeaderTextSize()
    {
        return zzDZ;
    }

    public Location getLocation()
    {
        return zzlY.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return zzlY.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zzlY.getNetworkExtrasBundle(class1);
    }

    public String getQuery()
    {
        return zzEa;
    }

    public boolean isTestDevice(Context context)
    {
        return zzlY.isTestDevice(context);
    }

    zzt zzac()
    {
        return zzlY;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzt.DEVICE_ID_EMULATOR;
    }
}
