// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;


// Referenced classes of package org.apache.http.util:
//            TextUtils

public class Args
{

    public static void check(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalArgumentException(s);
        } else
        {
            return;
        }
    }

    public static CharSequence notBlank(CharSequence charsequence, String s)
    {
        if (charsequence == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" may not be null").toString());
        }
        if (TextUtils.isBlank(charsequence))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" may not be blank").toString());
        } else
        {
            return charsequence;
        }
    }

    public static CharSequence notEmpty(CharSequence charsequence, String s)
    {
        if (charsequence == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" may not be null").toString());
        }
        if (TextUtils.isEmpty(charsequence))
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" may not be empty").toString());
        } else
        {
            return charsequence;
        }
    }

    public static int notNegative(int i, String s)
    {
        if (i < 0)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" may not be negative").toString());
        } else
        {
            return i;
        }
    }

    public static Object notNull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException((new StringBuilder()).append(s).append(" may not be null").toString());
        } else
        {
            return obj;
        }
    }
}
