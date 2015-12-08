// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.b.b.a;


// Referenced classes of package com.nuance.b.b.a:
//            af

public final class ae
{

    public long a;
    public af b;
    public String c;
    public Exception d;
    private final boolean e;

    public ae(long l, af af1, Exception exception, String s, boolean flag)
    {
        a = -1L;
        b = af.g;
        a = l;
        d = exception;
        c = s;
        e = flag;
        if (af1 != null)
        {
            b = af1;
        }
    }

    public final boolean a()
    {
        return e;
    }

    public final String toString()
    {
        return c;
    }
}
