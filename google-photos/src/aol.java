// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;

final class aol
    implements ane
{

    private final ane b;
    private final ane c;

    public aol(ane ane1, ane ane2)
    {
        b = ane1;
        c = ane2;
    }

    public final void a(MessageDigest messagedigest)
    {
        b.a(messagedigest);
        c.a(messagedigest);
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof aol)
        {
            obj = (aol)obj;
            flag = flag1;
            if (b.equals(((aol) (obj)).b))
            {
                flag = flag1;
                if (c.equals(((aol) (obj)).c))
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return b.hashCode() * 31 + c.hashCode();
    }

    public final String toString()
    {
        String s = String.valueOf("DataCacheKey{sourceKey=");
        String s1 = String.valueOf(b);
        String s2 = String.valueOf(c);
        return (new StringBuilder(String.valueOf(s).length() + 13 + String.valueOf(s1).length() + String.valueOf(s2).length())).append(s).append(s1).append(", signature=").append(s2).append("}").toString();
    }
}
