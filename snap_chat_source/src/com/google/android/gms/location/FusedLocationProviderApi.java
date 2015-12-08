// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.api.GoogleApiClient;

public interface FusedLocationProviderApi
{

    public abstract Location getLastLocation(GoogleApiClient googleapiclient);
}
