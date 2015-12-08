// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import java.util.Vector;
import kik.a.d.a.g;
import kik.a.f.n;

// Referenced classes of package kik.a.f.e:
//            g

public class e
    implements kik.a.f.e.g
{

    public e()
    {
    }

    public final g a(n n1)
    {
        Vector vector = new Vector();
        Vector vector1 = new Vector();
        n1.a(null, "g");
        String s4 = n1.getAttributeValue(null, "jid");
        boolean flag = "1".equals(n1.getAttributeValue(null, "ack-needed"));
        String s = null;
        String s1 = null;
        while (!n1.b("g")) 
        {
            String s2;
            String s3;
            if (n1.a("n"))
            {
                s2 = n1.nextText();
                s3 = s;
            } else
            if (n1.a("c"))
            {
                s3 = n1.nextText();
                vector.addElement(s3);
                s2 = s1;
            } else
            if (n1.a("m"))
            {
                vector.addElement(n1.nextText());
                s2 = s1;
                s3 = s;
            } else
            {
                s2 = s1;
                s3 = s;
                if (n1.a("l"))
                {
                    vector1.addElement(n1.nextText());
                    s2 = s1;
                    s3 = s;
                }
            }
            n1.next();
            s1 = s2;
            s = s3;
        }
        if (s4 == null)
        {
            return null;
        } else
        {
            return new kik.a.d.a.e(vector, vector1, s1, s, s4, flag);
        }
    }
}
