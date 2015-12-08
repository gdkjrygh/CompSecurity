// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

// Referenced classes of package org.apache.cordova:
//            FileTransfer

private static final class  extends FilterInputStream
{

    private boolean done;

    public int read()
        throws IOException
    {
        int i;
        boolean flag;
        if (done)
        {
            i = -1;
        } else
        {
            i = super.read();
        }
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        done = flag;
        return i;
    }

    public int read(byte abyte0[])
        throws IOException
    {
        int i;
        boolean flag;
        if (done)
        {
            i = -1;
        } else
        {
            i = super.read(abyte0);
        }
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        done = flag;
        return i;
    }

    public int read(byte abyte0[], int i, int j)
        throws IOException
    {
        boolean flag;
        if (done)
        {
            i = -1;
        } else
        {
            i = super.read(abyte0, i, j);
        }
        if (i == -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        done = flag;
        return i;
    }

    public (InputStream inputstream)
    {
        super(inputstream);
    }
}
