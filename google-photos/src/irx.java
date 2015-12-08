// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class irx
{

    public final byte a[];

    public irx(byte abyte0[])
    {
        a = abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof irx)
        {
            obj = (irx)obj;
            return Arrays.equals(a, ((irx) (obj)).a);
        } else
        {
            return false;
        }
    }

    public final int hashCode()
    {
        return Arrays.hashCode(a);
    }
}
