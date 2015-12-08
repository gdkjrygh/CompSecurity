// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.a;

import com.facebook.AccessToken;
import com.facebook.internal.U;
import com.facebook.s;
import java.io.Serializable;

// Referenced classes of package com.facebook.a:
//            a

private static final class b
    implements Serializable
{

    final String a;
    final String b;

    public final boolean equals(Object obj)
    {
        if (obj instanceof e)
        {
            if (U.a(((al.U.a) (obj = (al.U.a)obj)).a, a) && U.a(((al.U.a) (obj)).b, b))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = 0;
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i ^ j;
    }

    Token(AccessToken accesstoken)
    {
        this(accesstoken.d, s.h());
    }

    Token.d(String s1, String s2)
    {
        String s3 = s1;
        if (U.a(s1))
        {
            s3 = null;
        }
        a = s3;
        b = s2;
    }
}
