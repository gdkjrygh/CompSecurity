// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.e;
import com.aviary.android.feather.headless.moa.k;

public class TextFilter extends NativeFilter
{

    TextFilter()
    {
        super(new String[] {
            "addtext"
        });
    }

    public void a(double d1)
    {
        b.a(0).a("textsize", d1);
    }

    public void a(double d1, double d2)
    {
        b.a(0).a("topleft", new k(d2, d1));
    }

    public void a(float f)
    {
        b.a(0).a("rotation", f);
    }

    public void a(CharSequence charsequence)
    {
        b.a(0).a("text", charsequence);
    }

    public void b(double d1, double d2)
    {
        b.a(0).a("bottomright", new k(d2, d1));
    }

    public void b(int i)
    {
        b.a(0).a("fillcolor", new e(Integer.valueOf(i)));
    }

    public void c(int i)
    {
        b.a(0).a("outlinecolor", new e(Integer.valueOf(i)));
    }
}
