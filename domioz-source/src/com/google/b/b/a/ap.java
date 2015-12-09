// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.d.a;
import com.google.b.d.d;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.b.b.a:
//            ao

final class ap extends al
{

    final al a;
    final ao b;

    ap(ao ao, al al1)
    {
        b = ao;
        a = al1;
        super();
    }

    public final Object a(a a1)
    {
        a1 = (Date)a.a(a1);
        if (a1 != null)
        {
            return new Timestamp(a1.getTime());
        } else
        {
            return null;
        }
    }

    public final volatile void a(d d, Object obj)
    {
        obj = (Timestamp)obj;
        a.a(d, obj);
    }
}
