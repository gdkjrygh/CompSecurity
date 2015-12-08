// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            kx, iz, iw

public class 
    implements kx
{

    public iz a(InputStream inputstream)
    {
        if (inputstream != null) goto _L2; else goto _L1
_L1:
        inputstream = null;
_L4:
        return inputstream;
_L2:
        class _cls1 extends DataInputStream
        {

            final iz.a a;

            public void close()
            {
            }

            _cls1(InputStream inputstream)
            {
                a = iz.a.this;
                super(inputstream);
            }
        }

        _cls1 _lcls1 = new _cls1(inputstream);
        iz iz1 = new iz();
        _lcls1.readUTF();
        _lcls1.readUTF();
        iz.a(iz1, _lcls1.readBoolean());
        iz.a(iz1, _lcls1.readLong());
        do
        {
            int i = _lcls1.readUnsignedShort();
            inputstream = iz1;
            if (i == 0)
            {
                continue;
            }
            inputstream = new byte[i];
            _lcls1.readFully(inputstream);
            inputstream = new iw(inputstream);
            iz.a(iz1).add(0, inputstream);
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(OutputStream outputstream, iz iz1)
    {
        throw new UnsupportedOperationException("Serialization not supported");
    }

    public volatile void a(OutputStream outputstream, Object obj)
    {
        a(outputstream, (iz)obj);
    }

    public Object b(InputStream inputstream)
    {
        return a(inputstream);
    }

    public ()
    {
    }
}
