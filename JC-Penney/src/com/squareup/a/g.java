// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;


// Referenced classes of package com.squareup.a:
//            bi

final class g
    implements Runnable
{

    final bi a;
    final RuntimeException b;

    g(bi bi1, RuntimeException runtimeexception)
    {
        a = bi1;
        b = runtimeexception;
        super();
    }

    public void run()
    {
        throw new RuntimeException((new StringBuilder()).append("Transformation ").append(a.a()).append(" crashed with exception.").toString(), b);
    }
}
