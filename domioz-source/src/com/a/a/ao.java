// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import java.io.File;
import java.io.FilenameFilter;

final class ao
    implements FilenameFilter
{

    private final String a;

    public ao(String s)
    {
        a = s;
    }

    public final boolean accept(File file, String s)
    {
        while (s.equals((new StringBuilder()).append(a).append(".cls").toString()) || !s.contains(a) || s.endsWith(".cls_temp")) 
        {
            return false;
        }
        return true;
    }
}
