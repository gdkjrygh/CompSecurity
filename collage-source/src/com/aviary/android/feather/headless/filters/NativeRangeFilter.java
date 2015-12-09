// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.filters;

import com.aviary.android.feather.headless.moa.b;
import com.aviary.android.feather.headless.moa.d;
import com.aviary.android.feather.headless.moa.f;

// Referenced classes of package com.aviary.android.feather.headless.filters:
//            NativeFilter, INativeRangeFilter

public class NativeRangeFilter extends NativeFilter
    implements INativeRangeFilter
{

    protected String d;
    protected f e;

    public NativeRangeFilter(String s, String s1)
    {
        super(s);
        e = new f(0.0F);
        d = s1;
    }

    public void a(Float float1)
    {
        b.a(0).a(d, new f(float1.floatValue()));
    }

    public f b()
    {
        return (f)b.a(0).a(d, e);
    }
}
