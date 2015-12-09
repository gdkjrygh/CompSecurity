// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.c;
import com.android.slyce.a.ag;
import java.util.Hashtable;

// Referenced classes of package com.android.slyce.a.c.d:
//            aj, as

class an
    implements c
{

    final String a;
    final c b;
    final aj c;

    an(aj aj1, String s, c c1)
    {
        c = aj1;
        a = s;
        b = c1;
        super();
    }

    public void a(Exception exception, ag ag)
    {
        if (exception != null)
        {
            as as1 = (as)c.x.remove(a);
            if (as1 != null)
            {
                as1.a(exception);
            }
        }
        b.a(exception, ag);
    }
}
