// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;
import java.lang.reflect.Method;

// Referenced classes of package com.flurry.sdk:
//            et, eo

public final class er
{

    private static final String a = com/flurry/sdk/er.getSimpleName();

    public er()
    {
    }

    public static et a(String s)
    {
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        et et1 = (et)Class.forName(s).getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        s = et1;
_L2:
        return s;
        Exception exception;
        exception;
        eo.a(5, a, (new StringBuilder("FlurryModule ")).append(s).append(" is not available:").toString(), exception);
        s = null;
        if (true) goto _L2; else goto _L1
_L1:
    }

}
