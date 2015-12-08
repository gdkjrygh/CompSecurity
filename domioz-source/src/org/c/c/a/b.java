// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.c.a;

import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.zip.GZIPOutputStream;
import org.c.c.f;
import org.c.d.a;

// Referenced classes of package org.c.c.a:
//            e, i

public abstract class b
    implements e
{

    private OutputStream compressedBody;
    private boolean executed;
    private final f headers = new f();

    public b()
    {
        executed = false;
    }

    private void checkExecuted()
    {
        boolean flag;
        if (!executed)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a.state(flag, "ClientHttpRequest already executed");
    }

    private OutputStream getCompressedBody(OutputStream outputstream)
    {
        if (compressedBody == null)
        {
            compressedBody = new GZIPOutputStream(outputstream);
        }
        return compressedBody;
    }

    private boolean shouldCompress()
    {
        for (Iterator iterator = headers.getContentEncoding().iterator(); iterator.hasNext();)
        {
            if (((org.c.c.a)iterator.next()).equals(org.c.c.a.GZIP))
            {
                return true;
            }
        }

        return false;
    }

    public final i execute()
    {
        checkExecuted();
        if (compressedBody != null)
        {
            compressedBody.close();
        }
        i i = executeInternal(headers);
        executed = true;
        return i;
    }

    protected abstract i executeInternal(f f1);

    public final OutputStream getBody()
    {
        checkExecuted();
        OutputStream outputstream1 = getBodyInternal(headers);
        OutputStream outputstream = outputstream1;
        if (shouldCompress())
        {
            outputstream = getCompressedBody(outputstream1);
        }
        return outputstream;
    }

    protected abstract OutputStream getBodyInternal(f f1);

    public final f getHeaders()
    {
        if (executed)
        {
            return f.readOnlyHttpHeaders(headers);
        } else
        {
            return headers;
        }
    }
}
