// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.a.a.a.c.a.b;

import com.nuance.a.a.a.a.d.a.d;
import com.nuance.a.a.a.a.d.a.e;
import com.nuance.a.a.a.c.a.a.b.b;
import com.nuance.a.a.a.c.c.c;
import java.util.Vector;

// Referenced classes of package com.nuance.a.a.a.c.a.b:
//            c, e

public class f
{

    private static final e a = d.a(com/nuance/a/a/a/c/a/b/f);

    private f()
    {
    }

    public static com.nuance.a.a.a.c.a.b.e a(String s, short word0, String s1, byte abyte0[], String s2, com.nuance.a.a.a.a.b.b b1, com.nuance.a.a.a.a.b.b b2, Vector vector, 
            com.nuance.a.a.a.c.a.b.c c1)
    {
        a.b();
        if (s == null || s.length() == 0)
        {
            a.b("NullPointerException gatewayIP is NULL. ");
            throw new NullPointerException("gatewayIP must be provided!");
        }
        if (word0 <= 0)
        {
            a.b("IllegalArgumentException gatewayPort is invalid. ");
            throw new IllegalArgumentException("gatewayPort invalid value!");
        }
        if (s1 == null)
        {
            a.b("NullPointerException applicationId is NULL. ");
            throw new NullPointerException("Application id can not be null!");
        }
        if (abyte0 == null)
        {
            a.b("NullPointerException appKey is NULL. ");
            throw new NullPointerException("Application key can not be null!");
        }
        if (s2 == null)
        {
            a.b("NullPointerException uid is NULL. ");
            throw new NullPointerException("uid can not be null!");
        }
        if (b1 == null)
        {
            a.b("NullPointerException inputCodec is NULL. ");
            throw new NullPointerException("inputCodec can not be null!");
        }
        if (b2 == null)
        {
            a.b("NullPointerException outputCodec is NULL. ");
            throw new NullPointerException("outputCodec can not be null!");
        }
        if (c1 == null)
        {
            a.b("NullPointerException managerListener is NULL. ");
            throw new NullPointerException("managerListener can not be null!");
        }
        if (vector != null)
        {
            for (int i = 0; i < vector.size(); i++)
            {
                c c2 = (c)vector.elementAt(i);
                if (c2.d() == com.nuance.a.a.a.c.c.d.e || c2.d() == com.nuance.a.a.a.c.c.d.f || c2.d() == com.nuance.a.a.a.c.c.d.g || c2.d() == com.nuance.a.a.a.c.c.d.h || c2.d() == com.nuance.a.a.a.c.c.d.d || c2.d() == com.nuance.a.a.a.c.c.d.i || c2.d() == com.nuance.a.a.a.c.c.d.j)
                {
                    a.b((new StringBuilder("IllegalArgumentException Parameter type: ")).append(c2.d()).append(" not allowed. ").toString());
                    throw new IllegalArgumentException((new StringBuilder("Parameter type: ")).append(c2.d()).append(" not allowed. ").toString());
                }
            }

        }
        return new b(s, word0, s1, abyte0, s2, b1, b2, vector, c1);
    }

}
