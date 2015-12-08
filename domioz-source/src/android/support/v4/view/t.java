// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v4.view:
//            s

final class t extends Handler
{

    final s a;

    t(s s1)
    {
        a = s1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 3: default 32
    //                   1 56
    //                   2 76
    //                   3 84;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new RuntimeException((new StringBuilder("Unknown message ")).append(message).toString());
_L2:
        s.b(a).onShowPress(s.a(a));
_L6:
        return;
_L3:
        s.c(a);
        return;
_L4:
        if (s.d(a) != null)
        {
            if (!s.e(a))
            {
                s.d(a).onSingleTapConfirmed(s.a(a));
                return;
            } else
            {
                s.f(a);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }
}
