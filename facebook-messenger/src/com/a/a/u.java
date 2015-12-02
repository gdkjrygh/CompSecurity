// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.View;
import com.a.b.b;
import com.a.c.a.a;

final class u extends b
{

    u(String s)
    {
        super(s);
    }

    public Integer a(View view)
    {
        return Integer.valueOf(com.a.c.a.a.a(view).getScrollX());
    }

    public volatile Object a(Object obj)
    {
        return a((View)obj);
    }
}
