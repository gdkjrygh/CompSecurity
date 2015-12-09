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
    private static final String XQ;
    private static final String XR;
    private static final String XS;
    private static final String XT;

    public ac()
    {
        super(ID, new String[] {
            XQ
        });
    }

    public boolean jX()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a x(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(XQ);
        if (obj == null || obj == dh.lT())
        {
            return dh.lT();
        }
        String s1 = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(XS);
        String s;
        byte byte0;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        obj = (com.google.android.gms.internal.d.a)map.get(XT);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(XR);
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
            map = j.bm(s1);
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
                bh.w((new StringBuilder()).append("Encode: unknown input format: ").append(s).toString());
                map = dh.lT();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                bh.w("Encode: invalid input:");
                return dh.lT();
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
        bh.w((new StringBuilder()).append("Encode: unknown output format: ").append(((String) (obj))).toString());
        return dh.lT();
        if (true) goto _L8; else goto _L7
_L7:
    }

    static 
    {
        ID = a.Y.toString();
        XQ = b.bi.toString();
        XR = b.di.toString();
        XS = b.cH.toString();
        XT = b.dq.toString();
    }
}
