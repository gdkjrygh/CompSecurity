// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Iterator;
import java.util.List;

// Referenced classes of package b.a:
//            pq, ol, kt, iv, 
//            iu, mq

public final class kh
    implements pq, Comparable
{

    final ol a;
    final kt b;

    public final int compareTo(Object obj)
    {
        obj = (kh)obj;
        return a.a(((kh) (obj)).a);
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof kh))
        {
            return false;
        } else
        {
            return a.equals(((kh)obj).a);
        }
    }

    public final String h_()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a.h_());
        stringbuilder.append(": ");
        Iterator iterator = b.a.iterator();
        boolean flag = true;
        while (iterator.hasNext()) 
        {
            iv iv1 = (iv)iterator.next();
            if (flag)
            {
                flag = false;
            } else
            {
                stringbuilder.append(", ");
            }
            stringbuilder.append(iv1.a.a.toString());
        }
        return stringbuilder.toString();
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
