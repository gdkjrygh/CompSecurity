// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.auth;


// Referenced classes of package com.cardinalblue.android.piccollage.auth:
//            a

public static class b extends RuntimeException
{

    protected final int a;
    protected final String b;

    public int a()
    {
        return a;
    }

    public String b()
    {
        return b;
    }

    public ()
    {
        a = -1;
        b = "AuthorizerException";
    }

    public b(int i)
    {
        a = i;
        b = "AuthorizerException";
    }
}
