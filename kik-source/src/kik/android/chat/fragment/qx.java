// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.chat.fragment;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package kik.android.chat.fragment:
//            SendToFragment

final class qx extends Handler
{

    final SendToFragment a;

    qx(SendToFragment sendtofragment)
    {
        a = sendtofragment;
        super();
    }

    public final void handleMessage(Message message)
    {
        super.handleMessage(message);
        switch (message.what)
        {
        default:
            return;

        case 3: // '\003'
            removeMessages(3);
            break;
        }
        SendToFragment.a(a);
    }
}
