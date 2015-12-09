// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.flurry.sdk:
//            gx, ez

public class fc
{
    public static class a
        implements gx
    {

        public fc a(InputStream inputstream)
            throws IOException
        {
            if (inputstream != null) goto _L2; else goto _L1
_L1:
            inputstream = null;
_L4:
            return inputstream;
_L2:
            DataInputStream datainputstream = new DataInputStream(this, inputstream) {

                final a a;

                public void close()
                {
                }

            
            {
                a = a1;
                super(inputstream);
            }
            };
            fc fc1 = new fc();
            datainputstream.readUTF();
            datainputstream.readUTF();
            fc.a(fc1, datainputstream.readBoolean());
            fc.a(fc1, datainputstream.readLong());
            do
            {
                int i = datainputstream.readUnsignedShort();
                inputstream = fc1;
                if (i == 0)
                {
                    continue;
                }
                inputstream = new byte[i];
                datainputstream.readFully(inputstream);
                inputstream = new ez(inputstream);
                fc.a(fc1).add(0, inputstream);
            } while (true);
            if (true) goto _L4; else goto _L3
_L3:
        }

        public void a(OutputStream outputstream, fc fc1)
            throws IOException
        {
            throw new UnsupportedOperationException("Serialization not supported");
        }

        public volatile void a(OutputStream outputstream, Object obj)
            throws IOException
        {
            a(outputstream, (fc)obj);
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


    private static final String a = com/flurry/sdk/fc.getSimpleName();
    private boolean b;
    private long c;
    private final List d = new ArrayList();

    public fc()
    {
    }

    static long a(fc fc1, long l)
    {
        fc1.c = l;
        return l;
    }

    static List a(fc fc1)
    {
        return fc1.d;
    }

    static boolean a(fc fc1, boolean flag)
    {
        fc1.b = flag;
        return flag;
    }

    public boolean a()
    {
        return b;
    }

    public long b()
    {
        return c;
    }

    public List c()
    {
        return Collections.unmodifiableList(d);
    }

}
