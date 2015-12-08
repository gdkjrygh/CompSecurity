// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.Comparator;

// Referenced classes of package com.crashlytics.android:
//            ac

class ak
{

    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final String h;
    public final String i;
    public final ac j;

    public ak(String s, String s1, String s2, String s3, String s4, String s5, int k, 
            String s6, String s7, ac ac)
    {
        a = s;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = k;
        h = s6;
        i = s7;
        j = ac;
    }

    public static void a(File file, FilenameFilter filenamefilter, int k, Comparator comparator)
    {
        file = file.listFiles(filenamefilter);
        if (file == null || file.length <= k) goto _L2; else goto _L1
_L1:
        int l;
        int i1;
        int j1;
        Arrays.sort(file, comparator);
        i1 = file.length;
        j1 = file.length;
        l = 0;
_L6:
        if (l >= j1) goto _L2; else goto _L3
_L3:
        filenamefilter = file[l];
        if (i1 > k) goto _L4; else goto _L2
_L2:
        return;
_L4:
        filenamefilter.delete();
        i1--;
        l++;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
