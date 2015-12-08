// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.UUID;

public final class bar
{

    public final String a;
    public final UUID b;
    public final byte c[];

    public bar(String s, UUID uuid, byte abyte0[])
    {
        a = (String)bds.a(s);
        b = uuid;
        c = abyte0;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof bar)
        {
            if (obj == this)
            {
                return true;
            }
            obj = (bar)obj;
            if (a.equals(((bar) (obj)).a) && bej.a(b, ((bar) (obj)).b) && Arrays.equals(c, ((bar) (obj)).c))
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        int j = a.hashCode() + 37;
        int i = j;
        if (b != null)
        {
            i = j * 37 + b.hashCode();
        }
        j = i;
        if (c != null)
        {
            j = i * 37 + Arrays.hashCode(c);
        }
        return j;
    }
}
