// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.facebook.b:
//            ag

class ah extends Handler
{

    final ag a;

    ah(ag ag1)
    {
        a = ag1;
        super();
    }

    public void handleMessage(Message message)
    {
        a.a(message);
    }
}
