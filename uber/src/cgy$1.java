// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class ang.Object
    implements Runnable
{

    final Message a;
    final cgy b;

    public final void run()
    {
        throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
    }

    (cgy cgy1, Message message)
    {
        b = cgy1;
        a = message;
        super();
    }
}
