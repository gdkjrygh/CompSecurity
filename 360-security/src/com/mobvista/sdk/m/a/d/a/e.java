// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.d.a;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.mobvista.sdk.m.a.f.a;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;

// Referenced classes of package com.mobvista.sdk.m.a.d.a:
//            d, h

final class e extends Handler
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 1)
        {
            String s = message.getData().getString("message_key");
            message = com.mobvista.sdk.m.a.f.a.a(message.getData().getString("message_bitmap"));
            a.a(s, message);
            Object obj = (LinkedList)com.mobvista.sdk.m.a.d.a.d.a(a).get(s);
            if (obj != null)
            {
                obj = ((LinkedList) (obj)).iterator();
                do
                {
                    if (!((Iterator) (obj)).hasNext())
                    {
                        break;
                    }
                    h h1 = (h)((Iterator) (obj)).next();
                    if (h1 != null)
                    {
                        h1.a(message, s);
                    }
                } while (true);
            }
            com.mobvista.sdk.m.a.d.a.d.a(a).remove(s);
        } else
        if (message.what == 2)
        {
            String s1 = message.getData().getString("message_key");
            message.getData().getString("message_message");
            message = (LinkedList)com.mobvista.sdk.m.a.d.a.d.a(a).get(s1);
            if (message != null)
            {
                for (message = message.iterator(); message.hasNext(); message.next()) { }
            }
            com.mobvista.sdk.m.a.d.a.d.a(a).remove(s1);
            return;
        }
    }
}
