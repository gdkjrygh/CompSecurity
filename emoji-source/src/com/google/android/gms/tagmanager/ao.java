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
    private static final String afA;
    private static final String afE;
    private static final String afy;

    public ao()
    {
        super(ID, new String[] {
            afy
        });
    }

    private byte[] c(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
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
        String s = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(afE);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = dh.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(afA);
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
            return dh.nd();
        }
        try
        {
            map = dh.r(j.d(c(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.A((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return dh.nd();
        }
        return map;
    }

    static 
    {
        ID = a.aa.toString();
        afy = b.bi.toString();
        afE = b.aZ.toString();
        afA = b.cH.toString();
    }
}
