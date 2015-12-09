// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import cjd;

public class zzr extends Exception
{

    public long zzC;
    public final cjd zzaj;

    public zzr()
    {
        zzaj = null;
    }

    public zzr(cjd cjd)
    {
        zzaj = cjd;
    }

    public zzr(Throwable throwable)
    {
        super(throwable);
        zzaj = null;
    }
}
