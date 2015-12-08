// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.c;

import kik.a.f.n;

// Referenced classes of package kik.a.f.c:
//            c

public class b extends c
{

    private String j;
    private String k;
    private String l;

    public b()
    {
        super(4);
    }

    protected final void a(n n1)
    {
        if (n1.a("error"))
        {
            j = n1.getAttributeValue(null, "type");
            k = n1.getAttributeValue(null, "code");
            for (; !n1.b("error"); n1.next())
            {
                if (n1.a("text"))
                {
                    l = n1.nextText();
                }
            }

        } else
        {
            super.a(n1);
        }
    }
}
