// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;
import java.util.Collection;
import java.util.List;

public final class jg
{

    private final a a;
    private final View b;

    public jg(String s, Collection collection, int i, View view, String s1)
    {
    /* block-local class not found */
    class a {}

        a = new a(s, collection, i, s1);
        b = view;
    }

    public String a()
    {
        return a.a();
    }

    public String b()
    {
        return a.b();
    }

    public int c()
    {
        return a.c();
    }

    public List d()
    {
        return a.e();
    }

    public String[] e()
    {
        return (String[])a.e().toArray(new String[0]);
    }

    public String f()
    {
        return a.d();
    }

    public View g()
    {
        return b;
    }
}
