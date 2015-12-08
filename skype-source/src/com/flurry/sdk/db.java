// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            eo, fe

public final class db
{

    private int a;
    private String b;
    private Map c;
    private long d;
    private boolean e;
    private boolean f;
    private long g;

    public db(int i, String s, Map map, long l, boolean flag)
    {
        a = i;
        b = s;
        c = map;
        d = l;
        e = flag;
        if (e)
        {
            f = false;
            return;
        } else
        {
            f = true;
            return;
        }
    }

    public final void a(long l)
    {
        f = true;
        g = l - d;
        eo.a(3, "FlurryAgent", (new StringBuilder("Ended event '")).append(b).append("' (").append(d).append(") after ").append(g).append("ms").toString());
    }

    public final void a(Map map)
    {
        if (c == null || c.size() == 0)
        {
            c = map;
        } else
        {
            map = map.entrySet().iterator();
            while (map.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)map.next();
                if (c.containsKey(entry.getKey()))
                {
                    c.remove(entry.getKey());
                    c.put(entry.getKey(), entry.getValue());
                } else
                {
                    c.put(entry.getKey(), entry.getValue());
                }
            }
        }
    }

    public final boolean a()
    {
        return e;
    }

    public final boolean a(String s)
    {
        return e && g == 0L && b.equals(s);
    }

    public final void b(Map map)
    {
        c = map;
    }

    public final boolean b()
    {
        return f;
    }

    public final Map c()
    {
        return c;
    }

    public final int d()
    {
        return e().length;
    }

    public final byte[] e()
    {
        Object obj;
        Object obj1;
        obj1 = new ByteArrayOutputStream();
        obj = new DataOutputStream(((java.io.OutputStream) (obj1)));
        ((DataOutputStream) (obj)).writeShort(a);
        ((DataOutputStream) (obj)).writeUTF(b);
        if (c != null)
        {
            break MISSING_BLOCK_LABEL_76;
        }
        ((DataOutputStream) (obj)).writeShort(0);
_L1:
        byte abyte0[];
        ((DataOutputStream) (obj)).writeLong(d);
        ((DataOutputStream) (obj)).writeLong(g);
        ((DataOutputStream) (obj)).flush();
        abyte0 = ((ByteArrayOutputStream) (obj1)).toByteArray();
        fe.a(((java.io.Closeable) (obj)));
        return abyte0;
        ((DataOutputStream) (obj)).writeShort(c.size());
        Iterator iterator = c.entrySet().iterator();
        while (iterator.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            ((DataOutputStream) (obj)).writeUTF(fe.a((String)entry.getKey()));
            ((DataOutputStream) (obj)).writeUTF(fe.a((String)entry.getValue()));
        }
          goto _L1
        IOException ioexception1;
        ioexception1;
_L5:
        fe.a(((java.io.Closeable) (obj)));
        return new byte[0];
        obj;
        Object obj2;
        obj2 = null;
        ioexception1 = ((IOException) (obj));
_L3:
        fe.a(((java.io.Closeable) (obj2)));
        throw ioexception1;
        ioexception1;
        obj2 = obj;
        if (true) goto _L3; else goto _L2
_L2:
        IOException ioexception;
        ioexception;
        ioexception = null;
        if (true) goto _L5; else goto _L4
_L4:
    }
}
