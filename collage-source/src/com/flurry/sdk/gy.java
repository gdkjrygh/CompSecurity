// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.flurry.sdk;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.flurry.sdk:
//            gx, hp

public class gy
    implements gx
{

    public gy()
    {
    }

    public String a(InputStream inputstream)
        throws IOException
    {
        if (inputstream == null)
        {
            return null;
        } else
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            hp.a(inputstream, bytearrayoutputstream);
            return bytearrayoutputstream.toString();
        }
    }

    public volatile void a(OutputStream outputstream, Object obj)
        throws IOException
    {
        a(outputstream, (String)obj);
    }

    public void a(OutputStream outputstream, String s)
        throws IOException
    {
        if (outputstream == null || s == null)
        {
            return;
        } else
        {
            s = s.getBytes("utf-8");
            outputstream.write(s, 0, s.length);
            return;
        }
    }

    public Object b(InputStream inputstream)
        throws IOException
    {
        return a(inputstream);
    }
}
