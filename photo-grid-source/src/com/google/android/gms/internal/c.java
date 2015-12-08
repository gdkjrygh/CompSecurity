// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.gms.internal:
//            tj, pl, yn, vo, 
//            vq, vp

public class c extends tj
{

    private final vq a;

    private c(String s, vq vq1, vp vp)
    {
        super(s, vp);
        a = vq1;
    }

    public c(String s, vq vq1, vp vp, byte byte0)
    {
        this(s, vq1, vp);
    }

    protected final vo a(pl pl1)
    {
        String s;
        try
        {
            s = new String(pl1.b, yn.a(pl1.c, "ISO-8859-1"));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(pl1.b);
        }
        return vo.a(s, yn.a(pl1));
    }

    protected final void a(Object obj)
    {
        obj = (String)obj;
        a.a(obj);
    }
}
