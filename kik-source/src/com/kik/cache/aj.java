// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cache;


// Referenced classes of package com.kik.cache:
//            y

public final class aj extends y
{

    private final String f;

    private aj(String s, String s1, com.android.volley.r.b b, android.graphics.Bitmap.Config config, com.android.volley.r.a a1)
    {
        super(s, s1, b, 0, 0, config, a1);
        f = s;
    }

    public static aj a(String s, com.android.volley.r.b b, com.android.volley.r.a a1)
    {
        String s1 = e(s);
        if (s1 == null)
        {
            return null;
        } else
        {
            return new aj(s, s1, b, a, a1);
        }
    }

    public static String d(String s)
    {
        return e(s);
    }

    private static String e(String s)
    {
        if (s == null)
        {
            return null;
        } else
        {
            return (new StringBuilder("http://smiley-cdn.kik.com/smileys/")).append(s).append("/96x96.png").toString();
        }
    }
}
