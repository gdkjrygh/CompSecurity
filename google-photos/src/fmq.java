// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Calendar;

final class fmq
    implements hao
{

    private fmo a;

    fmq(fmo fmo1)
    {
        a = fmo1;
        super();
    }

    public final ehr a(long l)
    {
        ekw ekw = b(l);
        return new ehr(fmo.b(a), ekw);
    }

    public final ekw b(long l)
    {
        Calendar calendar = ivc.a();
        calendar.setTimeInMillis(l);
        eky eky1;
        byte byte0;
        if (fmo.a(a) == eyz.b)
        {
            byte0 = 2;
        } else
        {
            byte0 = 5;
        }
        calendar.add(byte0, 1);
        eky1 = (new eky()).a(fmo.c(a).b);
        eky1.d = l;
        eky1.e = calendar.getTimeInMillis();
        return eky1.a();
    }
}
