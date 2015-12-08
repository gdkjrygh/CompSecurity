// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.cg;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.google.android.m4b.maps.da.b;
import com.google.android.m4b.maps.da.d;

// Referenced classes of package com.google.android.m4b.maps.cg:
//            bl

public final class bk extends com.google.android.m4b.maps.model.internal.d.a
{

    private Resources a;

    public bk(Resources resources)
    {
        a = resources;
    }

    public final b a()
    {
        return d.a(bl.a(a));
    }

    public final b a(float f)
    {
        return d.a(new bl.b(bl.a(a), f));
    }

    public final b a(int i)
    {
        return d.a(new bl.g(i, (byte)0));
    }

    public final b a(Bitmap bitmap)
    {
        return d.a(new bl.d(bitmap, (byte)0));
    }

    public final b a(String s)
    {
        return d.a(new bl.a(s, (byte)0));
    }

    public final b b(String s)
    {
        return d.a(new bl.c(s, (byte)0));
    }

    public final b c(String s)
    {
        return d.a(new bl.f(s, (byte)0));
    }
}
