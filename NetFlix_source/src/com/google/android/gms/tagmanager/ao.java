// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.a;
import com.google.android.gms.internal.b;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Map;

// Referenced classes of package com.google.android.gms.tagmanager:
//            aj, dh, j, bh

class ao extends aj
{

    private static final String ID;
    private static final String XQ;
    private static final String XS;
    private static final String XW;

    public ao()
    {
        super(ID, new String[] {
            XQ
        });
    }

    private byte[] c(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
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
        String s = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(XW);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(XS);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = dh.j(map);
        }
        if ("text".equals(map))
        {
            map = s.getBytes();
        } else
        if ("base16".equals(map))
        {
            map = j.bm(s);
        } else
        {
            bh.w((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return dh.lT();
        }
        try
        {
            map = dh.r(j.d(c(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.w((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return dh.lT();
        }
        return map;
    }

    static 
    {
        ID = a.aa.toString();
        XQ = b.bi.toString();
        XW = b.aZ.toString();
        XS = b.cH.toString();
    }
}
