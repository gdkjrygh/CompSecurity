// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.c;

import java.io.File;
import java.io.FilenameFilter;

final class bs
    implements FilenameFilter
{

    bs()
    {
    }

    public final boolean accept(File file, String s)
    {
        return s.endsWith(".cls") && !s.contains("Session");
    }
}
