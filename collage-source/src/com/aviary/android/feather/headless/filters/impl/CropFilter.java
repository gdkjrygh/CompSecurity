// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters.impl;

import com.aviary.android.feather.headless.filters.NativeFilter;
import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.k;

public class CropFilter extends NativeFilter
{

    public CropFilter()
    {
        super(new String[] {
            "crop"
        });
    }

    public void a(k k)
    {
        b.a(0).a("upperleftpoint", k);
    }

    public void b(k k)
    {
        b.a(0).a("size", k);
    }

    public void c(k k)
    {
        b.a(0).a("previewsize", k);
    }
}
