// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.sunset;

import java.io.Serializable;

public class SunsetMoment
    implements Serializable
{

    String a;
    String b;
    long c;
    String d;
    String e;
    private String f;

    public SunsetMoment(String s, String s1, long l, String s2, String s3, String s4)
    {
        a = s;
        b = s1;
        c = l;
        d = s2;
        f = s3;
        e = s4;
    }
}
