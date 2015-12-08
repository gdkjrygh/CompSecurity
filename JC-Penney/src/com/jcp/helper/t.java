// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.helper;

import com.jcp.util.ae;
import java.io.IOException;

// Referenced classes of package com.jcp.helper:
//            s

class t
    implements Runnable
{

    final s a;
    private String b;

    public t(s s1, String s2)
    {
        a = s1;
        super();
        b = s2;
    }

    public void run()
    {
        try
        {
            a.c(b);
            return;
        }
        catch (Object obj)
        {
            if (((IOException) (obj)).getMessage() == null)
            {
                obj = "Exception while downloadDataSubCategories";
            } else
            {
                obj = ((IOException) (obj)).getMessage();
            }
        }
        ae.a(s.b(), ((String) (obj)));
    }
}
