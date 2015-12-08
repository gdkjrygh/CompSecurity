// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import com.google.android.gms.ads.internal.client.zzx;

public final class SearchAdRequest
{

    public static final String DEVICE_ID_EMULATOR;
    private final int zzHN;
    private final int zzHO;
    private final int zzHP;
    private final int zzHQ;
    private final int zzHR;
    private final int zzHS;
    private final int zzHT;
    private final String zzHU;
    private final int zzHV;
    private final String zzHW;
    private final int zzHX;
    private final int zzHY;
    private final String zzHZ;
    private final int zzvc;

    public int getAnchorTextColor()
    {
        return zzHN;
    }

    public int getBackgroundColor()
    {
        return zzvc;
    }

    public int getBackgroundGradientBottom()
    {
        return zzHO;
    }

    public int getBackgroundGradientTop()
    {
        return zzHP;
    }

    public int getBorderColor()
    {
        return zzHQ;
    }

    public int getBorderThickness()
    {
        return zzHR;
    }

    public int getBorderType()
    {
        return zzHS;
    }

    public int getCallButtonColor()
    {
        return zzHT;
    }

    public String getCustomChannels()
    {
        return zzHU;
    }

    public int getDescriptionTextColor()
    {
        return zzHV;
    }

    public String getFontFace()
    {
        return zzHW;
    }

    public int getHeaderTextColor()
    {
        return zzHX;
    }

    public int getHeaderTextSize()
    {
        return zzHY;
    }

    public String getQuery()
    {
        return zzHZ;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
