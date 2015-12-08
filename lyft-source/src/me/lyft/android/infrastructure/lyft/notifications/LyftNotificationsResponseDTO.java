// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.lyft.notifications;

import java.util.ArrayList;

public class LyftNotificationsResponseDTO
{

    public final ArrayList notifications;

    public LyftNotificationsResponseDTO(ArrayList arraylist)
    {
        notifications = arraylist;
    }

    public ArrayList getNotifications()
    {
        return notifications;
    }
}
