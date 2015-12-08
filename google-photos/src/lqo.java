// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.Message;

final class lqo
    implements android.os.Handler.Callback
{

    private lqm a;

    lqo(lqm lqm1)
    {
        a = lqm1;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        if (1 == message.what && lqm.e().equals(message.obj))
        {
            a.c();
            if (lqm.b(a) > 0 && !lqm.c(a))
            {
                lqm.d(a).sendMessageDelayed(lqm.d(a).obtainMessage(1, lqm.e()), lqm.b(a));
            }
        }
        return true;
    }
}
