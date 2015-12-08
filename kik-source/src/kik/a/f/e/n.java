// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.d.a.l;

// Referenced classes of package kik.a.f.e:
//            g

public class n
    implements kik.a.f.e.g
{

    public n()
    {
    }

    public final g a(kik.a.f.n n1)
    {
        Object obj = null;
        if (n1.a("status"))
        {
            obj = n1.getAttributeValue(null, "jid");
            String s = n1.getAttributeValue(null, "special-visibility");
            boolean flag;
            if (s != null && "true".equals(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = new l(n1.nextText(), ((String) (obj)), flag);
        }
        return ((g) (obj));
    }
}
