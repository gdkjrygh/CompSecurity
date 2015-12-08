// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.service;

import android.app.Service;
import android.os.Binder;

public abstract class LocalBinder extends Binder
{

    public LocalBinder()
    {
    }

    public abstract Service getService();
}
