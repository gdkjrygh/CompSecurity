// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            c, z

static final class b
    implements Runnable
{

    final z a;
    final RuntimeException b;

    public final void run()
    {
        throw new RuntimeException((new StringBuilder("Transformation ")).append(a.key()).append(" crashed with exception.").toString(), b);
    }

    n(z z1, RuntimeException runtimeexception)
    {
        a = z1;
        b = runtimeexception;
        super();
    }
}
