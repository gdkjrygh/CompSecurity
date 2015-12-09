// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.util;

import org.json.JSONObject;
import p.cw.c;

// Referenced classes of package com.pandora.radio.util:
//            n

public static class nit> extends n
{

    public boolean a()
    {
        String s = c.z.B();
        int i = 0;
        do
        {
label0:
            {
                if (i < s.length())
                {
                    char c1 = s.charAt(i);
                    if (c1 == '.' || c1 >= '0' && c1 <= '9')
                    {
                        break label0;
                    }
                    s = s.substring(0, i);
                }
                return a(s);
            }
            i++;
        } while (true);
    }

    public (JSONObject jsonobject)
    {
        super(jsonobject);
    }
}
