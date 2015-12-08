// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;

public class BorderFilter extends NativeFilter
{

    BorderFilter()
    {
        super(new String[] {
            "imageborders"
        });
    }

    public void a(double d1)
    {
        b.a(0).a("bordersize", d1);
    }

    public void a(CharSequence charsequence)
    {
        b.a(0).a("source", charsequence);
    }

    public void a(boolean flag)
    {
        b.a(0).a("large", flag);
    }

    public void b(CharSequence charsequence)
    {
        b.a(0).a("bordername", charsequence);
    }
}
