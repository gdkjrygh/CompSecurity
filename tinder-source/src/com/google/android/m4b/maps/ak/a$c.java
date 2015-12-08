// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ak;


// Referenced classes of package com.google.android.m4b.maps.ak:
//            a, c

public static final class <init> extends <init>
{

    public static <init> b(String s)
    {
        s = a.a(s);
        if (!(s instanceof <init>))
        {
            break MISSING_BLOCK_LABEL_37;
        }
        s = new <init>(((<init>)s).c, ((c)s).d);
        return s;
        s;
        return null;
    }

    public final String d()
    {
        return Long.toHexString(d);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (!(obj instanceof d))
        {
            break; /* Loop/switch isn't completed */
        }
        if (d != ((d)obj).d)
        {
            return false;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (obj instanceof c)
        {
            if (d != ((c)obj).a.d)
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    public final int hashCode()
    {
        return (int)(d ^ d >>> 32);
    }

    public (long l, long l1)
    {
        super(l, l1);
    }
}
