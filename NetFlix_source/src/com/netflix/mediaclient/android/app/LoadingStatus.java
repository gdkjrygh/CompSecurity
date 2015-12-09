// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.android.app;


public interface LoadingStatus
{
    public static interface LoadingStatusCallback
    {

        public abstract void onDataLoaded(int i);
    }


    public abstract boolean isLoadingData();

    public abstract void setLoadingStatusCallback(LoadingStatusCallback loadingstatuscallback);
}
