// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.Bundle;

public interface LeanplumPushNotificationCustomizer
{

    public abstract void customize(android.support.v4.app.NotificationCompat.Builder builder, Bundle bundle);
}
