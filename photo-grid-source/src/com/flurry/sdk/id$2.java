// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            kj, id, kc, jo, 
//            kg, hq

class it>
    implements it>
{

    final long a;
    final boolean b;
    final id c;

    public volatile void a(kj kj1, Object obj)
    {
        a(kj1, (byte[])obj);
    }

    public void a(kj kj1, byte abyte0[])
    {
        Object obj;
        int i;
        obj = null;
        i = kj1.h();
        kc.a(3, id.e(), (new StringBuilder("Proton config request: HTTP status code is:")).append(i).toString());
        if (i != 400 && i != 406 && i != 412 && i != 415) goto _L2; else goto _L1
_L1:
        id.a(c, 10000L);
_L4:
        return;
_L2:
        long l;
        hq hq1 = obj;
        if (!kj1.f())
        {
            continue; /* Loop/switch isn't completed */
        }
        hq1 = obj;
        if (abyte0 == null)
        {
            continue; /* Loop/switch isn't completed */
        }
        class _cls1 extends lr
        {

            final byte a[];
            final id._cls2 b;

            public void a()
            {
                id.a(b.c, b.a, b.b, a);
            }

            _cls1(byte abyte0[])
            {
                b = id._cls2.this;
                a = abyte0;
                super();
            }
        }

        jo.a().b(new _cls1(abyte0));
        long l1;
        try
        {
            abyte0 = (hq)id.e(c).d(abyte0);
        }
        // Misplaced declaration of an exception variable
        catch (byte abyte0[])
        {
            kc.a(5, id.e(), (new StringBuilder("Failed to decode proton config response: ")).append(abyte0).toString());
            abyte0 = null;
        }
        hq1 = abyte0;
        if (!id.a(c, abyte0))
        {
            hq1 = null;
        }
        if (hq1 != null)
        {
            id.a(c, 10000L);
            id.b(c, a);
            id.a(c, b);
            id.b(c, hq1);
            id.f(c);
            if (!id.g(c))
            {
                id.b(c, true);
                id.a(c, "flurry.session_start", null);
            }
            id.h(c);
        }
        if (hq1 != null) goto _L4; else goto _L3
_L3:
        l = id.i(c);
        if (i != 429) goto _L6; else goto _L5
_L5:
        kj1 = kj1.b("Retry-After");
        if (kj1.isEmpty()) goto _L6; else goto _L7
_L7:
        kj1 = (String)kj1.get(0);
        kc.a(3, id.e(), (new StringBuilder("Server returned retry time: ")).append(kj1).toString());
        l1 = Long.parseLong(kj1);
        l = l1 * 1000L;
_L9:
        id.a(c, l);
        kc.a(3, id.e(), (new StringBuilder("Proton config request failed, backing off: ")).append(id.i(c)).append("ms").toString());
        jo.a().b(id.j(c), id.i(c));
        return;
        kj1;
        kc.a(3, id.e(), "Server returned nonsensical retry time");
_L6:
        l <<= 1;
        if (true) goto _L9; else goto _L8
_L8:
    }

    atException(id id1, long l, boolean flag)
    {
        c = id1;
        a = l;
        b = flag;
        super();
    }
}
