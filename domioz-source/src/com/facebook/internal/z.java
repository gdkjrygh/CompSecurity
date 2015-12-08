// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import java.io.File;
import java.util.concurrent.atomic.AtomicLong;

// Referenced classes of package com.facebook.internal:
//            ai, y

final class z
    implements ai
{

    final long a;
    final File b;
    final String c;
    final y d;

    z(y y1, long l, File file, String s)
    {
        d = y1;
        a = l;
        b = file;
        c = s;
        super();
    }

    public final void a()
    {
        if (a < y.a(d).get())
        {
            b.delete();
            return;
        } else
        {
            y.a(d, c, b);
            return;
        }
    }
}
