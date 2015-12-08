// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.a;

import java.util.Locale;

// Referenced classes of package com.microsoft.onlineid.sts.a:
//            c

public class f extends c
{

    public f()
    {
    }

    public transient f(String s, Throwable throwable, Object aobj[])
    {
        super(String.format(Locale.US, s, aobj), throwable);
    }

    public transient f(String s, Object aobj[])
    {
        super(String.format(Locale.US, s, aobj));
    }

    public f(Throwable throwable)
    {
        super(throwable);
    }
}
