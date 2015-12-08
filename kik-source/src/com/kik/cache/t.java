// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;

import com.kik.g.r;
import java.io.File;
import kik.android.s;

// Referenced classes of package com.kik.cache:
//            s

final class t extends r
{

    final String a;
    final String b;
    final com.kik.cache.s c;

    t(com.kik.cache.s s1, String s2, String s3)
    {
        c = s1;
        a = s2;
        b = s3;
        super();
    }

    public final void a()
    {
        s.a(c).a(b);
    }

    public final void a(Object obj)
    {
        obj = (File)obj;
        c.a(a, ((File) (obj)));
        ((File) (obj)).deleteOnExit();
    }
}
