// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.qihoo.security.profile:
//            k

class a extends Handler
{

    final k a;

    public void handleMessage(Message message)
    {
        try
        {
            k.a(a, message);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            return;
        }
    }

    (k k1, Looper looper)
    {
        a = k1;
        super(looper);
    }
}
