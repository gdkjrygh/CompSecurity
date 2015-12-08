// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            kv, g, kz, ku, 
//            kt, lb

public static final class s extends kv
{

    private static volatile c c[];
    public int a;
    public int b;

    public static s[] b()
    {
        if (c == null)
        {
            synchronized (kz.a)
            {
                if (c == null)
                {
                    c = new c[0];
                }
            }
        }
        return c;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected final int a()
    {
        return super.a() + ku.b(1, a) + ku.b(2, b);
    }

    public final lb a(kt kt1)
        throws IOException
    {
        do
        {
            int i = kt1.a();
            switch (i)
            {
            default:
                if (a(kt1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 8: // '\b'
                a = kt1.f();
                break;

            case 16: // '\020'
                b = kt1.f();
                break;
            }
        } while (true);
    }

    public final void a(ku ku1)
        throws IOException
    {
        ku1.a(1, a);
        ku1.a(2, b);
        super.a(ku1);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof )
            {
                obj = ()obj;
                flag = flag1;
                if (a == ((a) (obj)).a)
                {
                    flag = flag1;
                    if (b == ((b) (obj)).b)
                    {
                        return a(((kv) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return ((a + 527) * 31 + b) * 31 + c();
    }

    public ()
    {
        a = 0;
        b = 0;
        r = null;
        s = -1;
    }
}
