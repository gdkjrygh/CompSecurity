// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class x
{

    private final String a;
    private final JSONObject b;
    private final String c;
    private final String d;
    private final boolean e;

    public x(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        d = versioninfoparcel.zzIz;
        b = jsonobject;
        c = s;
        a = s1;
        e = flag;
    }

    public String a()
    {
        return a;
    }

    public String b()
    {
        return d;
    }

    public JSONObject c()
    {
        return b;
    }

    public String d()
    {
        return c;
    }

    public boolean e()
    {
        return e;
    }
}
