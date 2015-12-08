// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;


public class UserMetaData
{

    public static final UserMetaData a = new UserMetaData();
    public final String b;
    public final String c;
    public final String d;

    public UserMetaData()
    {
        this(null, null, null);
    }

    public UserMetaData(String s, String s1, String s2)
    {
        b = s;
        c = s1;
        d = s2;
    }

}
