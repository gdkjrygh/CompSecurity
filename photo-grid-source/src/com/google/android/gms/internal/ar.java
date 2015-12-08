// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class ar
{

    private final String a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final boolean e;

    public ar(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        d = versioninfoparcel.zzJu;
        b = jsonobject;
        c = s;
        a = s1;
        e = flag;
    }

    public final String a()
    {
        return a;
    }

    public final String b()
    {
        return d;
    }

    public final JSONObject c()
    {
        return b;
    }

    public final String d()
    {
        return c;
    }

    public final boolean e()
    {
        return e;
    }
}
