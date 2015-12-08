// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters.impl;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;

public class EffectFilter extends NativeFilter
{

    public EffectFilter()
    {
        super(new String[] {
            "effects"
        });
        a(a);
    }

    public final void a(String s)
    {
        b.a(0).a("filename", s);
    }
}
