// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.a;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package android.support.v4.a:
//            f

class g extends Handler
{

    final f a;

    g(f f1, Looper looper)
    {
        a = f1;
        super(looper);
    }

    public void handleMessage(Message message)
    {
        switch (message.what)
        {
        default:
            super.handleMessage(message);
            return;

        case 1: // '\001'
            f.a(a);
            break;
        }
    }
}
