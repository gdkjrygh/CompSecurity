// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            kx

public class kw
    implements kx
{

    kx a;

    public kw(kx kx1)
    {
        if (kx1 == null)
        {
            throw new IllegalArgumentException("recordSerializer cannot be null");
        } else
        {
            a = kx1;
            return;
        }
    }

    public List a(InputStream inputstream)
    {
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        int j = (new _cls2(inputstream)).readInt();
        ArrayList arraylist = new ArrayList(j);
        int i = 0;
        do
        {
            obj = arraylist;
            if (i >= j)
            {
                continue;
            }
            obj = a.b(inputstream);
            if (obj == null)
            {
                throw new IOException("Missing record.");
            }
            arraylist.add(obj);
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (List)obj);
    }

    public void a(OutputStream outputstream, List list)
    {
        int j = 0;
        if (outputstream == null)
        {
            return;
        }
        _cls1 _lcls1 = new _cls1(outputstream);
        int i;
        if (list != null)
        {
            i = list.size();
        } else
        {
            i = 0;
        }
        _lcls1.writeInt(i);
        for (; j < i; j++)
        {
            a.a(outputstream, list.get(j));
        }

        _lcls1.flush();
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    private class _cls2 extends DataInputStream
    {

        final kw a;

        public void close()
        {
        }

        _cls2(InputStream inputstream)
        {
            a = kw.this;
            super(inputstream);
        }
    }


    private class _cls1 extends DataOutputStream
    {

        final kw a;

        public void close()
        {
        }

        _cls1(OutputStream outputstream)
        {
            a = kw.this;
            super(outputstream);
        }
    }

}
