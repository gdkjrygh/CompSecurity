// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.net.URI;

final class aqf
{

    URI a;
    Object b;

    aqf(URI uri, Object obj)
    {
        a = uri;
        b = obj;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj != null)
        {
            flag = flag1;
            if (obj instanceof aqf)
            {
                obj = (aqf)obj;
                flag = flag1;
                if (((aqf) (obj)).a == a)
                {
                    flag = flag1;
                    if (((aqf) (obj)).b == b)
                    {
                        flag = true;
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (a.hashCode() + 1073) * 37 + b.hashCode();
    }
}
