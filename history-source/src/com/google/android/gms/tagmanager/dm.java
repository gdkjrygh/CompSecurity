// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bz, di, bh

class dm
{

    private static bz a(bz bz1)
    {
        bz bz2;
        try
        {
            bz2 = new bz(di.u(dg(di.j((com.google.android.gms.internal.d.a)bz1.getObject()))), bz1.pX());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            bh.b("Escape URI: unsupported encoding", unsupportedencodingexception);
            return bz1;
        }
        return bz2;
    }

    private static bz a(bz bz1, int i)
    {
        if (!q((com.google.android.gms.internal.d.a)bz1.getObject()))
        {
            bh.T("Escaping can only be applied to strings.");
            return bz1;
        }
        switch (i)
        {
        default:
            bh.T((new StringBuilder()).append("Unsupported Value Escaping: ").append(i).toString());
            return bz1;

        case 12: // '\f'
            return a(bz1);
        }
    }

    static transient bz a(bz bz1, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            bz1 = a(bz1, ai[i]);
        }

        return bz1;
    }

    static String dg(String s)
        throws UnsupportedEncodingException
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean q(com.google.android.gms.internal.d.a a1)
    {
        return di.o(a1) instanceof String;
    }
}
