// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm.nts;

import android.app.Service;
import java.util.HashSet;
import java.util.Set;

public abstract class NetworkTaskService extends Service
{

    public static final String PERMISSION_BIND = "com.google.android.gms.permission.BIND_NETWORK_TASK_SERVICE";
    private final Set arp = new HashSet();

    public NetworkTaskService()
    {
    }
}
