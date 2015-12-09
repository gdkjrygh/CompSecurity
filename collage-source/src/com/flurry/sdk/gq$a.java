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
//            gx, gq

public static class eam
    implements gx
{

    public gq a(InputStream inputstream)
        throws IOException
    {
        if (inputstream != null)
        {
            inputstream = new DataInputStream(inputstream) {

                final gq.a a;

                public void close()
                {
                }

            
            {
                a = gq.a.this;
                super(inputstream);
            }
            };
            gq gq1 = new gq(null);
            short word0 = inputstream.readShort();
            if (word0 != 0)
            {
                gq.a(gq1, new byte[word0]);
                inputstream.readFully(gq.a(gq1));
                if (inputstream.readUnsignedShort() != 0);
                return gq1;
            }
        }
        return null;
    }

    public void a(OutputStream outputstream, gq gq1)
        throws IOException
    {
        if (outputstream == null || gq1 == null)
        {
            return;
        } else
        {
            outputstream = new DataOutputStream(outputstream) {

                final gq.a a;

                public void close()
                {
                }

            
            {
                a = gq.a.this;
                super(outputstream);
            }
            };
            outputstream.writeShort(gq.a(gq1).length);
            outputstream.write(gq.a(gq1));
            outputstream.writeShort(0);
            outputstream.flush();
            return;
        }
    }

    public volatile void a(OutputStream outputstream, Object obj)
        throws IOException
    {
        a(outputstream, (gq)obj);
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
