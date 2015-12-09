// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.d;

import com.fitbit.util.format.e;
import java.util.Date;
import java.util.TimeZone;

// Referenced classes of package com.fitbit.d:
//            a

static final class <init>
    implements <init>
{

    final TimeZone a;

    public Date a(String s)
    {
        return e.a(s, a);
    }

    e(TimeZone timezone)
    {
        a = timezone;
        super();
    }
}
