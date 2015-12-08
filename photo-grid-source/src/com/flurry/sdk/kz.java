// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kx, la

public class kz
    implements kx
{

    private final String a;
    private final int b;
    private final la c;

    public kz(String s, int i, la la1)
    {
        a = s;
        b = i;
        c = la1;
    }

    public void a(OutputStream outputstream, Object obj)
    {
        if (outputstream == null || c == null)
        {
            return;
        }
        outputstream = new _cls1(outputstream);
        outputstream.writeUTF(a);
        outputstream.writeInt(b);
        kx kx1 = c.a(b);
        if (kx1 == null)
        {
            throw new IOException((new StringBuilder("No serializer for version: ")).append(b).toString());
        } else
        {
            kx1.a(outputstream, obj);
            outputstream.flush();
            return;
        }
    }

    public Object b(InputStream inputstream)
    {
        if (inputstream == null || c == null)
        {
            return null;
        }
        inputstream = new _cls2(inputstream);
        Object obj = inputstream.readUTF();
        if (!a.equals(obj))
        {
            throw new IOException((new StringBuilder("Signature: ")).append(((String) (obj))).append(" is invalid").toString());
        }
        int i = inputstream.readInt();
        obj = c.a(i);
        if (obj == null)
        {
            throw new IOException((new StringBuilder("No serializer for version: ")).append(i).toString());
        } else
        {
            return ((kx) (obj)).b(inputstream);
        }
    }

    private class _cls1 extends DataOutputStream
    {

        final kz a;

        public void close()
        {
        }

        _cls1(OutputStream outputstream)
        {
            a = kz.this;
            super(outputstream);
        }
    }


    private class _cls2 extends DataInputStream
    {

        final kz a;

        public void close()
        {
        }

        _cls2(InputStream inputstream)
        {
            a = kz.this;
            super(inputstream);
        }
    }

}
