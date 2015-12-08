// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy;

import android.app.Notification;
import android.content.Context;
import android.os.Bundle;
import com.appboy.configuration.XmlAppConfigurationProvider;

public interface IAppboyNotificationFactory
{

    public abstract Notification createNotification(XmlAppConfigurationProvider xmlappconfigurationprovider, Context context, Bundle bundle, Bundle bundle1);
}
