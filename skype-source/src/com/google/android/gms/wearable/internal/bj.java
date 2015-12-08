// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.wearable.internal;

import com.google.android.gms.wearable.g;

public final class bj
    implements g
{

    private final String a;
    private final String b;

    public bj(g g1)
    {
        a = g1.b();
        b = g1.c();
    }

    public final Object a()
    {
        return this;
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("DataItemAssetEntity[");
        stringbuilder.append("@");
        stringbuilder.append(Integer.toHexString(hashCode()));
        if (a == null)
        {
            stringbuilder.append(",noid");
        } else
        {
            stringbuilder.append(",");
            stringbuilder.append(a);
        }
        stringbuilder.append(", key=");
        stringbuilder.append(b);
        stringbuilder.append("]");
        return stringbuilder.toString();
    }
}
