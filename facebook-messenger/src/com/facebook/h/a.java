// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.h;

import com.facebook.base.c;
import com.facebook.debug.log.b;
import com.facebook.prefs.shared.aj;
import com.facebook.prefs.shared.d;
import com.facebook.prefs.shared.f;
import com.google.common.base.Preconditions;

// Referenced classes of package com.facebook.h:
//            b, c

public class a
    implements c
{

    private final d a;
    private final f b = new com.facebook.h.b(this);
    private final com.facebook.config.a.a c;
    private final javax.inject.a d;

    a(d d1, com.facebook.config.a.a a1, javax.inject.a a2)
    {
        a = (d)Preconditions.checkNotNull(d1);
        c = (com.facebook.config.a.a)Preconditions.checkNotNull(a1);
        d = a2;
        a.a(b);
    }

    public void a()
    {
        b();
    }

    public void b()
    {
        String s = a.a(aj.i, "-1");
        int i;
        try
        {
            i = Integer.parseInt(s);
        }
        catch (NumberFormatException numberformatexception)
        {
            i = -1;
        }
        if (i != -1)
        {
            com.facebook.debug.log.b.a(i);
            return;
        }
        c.a[c.h().ordinal()];
        JVM INSTR tableswitch 1 1: default 68
    //                   1 93;
           goto _L1 _L2
_L1:
        byte byte0;
        if (((Boolean)d.b()).booleanValue())
        {
            byte0 = 4;
        } else
        {
            byte0 = 5;
        }
_L4:
        com.facebook.debug.log.b.a(byte0);
        return;
_L2:
        byte0 = 3;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
