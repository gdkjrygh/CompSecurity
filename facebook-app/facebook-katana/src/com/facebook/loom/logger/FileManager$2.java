// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.loom.logger;

import java.io.File;
import java.io.FilenameFilter;

final class 
    implements FilenameFilter
{

    public final boolean accept(File file, String s)
    {
        return s.startsWith("override-") && s.endsWith(".log");
    }

    ()
    {
    }
}
