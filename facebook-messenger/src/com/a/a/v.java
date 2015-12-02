// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.a.a;

import android.view.View;
import com.a.b.b;
import com.a.c.a.a;

final class v extends b
{

    v(String s)
    {
        super(s);
    }

    public Integer a(View view)
    {
        return Integer.valueOf(com.a.c.a.a.a(view).getScrollY());
    }

    public volatile Object a(Object obj)
    {
        return a((View)obj);
    }
}
