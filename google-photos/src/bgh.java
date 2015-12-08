// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.File;
import java.io.FilenameFilter;

public final class bgh
    implements FilenameFilter
{

    public bgh()
    {
    }

    public final boolean accept(File file, String s)
    {
        file = s.toLowerCase();
        return file.endsWith(".jpg") || file.endsWith(".jpeg") || file.endsWith(".png");
    }
}
