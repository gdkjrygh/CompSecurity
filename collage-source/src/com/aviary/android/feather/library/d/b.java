// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.d;

import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.library.d:
//            c

public class b
{

    final String a;
    final int b;
    final List c = new ArrayList(0);

    public b(String s, int i)
    {
        a = s;
        b = i;
    }

    public String a()
    {
        return a;
    }

    public void a(c c1)
    {
        c.clear();
        if (c1 != null)
        {
            c.add(c1);
        }
    }

    public int b()
    {
        return b;
    }

    public void b(c c1)
    {
        if (c1 != null)
        {
            c.add(c1);
        }
    }

    public List c()
    {
        return c;
    }

    public void d()
    {
        c.clear();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("EditVO{ ");
        stringbuilder.append((new StringBuilder()).append("toolId:").append(a).toString());
        stringbuilder.append((new StringBuilder()).append(", toolVersion:").append(b).toString());
        stringbuilder.append((new StringBuilder()).append(", edit:").append(c.toString()).toString());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
