// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.os.Message;

// Referenced classes of package com.c.b:
//            bd

final class be
    implements Runnable
{

    final Message a;
    final bd b;

    be(bd bd, Message message)
    {
        b = bd;
        a = message;
        super();
    }

    public final void run()
    {
        throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
    }
}
