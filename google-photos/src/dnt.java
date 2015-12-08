// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.text.TextUtils;

public final class dnt extends nzc
{

    private final dnq a;
    private final int b = 100;
    private final String c;
    private plz d;

    public dnt(Context context, dnq dnq1, int i, String s)
    {
        super(context, new nyg(context, dnq1.a), "photossearch", new pcj(), new pck());
        c = s;
        a = dnq1;
    }

    public static plz a(dnt dnt1)
    {
        return dnt1.d;
    }

    protected final void a(qlw qlw)
    {
        plr plr1;
        qlw = (pcj)qlw;
        qlw.a = new pln();
        qlw = ((pcj) (qlw)).a;
        qlw.b = c;
        plr1 = new plr();
        plr1.b = 1;
        plm plm1;
        boolean flag;
        if (a.d != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        plm1 = new plm();
        plm1.c = Integer.valueOf(0);
        plm1.d = Integer.valueOf(0);
        plm1.b = String.valueOf(a.a());
        plm1.a = 1;
        plr1.d = (new plm[] {
            plm1
        });
        plr1.c = Long.valueOf(a.a());
_L4:
        qlw.c = plr1;
        qlw.a = Integer.valueOf(b);
        qlw.d = b.i();
        ((pln) (qlw)).d.a.b = new pze();
        return;
_L2:
        if (TextUtils.isEmpty(a.e))
        {
            break; /* Loop/switch isn't completed */
        }
        plm plm2 = new plm();
        plm2.c = Integer.valueOf(0);
        plm2.d = Integer.valueOf(a.b.length());
        plm2.b = a.e;
        plm2.a = 2;
        plr1.d = (new plm[] {
            plm2
        });
_L6:
        plr1.a = a.b;
        if (true) goto _L4; else goto _L3
_L3:
        if (TextUtils.isEmpty(a.h)) goto _L6; else goto _L5
_L5:
        plm plm3 = new plm();
        plm3.c = Integer.valueOf(0);
        plm3.d = Integer.valueOf(a.b.length());
        plm3.b = a.h;
        plm3.a = 3;
        plr1.d = (new plm[] {
            plm3
        });
          goto _L6
    }

    protected final void b(qlw qlw)
    {
        d = ((pck)qlw).a;
    }
}
