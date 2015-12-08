// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.f.n;
import kik.a.h.i;

// Referenced classes of package kik.a.f.e:
//            g

public class d
    implements kik.a.f.e.g
{

    public d()
    {
    }

    public final g a(n n1)
    {
        if (!n1.a("friend-attribution")) goto _L2; else goto _L1
_L1:
        String s;
        String s2;
        String s3;
        s3 = null;
        String s1 = null;
        s2 = null;
        s = null;
        while (!n1.b("friend-attribution")) 
        {
            String s4;
            String s5;
            String s6;
            if (n1.a("context"))
            {
                s4 = n1.getAttributeValue(null, "type");
                s5 = n1.getAttributeValue(null, "reply");
                s6 = n1.getAttributeValue(null, "referrer");
            } else
            {
                s6 = s1;
                s5 = s2;
                s4 = s;
                if (n1.a("body"))
                {
                    String s7 = n1.nextText();
                    s3 = s7;
                    s6 = s1;
                    s5 = s2;
                    s4 = s;
                    if (!i.a(s7))
                    {
                        s3 = s7.replaceAll("^\"|\"$", "");
                        s6 = s1;
                        s5 = s2;
                        s4 = s;
                    }
                }
            }
            n1.next();
            s1 = s6;
            s2 = s5;
            s = s4;
        }
        n1 = s1;
_L4:
        if (!i.a(s) && !i.a(n1) && !i.a(s2))
        {
            return new kik.a.d.a.d(s, n1, Boolean.valueOf(s2).booleanValue(), s3, System.currentTimeMillis());
        } else
        {
            return null;
        }
_L2:
        s3 = null;
        n1 = null;
        s2 = null;
        s = null;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
