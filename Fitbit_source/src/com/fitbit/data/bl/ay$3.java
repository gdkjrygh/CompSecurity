// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.repo.ao;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            ay

class c
    implements yMerger.g
{

    final Date a;
    final int b;
    final int c;
    final ay d;

    public List a(ao ao)
    {
        return d.b(a, b, c);
    }

    yMerger.g(ay ay1, Date date, int i, int j)
    {
        d = ay1;
        a = date;
        b = i;
        c = j;
        super();
    }
}
