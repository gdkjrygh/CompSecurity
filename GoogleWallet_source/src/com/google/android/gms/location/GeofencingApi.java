// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import java.util.List;

public interface GeofencingApi
{

    public abstract PendingResult addGeofences(GoogleApiClient googleapiclient, List list, PendingIntent pendingintent);

    public abstract PendingResult removeGeofences(GoogleApiClient googleapiclient, PendingIntent pendingintent);
}
