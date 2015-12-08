// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.d;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.ao;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

// Referenced classes of package com.android.slyce.a.c.d:
//            u, s, t

class v
    implements e
{

    final u a;

    v(u u1)
    {
        a = u1;
        super();
    }

    public void a(am am, aj aj1)
    {
        aj1.a(ByteOrder.BIG_ENDIAN);
        a.b = aj1.f();
        a.c = aj1.f();
        a.f = (short)((a.b & 0x3fff0000) >> 16);
        a.e = (byte)((a.b & 0xff00) >> 8);
        a.d = (byte)(a.b & 0xff);
        a.g = a.c & 0x7fffffff;
        if (s.a().isLoggable(Level.FINE))
        {
            s.a().fine(t.a(true, a.g, a.f, a.e, a.d));
        }
        u.b(a).a(a.f, u.a(a));
    }
}
