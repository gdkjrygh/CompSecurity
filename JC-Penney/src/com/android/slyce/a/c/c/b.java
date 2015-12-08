// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c.c;

import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import com.android.slyce.a.at;
import com.android.slyce.a.bp;

// Referenced classes of package com.android.slyce.a.c.c:
//            d, a, c

public class b extends at
{

    static final boolean e;
    aj d;
    private int f;
    private int g;
    private d h;

    public b()
    {
        f = 0;
        g = 0;
        h = d.a;
        d = new aj();
    }

    private boolean a(char c1)
    {
        return a(c1, '\n');
    }

    private boolean a(char c1, char c2)
    {
        if (c1 != c2)
        {
            a(((Exception) (new a((new StringBuilder()).append(c2).append(" was expected, got ").append(c1).toString()))));
            return false;
        } else
        {
            return true;
        }
    }

    private boolean b(char c1)
    {
        return a(c1, '\r');
    }

    public void a(am am, aj aj1)
    {
_L3:
        if (aj1.d() <= 0) goto _L2; else goto _L1
_L1:
        c.a[h.ordinal()];
        JVM INSTR tableswitch 1 6: default 396
    //                   1 56
    //                   2 224
    //                   3 245
    //                   4 313
    //                   5 334
    //                   6 382;
           goto _L3 _L4 _L5 _L6 _L7 _L8 _L9
_L4:
        char c1 = aj1.g();
        if (c1 != '\r') goto _L11; else goto _L10
_L10:
        h = d.b;
_L14:
        g = f;
          goto _L3
_L2:
        return;
_L11:
        f = f * 16;
        if (c1 < 'a' || c1 > 'f') goto _L13; else goto _L12
_L12:
        f = (c1 - 97) + 10 + f;
          goto _L14
_L13:
        if (c1 < '0' || c1 > '9') goto _L16; else goto _L15
_L15:
        f = (c1 - 48) + f;
          goto _L14
_L16:
        if (c1 < 'A' || c1 > 'F') goto _L18; else goto _L17
_L17:
        f = (c1 - 65) + 10 + f;
          goto _L14
_L18:
        try
        {
            a(((Exception) (new a((new StringBuilder()).append("invalid chunk length: ").append(c1).toString()))));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (am am)
        {
            a(((Exception) (am)));
        }
          goto _L2
_L5:
        if (!a(aj1.g())) goto _L2; else goto _L19
_L19:
        h = d.d;
          goto _L3
_L6:
        int i;
        i = aj1.d();
        i = Math.min(g, i);
        g = g - i;
        if (g == 0)
        {
            h = d.e;
        }
        if (i == 0) goto _L3; else goto _L20
_L20:
        aj1.a(d, i);
        bp.a(this, d);
          goto _L3
_L7:
        if (!b(aj1.g())) goto _L2; else goto _L21
_L21:
        h = d.f;
          goto _L3
_L8:
        if (!a(aj1.g())) goto _L2; else goto _L22
_L22:
        if (f <= 0) goto _L24; else goto _L23
_L23:
        h = d.a;
_L25:
        f = 0;
          goto _L3
_L24:
        h = d.g;
        a(((Exception) (null)));
          goto _L25
_L9:
        if (e) goto _L2; else goto _L26
_L26:
        throw new AssertionError();
    }

    protected void a(Exception exception)
    {
        Object obj = exception;
        if (exception == null)
        {
            obj = exception;
            if (h != d.g)
            {
                obj = new a("chunked input ended before final chunk");
            }
        }
        super.a(((Exception) (obj)));
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/c/b.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
    }
}
