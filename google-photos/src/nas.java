// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Log;

final class nas
    implements nam
{

    private final nud a = new ntz(null);

    nas()
    {
    }

    public final nud a()
    {
        return a;
    }

    public final void a(String s)
    {
        this;
        JVM INSTR monitorenter ;
        String s1;
        if (Log.isLoggable("AuthInvalidator", 3))
        {
            s1 = String.valueOf("Invalidating auth tokens, reason: ");
            s = String.valueOf(s);
            if (s.length() == 0)
            {
                break MISSING_BLOCK_LABEL_47;
            }
            s1.concat(s);
        }
_L1:
        a.b();
        this;
        JVM INSTR monitorexit ;
        return;
        new String(s1);
          goto _L1
        s;
        throw s;
    }
}
