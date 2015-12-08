// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ba, cl, ak

final class cp
{

    private static ba a(ba ba1)
    {
        ba ba2;
        try
        {
            ba2 = new ba(cl.a(a(cl.a((com.google.android.gms.internal.h.a)ba1.a()))), ba1.b());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            ak.a("Escape URI: unsupported encoding", unsupportedencodingexception);
            return ba1;
        }
        return ba2;
    }

    static transient ba a(ba ba1, int ai[])
    {
        int i;
        int j;
        j = ai.length;
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k = ai[i];
        if (cl.e((com.google.android.gms.internal.h.a)ba1.a()) instanceof String) goto _L4; else goto _L3
_L3:
        ak.a("Escaping can only be applied to strings.");
_L7:
        i++;
          goto _L5
_L4:
        switch (k)
        {
        default:
            ak.a((new StringBuilder("Unsupported Value Escaping: ")).append(k).toString());
            break;

        case 12: // '\f'
            ba1 = a(ba1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return ba1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    static String a(String s)
        throws UnsupportedEncodingException
    {
        return URLEncoder.encode(s, "UTF-8").replaceAll("\\+", "%20");
    }
}
