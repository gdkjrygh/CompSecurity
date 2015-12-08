// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.os.Message;

// Referenced classes of package com.c.b:
//            r

final class s
    implements Runnable
{

    final Message a;
    final r b;

    s(r r, Message message)
    {
        b = r;
        a = message;
        super();
    }

    public final void run()
    {
        throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(a.what).toString());
    }
}
