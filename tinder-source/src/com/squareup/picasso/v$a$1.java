// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Message;

// Referenced classes of package com.squareup.picasso:
//            v

final class a
    implements Runnable
{

    final Message a;
    final tring b;

    public final void run()
    {
        throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(a.what).toString());
    }

    ( , Message message)
    {
        b = ;
        a = message;
        super();
    }
}
