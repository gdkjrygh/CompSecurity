// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;

// Referenced classes of package com.flurry.sdk:
//            ep, eo, eq

public final class en extends ep
{

    private final int a;

    public en(String s, int i)
    {
        super(a(s, i));
        a = i;
    }

    private static eq a(String s, int i)
    {
        eq eq = null;
        if (b(s, i))
        {
            eq = eo.a(s);
        }
        return eq;
    }

    private static boolean b(String s, int i)
    {
        return !TextUtils.isEmpty(s) && android.os.Build.VERSION.SDK_INT >= i;
    }
}
