// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;

final class app
    implements android.os.Handler.Callback
{

    app()
    {
    }

    public final boolean handleMessage(Message message)
    {
        apn apn1 = (apn)message.obj;
        message.what;
        JVM INSTR tableswitch 1 3: default 40
    //                   1 74
    //                   2 80
    //                   3 87;
           goto _L1 _L2 _L3 _L4
_L1:
        int i = message.what;
        throw new IllegalStateException((new StringBuilder(33)).append("Unrecognized message: ").append(i).toString());
_L2:
        apn.a(apn1);
_L6:
        return true;
_L3:
        apn.b(apn1);
        continue; /* Loop/switch isn't completed */
_L4:
        apn.c(apn1);
        if (true) goto _L6; else goto _L5
_L5:
    }
}
