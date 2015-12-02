// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.View;
import com.a.b.a;

final class y extends a
{

    y(String s)
    {
        super(s);
    }

    public Float a(View view)
    {
        return Float.valueOf(com.a.c.a.a.a(view).getPivotX());
    }

    public volatile Object a(Object obj)
    {
        return a((View)obj);
    }

    public void a(View view, float f)
    {
        com.a.c.a.a.a(view).setPivotX(f);
    }

    public volatile void a(Object obj, float f)
    {
        a((View)obj, f);
    }
}
