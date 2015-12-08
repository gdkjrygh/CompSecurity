// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.flurry.sdk:
//            kx, kw, in, ig

public class <init>
    implements kx
{

    kw a;

    public ig a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        }
        class _cls2 extends DataInputStream
        {

            final ig.a a;

            public void close()
            {
            }

            _cls2(InputStream inputstream)
            {
                a = ig.a.this;
                super(inputstream);
            }
        }

        _cls2 _lcls2 = new _cls2(inputstream);
        Object obj1 = _lcls2.readUTF();
        Object obj = obj1;
        if (((String) (obj1)).equals(""))
        {
            obj = null;
        }
        String s2 = _lcls2.readUTF();
        long l1 = _lcls2.readLong();
        int k = _lcls2.readInt();
        long l2 = _lcls2.readLong();
        int l = _lcls2.readInt();
        int i1 = _lcls2.readInt();
        in in1 = in.a(_lcls2.readInt());
        obj1 = null;
        int j1 = _lcls2.readInt();
        if (j1 != 0)
        {
            HashMap hashmap = new HashMap();
            int i = 0;
            do
            {
                obj1 = hashmap;
                if (i >= j1)
                {
                    break;
                }
                hashmap.put(_lcls2.readUTF(), _lcls2.readUTF());
                i++;
            } while (true);
        }
        long l3 = _lcls2.readLong();
        int j = _lcls2.readInt();
        j1 = _lcls2.readInt();
        String s1 = _lcls2.readUTF();
        String s = s1;
        if (s1.equals(""))
        {
            s = null;
        }
        boolean flag = _lcls2.readBoolean();
        obj = new ig(((String) (obj)), l2, s2, l1, l, i1, in1, ((Map) (obj1)), j, j1, s);
        ig.a(((ig) (obj)), l3);
        ig.a(((ig) (obj)), flag);
        ((ig) (obj)).b(k);
        obj.a = (ArrayList)a.a(inputstream);
        ((ig) (obj)).o();
        return ((ig) (obj));
    }

    public void a(OutputStream outputstream, ig ig1)
    {
        if (outputstream == null || ig1 == null)
        {
            return;
        }
        class _cls1 extends DataOutputStream
        {

            final ig.a a;

            public void close()
            {
            }

            _cls1(OutputStream outputstream)
            {
                a = ig.a.this;
                super(outputstream);
            }
        }

        _cls1 _lcls1 = new _cls1(outputstream);
        Map map;
        if (ig.a(ig1) != null)
        {
            _lcls1.writeUTF(ig.a(ig1));
        } else
        {
            _lcls1.writeUTF("");
        }
        if (ig1.t() != null)
        {
            _lcls1.writeUTF(ig1.t());
        } else
        {
            _lcls1.writeUTF("");
        }
        _lcls1.writeLong(ig1.p());
        _lcls1.writeInt(ig1.r());
        _lcls1.writeLong(ig.b(ig1));
        _lcls1.writeInt(ig.c(ig1));
        _lcls1.writeInt(ig.d(ig1));
        _lcls1.writeInt(ig.e(ig1).a());
        map = ig.f(ig1);
        if (map != null)
        {
            _lcls1.writeInt(ig.f(ig1).size());
            String s;
            for (Iterator iterator = ig.f(ig1).keySet().iterator(); iterator.hasNext(); _lcls1.writeUTF((String)map.get(s)))
            {
                s = (String)iterator.next();
                _lcls1.writeUTF(s);
            }

        } else
        {
            _lcls1.writeInt(0);
        }
        _lcls1.writeLong(ig.g(ig1));
        _lcls1.writeInt(ig.h(ig1));
        _lcls1.writeInt(ig.i(ig1));
        if (ig.j(ig1) != null)
        {
            _lcls1.writeUTF(ig.j(ig1));
        } else
        {
            _lcls1.writeUTF("");
        }
        _lcls1.writeBoolean(ig.k(ig1));
        _lcls1.flush();
        a.a(outputstream, ig1.a);
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (ig)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public ()
    {
        a = new kw(new <init>());
    }
}
