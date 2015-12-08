// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a;

import c.g;
import c.o;
import com.c.a.a.i;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.c.a:
//            x, r

final class z extends x
{

    final r a;
    final File b;

    z(r r, File file)
    {
        a = r;
        b = file;
        super();
    }

    public final long contentLength()
    {
        return b.length();
    }

    public final r contentType()
    {
        return a;
    }

    public final void writeTo(g g1)
        throws IOException
    {
        c.y y = null;
        c.y y1 = o.a(b);
        y = y1;
        g1.a(y1);
        i.a(y1);
        return;
        g1;
        i.a(y);
        throw g1;
    }
}
