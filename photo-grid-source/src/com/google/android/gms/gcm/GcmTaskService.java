// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.gcm;

import android.app.Service;
import java.util.HashSet;
import java.util.Set;

public abstract class GcmTaskService extends Service
{

    private final Set a = new HashSet();

    public GcmTaskService()
    {
    }
}
