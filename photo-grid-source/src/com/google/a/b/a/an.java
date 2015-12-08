// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b.a;

import com.google.a.am;
import com.google.a.c.a;
import com.google.a.k;
import java.sql.Timestamp;
import java.util.Date;

// Referenced classes of package com.google.a.b.a:
//            ao

final class an
    implements com.google.a.an
{

    an()
    {
    }

    public final am a(k k1, a a1)
    {
        if (a1.a() != java/sql/Timestamp)
        {
            return null;
        } else
        {
            return new ao(this, k1.a(java/util/Date));
        }
    }
}
