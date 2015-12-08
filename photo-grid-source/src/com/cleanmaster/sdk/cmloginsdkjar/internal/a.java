// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.cleanmaster.sdk.cmloginsdkjar.internal:
//            j, FileLruCache

final class a
    implements j
{

    final long a;
    final File b;
    final String c;
    final FileLruCache d;

    a(FileLruCache filelrucache, long l, File file, String s)
    {
        d = filelrucache;
        a = l;
        b = file;
        c = s;
        super();
    }

    public final void a()
    {
        if (a < FileLruCache.access$000(d).get())
        {
            b.delete();
            return;
        } else
        {
            FileLruCache.access$100(d, c, b);
            return;
        }
    }
}
