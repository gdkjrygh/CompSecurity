// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.conviva.utils;


public class LivePassVersion
{

    public static final int VERSION_MAJOR = 2;
    public static final int VERSION_MINOR = 96;
    public static final int VERSION_RELEASE = 0;
    public static final int VERSION_SVN = 26145;

    public LivePassVersion()
    {
    }

    public static String getVersion3Str()
    {
        return "2.96.0";
    }

    public static String getVersionStr()
    {
        return (new StringBuilder()).append(getVersion3Str()).append(".").append(26145).toString();
    }
}
