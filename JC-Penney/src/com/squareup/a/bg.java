// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.a;

import android.os.Message;

// Referenced classes of package com.squareup.a:
//            bf

class bg
    implements Runnable
{

    final Message a;
    final bf b;

    bg(bf bf, Message message)
    {
        b = bf;
        a = message;
        super();
    }

    public void run()
    {
        throw new AssertionError((new StringBuilder()).append("Unhandled stats message.").append(a.what).toString());
    }
}
