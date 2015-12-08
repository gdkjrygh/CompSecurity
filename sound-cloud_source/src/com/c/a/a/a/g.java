// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;

// Referenced classes of package com.c.a.a.a:
//            f

final class g extends ThreadLocal
{

    g()
    {
    }

    protected final Object initialValue()
    {
        SimpleDateFormat simpledateformat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
        simpledateformat.setLenient(false);
        simpledateformat.setTimeZone(f.a());
        return simpledateformat;
    }
}
