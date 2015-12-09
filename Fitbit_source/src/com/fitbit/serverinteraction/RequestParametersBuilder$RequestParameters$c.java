// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.fitbit.serverinteraction:
//            RequestParametersBuilder

static abstract class 
{

    abstract InputStream a();

    public void a(OutputStream outputstream)
        throws IOException
    {
        InputStream inputstream = a();
        byte abyte0[] = new byte[1024];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
            } else
            {
                outputstream.flush();
                return;
            }
        } while (true);
    }

    public abstract int b();

    public String c()
    {
        return null;
    }

    public a d()
    {
        return this;
    }

    ()
    {
    }
}
