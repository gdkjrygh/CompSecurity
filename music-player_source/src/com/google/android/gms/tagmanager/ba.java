// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.ej;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ad, ay, t

final class ba
{

    private static ad a(ad ad1)
    {
        ad ad2;
        try
        {
            ad2 = new ad(ay.a(URLEncoder.encode(ay.a((ej)ad1.a()), "UTF-8").replaceAll("\\+", "%20")), ad1.b());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            t.a("Escape URI: unsupported encoding", unsupportedencodingexception);
            return ad1;
        }
        return ad2;
    }

    static transient ad a(ad ad1, int ai[])
    {
        int i;
        int j;
        j = ai.length;
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k = ai[i];
        if (ay.c((ej)ad1.a()) instanceof String) goto _L4; else goto _L3
_L3:
        t.a("Escaping can only be applied to strings.");
_L7:
        i++;
          goto _L5
_L4:
        switch (k)
        {
        default:
            t.a((new StringBuilder("Unsupported Value Escaping: ")).append(k).toString());
            break;

        case 12: // '\f'
            ad1 = a(ad1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return ad1;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
