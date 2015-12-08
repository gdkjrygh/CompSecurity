// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.fabric.sdk.android.services.settings;


public class SessionSettingsData
{

    public final int identifierMask;
    public final int logBufferSize;
    public final int maxChainedExceptionDepth;
    public final int maxCustomExceptionEvents;
    public final int maxCustomKeyValuePairs;
    public final boolean sendSessionWithoutCrash;

    public SessionSettingsData(int i, int j, int k, int l, int i1, boolean flag)
    {
        logBufferSize = i;
        maxChainedExceptionDepth = j;
        maxCustomExceptionEvents = k;
        maxCustomKeyValuePairs = l;
        identifierMask = i1;
        sendSessionWithoutCrash = flag;
    }
}
