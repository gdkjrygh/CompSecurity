// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.c;
import com.android.slyce.a.c.bn;
import com.android.slyce.a.c.l;
import com.android.slyce.a.c.u;
import com.android.slyce.a.h;
import com.android.slyce.a.p;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

// Referenced classes of package com.android.slyce.a.c.d:
//            aj, am

class al
    implements p
{

    final l a;
    final String b;
    final c c;
    final aj d;

    al(aj aj1, l l1, String s, c c1)
    {
        d = aj1;
        a = l1;
        b = s;
        c = c1;
        super();
    }

    public void a(Exception exception, h h1)
    {
        a.j.b("checking spdy handshake");
        if (exception != null || d.w == null)
        {
            aj.a(d, b, c, exception, h1);
            aj.a(d, b);
            return;
        }
        try
        {
            long l1 = ((Long)d.t.get(h1.b())).longValue();
            exception = (byte[])(byte[])d.w.invoke(null, new Object[] {
                Long.valueOf(l1)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Exception exception)
        {
            throw new AssertionError(exception);
        }
        if (exception != null)
        {
            break MISSING_BLOCK_LABEL_150;
        }
        aj.a(d, b, c, null, h1);
        aj.a(d, b);
        return;
        exception = new String(exception);
        if (bn.a(exception) == null)
        {
            aj.a(d, b, c, null, h1);
            aj.a(d, b);
            return;
        }
        new am(this, h1, bn.a(exception));
        return;
    }
}
