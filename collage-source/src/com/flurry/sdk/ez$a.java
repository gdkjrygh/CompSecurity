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
//            gx, ez

public static class eam
    implements gx
{

    public ez a(InputStream inputstream)
        throws IOException
    {
        if (inputstream == null)
        {
            return null;
        }
        inputstream = new DataInputStream(inputstream) {

            final ez.a a;

            public void close()
            {
            }

            
            {
                a = ez.a.this;
                super(inputstream);
            }
        };
        ez ez1 = new ez(null);
        int i = inputstream.readUnsignedShort();
        if (i > 0)
        {
            byte abyte0[] = new byte[i];
            inputstream.readFully(abyte0);
            ez1.a = abyte0;
        }
        return ez1;
    }

    public void a(OutputStream outputstream, ez ez1)
        throws IOException
    {
        if (outputstream == null || ez1 == null)
        {
            return;
        }
        outputstream = new DataOutputStream(outputstream) {

            final ez.a a;

            public void close()
            {
            }

            
            {
                a = ez.a.this;
                super(outputstream);
            }
        };
        int i = 0;
        if (ez1.a != null)
        {
            i = ez1.a.length;
        }
        outputstream.writeShort(i);
        if (i > 0)
        {
            outputstream.write(ez1.a);
        }
        outputstream.flush();
    }

    public volatile void a(OutputStream outputstream, Object obj)
        throws IOException
    {
        a(outputstream, (ez)obj);
    }

    public Object b(InputStream inputstream)
        throws IOException
    {
        return a(inputstream);
    }

    public eam()
    {
    }
}
