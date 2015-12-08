// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common;

import android.content.Context;

// Referenced classes of package com.google.android.gms.common:
//            d

public class a
{

    public static final int a;
    private static final a b = new a();

    a()
    {
    }

    public static a a()
    {
        return b;
    }

    public int a(Context context)
    {
        int j = d.a(context);
        int i = j;
        if (d.a(context, j))
        {
            i = 18;
        }
        return i;
    }

    static 
    {
        a = d.a;
    }
}
