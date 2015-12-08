// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplay;

import com.google.android.gms.common.api.GoogleApiClient;
import rx.Observable;

public interface IGoogleApiProvider
{

    public abstract boolean checkGooglePlayServicesAvailable();

    public abstract GoogleApiClient getApi();

    public abstract boolean isConnected();

    public abstract Observable observeReady();
}
