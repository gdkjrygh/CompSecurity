// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kx, ii, ih

public class 
    implements kx
{

    public ih a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        } else
        {
            class _cls2 extends DataInputStream
            {

                final ih.a a;

                public void close()
                {
                }

            _cls2(InputStream inputstream)
            {
                a = ih.a.this;
                super(inputstream);
            }
            }

            Object obj = new _cls2(inputstream);
            int i = ((DataInputStream) (obj)).readInt();
            long l = ((DataInputStream) (obj)).readLong();
            long l1 = ((DataInputStream) (obj)).readLong();
            boolean flag = ((DataInputStream) (obj)).readBoolean();
            int j = ((DataInputStream) (obj)).readInt();
            inputstream = ii.a(((DataInputStream) (obj)).readInt());
            String s = ((DataInputStream) (obj)).readUTF();
            int k = ((DataInputStream) (obj)).readInt();
            long l2 = ((DataInputStream) (obj)).readLong();
            boolean flag1 = ((DataInputStream) (obj)).readBoolean();
            long l3 = ((DataInputStream) (obj)).readLong();
            obj = new ih(null, l, l1, i);
            obj.d = flag;
            obj.e = j;
            obj.f = inputstream;
            obj.g = s;
            obj.h = k;
            obj.i = l2;
            obj.j = flag1;
            obj.k = l3;
            return ((ih) (obj));
        }
    }

    public void a(OutputStream outputstream, ih ih1)
    {
        if (outputstream == null || ih1 == null)
        {
            return;
        }
        class _cls1 extends DataOutputStream
        {

            final ih.a a;

            public void close()
            {
            }

            _cls1(OutputStream outputstream)
            {
                a = ih.a.this;
                super(outputstream);
            }
        }

        outputstream = new _cls1(outputstream);
        outputstream.writeInt(ih1.a);
        outputstream.writeLong(ih1.b);
        outputstream.writeLong(ih1.c);
        outputstream.writeBoolean(ih1.d);
        outputstream.writeInt(ih1.e);
        outputstream.writeInt(ih1.f.a());
        if (ih1.g != null)
        {
            outputstream.writeUTF(ih1.g);
        } else
        {
            outputstream.writeUTF("");
        }
        outputstream.writeInt(ih1.h);
        outputstream.writeLong(ih1.i);
        outputstream.writeBoolean(ih1.j);
        outputstream.writeLong(ih1.k);
        outputstream.flush();
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (ih)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public ()
    {
    }
}
