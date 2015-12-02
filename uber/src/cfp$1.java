// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class ang.Object
    implements Runnable
{

    final Message a;
    final cfp b;

    public final void run()
    {
        throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(a.what).toString());
    }

    (cfp cfp1, Message message)
    {
        b = cfp1;
        a = message;
        super();
    }
}
