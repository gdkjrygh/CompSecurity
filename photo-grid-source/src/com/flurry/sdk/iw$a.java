// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            kx, iw

public class 
    implements kx
{

    public iw a(InputStream inputstream)
    {
        if (inputstream == null)
        {
            return null;
        }
        class _cls2 extends DataInputStream
        {

            final iw.a a;

            public void close()
            {
            }

            _cls2(InputStream inputstream)
            {
                a = iw.a.this;
                super(inputstream);
            }
        }

        inputstream = new _cls2(inputstream);
        iw iw1 = new iw(null);
        int i = inputstream.readUnsignedShort();
        if (i > 0)
        {
            byte abyte0[] = new byte[i];
            inputstream.readFully(abyte0);
            iw1.a = abyte0;
        }
        return iw1;
    }

    public void a(OutputStream outputstream, iw iw1)
    {
        if (outputstream == null || iw1 == null)
        {
            return;
        }
        class _cls1 extends DataOutputStream
        {

            final iw.a a;

            public void close()
            {
            }

            _cls1(OutputStream outputstream)
            {
                a = iw.a.this;
                super(outputstream);
            }
        }

        outputstream = new _cls1(outputstream);
        int i = 0;
        if (iw1.a != null)
        {
            i = iw1.a.length;
        }
        outputstream.writeShort(i);
        if (i > 0)
        {
            outputstream.write(iw1.a);
        }
        outputstream.flush();
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (iw)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public ()
    {
    }
}
