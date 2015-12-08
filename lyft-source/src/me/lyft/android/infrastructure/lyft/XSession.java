// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft;


public class XSession
{

    String advertisingId;
    String androidId;
    String facebookAttributionId;
    boolean googleAdTrackingEnable;

    public XSession(String s, String s1, boolean flag)
    {
        androidId = s;
        advertisingId = s1;
        googleAdTrackingEnable = flag;
    }
}
