// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ui.media.cache;

import com.facebook.common.time.a;
import java.io.File;
import java.util.Comparator;

// Referenced classes of package com.facebook.ui.media.cache:
//            a

class d
    implements Comparator
{

    final com.facebook.ui.media.cache.a a;

    d(com.facebook.ui.media.cache.a a1)
    {
        a = a1;
        super();
    }

    public int a(File file, File file1)
    {
        long l1 = 0L;
        long l2 = 0x6ddd00L + com.facebook.ui.media.cache.a.b(a).a();
        long l;
        if (file.lastModified() < l2)
        {
            l = file.lastModified();
        } else
        {
            l = 0L;
        }
        if (file1.lastModified() < l2)
        {
            l1 = file1.lastModified();
        }
        return (int)Math.max(Math.min(l - l1, 0x7fffffffL), 0xffffffff80000000L);
    }

    public int compare(Object obj, Object obj1)
    {
        return a((File)obj, (File)obj1);
    }
}
