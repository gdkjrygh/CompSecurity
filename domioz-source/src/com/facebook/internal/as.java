// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.internal;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.internal:
//            ar

final class as extends Handler
{

    final ar a;

    as(ar ar1)
    {
        a = ar1;
        super();
    }

    public final void handleMessage(Message message)
    {
        a.a(message);
    }
}
