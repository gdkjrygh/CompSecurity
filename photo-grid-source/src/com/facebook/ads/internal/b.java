// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.ads.internal;

import com.facebook.ads.AdError;
import com.facebook.ads.internal.dev.Debug;
import com.facebook.ads.internal.util.s;

// Referenced classes of package com.facebook.ads.internal:
//            AdErrorType

public class b
{

    private final AdErrorType a;
    private final String b;

    public b(AdErrorType aderrortype, String s1)
    {
        String s2 = s1;
        if (s.a(s1))
        {
            s2 = aderrortype.getDefaultErrorMessage();
        }
        a = aderrortype;
        b = s2;
        Debug.d((new StringBuilder("Error code [")).append(String.valueOf(aderrortype.getErrorCode())).append("] ").append(s2).toString());
    }

    public AdErrorType a()
    {
        return a;
    }

    public AdError b()
    {
        if (a.a())
        {
            return new AdError(a.getErrorCode(), b);
        } else
        {
            return new AdError(AdErrorType.UNKNOWN_ERROR.getErrorCode(), AdErrorType.UNKNOWN_ERROR.getDefaultErrorMessage());
        }
    }
}
