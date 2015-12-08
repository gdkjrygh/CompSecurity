// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Base64;
import java.util.Map;

final class lvb extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;
    private static final String f;

    public lvb()
    {
        super(b, new String[] {
            c
        });
    }

    public final ksp a(Map map)
    {
        Object obj;
        String s;
        String s1;
        byte byte0;
        obj = (ksp)map.get(c);
        if (obj == null || obj == ltw.f())
        {
            return ltw.f();
        }
        s1 = ltw.a(((ksp) (obj)));
        obj = (ksp)map.get(e);
        byte byte1;
        if (obj == null)
        {
            s = "text";
        } else
        {
            s = ltw.a(((ksp) (obj)));
        }
        obj = (ksp)map.get(f);
        if (obj == null)
        {
            obj = "base16";
        } else
        {
            obj = ltw.a(((ksp) (obj)));
        }
        byte1 = 2;
        map = (ksp)map.get(d);
        byte0 = byte1;
        if (map != null)
        {
            byte0 = byte1;
            if (ltw.d(map).booleanValue())
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
        map = b.c(map);
_L6:
        return ltw.a(map);
_L2:
        if ("base16".equals(s))
        {
            map = b.w(s1);
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
                lqh.a((new StringBuilder("Encode: unknown input format: ")).append(s).toString());
                map = ltw.f();
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                lqh.a("Encode: invalid input:");
                return ltw.f();
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
        lqh.a((new StringBuilder("Encode: unknown output format: ")).append(((String) (obj))).toString());
        return ltw.f();
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.v.toString();
        c = ksf.f.toString();
        d = ksf.D.toString();
        e = ksf.t.toString();
        f = ksf.E.toString();
    }
}
