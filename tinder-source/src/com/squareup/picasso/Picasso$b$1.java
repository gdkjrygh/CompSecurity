// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            Picasso

final class a
    implements Runnable
{

    final Exception a;
    final a b;

    public final void run()
    {
        throw new RuntimeException(a);
    }

    ( , Exception exception)
    {
        b = ;
        a = exception;
        super();
    }
}
