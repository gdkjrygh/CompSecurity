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
//            gx, ha

public class gz
    implements gx
{

    private final String a;
    private final int b;
    private final ha c;

    public gz(String s, int i, ha ha1)
    {
        a = s;
        b = i;
        c = ha1;
    }

    public void a(OutputStream outputstream, Object obj)
        throws IOException
    {
        if (outputstream == null || c == null)
        {
            return;
        }
        outputstream = new DataOutputStream(outputstream) {

            final gz a;

            public void close()
            {
            }

            
            {
                a = gz.this;
                super(outputstream);
            }
        };
        outputstream.writeUTF(a);
        outputstream.writeInt(b);
        gx gx1 = c.a(b);
        if (gx1 == null)
        {
            throw new IOException((new StringBuilder()).append("No serializer for version: ").append(b).toString());
        } else
        {
            gx1.a(outputstream, obj);
            outputstream.flush();
            return;
        }
    }

    public Object b(InputStream inputstream)
        throws IOException
    {
        if (inputstream == null || c == null)
        {
            return null;
        }
        inputstream = new DataInputStream(inputstream) {

            final gz a;

            public void close()
            {
            }

            
            {
                a = gz.this;
                super(inputstream);
            }
        };
        Object obj = inputstream.readUTF();
        if (!a.equals(obj))
        {
            throw new IOException((new StringBuilder()).append("Signature: ").append(((String) (obj))).append(" is invalid").toString());
        }
        int i = inputstream.readInt();
        obj = c.a(i);
        if (obj == null)
        {
            throw new IOException((new StringBuilder()).append("No serializer for version: ").append(i).toString());
        } else
        {
            return ((gx) (obj)).b(inputstream);
        }
    }
}
