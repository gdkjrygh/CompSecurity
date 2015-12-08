// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.api;

import java.util.HashMap;
import java.util.Map;

public class WLInitWebFrameworkResult
{

    public static String DATA_SPACE_REQUIRED = "spaceRequired";
    public static int FAILURE_CHECKSUM = 3;
    public static int FAILURE_INTERNAL = 1;
    public static int FAILURE_NOT_ENOUGH_SPACE = 4;
    public static int FAILURE_UNZIP = 2;
    public static int SUCCESS = 0;
    private int code;
    private Map data;
    private String message;

    public WLInitWebFrameworkResult(int i, String s)
    {
        this(i, s, null);
    }

    public WLInitWebFrameworkResult(int i, String s, Map map)
    {
        code = i;
        message = s;
        if (map == null)
        {
            data = new HashMap();
            return;
        } else
        {
            data = map;
            return;
        }
    }

    public Map getData()
    {
        return data;
    }

    public String getMessage()
    {
        return message;
    }

    public int getStatusCode()
    {
        return code;
    }

}
