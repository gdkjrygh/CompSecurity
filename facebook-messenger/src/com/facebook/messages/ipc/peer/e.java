// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import com.facebook.i.a.a.f;
import java.util.Set;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            d

public class e
{

    public e()
    {
    }

    public static int a(String s, String s1, f f1)
    {
        s = (Set)f1.a(d.c(s));
        if (s == null)
        {
            return 1;
        }
        if (s.contains(s1))
        {
            return s.size();
        } else
        {
            return s.size() + 1;
        }
    }

    public static void a(f f1)
    {
        f1.a(d.p, null);
    }

    public static void a(String s, f f1)
    {
        f1.a(d.d(s), null);
    }

    public static void b(String s, String s1, f f1)
    {
        f1.a(d.c(s), s1);
    }
}
