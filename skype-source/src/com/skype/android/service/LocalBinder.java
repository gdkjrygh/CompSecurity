// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.service;

import android.os.Binder;

public class LocalBinder extends Binder
{

    private Object binding;

    public LocalBinder(Object obj)
    {
        binding = obj;
    }

    public Object getBinding()
    {
        return binding;
    }
}
