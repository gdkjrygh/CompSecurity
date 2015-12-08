// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.play.utils;

import java.io.File;
import java.util.Comparator;

public final class FileModifiedDateComparator
    implements Comparator
{

    public static final FileModifiedDateComparator INSTANCE = new FileModifiedDateComparator();

    private FileModifiedDateComparator()
    {
    }

    public final volatile int compare(Object obj, Object obj1)
    {
        obj = (File)obj;
        obj1 = (File)obj1;
        if (((File) (obj)).lastModified() == ((File) (obj1)).lastModified())
        {
            return 0;
        }
        return ((File) (obj)).lastModified() >= ((File) (obj1)).lastModified() ? 1 : -1;
    }

}
