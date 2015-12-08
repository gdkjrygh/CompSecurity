// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class eth
{

    public int a;

    private eth()
    {
        a = -1;
    }

    eth(byte byte0)
    {
        this();
    }

    eth(eth eth1)
    {
        a = eth1.a;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (eth)obj;
            if (a != ((eth) (obj)).a)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return a;
    }
}
