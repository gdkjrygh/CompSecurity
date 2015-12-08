// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class cic
{

    private int a;
    private boolean b;

    public cic(int i)
    {
        a = i;
        b = true;
    }

    public cic(String s)
    {
        a = s.hashCode();
        b = false;
    }

    public final boolean equals(Object obj)
    {
        if (obj instanceof cic)
        {
            if (a == ((cic) (obj = (cic)obj)).a && b == ((cic) (obj)).b)
            {
                return true;
            }
        }
        return false;
    }

    public final int hashCode()
    {
        return a;
    }
}
