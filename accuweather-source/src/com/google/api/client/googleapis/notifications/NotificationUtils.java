// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.googleapis.notifications;

import java.util.UUID;

public final class NotificationUtils
{

    private NotificationUtils()
    {
    }

    public static String randomUuidString()
    {
        return UUID.randomUUID().toString();
    }
}
