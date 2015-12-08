// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.util.Base64;
import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, cw, ak

final class i extends o
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    public i()
    {
        super(a, new String[] {
            b
        });
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        Object obj;
        String s;
        String s1;
        byte byte0;
        obj = (com.google.android.gms.internal.h.a)map.get(b);
        if (obj == null || obj == com.google.android.gms.tagmanager.cl.f())
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
        s1 = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        obj = (com.google.android.gms.internal.h.a)map.get(d);
        byte byte1;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        }
        obj = (com.google.android.gms.internal.h.a)map.get(e);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        }
        byte1 = 2;
        map = (com.google.android.gms.internal.h.a)map.get(c);
        byte0 = byte1;
        if (map != null)
        {
            byte0 = byte1;
            if (cl.d(map).booleanValue())
            {
                byte0 = 3;
            }
        }
        if (!"text".equals(s)) goto _L2; else goto _L1
_L1:
        map = s1.getBytes();
_L8:
        if (!"base16".equals(obj)) goto _L4; else goto _L3
_L3:
        map = cw.a(map);
_L6:
        return cl.a(map);
_L2:
        if ("base16".equals(s))
        {
            map = cw.a(s1);
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
                ak.a((new StringBuilder("Encode: unknown input format: ")).append(s).toString());
                map = com.google.android.gms.tagmanager.cl.f();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                ak.a("Encode: invalid input:");
                return com.google.android.gms.tagmanager.cl.f();
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
        ak.a((new StringBuilder("Encode: unknown output format: ")).append(((String) (obj))).toString());
        return com.google.android.gms.tagmanager.cl.f();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.G.toString();
        b = f.p.toString();
        c = f.bN.toString();
        d = f.bj.toString();
        e = f.bV.toString();
    }
}
