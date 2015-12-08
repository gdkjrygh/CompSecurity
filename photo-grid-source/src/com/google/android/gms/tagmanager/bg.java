// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.g;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

// Referenced classes of package com.google.android.gms.tagmanager:
//            ai, be, y

final class bg
{

    private static ai a(ai ai1)
    {
        ai ai2;
        try
        {
            ai2 = new ai(be.a(URLEncoder.encode(be.a((g)ai1.a()), "UTF-8").replaceAll("\\+", "%20")), ai1.b());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            y.a("Escape URI: unsupported encoding", unsupportedencodingexception);
            return ai1;
        }
        return ai2;
    }

    static transient ai a(ai ai1, int ai2[])
    {
        int i;
        int j;
        j = ai2.length;
        i = 0;
_L5:
        if (i >= j) goto _L2; else goto _L1
_L1:
        int k = ai2[i];
        if (be.c((g)ai1.a()) instanceof String) goto _L4; else goto _L3
_L3:
        y.a("Escaping can only be applied to strings.");
_L7:
        i++;
          goto _L5
_L4:
        switch (k)
        {
        default:
            y.a((new StringBuilder("Unsupported Value Escaping: ")).append(k).toString());
            break;

        case 12: // '\f'
            ai1 = a(ai1);
            break;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        return ai1;
        if (true) goto _L7; else goto _L6
_L6:
    }
}
