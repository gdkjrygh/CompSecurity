// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.jirbo.adcolony:
//            ae, ADCVideo

class > extends Handler
{

    final ae a;

    public void handleMessage(Message message)
    {
        while (a.d.isFinishing() || a.d.E == null) 
        {
            return;
        }
        a.a(message.what);
    }

    deo(ae ae1)
    {
        a = ae1;
        super();
    }
}
