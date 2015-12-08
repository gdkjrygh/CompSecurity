// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.util;

import java.io.File;

public class Files
{

    public Files()
    {
    }

    public static File createDirectory(String s)
    {
        if (s != null)
        {
            if ((s = new File(s)).exists() && s.isDirectory() || s.mkdirs() && s.isDirectory())
            {
                return s;
            }
        }
        return null;
    }

    public static int intLength(File file)
    {
        if (file == null)
        {
            return 0;
        }
        long l = file.length();
        if (l < 0x7fffffffL)
        {
            return (int)l;
        } else
        {
            return 0x7fffffff;
        }
    }
}
