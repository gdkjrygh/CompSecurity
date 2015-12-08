// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class nwa extends nzc
{

    public poq a;
    private final String b;
    private final pos c;

    public nwa(Context context, nyg nyg, String s, pos pos)
    {
        super(context, nyg, "getphotossettings", new pbj(), new pbk());
        b = s;
        c = pos;
    }

    protected final void a(qlw qlw)
    {
        qlw = (pbj)qlw;
        qlw.a = new plh();
        qlw = ((pbj) (qlw)).a;
        qlw.a = b;
        qlw.b = c;
    }

    protected final void b(qlw qlw)
    {
        a = ((pbk)qlw).a.a;
    }

    public final nwc c()
    {
        nwe nwe1;
        boolean flag;
        flag = true;
        nwe1 = new nwe();
        if (a.f != null)
        {
            nwe1.a = a.f.booleanValue();
        }
        if (a.d != null)
        {
            nwe1.b = a.d.booleanValue();
        }
        if (a.e != null)
        {
            nwe1.c = a.e.booleanValue();
        }
        if (a.a != null)
        {
            nwe1.d = a.a.booleanValue();
        }
        if (a.b != null)
        {
            nwe1.e = a.b.a.booleanValue();
            nwe1.f = a.b.b.booleanValue();
        }
        if (a.h == null) goto _L2; else goto _L1
_L1:
        pob apob[];
        int i;
        int j;
        apob = a.h.a;
        j = apob.length;
        i = 0;
_L7:
        if (i >= j) goto _L2; else goto _L3
_L3:
        pob pob1 = apob[i];
        if (pob1.a != 1) goto _L5; else goto _L4
_L4:
        if (pob1.b == 1)
        {
            nwe1.g = false;
            nwe1.h = false;
        } else
        {
            nwe1.g = true;
            if (pob1.b != 2)
            {
                flag = false;
            }
            nwe1.h = flag;
        }
_L2:
        return nwe1.a();
_L5:
        i++;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
