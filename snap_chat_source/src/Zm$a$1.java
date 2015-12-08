// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class ng.Object
    implements Runnable
{

    private Message a;

    public final void run()
    {
        throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
    }

    .os.Message(Message message)
    {
        a = message;
        super();
    }
}
