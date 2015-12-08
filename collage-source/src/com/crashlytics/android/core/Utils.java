// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android.core;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

final class Utils
{

    private Utils()
    {
    }

    public static void capFileCount(File file, FilenameFilter filenamefilter, int i, Comparator comparator)
    {
        file = file.listFiles(filenamefilter);
        if (file == null || file.length <= i) goto _L2; else goto _L1
_L1:
        int j;
        int k;
        int l;
        Arrays.sort(file, comparator);
        k = file.length;
        l = file.length;
        j = 0;
_L6:
        if (j >= l) goto _L2; else goto _L3
_L3:
        filenamefilter = file[j];
        if (k > i) goto _L4; else goto _L2
_L2:
        return;
_L4:
        filenamefilter.delete();
        k--;
        j++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
