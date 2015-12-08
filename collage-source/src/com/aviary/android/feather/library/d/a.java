// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.d;

import com.aviary.android.feather.headless.moa.d;
import java.util.List;

// Referenced classes of package com.aviary.android.feather.library.d:
//            b, c

public class a
{

    d a;
    final b b;

    public a(String s, int i)
    {
        b = new b(s, i);
    }

    public void a(d d1)
    {
        a = d1;
    }

    public void a(c c1)
    {
        b.a(c1);
    }

    public boolean a()
    {
        return a != null && a.size() > 0;
    }

    public b b()
    {
        return b;
    }

    public void b(c c1)
    {
        b.b(c1);
    }

    public String c()
    {
        return b.a();
    }

    public int d()
    {
        return b.b();
    }

    public d e()
    {
        return a;
    }

    public List f()
    {
        return b.c();
    }

    public void g()
    {
        if (a != null)
        {
            a.clear();
        }
        b.d();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("EditToolResultVO{ ");
        if (a())
        {
            stringbuilder.append((new StringBuilder()).append("toolId:").append(c()).toString());
            stringbuilder.append((new StringBuilder()).append(", toolVersion:").append(d()).toString());
            stringbuilder.append((new StringBuilder()).append(", actions:").append(a.size()).toString());
            stringbuilder.append((new StringBuilder()).append(", edit:").append(f().toString()).toString());
        } else
        {
            stringbuilder.append("INVALID");
        }
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }
}
