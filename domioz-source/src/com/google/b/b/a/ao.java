// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b.a;

import com.google.b.al;
import com.google.b.am;
import com.google.b.c.a;
import com.google.b.k;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.b.b.a:
//            ap

final class ao
    implements am
{

    ao()
    {
    }

    public final al a(k k1, a a1)
    {
        if (a1.getRawType() != java/sql/Timestamp)
        {
            return null;
        } else
        {
            return new ap(this, k1.a(java/util/Date));
        }
    }
}
