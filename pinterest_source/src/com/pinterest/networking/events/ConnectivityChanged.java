// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.networking.events;

import com.pinterest.kit.utils.NetworkUtils;

public class ConnectivityChanged
{

    private boolean a;

    public ConnectivityChanged(Boolean boolean1)
    {
        if (boolean1 == null)
        {
            boolean1 = Boolean.valueOf(NetworkUtils.getInstance().hasInternet());
        } else
        {
            NetworkUtils.getInstance().setHasInternet(boolean1.booleanValue());
        }
        a = boolean1.booleanValue();
    }

    public final boolean a()
    {
        return a;
    }
}
