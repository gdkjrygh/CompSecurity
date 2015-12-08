// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, di, j, bh

class ac extends aj
{

    private static final String ID;
    private static final String arp;
    private static final String arq;
    private static final String arr;
    private static final String ars;

    public ac()
    {
        super(ID, new String[] {
            arp
        });
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(arp);
        if (obj == null || obj == di.rb())
        {
            return di.rb();
        }
        String s1 = di.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(arr);
        String s;
        byte byte0;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = di.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        obj = (com.google.android.gms.internal.d.a)map.get(ars);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = di.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(arq);
        if (map != null && di.n(map).booleanValue())
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
        return di.u(map);
_L2:
        if ("base16".equals(s))
        {
            map = j.co(s1);
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
                bh.T((new StringBuilder()).append("Encode: unknown input format: ").append(s).toString());
                map = di.rb();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                bh.T("Encode: invalid input:");
                return di.rb();
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
        bh.T((new StringBuilder()).append("Encode: unknown output format: ").append(((String) (obj))).toString());
        return di.rb();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.aa.toString();
        arp = b.bw.toString();
        arq = b.dH.toString();
        arr = b.de.toString();
        ars = b.dP.toString();
    }
}
