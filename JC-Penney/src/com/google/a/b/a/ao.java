// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.af;
import com.google.a.ag;
import com.google.a.c.a;
import com.google.a.j;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.a.b.a:
//            ap

final class ao
    implements ag
{

    ao()
    {
    }

    public af a(j j1, a a1)
    {
        if (a1.a() != java/sql/Timestamp)
        {
            return null;
        } else
        {
            return new ap(this, j1.a(java/util/Date));
        }
    }
}
