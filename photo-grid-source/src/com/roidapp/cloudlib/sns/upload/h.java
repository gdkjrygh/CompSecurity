// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.sns.upload;


// Referenced classes of package com.roidapp.cloudlib.sns.upload:
//            e

final class h
    implements Runnable
{

    final e a;

    private h(e e1)
    {
        a = e1;
        super();
    }

    h(e e1, byte byte0)
    {
        this(e1);
    }

    public final void run()
    {
        e.c(a);
    }
}
