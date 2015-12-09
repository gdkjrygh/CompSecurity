// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            ik, hc, lt, jf

public class c extends ik
{

    private final jf.b a;

    public c(int i, String s, jf.b b, jf.a a1)
    {
        super(i, s, a1);
        a = b;
    }

    public c(String s, jf.b b, jf.a a1)
    {
        this(0, s, b, a1);
    }

    protected jf a(hc hc1)
    {
        String s;
        try
        {
            s = new String(hc1.b, lt.a(hc1.c));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(hc1.b);
        }
        return jf.a(s, lt.a(hc1));
    }

    protected void a(Object obj)
    {
        a((String)obj);
    }

    protected void a(String s)
    {
        a.a(s);
    }
}
