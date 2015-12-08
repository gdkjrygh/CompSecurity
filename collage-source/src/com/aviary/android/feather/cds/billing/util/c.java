// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.cds.billing.util;


// Referenced classes of package com.aviary.android.feather.cds.billing.util:
//            e

public class c extends Exception
{

    e a;

    public c(int i, String s)
    {
        this(new e(i, s));
    }

    public c(int i, String s, Exception exception)
    {
        this(new e(i, s), exception);
    }

    public c(e e1)
    {
        this(e1, ((Exception) (null)));
    }

    public c(e e1, Exception exception)
    {
        super(e1.b(), exception);
        a = e1;
    }

    public e a()
    {
        return a;
    }
}
