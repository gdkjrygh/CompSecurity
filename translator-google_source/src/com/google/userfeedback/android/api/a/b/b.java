// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.userfeedback.android.api.a.b;

import java.util.Enumeration;
import java.util.Hashtable;

// Referenced classes of package com.google.userfeedback.android.api.a.b:
//            a

public final class b
{

    public int a;
    final a b;
    private int c;
    private Enumeration d;

    public b(a a1)
    {
        b = a1;
        super();
        c = 0;
        a = 0x80000000;
        d = null;
    }

    public final boolean a()
    {
        if (a != 0x80000000)
        {
            return true;
        }
        if (c <= b.c)
        {
            for (; c <= b.c; c = c + 1)
            {
                if (b.a[c] != null)
                {
                    int i = c;
                    c = i + 1;
                    a = i;
                    return true;
                }
            }

        }
        if (b.b != null)
        {
            if (d == null)
            {
                d = b.b.keys();
            }
            if (d.hasMoreElements())
            {
                a = ((Integer)d.nextElement()).intValue();
                return true;
            }
        }
        return false;
    }
}
