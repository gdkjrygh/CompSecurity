// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.e;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.qihoo.security.e:
//            a

class  extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        com.qihoo.security.e.a.a(a, message);
    }

    (a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }
}
