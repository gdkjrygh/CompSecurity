// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;


// Referenced classes of package com.leanplum:
//            Z

final class i
    implements Z
{

    private final Runnable a;

    i(Runnable runnable)
    {
        a = runnable;
        super();
    }

    public final void a()
    {
        if (a != null)
        {
            a.run();
        }
    }
}
