// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kx, kq

public class 
    implements kx
{

    public kq a(InputStream inputstream)
    {
        if (inputstream != null)
        {
            class _cls2 extends DataInputStream
            {

                final kq.a a;

                public void close()
                {
                }

            _cls2(InputStream inputstream)
            {
                a = kq.a.this;
                super(inputstream);
            }
            }

            inputstream = new _cls2(inputstream);
            kq kq1 = new kq(null);
            short word0 = inputstream.readShort();
            if (word0 != 0)
            {
                kq.a(kq1, new byte[word0]);
                inputstream.readFully(kq.a(kq1));
                inputstream.readUnsignedShort();
                return kq1;
            }
        }
        return null;
    }

    public void a(OutputStream outputstream, kq kq1)
    {
        if (outputstream == null || kq1 == null)
        {
            return;
        } else
        {
            class _cls1 extends DataOutputStream
            {

                final kq.a a;

                public void close()
                {
                }

            _cls1(OutputStream outputstream)
            {
                a = kq.a.this;
                super(outputstream);
            }
            }

            outputstream = new _cls1(outputstream);
            outputstream.writeShort(kq.a(kq1).length);
            outputstream.write(kq.a(kq1));
            outputstream.writeShort(0);
            outputstream.flush();
            return;
        }
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (kq)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public ()
    {
    }
}
