// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;

import android.os.Message;

// Referenced classes of package com.google.android.libraries.wordlens:
//            WordLensSystem

final class k
    implements android.os.Handler.Callback
{

    final WordLensSystem a;

    k(WordLensSystem wordlenssystem)
    {
        a = wordlenssystem;
        super();
    }

    public final boolean handleMessage(Message message)
    {
        Object obj = WordLensSystem.c();
        obj;
        JVM INSTR monitorenter ;
        message.what;
        JVM INSTR tableswitch 0 0: default 48
    //                   0 32;
           goto _L1 _L2
_L1:
        return false;
_L2:
        WordLensSystem.b(a);
        obj;
        JVM INSTR monitorexit ;
        return true;
        message;
        obj;
        JVM INSTR monitorexit ;
        throw message;
    }
}
