// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.io;

import java.io.File;

public class FilenameUtils
{

    public static final String EXTENSION_SEPARATOR_STR = Character.toString('.');
    private static final char OTHER_SEPARATOR;
    private static final char SYSTEM_SEPARATOR;

    static boolean isSystemWindows()
    {
        return SYSTEM_SEPARATOR == '\\';
    }

    static 
    {
        SYSTEM_SEPARATOR = File.separatorChar;
        if (isSystemWindows())
        {
            OTHER_SEPARATOR = '/';
        } else
        {
            OTHER_SEPARATOR = '\\';
        }
    }
}
