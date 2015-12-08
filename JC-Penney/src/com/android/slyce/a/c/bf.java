// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.a.c;

import com.android.slyce.a.a.e;
import com.android.slyce.a.aj;
import com.android.slyce.a.am;

// Referenced classes of package com.android.slyce.a.c:
//            bi, bc

class bf
    implements e
{

    final bc a;

    bf(bc bc1)
    {
        a = bc1;
        super();
    }

    public void a(am am, aj aj1)
    {
        am = new byte[bc.a(a)];
        aj1.a(am);
        try
        {
            bc.a(a, am);
        }
        // Misplaced declaration of an exception variable
        catch (am am)
        {
            a.a(am);
            am.printStackTrace();
        }
        a.a();
    }
}
