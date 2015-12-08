// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.utils;

import java.io.File;
import java.io.FilenameFilter;

final class d
    implements FilenameFilter
{

    d()
    {
    }

    public boolean accept(File file, String s)
    {
        return s.startsWith("cs_cache_");
    }
}
