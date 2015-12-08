// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

// Referenced classes of package com.flurry.sdk:
//            gx

public class gq
{
    public static class a
        implements gx
    {

        public gq a(InputStream inputstream)
            throws IOException
        {
            if (inputstream != null)
            {
                inputstream = new DataInputStream(this, inputstream) {

                    final a a;

                    public void close()
                    {
                    }

            
            {
                a = a1;
                super(inputstream);
            }
                };
                gq gq1 = new gq();
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
                outputstream = new DataOutputStream(this, outputstream) {

                    final a a;

                    public void close()
                    {
                    }

            
            {
                a = a1;
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

        public a()
        {
        }
    }


    private static final String b = com/flurry/sdk/gq.getSimpleName();
    String a;
    private byte c[];

    private gq()
    {
        a = null;
        c = null;
    }


    public gq(byte abyte0[])
    {
        a = null;
        c = null;
        a = UUID.randomUUID().toString();
        c = abyte0;
    }

    public static String a(String s)
    {
        return (new StringBuilder()).append(".yflurrydatasenderblock.").append(s).toString();
    }

    static byte[] a(gq gq1)
    {
        return gq1.c;
    }

    static byte[] a(gq gq1, byte abyte0[])
    {
        gq1.c = abyte0;
        return abyte0;
    }

    public String a()
    {
        return a;
    }

    public byte[] b()
    {
        return c;
    }

}
