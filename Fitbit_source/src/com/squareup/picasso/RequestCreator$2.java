// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;


// Referenced classes of package com.squareup.picasso:
//            RequestCreator

static final class val.e
    implements Runnable
{

    final InterruptedException val$e;

    public void run()
    {
        throw new RuntimeException(val$e);
    }

    (InterruptedException interruptedexception)
    {
        val$e = interruptedexception;
        super();
    }
}
