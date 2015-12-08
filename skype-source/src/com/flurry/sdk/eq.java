// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            es, er, et

public final class eq extends es
{

    private final int a;

    public eq(String s, int i)
    {
        super(a(s, i));
        a = i;
    }

    private static et a(String s, int i)
    {
        et et = null;
        if (b(s, i))
        {
            et = er.a(s);
        }
        return et;
    }

    private static boolean b(String s, int i)
    {
        return !TextUtils.isEmpty(s) && android.os.Build.VERSION.SDK_INT >= i;
    }
}
