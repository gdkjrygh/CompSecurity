// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.wearable.a;
import com.google.android.gms.wearable.c;

public class kb
    implements a
{

    private int LF;
    private c adC;

    public kb(a a1)
    {
        LF = a1.getType();
        adC = (c)a1.lZ().freeze();
    }

    public Object freeze()
    {
        return me();
    }

    public int getType()
    {
        return LF;
    }

    public boolean isDataValid()
    {
        return true;
    }

    public c lZ()
    {
        return adC;
    }

    public a me()
    {
        return this;
    }
}
