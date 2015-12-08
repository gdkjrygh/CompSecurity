// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


// Referenced classes of package com.google.android.m4b.maps.ak:
//            a

public static final class b extends a
{

    protected final long b;

    public final String a()
    {
        return "";
    }

    public final boolean a(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof b)
        {
            flag = flag1;
            if (((b)obj).b == b)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof b)
        {
            return ((b)obj).b == b;
        } else
        {
            return a(obj);
        }
    }

    public final int hashCode()
    {
        return (int)(b ^ b >>> 32);
    }

    public final String toString()
    {
        long l = b;
        return (new StringBuilder(27)).append("[hash:").append(l).append("]").toString();
    }

    (long l)
    {
        b = l;
    }
}
