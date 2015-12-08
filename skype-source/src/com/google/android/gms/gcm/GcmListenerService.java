// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;

public abstract class GcmListenerService extends Service
{

    private final Object a = new Object();
    private int b;

    public GcmListenerService()
    {
        b = 0;
    }
}
