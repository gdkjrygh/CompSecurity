// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.d.a;

import java.io.OutputStream;
import org.apache.http.entity.StringEntity;

// Referenced classes of package com.facebook.http.d.a:
//            c, a

public class d extends StringEntity
{

    private a a;

    public d(String s, String s1)
    {
        super(s, s1);
        a = null;
    }

    public void a(a a1)
    {
        a = a1;
    }

    public void writeTo(OutputStream outputstream)
    {
        if (outputstream == null)
        {
            throw new IllegalArgumentException("Output stream may not be null");
        }
        if (a == null)
        {
            outputstream.write(content);
        } else
        {
            outputstream = new c(outputstream, a);
            int j = content.length;
            int i = 0;
            while (i < j) 
            {
                outputstream.write(content, i, Math.min(j - i, 4096));
                i += 4096;
            }
        }
        outputstream.flush();
    }
}
