// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import android.text.TextUtils;
import java.util.Arrays;

// Referenced classes of package com.flurry.sdk:
//            jo, lp, kc

public class ja
{

    private static String a = com/flurry/sdk/ja.getName();

    public ja()
    {
    }

    public static String a(String s)
    {
        String s2 = (new StringBuilder("a=")).append(jo.a().d()).toString();
        String s1 = s2;
        if (!TextUtils.isEmpty(s))
        {
            s1 = String.format("%s&%s", new Object[] {
                s2, (new StringBuilder("cid=")).append(b(s)).toString()
            });
        }
        return s1;
    }

    private static String b(String s)
    {
        if (s == null || s.trim().length() <= 0) goto _L2; else goto _L1
_L1:
        s = lp.f(s);
        if (s == null) goto _L4; else goto _L3
_L3:
        int i = s.length;
        if (i != 20) goto _L4; else goto _L5
_L5:
        kc.a(5, a, (new StringBuilder("syndication hashedId is:")).append(new String(s)).toString());
_L8:
        return lp.a(s);
_L4:
        kc.a(6, a, (new StringBuilder("sha1 is not 20 bytes long: ")).append(Arrays.toString(s)).toString());
        s = null;
        continue; /* Loop/switch isn't completed */
        s;
        s = null;
_L6:
        kc.a(6, a, "Exception in getHashedSyndicationIdString()");
        continue; /* Loop/switch isn't completed */
        Exception exception;
        exception;
        if (true) goto _L6; else goto _L2
_L2:
        s = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

}
