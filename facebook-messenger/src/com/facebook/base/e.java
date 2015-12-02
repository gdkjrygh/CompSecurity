// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.base;

import java.text.Normalizer;

// Referenced classes of package com.facebook.base:
//            g

public class e
{

    public e()
    {
    }

    public static String a(CharSequence charsequence, g g1)
    {
        if (android.os.Build.VERSION.SDK_INT < 9)
        {
            return b(charsequence, g1);
        } else
        {
            return c(charsequence, g1);
        }
    }

    private static String b(CharSequence charsequence, g g1)
    {
        return charsequence.toString();
    }

    private static String c(CharSequence charsequence, g g1)
    {
        return Normalizer.normalize(charsequence, g.unwrap(g1));
    }
}
