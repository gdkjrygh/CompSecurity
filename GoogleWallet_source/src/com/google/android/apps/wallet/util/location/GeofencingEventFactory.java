// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.util.location;

import android.content.Intent;
import com.google.android.gms.location.GeofencingEvent;

public class GeofencingEventFactory
{

    GeofencingEventFactory()
    {
    }

    public static GeofencingEvent fromIntent(Intent intent)
    {
        return GeofencingEvent.fromIntent(intent);
    }
}
