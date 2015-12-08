// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;

public final class jjq
{

    public final int a[];
    private final int b = 2;

    private jjq(int ai[], int i)
    {
        a = Arrays.copyOf(ai, 1);
        Arrays.sort(a);
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof jjq))
            {
                return false;
            }
            obj = (jjq)obj;
            if (!Arrays.equals(a, ((jjq) (obj)).a) || b != ((jjq) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return b + Arrays.hashCode(a) * 31;
    }

    public final String toString()
    {
        int i = b;
        String s = String.valueOf(Arrays.toString(a));
        return (new StringBuilder(String.valueOf(s).length() + 67)).append("AudioCapabilities[maxChannelCount=").append(i).append(", supportedEncodings=").append(s).append("]").toString();
    }

    static 
    {
        new jjq(new int[] {
            2
        }, 2);
    }
}
