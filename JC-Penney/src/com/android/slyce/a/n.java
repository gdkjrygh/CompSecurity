// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a;

import com.android.slyce.a.a.e;
import com.android.slyce.a.d.a;
import java.nio.ByteBuffer;
import javax.net.ssl.SSLEngine;
import javax.net.ssl.SSLEngineResult;
import javax.net.ssl.SSLException;

// Referenced classes of package com.android.slyce.a:
//            aj, i, am

class n
    implements e
{

    final a a = (new a()).b(8192);
    final aj b = new aj();
    final i c;

    n(i j)
    {
        c = j;
        super();
    }

    public void a(am am, aj aj1)
    {
        if (c.d)
        {
            return;
        }
        Object obj;
        c.d = true;
        aj1.a(b);
        if (b.e())
        {
            am = b.k();
            b.a(am);
        }
        obj = aj.g;
_L4:
        am = ((am) (obj));
        if (((ByteBuffer) (obj)).remaining() != 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        am = ((am) (obj));
        if (b.o() > 0)
        {
            am = b.n();
        }
        int j;
        int k;
        j = am.remaining();
        k = c.p.d();
        aj1 = a.a();
        obj = c.e.unwrap(am, aj1);
        c.a(c.p, aj1);
        a.a(c.p.d() - k);
        if (((SSLEngineResult) (obj)).getStatus() != javax.net.ssl.SSLEngineResult.Status.BUFFER_OVERFLOW) goto _L2; else goto _L1
_L1:
        a.b(a.b() * 2);
        j = -1;
        aj1 = am;
_L7:
        com.android.slyce.a.i.a(c, ((SSLEngineResult) (obj)).getHandshakeStatus());
        obj = aj1;
        if (aj1.remaining() != j) goto _L4; else goto _L3
_L3:
        obj = aj1;
        if (k != c.p.d()) goto _L4; else goto _L5
_L5:
        b.b(aj1);
_L9:
        c.e();
        c.d = false;
        return;
_L2:
        aj1 = am;
        if (((SSLEngineResult) (obj)).getStatus() != javax.net.ssl.SSLEngineResult.Status.BUFFER_UNDERFLOW) goto _L7; else goto _L6
_L6:
        b.b(am);
        if (b.o() <= 1) goto _L9; else goto _L8
_L8:
        am = b.k();
        b.b(am);
        aj1 = aj.g;
        j = -1;
          goto _L7
        am;
        am.printStackTrace();
        com.android.slyce.a.i.a(c, am);
        c.d = false;
        return;
        am;
        c.d = false;
        throw am;
    }
}
