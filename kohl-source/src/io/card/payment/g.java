// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package io.card.payment;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package io.card.payment:
//            f

final class g extends Handler
{

    private f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    public final void handleMessage(Message message)
    {
        a.a(message);
    }
}
