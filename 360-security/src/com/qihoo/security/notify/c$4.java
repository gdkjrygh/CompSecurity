// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import com.qihoo.security.locale.d;
import com.qihoo.security.support.b;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.q;

// Referenced classes of package com.qihoo.security.notify:
//            c

class a
    implements com.qihoo.security.opti.a.a
{

    final c a;

    public void a()
    {
        q.a().a(0x7f0c007e);
    }

    public void a(int i, int j)
    {
        b.b(20030, i);
        j = (int)(((long)j * 100L) / Utils.getMemoryTotalKb());
        String s = a.c.a(0x7f0c007d, new Object[] {
            Integer.valueOf(i), Integer.valueOf(j)
        });
        q.a().a(s);
    }

    s(c c1)
    {
        a = c1;
        super();
    }
}
