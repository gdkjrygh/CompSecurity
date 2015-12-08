// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.adobe.mediacore;

import com.adobe.ave.VideoEngine;

public class Version
{

    private static final String FIELD_SEPARATOR = ".";
    private static final int VERSION = 1;
    private static final int _apiVersion = 1;
    private static final String _aveVersion = VideoEngine.getVersionString();
    private static final String _buildChangeList = "1310341";
    private static final String _major = "1";
    private static final String _minor = "4.14";
    private static final String _psdkDescription = "1.4.14.1415 ( release, 1310341)";
    private static final String _psdkVersion = "1.4.14.1415";
    private static final String _revision = "1415";
    private static final String _type = "release";

    public Version()
    {
    }

    public static String getAVEVersion()
    {
        return _aveVersion;
    }

    public static int getApiVersion()
    {
        return _apiVersion;
    }

    public static String getDescription()
    {
        return _psdkDescription;
    }

    public static String getMajor()
    {
        return "1";
    }

    public static String getMinor()
    {
        return "4.14";
    }

    public static String getRevision()
    {
        return "1415";
    }

    public static String getType()
    {
        return "release";
    }

    public static String getVersion()
    {
        return _psdkVersion;
    }

    static 
    {
        System.loadLibrary("AVEAndroid");
    }
}
