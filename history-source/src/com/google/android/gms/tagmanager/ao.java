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
    private static final String arp;
    private static final String arr;
    private static final String arv;

    public ao()
    {
        super(ID, new String[] {
            arp
        });
    }

    private byte[] d(String s, byte abyte0[])
        throws NoSuchAlgorithmException
    {
        s = MessageDigest.getInstance(s);
        s.update(abyte0);
        return s.digest();
    }

    public com.google.android.gms.internal.d.a B(Map map)
    {
        Object obj = (com.google.android.gms.internal.d.a)map.get(arp);
        if (obj == null || obj == di.rb())
        {
            return di.rb();
        }
        String s = di.j(((com.google.android.gms.internal.d.a) (obj)));
        obj = (com.google.android.gms.internal.d.a)map.get(arv);
        if (obj == null)
        {
            obj = "MD5";
        } else
        {
            obj = di.j(((com.google.android.gms.internal.d.a) (obj)));
        }
        map = (com.google.android.gms.internal.d.a)map.get(arr);
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
            map = j.co(s);
        } else
        {
            bh.T((new StringBuilder()).append("Hash: unknown input format: ").append(map).toString());
            return di.rb();
        }
        try
        {
            map = di.u(j.d(d(((String) (obj)), map)));
        }
        // Misplaced declaration of an exception variable
        catch (Map map)
        {
            bh.T((new StringBuilder()).append("Hash: unknown algorithm: ").append(((String) (obj))).toString());
            return di.rb();
        }
        return map;
    }

    public boolean pe()
    {
        return true;
    }

    static 
    {
        ID = a.ac.toString();
        arp = b.bw.toString();
        arv = b.bn.toString();
        arr = b.de.toString();
    }
}
