// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, j, bh

class ac extends aj
{

    private static final String ID;
    private static final String afA;
    private static final String afB;
    private static final String afy;
    private static final String afz;

    public ac()
    {
        super(ID, new String[] {
            afy
        });
    }

    public boolean lh()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(afy);
        if (obj == null || obj == dh.nd())
        {
            return dh.nd();
        }
        String s1 = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(afA);
        String s;
        byte byte0;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        obj = (com.google.android.gms.internal.d.a)map.get(afB);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(afz);
        if (map != null && dh.n(map).booleanValue())
        {
            byte0 = 3;
        } else
        {
            byte0 = 2;
        }
        if (!"text".equals(s)) goto _L2; else goto _L1
_L1:
        map = s1.getBytes();
_L8:
        if (!"base16".equals(obj)) goto _L4; else goto _L3
_L3:
        map = j.d(map);
_L6:
        return dh.r(map);
_L2:
        if ("base16".equals(s))
        {
            map = j.bE(s1);
            continue; /* Loop/switch isn't completed */
        }
        if ("base64".equals(s))
        {
            map = Base64.decode(s1, byte0);
            continue; /* Loop/switch isn't completed */
        }
        if ("base64url".equals(s))
        {
            map = Base64.decode(s1, byte0 | 8);
            continue; /* Loop/switch isn't completed */
        } else
        {
            try
            {
                bh.A((new StringBuilder()).append("Encode: unknown input format: ").append(s).toString());
                map = dh.nd();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                bh.A("Encode: invalid input:");
                return dh.nd();
            }
            return map;
        }
_L4:
        if ("base64".equals(obj))
        {
            map = Base64.encodeToString(map, byte0);
            continue; /* Loop/switch isn't completed */
        }
        if (!"base64url".equals(obj))
        {
            break; /* Loop/switch isn't completed */
        }
        map = Base64.encodeToString(map, byte0 | 8);
        if (true) goto _L6; else goto _L5
_L5:
        bh.A((new StringBuilder()).append("Encode: unknown output format: ").append(((String) (obj))).toString());
        return dh.nd();
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        ID = a.Y.toString();
        afy = b.bi.toString();
        afz = b.di.toString();
        afA = b.cH.toString();
        afB = b.dq.toString();
    }
}
