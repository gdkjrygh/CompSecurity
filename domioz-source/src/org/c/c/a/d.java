// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPInputStream;
import org.c.c.a;
import org.c.c.f;
import org.c.c.l;

// Referenced classes of package org.c.c.a:
//            i

public abstract class d
    implements i
{

    private InputStream compressedBody;

    public d()
    {
    }

    private InputStream getCompressedBody(InputStream inputstream)
    {
        if (compressedBody == null)
        {
            compressedBody = new GZIPInputStream(inputstream);
        }
        return compressedBody;
    }

    private boolean isCompressed()
    {
        for (Iterator iterator = getHeaders().getContentEncoding().iterator(); iterator.hasNext();)
        {
            if (((a)iterator.next()).equals(a.GZIP))
            {
                return true;
            }
        }

        return false;
    }

    public void close()
    {
        if (compressedBody != null)
        {
            try
            {
                compressedBody.close();
            }
            catch (IOException ioexception) { }
        }
        closeInternal();
    }

    protected abstract void closeInternal();

    public InputStream getBody()
    {
        InputStream inputstream1 = getBodyInternal();
        InputStream inputstream = inputstream1;
        if (isCompressed())
        {
            inputstream = getCompressedBody(inputstream1);
        }
        return inputstream;
    }

    protected abstract InputStream getBodyInternal();

    public l getStatusCode()
    {
        return l.valueOf(getRawStatusCode());
    }
}
