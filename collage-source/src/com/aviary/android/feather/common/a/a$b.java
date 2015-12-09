// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.common.a;

import android.util.Log;

// Referenced classes of package com.aviary.android.feather.common.a:
//            a

static class <init> extends <init>
{

    public void a(String s)
    {
        Log.d(a, s);
    }

    public transient void a(String s, Object aobj[])
    {
        Log.v(a, String.format(s, aobj));
    }

    public void b(String s)
    {
        Log.i(a, s);
    }

    public transient void b(String s, Object aobj[])
    {
        Log.d(a, String.format(s, aobj));
    }

    public void c(String s)
    {
        Log.w(a, s);
    }

    public transient void c(String s, Object aobj[])
    {
        Log.i(a, String.format(s, aobj));
    }

    public void d(String s)
    {
        Log.e(a, s);
    }

    public transient void d(String s, Object aobj[])
    {
        Log.w(a, String.format(s, aobj));
    }

    public transient void e(String s, Object aobj[])
    {
        Log.e(a, String.format(s, aobj));
    }

    public (String s)
    {
        super(s);
    }
}
