// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.b.l;
import com.android.slyce.a.c.b.a;

// Referenced classes of package com.android.slyce.a.c:
//            j, u, bw, bv, 
//            a, w

class c
    implements a
{

    final l a;
    final j b;
    final u c;
    final com.android.slyce.a.c.a d;

    c(com.android.slyce.a.c.a a1, l l1, j j1, u u1)
    {
        d = a1;
        a = l1;
        b = j1;
        c = u1;
        super();
    }

    public void a(Exception exception, w w)
    {
        if (exception == null) goto _L2; else goto _L1
_L1:
        if (a.a(exception) && b != null)
        {
            b.a(exception, null);
        }
_L8:
        return;
_L2:
        w = com.android.slyce.a.c.bw.a(c.e(), w);
        if (w != null) goto _L4; else goto _L3
_L3:
        if (!a.a(new bv("Unable to complete websocket handshake")))
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        if (b != null)
        {
            b.a(exception, w);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (a.b(w)) goto _L6; else goto _L5
_L5:
        break; /* Loop/switch isn't completed */
        if (true) goto _L8; else goto _L7
_L7:
    }
}
