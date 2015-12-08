// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sports;


public interface FlavorConfig
    extends com.nbcsports.liveextra.library.api.Endpoints.Production
{

    public static final String BLACKOUT_URL = "http://api.nbcsports.com/geo.asmx/MLEAuth2?evt=[eventid]&z=[zipcode]&callback=";
    public static final String CONFIG_URL = "http://stream.nbcsports.com/data/mobile/configuration-liveextra-android.json";
    public static final int DEFAULT_PROVIDER_ICON = 0x7f02009e;
    public static final boolean IS_URBAN_AIRSHIP_ENABLED = true;
}
