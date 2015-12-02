// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.a;

import android.os.Looper;
import android.os.MessageQueue;
import java.util.LinkedList;

// Referenced classes of package com.facebook.common.a:
//            g, f

public class d
{

    private LinkedList a;
    private MessageQueue b;
    private g c;

    public d()
    {
        a = new LinkedList();
        b = Looper.myQueue();
        c = new g(this, null);
    }

    static LinkedList a(d d1)
    {
        return d1.a;
    }

    void a()
    {
label0:
        {
            if (a.size() > 0)
            {
                if (!((Runnable)a.getFirst() instanceof f))
                {
                    break label0;
                }
                b.addIdleHandler(c);
            }
            return;
        }
        c.sendEmptyMessage(1);
    }
}
