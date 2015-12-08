// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            ia, gs, lk, iw

public class c extends ia
{

    private final iw.b a;

    private c(String s, iw.b b, iw.a a1)
    {
        super(s, a1);
        a = b;
    }

    public c(String s, iw.b b, iw.a a1, byte byte0)
    {
        this(s, b, a1);
    }

    protected final iw a(gs gs1)
    {
        String s;
        try
        {
            s = new String(gs1.b, lk.a(gs1.c, "ISO-8859-1"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(gs1.b);
        }
        return iw.a(s, lk.a(gs1));
    }

    protected final void a(Object obj)
    {
        obj = (String)obj;
        a.a(obj);
    }
}
