// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.a;


// Referenced classes of package com.roidapp.photogrid.a:
//            l

public final class c extends Exception
{

    l a;

    public c(int i, String s)
    {
        this(new l(i, s));
    }

    public c(int i, String s, Exception exception)
    {
        this(new l(i, s), exception);
    }

    private c(l l1)
    {
        this(l1, ((Exception) (null)));
    }

    private c(l l1, Exception exception)
    {
        super(l1.b, exception);
        a = l1;
    }
}
