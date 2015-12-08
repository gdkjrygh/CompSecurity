// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.a.a;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.a.c.b;

// Referenced classes of package com.nuance.a.a.a.c.a.a.a:
//            l

public class p extends l
    implements b
{

    private static final e a = d.a(com/nuance/a/a/a/c/a/a/a/p);

    public p(byte abyte0[])
    {
        super((short)29189, abyte0);
    }

    public final String a()
    {
        String s = h("name");
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

    public final int b()
    {
        int i;
        try
        {
            i = f("cause");
        }
        catch (Exception exception)
        {
            return 0;
        }
        return i;
    }

    public final String f()
    {
        String s;
        try
        {
            s = h("prompt");
        }
        catch (Exception exception)
        {
            exception = "";
        }
        if (s != null)
        {
            return s;
        } else
        {
            return "";
        }
    }

}
