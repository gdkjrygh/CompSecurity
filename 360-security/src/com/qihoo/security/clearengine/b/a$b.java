// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.clearengine.b;

import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import java.util.List;

// Referenced classes of package com.qihoo.security.clearengine.b:
//            a

class a extends Handler
{

    final a a;

    public void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 7: default 166
    //                   1 48
    //                   2 102
    //                   3 110
    //                   4 127
    //                   5 135
    //                   6 150
    //                   7 158;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8
_L2:
        com.qihoo.security.clearengine.b.a.k(a);
        com.qihoo.security.clearengine.b.a.l(a);
        return;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
_L3:
        try
        {
            com.qihoo.security.clearengine.b.a.m(a);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            message.printStackTrace();
            synchronized (com.qihoo.security.clearengine.b.a.b(a))
            {
                com.qihoo.security.clearengine.b.a.a(a, false);
                com.qihoo.security.clearengine.b.a.b(a, false);
            }
            return;
        }
_L4:
        message = (List)message.obj;
        com.qihoo.security.clearengine.b.a.a(a, message);
        return;
_L5:
        com.qihoo.security.clearengine.b.a.n(a);
        return;
_L6:
        com.qihoo.security.clearengine.b.a.a(a, (IBinder)message.obj);
        return;
_L7:
        com.qihoo.security.clearengine.b.a.o(a);
        return;
_L8:
        com.qihoo.security.clearengine.b.a.p(a);
        return;
_L1:
    }

    public (a a1, Looper looper)
    {
        a = a1;
        super(looper);
    }
}
