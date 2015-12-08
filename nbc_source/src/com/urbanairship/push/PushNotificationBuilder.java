// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.app.Notification;
import java.util.Map;

public interface PushNotificationBuilder
{

    public abstract Notification buildNotification(String s, Map map);

    public abstract int getNextId(String s, Map map);
}
