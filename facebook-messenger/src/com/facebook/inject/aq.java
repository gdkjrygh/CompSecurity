// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.inject;

import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.facebook.inject:
//            al, an, ao

public class aq extends RuntimeException
{

    public aq()
    {
        super(a(null));
    }

    public aq(String s)
    {
        super(a(s));
    }

    public aq(Throwable throwable)
    {
        super(a(null), throwable);
    }

    private static String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (s != null)
        {
            stringbuilder.append(s);
        } else
        {
            stringbuilder.append("Failure to provision.");
        }
        stringbuilder.append("\n");
        s = hq.a(al.b()).iterator();
        while (s.hasNext()) 
        {
            an an1 = (an)s.next();
            if (an1.a == ao.INSTANCE_GET)
            {
                stringbuilder.append(" while trying to get instance of ");
            } else
            {
                stringbuilder.append(" while trying to get provider of ");
            }
            stringbuilder.append(an1.b).append("\n");
        }
        return stringbuilder.toString();
    }
}
