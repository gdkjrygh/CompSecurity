// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.wordlens;


// Referenced classes of package com.google.android.libraries.wordlens:
//            WordLensSystem

final class l
    implements Runnable
{

    final WordLensSystem a;

    l(WordLensSystem wordlenssystem)
    {
        a = wordlenssystem;
        super();
    }

    public final void run()
    {
        synchronized (WordLensSystem.c())
        {
            WordLensSystem.b(a);
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
