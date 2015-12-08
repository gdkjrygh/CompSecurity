// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.b.a:
//            t

public final class q
{

    private static String a[] = new String[2];

    public static String[] a(Context context)
    {
        if (!TextUtils.isEmpty(a[0]) && !TextUtils.isEmpty(a[1]))
        {
            return a;
        }
        if (context != null)
        {
            t.a(context);
            context = t.a();
            if (context != null)
            {
                a[0] = context[0];
                a[1] = context[1];
                return a;
            }
        }
        return null;
    }

}
