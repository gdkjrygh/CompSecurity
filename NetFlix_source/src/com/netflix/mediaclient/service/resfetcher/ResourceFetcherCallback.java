// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.resfetcher;


public interface ResourceFetcherCallback
{

    public abstract void onResourceFetched(String s, String s1, int i);

    public abstract void onResourcePrefetched(String s, int i, int j);
}
