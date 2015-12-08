// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;


// Referenced classes of package com.c.b:
//            bg

final class j
    implements Runnable
{

    final bg a;

    j(bg bg1)
    {
        a = bg1;
        super();
    }

    public final void run()
    {
        throw new IllegalStateException((new StringBuilder("Transformation ")).append(a.b()).append(" mutated input Bitmap but failed to recycle the original.").toString());
    }
}
