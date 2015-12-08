// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.library.filters;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.k;

public class StickerFilter extends NativeFilter
{

    public StickerFilter(String s, String s1)
    {
        super(new String[] {
            "addsticker"
        });
        a(s);
        b(s1);
    }

    public void a(double d1)
    {
        a().a(0).a("rotation", d1);
    }

    public void a(float f, float f1)
    {
        a().a(0).a("topleft", new k(f, f1));
    }

    public void a(String s)
    {
        a().a(0).a("source", s);
    }

    public void b(float f, float f1)
    {
        a().a(0).a("bottomright", new k(f, f1));
    }

    public void b(int i, int j)
    {
        a().a(0).a("size", new k(i, j));
    }

    public void b(String s)
    {
        a().a(0).a("url", s);
    }

    public void c(float f, float f1)
    {
        a().a(0).a("center", new k(f, f1));
    }

    public void d(float f, float f1)
    {
        a().a(0).a("scale", new k(f, f1));
    }
}
