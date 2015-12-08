// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

final class lrn extends lqd
{

    private static final String b;
    private static final String c;
    private static final String d;
    private static final String e;

    public lrn()
    {
        super(b, new String[] {
            c
        });
    }

    public final ksp a(Map map)
    {
        Object obj = (ksp)map.get(c);
        if (obj == null || obj == ltw.f())
        {
            return ltw.f();
        }
        Object obj1 = ltw.a(((ksp) (obj)));
        obj = (ksp)map.get(d);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = ltw.a(((ksp) (obj)));
        }
        map = (ksp)map.get(e);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = ltw.a(map);
        }
        if ("text".equals(map))
        {
            map = ((String) (obj1)).getBytes();
        } else
        if ("base16".equals(map))
        {
            map = b.w(((String) (obj1)));
        } else
        {
            lqh.a((new StringBuilder("Hash: unknown input format: ")).append(map).toString());
            return ltw.f();
        }
        try
        {
            obj1 = MessageDigest.getInstance(((String) (obj)));
            ((MessageDigest) (obj1)).update(map);
            map = ltw.a(b.c(((MessageDigest) (obj1)).digest()));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            lqh.a((new StringBuilder("Hash: unknown algorithm: ")).append(((String) (obj))).toString());
            return ltw.f();
        }
        return map;
    }

    public final boolean b()
    {
        return true;
    }

    static 
    {
        b = kse.x.toString();
        c = ksf.f.toString();
        d = ksf.c.toString();
        e = ksf.t.toString();
    }
}
