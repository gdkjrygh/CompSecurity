// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;


final class z
{

    static final int a[];

    static 
    {
        a = new int[GAServiceProxy.ConnectState.values().length];
        try
        {
            a[GAServiceProxy.ConnectState.CONNECTED_LOCAL.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            a[GAServiceProxy.ConnectState.CONNECTED_SERVICE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            a[GAServiceProxy.ConnectState.DISCONNECTED.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
