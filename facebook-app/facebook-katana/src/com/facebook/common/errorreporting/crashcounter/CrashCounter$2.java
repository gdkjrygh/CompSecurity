// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.errorreporting.crashcounter;

import com.facebook.acra.CustomReportDataSupplier;

// Referenced classes of package com.facebook.common.errorreporting.crashcounter:
//            CrashCounter

class a
    implements CustomReportDataSupplier
{

    final CrashCounter a;

    public String getCustomData(Throwable throwable)
    {
        try
        {
            a.a();
            throwable = Integer.toString(a.e());
        }
        // Misplaced declaration of an exception variable
        catch (Throwable throwable)
        {
            return "n/a";
        }
        return throwable;
    }

    (CrashCounter crashcounter)
    {
        a = crashcounter;
        super();
    }
}
