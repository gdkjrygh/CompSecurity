// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.e;
import com.google.android.gms.internal.f;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            o, cl, cw, ak

final class t extends o
{

    private static final String a;
    private static final String b;
    private static final String c;
    private static final String d;

    public t()
    {
        super(a, new String[] {
            b
        });
    }

    public final com.google.android.gms.internal.h.a a(Map map)
    {
        Object obj = (com.google.android.gms.internal.h.a)map.get(b);
        if (obj == null || obj == com.google.android.gms.tagmanager.cl.f())
        {
            return com.google.android.gms.tagmanager.cl.f();
        }
        Object obj1 = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        obj = (com.google.android.gms.internal.h.a)map.get(c);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = cl.a(((com.google.android.gms.internal.h.a) (obj)));
        }
        map = (com.google.android.gms.internal.h.a)map.get(d);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = cl.a(map);
        }
        if ("text".equals(map))
        {
            map = ((String) (obj1)).getBytes();
        } else
        if ("base16".equals(map))
        {
            map = cw.a(((String) (obj1)));
        } else
        {
            ak.a((new StringBuilder("Hash: unknown input format: ")).append(map).toString());
            return com.google.android.gms.tagmanager.cl.f();
        }
        try
        {
            obj1 = MessageDigest.getInstance(((String) (obj)));
            ((MessageDigest) (obj1)).update(map);
            map = cl.a(cw.a(((MessageDigest) (obj1)).digest()));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            ak.a((new StringBuilder("Hash: unknown algorithm: ")).append(((String) (obj))).toString());
            return com.google.android.gms.tagmanager.cl.f();
        }
        return map;
    }

    public final boolean a()
    {
        return true;
    }

    static 
    {
        a = e.I.toString();
        b = f.p.toString();
        c = f.g.toString();
        d = f.bj.toString();
    }
}
