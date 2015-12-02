// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.core.loader;


public final class j
{

    public String a;
    public String b;
    public String c;
    public String d;
    public int e;
    public int f;
    public String g;

    public j()
    {
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder("http\u54CD\u5E94\u5934\uFF1A...\n");
        stringbuilder.append("statusCode=").append(f).append(", ");
        stringbuilder.append("location=").append(a).append(", ");
        stringbuilder.append("contentType=").append(b).append(", ");
        stringbuilder.append("contentLength=").append(e).append(", ");
        stringbuilder.append("contentEncoding=").append(c).append(", ");
        stringbuilder.append("referer=").append(d).append(", ");
        return stringbuilder.toString();
    }
}
