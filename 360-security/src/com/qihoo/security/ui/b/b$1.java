// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.b;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.qihoo.security.ui.b:
//            b

class a extends Handler
{

    final b a;

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            return;

        case 0: // '\0'
            b.a(a, message.arg1, message.arg2, (a)message.obj);
            return;

        case 1: // '\001'
            b.a(a, (a)message.obj);
            return;

        case 2: // '\002'
            b.b(a, message.arg1, message.arg2, (a)message.obj);
            break;
        }
    }

    (b b1, Looper looper)
    {
        a = b1;
        super(looper);
    }
}
