// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Message;
import com.spotify.mobile.android.util.Assertion;

final class ang.Object
    implements android.os.r.Callback
{

    private ecq a;

    public final boolean handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 10 10: default 24
    //                   10 48;
           goto _L1 _L2
_L1:
        Assertion.a((new StringBuilder("Unexpected message ")).append(message.what).toString());
_L4:
        return true;
_L2:
        ecq.a(a, (fnu)message.obj);
        if (true) goto _L4; else goto _L3
_L3:
    }

    (ecq ecq1)
    {
        a = ecq1;
        super();
    }
}
