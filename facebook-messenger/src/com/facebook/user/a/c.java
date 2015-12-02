// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.user.a;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

// Referenced classes of package com.facebook.user.a:
//            d, e, f, a, 
//            b

class c extends d
{

    final a a;

    private c(a a1)
    {
        a = a1;
        super(a1);
    }

    c(a a1, b b)
    {
        this(a1);
    }

    public Iterator a(String s)
    {
        HashSet hashset = new HashSet();
        s = e.a().a(s);
        int i = s.size();
        StringBuilder stringbuilder = new StringBuilder();
        StringBuilder stringbuilder1 = new StringBuilder();
        StringBuilder stringbuilder2 = new StringBuilder();
        i--;
        while (i >= 0) 
        {
            f f1 = (f)s.get(i);
            if (2 == f1.a)
            {
                stringbuilder.insert(0, f1.c);
                stringbuilder1.insert(0, f1.c.charAt(0));
            } else
            if (1 == f1.a)
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.insert(0, ' ');
                }
                if (stringbuilder2.length() > 0)
                {
                    stringbuilder2.insert(0, ' ');
                }
                stringbuilder.insert(0, f1.b);
                stringbuilder1.insert(0, f1.b.charAt(0));
            }
            stringbuilder2.insert(0, f1.b);
            hashset.add(stringbuilder2.toString());
            hashset.add(stringbuilder.toString());
            hashset.add(stringbuilder1.toString());
            i--;
        }
        return hashset.iterator();
    }
}
