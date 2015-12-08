// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a.c;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.a.a.c:
//            x

static final class a
    implements FilenameFilter
{

    private final String a;

    public final boolean accept(File file, String s)
    {
        return s.contains(a) && !s.endsWith(".cls_temp");
    }

    public ng(String s)
    {
        a = s;
    }
}
