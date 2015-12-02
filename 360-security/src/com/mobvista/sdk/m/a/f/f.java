// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mobvista.sdk.m.a.f;


// Referenced classes of package com.mobvista.sdk.m.a.f:
//            e

final class f
{

    private StringBuilder a;

    private f()
    {
        a = new StringBuilder();
    }

    f(byte byte0)
    {
        this();
    }

    public final f a(String s)
    {
        a.append(s);
        return this;
    }

    public final f a(String s, Object obj)
    {
        obj = e.c(String.valueOf(obj));
        a.append(s).append('=').append(((String) (obj))).append('&');
        return this;
    }

    public final String toString()
    {
        if (a.charAt(a.length() - 1) == '&')
        {
            a.deleteCharAt(a.length() - 1);
        }
        return a.toString();
    }
}
