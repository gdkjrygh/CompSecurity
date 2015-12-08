// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a.d;

import a.a.b;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package a.a.d:
//            e

public class a
    implements e
{

    public a()
    {
    }

    public String a(String s, a.a.c.b b1, a.a.c.a a1)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("OAuth ");
        if (a1.containsKey("realm"))
        {
            stringbuilder.append(a1.a("realm"));
            stringbuilder.append(", ");
        }
        a1 = a1.a();
        a1.a("oauth_signature", s, true);
        s = a1.keySet().iterator();
        do
        {
            if (!s.hasNext())
            {
                break;
            }
            stringbuilder.append(a1.a((String)s.next()));
            if (s.hasNext())
            {
                stringbuilder.append(", ");
            }
        } while (true);
        s = stringbuilder.toString();
        b.a("Auth Header", s);
        b1.a("Authorization", s);
        return s;
    }
}
