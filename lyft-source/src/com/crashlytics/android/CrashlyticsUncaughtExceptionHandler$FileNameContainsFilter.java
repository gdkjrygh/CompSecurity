// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.crashlytics.android;

import java.io.File;
import java.io.FilenameFilter;

class a
    implements FilenameFilter
{

    private final String a;

    public boolean accept(File file, String s)
    {
        return s.contains(a) && !s.endsWith(".cls_temp");
    }

    public (String s)
    {
        a = s;
    }
}
