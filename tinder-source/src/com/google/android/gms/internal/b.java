// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            zzk, ci, fl, dv

public class b extends zzk
{

    private final dv.b a;

    private b(String s, dv.b b1, dv.a a1)
    {
        super(s, a1);
        a = b1;
    }

    public b(String s, dv.b b1, dv.a a1, byte byte0)
    {
        this(s, b1, a1);
    }

    protected final dv a(ci ci1)
    {
        String s;
        try
        {
            s = new String(ci1.b, fl.a(ci1.c, "ISO-8859-1"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(ci1.b);
        }
        return new dv(s, fl.a(ci1));
    }

    protected final void a(Object obj)
    {
        obj = (String)obj;
        a.a(obj);
    }
}
