// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.e;

public class MemeFilter extends NativeFilter
{

    private b d;

    MemeFilter()
    {
        super(new String[] {
            "memegen"
        });
        d = b.a(0);
    }

    public void a(double d1)
    {
        d.a("textsize", d1);
    }

    public void a(String s)
    {
        d.a("fontsourcedir", s);
    }

    public void b(double d1)
    {
        d.a("paddingtop", d1);
    }

    public void b(int i)
    {
        d.a("fillcolor", new e(Integer.valueOf(i)));
    }

    public void b(String s)
    {
        d.a("toptext", s);
    }

    public void c(double d1)
    {
        d.a("paddingbottom", d1);
    }

    public void c(int i)
    {
        d.a("outlinecolor", new e(Integer.valueOf(i)));
    }

    public void c(String s)
    {
        d.a("bottomtext", s);
    }

    public void d(String s)
    {
        d.a("fontname", (new StringBuilder()).append("assets/").append(s).toString());
    }
}
