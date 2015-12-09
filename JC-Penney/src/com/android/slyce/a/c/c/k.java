// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.bj;
import java.util.zip.CRC32;

// Referenced classes of package com.android.slyce.a.c.c:
//            j, i, h

class k
    implements bj
{

    final j a;

    k(j j1)
    {
        a = j1;
        super();
    }

    public volatile void a(Object obj)
    {
        a((byte[])obj);
    }

    public void a(byte abyte0[])
    {
        if (a.a.b)
        {
            a.a.e.e.update(abyte0, 0, abyte0.length);
        }
        i.a(a.a);
    }
}
