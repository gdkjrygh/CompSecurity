// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            as, cy, at, ar

class wz
    implements Runnable
{

    final ar apr;
    final long aps;
    final as apt;
    final String wz;

    public void run()
    {
        if (as.a(apt) == null)
        {
            cy cy1 = cy.pw();
            cy1.a(as.b(apt), apr);
            as.a(apt, cy1.px());
        }
        as.a(apt).f(aps, wz);
    }

    (as as1, ar ar, long l, String s)
    {
        apt = as1;
        apr = ar;
        aps = l;
        wz = s;
        super();
    }
}
