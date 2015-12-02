// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.e;

import com.facebook.common.w.m;
import com.facebook.debug.log.b;

// Referenced classes of package com.facebook.common.e:
//            o

class p
    implements Runnable
{

    final String a;
    final String b;
    final Object c;
    final Object d;
    final String e;
    final o f;

    p(o o, String s, String s1, Object obj, Object obj1, String s2)
    {
        f = o;
        a = s;
        b = s1;
        c = obj;
        d = obj1;
        e = s2;
        super();
    }

    public void run()
    {
        StringBuilder stringbuilder;
        try
        {
            stringbuilder = new StringBuilder();
            stringbuilder.append(m.a("Category: %s\nMessage: %s", new Object[] {
                a, b
            }));
            if (c != null)
            {
                stringbuilder.append("\nCaused By: ").append(c);
            }
            if (d != null)
            {
                com.facebook.debug.log.b.b(e, stringbuilder.toString(), new Object[] {
                    d
                });
                return;
            }
        }
        catch (Throwable throwable)
        {
            return;
        }
        com.facebook.debug.log.b.d(e, stringbuilder.toString());
        return;
    }
}
