// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import org.json.JSONObject;

public final class bzu
{

    final String a;
    final JSONObject b;
    final String c;
    final String d;
    final boolean e;

    public bzu(String s, VersionInfoParcel versioninfoparcel, String s1, JSONObject jsonobject, boolean flag)
    {
        d = versioninfoparcel.b;
        b = jsonobject;
        c = s;
        a = s1;
        e = flag;
    }
}
