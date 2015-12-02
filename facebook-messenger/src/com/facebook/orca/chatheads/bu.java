// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

// Referenced classes of package com.facebook.orca.chatheads:
//            al

class bu extends Handler
{

    private final WeakReference a;

    public bu(al al1)
    {
        a = new WeakReference(al1);
    }

    public void handleMessage(Message message)
    {
        al al1 = (al)a.get();
        if (al1 == null)
        {
            return;
        }
        switch (message.what)
        {
        default:
            return;

        case 10: // '\n'
            al.O(al1);
            return;

        case 11: // '\013'
            al.P(al1);
            return;

        case 12: // '\f'
            al.Q(al1);
            break;
        }
    }
}
