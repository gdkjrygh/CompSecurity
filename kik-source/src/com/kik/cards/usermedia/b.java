// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;

import com.kik.g.as;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kik.a.e.v;

// Referenced classes of package com.kik.cards.usermedia:
//            a

final class b
    implements as
{

    final File a;
    final boolean b;
    final a c;

    b(a a1, File file, boolean flag)
    {
        c = a1;
        a = file;
        b = flag;
        super();
    }

    public final Object a(Object obj)
    {
        obj = new ArrayList();
        ((List) (obj)).add(a.getAbsolutePath());
        if (b)
        {
            com.kik.cards.usermedia.a.a(c).a(UUID.randomUUID(), a);
        }
        return obj;
    }
}
