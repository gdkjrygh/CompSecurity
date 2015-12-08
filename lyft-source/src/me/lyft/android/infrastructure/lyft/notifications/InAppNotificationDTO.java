// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.notifications;


public class InAppNotificationDTO
{

    public final String event;
    public final String sourceUrl;

    public InAppNotificationDTO(String s, String s1)
    {
        event = s;
        sourceUrl = s1;
    }

    public String getEvent()
    {
        return event;
    }

    public String getSourceUrl()
    {
        return sourceUrl;
    }
}
