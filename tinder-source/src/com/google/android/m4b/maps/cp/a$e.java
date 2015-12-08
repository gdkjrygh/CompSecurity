// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cp;

import com.google.android.m4b.maps.cu.a;
import com.google.android.m4b.maps.cu.b;
import com.google.android.m4b.maps.cu.f;

// Referenced classes of package com.google.android.m4b.maps.cp:
//            a

public static final class n extends b
{

    private static volatile c a[];
    private String b;
    private String c;

    public static n[] a()
    {
        if (a == null)
        {
            synchronized (f.a)
            {
                if (a == null)
                {
                    a = new a[0];
                }
            }
        }
        return a;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void a(a a1)
    {
        if (!b.equals(""))
        {
            a1.a(1, b);
        }
        if (!c.equals(""))
        {
            a1.a(2, c);
        }
        super.a(a1);
    }

    protected final int b()
    {
        int j = super.b();
        int i = j;
        if (!b.equals(""))
        {
            i = j + com.google.android.m4b.maps.cu.a.b(1, b);
        }
        j = i;
        if (!c.equals(""))
        {
            j = i + com.google.android.m4b.maps.cu.a.b(2, c);
        }
        return j;
    }

    public ()
    {
        b = "";
        c = "";
        m = null;
        n = -1;
    }
}
