// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


public final class gei
    implements ds
{

    public final int a;

    gei(int i)
    {
        a = i;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof gei)
        {
            obj = (gei)obj;
            flag = flag1;
            if (a == ((gei) (obj)).a)
            {
                flag = true;
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return a + 527;
    }
}
