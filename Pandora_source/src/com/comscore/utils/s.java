// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.io.File;
import java.io.FilenameFilter;

final class s
    implements FilenameFilter
{

    s()
    {
    }

    public boolean accept(File file, String s1)
    {
        return s1.startsWith("cs_cache_");
    }
}
