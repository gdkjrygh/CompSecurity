// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jirbo.adcolony;

import java.io.File;
import java.io.IOException;

// Referenced classes of package com.jirbo.adcolony:
//            a, d, ADCStorage, y, 
//            s, x

class f
{

    static byte a[] = new byte[1024];
    String b;

    f(String s1)
    {
        b = (new StringBuilder()).append(a.l.f.d).append(s1).toString();
    }

    y a()
    {
        return new y(b);
    }

    void a(String s1)
    {
        y y1 = a();
        int j = s1.length();
        for (int i = 0; i < j; i++)
        {
            y1.a(s1.charAt(i));
        }

        y1.b();
    }

    s b()
    {
        s s1;
        try
        {
            s1 = new s(new x(b));
        }
        catch (IOException ioexception)
        {
            return null;
        }
        return s1;
    }

    void c()
    {
        (new File(b)).delete();
    }

}
