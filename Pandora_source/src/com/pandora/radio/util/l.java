// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import android.content.Context;
import java.util.Map;

// Referenced classes of package com.pandora.radio.util:
//            b

public class l extends b
{

    private static Map a;

    public static Object a(Context context, String s)
    {
        if (a != null)
        {
            Object obj = a.get(s);
            if (obj != null)
            {
                return obj;
            }
        }
        return context.getSystemService(s);
    }
}
