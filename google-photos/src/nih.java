// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class nih extends nzc
{

    boolean a;
    boolean b;

    nih(Context context, nyg nyg)
    {
        super(context, nyg, "getaccountstatus", new pbd(), new pbe());
    }

    protected final void a(qlw qlw)
    {
        qlw = (pbd)qlw;
        qlw.a = new phs();
        qlw = ((pbd) (qlw)).a;
        qlw.a = new pib[3];
        pib pib1 = new pib();
        pib1.a = 485;
        pib1.b = Boolean.valueOf(true);
        pib1.c = Boolean.valueOf(false);
        pib1.d = Boolean.valueOf(false);
        ((phs) (qlw)).a[0] = pib1;
        pib1 = new pib();
        pib1.a = 355;
        pib1.b = Boolean.valueOf(true);
        pib1.c = Boolean.valueOf(false);
        pib1.d = Boolean.valueOf(false);
        ((phs) (qlw)).a[1] = pib1;
        pib1 = new pib();
        pib1.a = 397;
        pib1.b = Boolean.valueOf(true);
        pib1.c = Boolean.valueOf(false);
        pib1.d = Boolean.valueOf(false);
        ((phs) (qlw)).a[2] = pib1;
    }

    protected final void b(qlw qlw)
    {
        boolean flag;
        flag = false;
        qlw = (pbe)qlw;
        b = true;
        qlw = ((pbe) (qlw)).a;
        if (qlw != null && ((pht) (qlw)).a != null && ((pht) (qlw)).a.length != 0) goto _L2; else goto _L1
_L1:
        return;
_L2:
        pia apia[];
        int i;
        int j;
        apia = ((pht) (qlw)).a;
        j = apia.length;
        i = 0;
_L7:
        if (i >= j) goto _L4; else goto _L3
_L3:
        pia pia1 = apia[i];
        if (pia1.a != 485) goto _L6; else goto _L5
_L5:
        pia1.b.booleanValue();
_L4:
        apia = ((pht) (qlw)).a;
        j = apia.length;
        i = 0;
_L8:
        if (i < j)
        {
            pia pia2 = apia[i];
            if (pia2.a != 355)
            {
                break MISSING_BLOCK_LABEL_191;
            }
            a = pia2.b.booleanValue();
            b = false;
        }
        qlw = ((pht) (qlw)).a;
        j = qlw.length;
        i = ((flag) ? 1 : 0);
        while (i < j) 
        {
            Object obj = qlw[i];
            if (((pia) (obj)).a == 397)
            {
                ((pia) (obj)).b.booleanValue();
            }
            i++;
        }
          goto _L1
_L6:
        i++;
          goto _L7
        i++;
          goto _L8
    }
}
