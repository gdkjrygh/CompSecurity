// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.SharedPreferences;

public final class cba
{

    final Object a = new Object();
    boolean b;
    SharedPreferences c;

    public cba()
    {
        b = false;
        c = null;
    }

    public final Object a(cax cax1)
    {
        Object obj = a;
        obj;
        JVM INSTR monitorenter ;
        if (b)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        cax1 = ((cax) (cax1.b));
        return cax1;
        obj;
        JVM INSTR monitorexit ;
        return cax1.a(c);
        cax1;
        obj;
        JVM INSTR monitorexit ;
        throw cax1;
    }
}
