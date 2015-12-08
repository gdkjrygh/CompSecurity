// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import kik.a.d.a.g;
import kik.a.d.a.k;
import kik.a.f.n;

// Referenced classes of package kik.a.f.e:
//            g

public class m
    implements kik.a.f.e.g
{

    public m()
    {
    }

    public final g a(n n1)
    {
        k k1 = null;
        if (n1.a("scan-notification"))
        {
            n1 = n1.getAttributeValue(null, "nonce");
            int i;
            try
            {
                i = Integer.parseInt(n1);
            }
            // Misplaced declaration of an exception variable
            catch (n n1)
            {
                i = 0;
            }
            k1 = new k(i);
        }
        return k1;
    }
}
