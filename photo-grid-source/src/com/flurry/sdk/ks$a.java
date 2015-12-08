// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kx, ks

public class 
    implements kx
{

    public ks a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        } else
        {
            class _cls2 extends DataInputStream
            {

                final ks.a a;

                public void close()
                {
                }

            _cls2(InputStream inputstream)
            {
                a = ks.a.this;
                super(inputstream);
            }
            }

            inputstream = new _cls2(inputstream);
            ks ks1 = new ks(null);
            ks.a(ks1, inputstream.readUTF());
            return ks1;
        }
    }

    public void a(OutputStream outputstream, ks ks1)
    {
        if (outputstream == null || ks1 == null)
        {
            return;
        } else
        {
            class _cls1 extends DataOutputStream
            {

                final ks.a a;

                public void close()
                {
                }

            _cls1(OutputStream outputstream)
            {
                a = ks.a.this;
                super(outputstream);
            }
            }

            outputstream = new _cls1(outputstream);
            outputstream.writeUTF(ks.a(ks1));
            outputstream.flush();
            return;
        }
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (ks)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public ()
    {
    }
}
