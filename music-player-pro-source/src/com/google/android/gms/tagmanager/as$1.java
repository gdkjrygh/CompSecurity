// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            as, cy, at, ar

class wO
    implements Runnable
{

    final ar arA;
    final long arB;
    final as arC;
    final String wO;

    public void run()
    {
        if (as.a(arC) == null)
        {
            cy cy1 = cy.qN();
            cy1.a(as.b(arC), arA);
            as.a(arC, cy1.qO());
        }
        as.a(arC).f(arB, wO);
    }

    (as as1, ar ar, long l, String s)
    {
        arC = as1;
        arA = ar;
        arB = l;
        wO = s;
        super();
    }
}
