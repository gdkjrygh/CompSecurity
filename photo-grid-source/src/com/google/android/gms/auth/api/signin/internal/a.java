// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.auth.api.signin.internal;


public final class a
{

    static int a = 31;
    private int b;

    public a()
    {
        b = 1;
    }

    public final int a()
    {
        return b;
    }

    public final a a(Object obj)
    {
        int j = a;
        int k = b;
        int i;
        if (obj == null)
        {
            i = 0;
        } else
        {
            i = obj.hashCode();
        }
        b = i + k * j;
        return this;
    }

    public final a a(boolean flag)
    {
        int j = a;
        int k = b;
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        b = i + k * j;
        return this;
    }

}
