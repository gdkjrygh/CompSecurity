// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.d.a;
import com.google.a.d.f;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.a.b.a:
//            an

final class ao extends am
{

    final am a;
    final an b;

    ao(an an, am am1)
    {
        b = an;
        a = am1;
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

    public final volatile void a(f f, Object obj)
    {
        obj = (Timestamp)obj;
        a.a(f, obj);
    }
}
