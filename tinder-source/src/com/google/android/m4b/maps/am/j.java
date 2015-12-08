// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.am;

import com.google.android.m4b.maps.a.h;
import com.google.android.m4b.maps.a.k;
import com.google.android.m4b.maps.a.m;
import java.io.UnsupportedEncodingException;

// Referenced classes of package com.google.android.m4b.maps.am:
//            d

public class j extends k
{

    private final com.google.android.m4b.maps.a.m.b l;

    private j(String s, com.google.android.m4b.maps.a.m.b b, com.google.android.m4b.maps.a.m.a a1)
    {
        super(0, s, a1);
        l = b;
    }

    public j(String s, com.google.android.m4b.maps.a.m.b b, com.google.android.m4b.maps.a.m.a a1, byte byte0)
    {
        this(s, b, a1);
    }

    protected final m a(h h1)
    {
        String s;
        try
        {
            s = new String(h1.b, d.a(h1.c));
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            unsupportedencodingexception = new String(h1.b);
        }
        return m.a(s, d.a(h1));
    }

    protected final void a(Object obj)
    {
        obj = (String)obj;
        l.a(obj);
    }
}
