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
    private static final String afB;
    private static final String afv;
    private static final String afx;

    public ao()
    {
        super(ID, new String[] {
            afv
        });
    }

    private byte[] c(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public boolean lc()
    {
        return true;
    }

    public com.google.android.gms.internal.d.a w(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(afv);
        if (obj == null || obj == dh.mY())
        {
            return dh.mY();
        }
        String s = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(afB);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(afx);
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
            map = j.bE(s);
        } else
        {
            bh.A((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return dh.mY();
        }
        try
        {
            map = dh.r(j.d(c(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.A((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return dh.mY();
        }
        return map;
    }

    static 
    {
        ID = a.aa.toString();
        afv = b.bi.toString();
        afB = b.aZ.toString();
        afx = b.cH.toString();
    }
}
