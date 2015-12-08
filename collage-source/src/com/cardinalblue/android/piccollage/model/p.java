// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model;

import com.google.b.k;
import com.google.b.s;

public abstract class p
    implements k, s
{

    private Object versionCode;

    public p(Object obj)
    {
        versionCode = obj;
    }

    protected Object getVersion()
    {
        return versionCode;
    }

    public void setVersion(Object obj)
    {
        versionCode = obj;
    }
}
