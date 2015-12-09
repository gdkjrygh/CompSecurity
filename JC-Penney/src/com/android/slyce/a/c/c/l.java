// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import java.nio.ByteBuffer;
import java.util.zip.CRC32;

// Referenced classes of package com.android.slyce.a.c.c:
//            i, h

class l
    implements e
{

    final i a;

    l(i j)
    {
        a = j;
        super();
    }

    public void a(am am, aj aj1)
    {
        if (a.b)
        {
            for (; aj1.o() > 0; aj.c(am))
            {
                am = aj1.n();
                a.e.e.update(am.array(), am.arrayOffset() + am.position(), am.remaining());
            }

        }
        aj1.m();
        i.b(a);
    }
}
