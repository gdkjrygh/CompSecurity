// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo360.common.utils;

import java.io.BufferedReader;
import java.io.FileReader;

public class MountUtil
{
    public static class MountInfo
    {

        public String dev;
        public String flags;
        public String fstype;
        public String mountPoint;

        public MountInfo()
        {
        }
    }


    public MountUtil()
    {
    }

    public static String getMountPoint(String s)
    {
        return s.substring(0, s.indexOf('/', 1));
    }

    public static MountInfo queryMountInfo(String s)
    {
        Object obj = new BufferedReader(new FileReader("/proc/mounts"));
_L2:
        String s1 = ((BufferedReader) (obj)).readLine();
        if (s1 != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        String as[];
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return null;
        if (!s1.contains(s)) goto _L2; else goto _L1
_L1:
        as = s1.split("[ \t]+");
        if (as == null)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        if (as.length <= 4)
        {
            break MISSING_BLOCK_LABEL_102;
        }
        s = new MountInfo();
        s.dev = as[0];
        s.mountPoint = as[1];
        s.fstype = as[2];
        s.flags = as[3];
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return s;
        }
        return s;
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        return null;
        s;
        s = null;
_L6:
        try
        {
            s.close();
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        break MISSING_BLOCK_LABEL_30;
        s;
        obj = null;
_L4:
        try
        {
            ((BufferedReader) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw s;
        s;
        if (true) goto _L4; else goto _L3
_L3:
        s;
        s = ((String) (obj));
        if (true) goto _L6; else goto _L5
_L5:
    }
}
