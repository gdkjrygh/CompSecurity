// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.repo.aa;
import com.fitbit.data.repo.ao;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            u

class 
    implements tyMerger.g
{

    final Date a;
    final Date b;
    final u c;

    public List a(ao ao)
    {
        return ((aa)ao).getBetweenDates(a, b);
    }

    (u u1, Date date, Date date1)
    {
        c = u1;
        a = date;
        b = date1;
        super();
    }
}
