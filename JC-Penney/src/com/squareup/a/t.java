// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.os.Message;

// Referenced classes of package com.squareup.a:
//            s

class t
    implements Runnable
{

    final Message a;
    final s b;

    t(s s, Message message)
    {
        b = s;
        a = message;
        super();
    }

    public void run()
    {
        throw new AssertionError((new StringBuilder()).append("Unknown handler message received: ").append(a.what).toString());
    }
}
