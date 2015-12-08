// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

final class krx
{

    public final boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof krx))
            {
                return false;
            }
            if (!Arrays.equals(null, null))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return Arrays.hashCode(null) + 16337;
    }
}
