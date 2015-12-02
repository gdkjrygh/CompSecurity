// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import com.facebook.ads.c;
import com.facebook.ads.internal.c.a;
import com.facebook.ads.internal.util.t;

// Referenced classes of package com.facebook.ads.internal:
//            AdErrorType

public class b
{

    private final AdErrorType a;
    private final String b;

    public b(AdErrorType aderrortype, String s)
    {
        String s1 = s;
        if (t.a(s))
        {
            s1 = aderrortype.getDefaultErrorMessage();
        }
        a = aderrortype;
        b = s1;
        com.facebook.ads.internal.c.a.b((new StringBuilder()).append("Error code [").append(String.valueOf(aderrortype.getErrorCode())).append("] ").append(s1).toString());
    }

    public AdErrorType a()
    {
        return a;
    }

    public c b()
    {
        if (a.a())
        {
            return new c(a.getErrorCode(), b);
        } else
        {
            return new c(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
        }
    }
}
