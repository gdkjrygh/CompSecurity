// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cm.kinfoc;

import com.cm.kinfoc.a.e;
import java.io.File;
import java.io.IOException;

// Referenced classes of package com.cm.kinfoc:
//            ah

public final class n
{

    boolean a;
    private final String b = "http://helpgrid1.ksmobile.com/c/";
    private ah c;

    public n()
    {
        a = false;
        try
        {
            c = new ah((new StringBuilder()).append(e.a().c().getAbsolutePath()).append(File.separatorChar).append("kctrl.dat").toString());
            a = true;
            return;
        }
        catch (IOException ioexception)
        {
            a = false;
            ioexception.printStackTrace();
            return;
        }
    }

    public final int a()
    {
        int i = 0;
        if (a)
        {
            i = c.a("common", "product", 0);
        }
        return i;
    }

    public final int a(String s)
    {
        int i = 10000;
        if (a)
        {
            i = c.a(s, "probability", 10000);
        }
        return i;
    }

    public final String a(int i)
    {
        if (a)
        {
            String s = (new StringBuilder("server")).append(i).toString();
            return c.a("common", s, "http://helpgrid1.ksmobile.com/c/");
        } else
        {
            return "http://helpgrid1.ksmobile.com/c/";
        }
    }

    public final int b()
    {
        int i = 0;
        if (a)
        {
            i = c.a("common", "validity", 0);
        }
        return i;
    }

    public final int b(String s)
    {
        int i = 10000;
        if (a)
        {
            i = c.a(s, "userprobability", 10000);
        }
        return i;
    }
}
