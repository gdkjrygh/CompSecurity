// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.text.TextUtils;

// Referenced classes of package com.jcp.util:
//            bg, k

public final class bs
{

    public static boolean a(Context context, String s)
    {
        if (!TextUtils.isEmpty(s) && !bg.a(s))
        {
            return false;
        }
        if (s.length() < 5)
        {
            k.a(context, 0x7f0701bb, 0x7f070465);
            return false;
        } else
        {
            return true;
        }
    }
}
