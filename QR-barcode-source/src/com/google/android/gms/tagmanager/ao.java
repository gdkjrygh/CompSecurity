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
//            aj, di, j, bh

class ao extends aj
{

    private static final String ID;
    private static final String apf;
    private static final String aph;
    private static final String apl;

    public ao()
    {
        super(ID, new String[] {
            apf
        });
    }

    private byte[] d(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.d.a C(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(apf);
        if (obj == null || obj == di.pK())
        {
            return di.pK();
        }
        String s = di.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(apl);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = di.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(aph);
        if (map == null)
        {
            map = "text";
        } else
        {
            map = di.j(map);
        }
        if ("text".equals(map))
        {
            map = s.getBytes();
        } else
        if ("base16".equals(map))
        {
            map = j.cm(s);
        } else
        {
            bh.T((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return di.pK();
        }
        try
        {
            map = di.u(j.d(d(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.T((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return di.pK();
        }
        return map;
    }

    public boolean nN()
    {
        return true;
    }

    static 
    {
        ID = a.ac.toString();
        apf = b.bw.toString();
        apl = b.bn.toString();
        aph = b.de.toString();
    }
}
