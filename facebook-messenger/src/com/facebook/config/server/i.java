// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.config.server;

import com.facebook.common.v.a;

// Referenced classes of package com.facebook.config.server:
//            h

public class i extends h
{

    private final a a;
    private final String b;
    private final String c;

    i(com.facebook.http.c.i j, a a1, String s)
    {
        super(j);
        a = a1;
        b = s;
        c = (new StringBuilder()).append(b).append(" FBBK/1").toString();
    }

    public String e()
    {
        if (a.a())
        {
            return c;
        } else
        {
            return b;
        }
    }
}
