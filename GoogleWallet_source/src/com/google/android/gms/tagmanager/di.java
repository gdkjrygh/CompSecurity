// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            bx, de, bg

final class di
{

    private static bx a(bx bx1)
    {
        bx bx2;
        try
        {
            bx2 = new bx(de.A(eg(de.j((com.google.android.gms.internal.d.a)bx1.getObject()))), bx1.tj());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            bg.e("Escape URI: unsupported encoding", unsupportedencodingexception);
            return bx1;
        }
        return bx2;
    }

    private static bx a(bx bx1, int i)
    {
        if (!q((com.google.android.gms.internal.d.a)bx1.getObject()))
        {
            bg.e("Escaping can only be applied to strings.");
            return bx1;
        }
        switch (i)
        {
        default:
            bg.e((new StringBuilder("Unsupported Value Escaping: ")).append(i).toString());
            return bx1;

        case 12: // '\f'
            return a(bx1);
        }
    }

    static transient bx a(bx bx1, int ai[])
    {
        int j = ai.length;
        for (int i = 0; i < j; i++)
        {
            bx1 = a(bx1, ai[i]);
        }

        return bx1;
    }

    private static String eg(String s)
        throws UnsupportedEncodingException
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }

    private static boolean q(com.google.android.gms.internal.d.a a1)
    {
        return de.o(a1) instanceof String;
    }
}
