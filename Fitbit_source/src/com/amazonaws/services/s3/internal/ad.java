// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.services.s3.internal;


// Referenced classes of package com.amazonaws.services.s3.internal:
//            af

public abstract class ad
    implements af
{

    private String a;
    private String b;
    private String c;

    public ad()
    {
    }

    public final void b(String s)
    {
        a = s;
    }

    public final void c(String s)
    {
        b = s;
    }

    public final String c_()
    {
        return a;
    }

    public final void d(String s)
    {
        c = s;
    }

    public final String d_()
    {
        return b;
    }

    public final String e()
    {
        return c;
    }

    public final String f()
    {
        return a;
    }
}
