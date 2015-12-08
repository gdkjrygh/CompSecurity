// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


// Referenced classes of package com.squareup.a:
//            an

class ao
    implements Runnable
{

    final Exception a;
    final an b;

    ao(an an, Exception exception)
    {
        b = an;
        a = exception;
        super();
    }

    public void run()
    {
        throw new RuntimeException(a);
    }
}
