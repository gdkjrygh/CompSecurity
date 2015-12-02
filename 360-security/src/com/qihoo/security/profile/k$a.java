// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import java.util.Map;

// Referenced classes of package com.qihoo.security.profile:
//            k, d

class a
    implements android.os.der.DeathRecipient
{

    String a;
    d b;
    final k c;

    public void binderDied()
    {
        synchronized (k.a(c))
        {
            k.a(c).remove(b.asBinder());
            k.a(c, -1, 2, (new StringBuilder()).append(a).append(" died").toString());
        }
        return;
        exception;
        map;
        JVM INSTR monitorexit ;
        throw exception;
    }

    nt(k k1, d d1, String s)
    {
        c = k1;
        super();
        b = d1;
        a = s;
    }
}
