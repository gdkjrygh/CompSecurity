// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.iid;

import android.os.Binder;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.google.android.gms.iid:
//            h, MessengerCompat

final class e extends h
{

    Handler a;
    final MessengerCompat b;

    e(MessengerCompat messengercompat, Handler handler)
    {
        b = messengercompat;
        super();
        a = handler;
    }

    public final void a(Message message)
    {
        message.arg2 = Binder.getCallingUid();
        a.dispatchMessage(message);
    }
}
