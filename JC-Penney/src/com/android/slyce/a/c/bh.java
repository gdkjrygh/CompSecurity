// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;
import java.io.IOException;

// Referenced classes of package com.android.slyce.a.c:
//            bc

class bh
    implements e
{

    static final boolean a;
    final bc b;

    bh(bc bc1)
    {
        b = bc1;
        super();
    }

    public void a(am am, aj aj1)
    {
        if (!a && aj1.d() != bc.c(b))
        {
            throw new AssertionError();
        }
        bc.c(b, new byte[bc.c(b)]);
        aj1.a(bc.d(b));
        try
        {
            com.android.slyce.a.c.bc.e(b);
        }
        // Misplaced declaration of an exception variable
        catch (am am)
        {
            b.a(am);
            am.printStackTrace();
        }
        bc.a(b, 0);
        b.a();
    }

    static 
    {
        boolean flag;
        if (!com/android/slyce/a/c/bc.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
