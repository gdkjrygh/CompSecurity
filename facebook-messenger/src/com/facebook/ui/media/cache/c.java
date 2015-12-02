// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import java.io.File;
import java.io.FilenameFilter;

// Referenced classes of package com.facebook.ui.media.cache:
//            a

class c
    implements FilenameFilter
{

    final a a;

    c(a a1)
    {
        a = a1;
        super();
    }

    public boolean accept(File file, String s)
    {
        return !s.endsWith(com.facebook.ui.media.cache.a.a(a));
    }
}
