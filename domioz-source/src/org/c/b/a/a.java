// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.b.a;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import org.c.b.b;
import org.c.d.l;

// Referenced classes of package org.c.b.a:
//            d

public abstract class a
    implements d
{

    public a()
    {
    }

    public long contentLength()
    {
        return getFile().length();
    }

    public d createRelative(String s)
    {
        throw new FileNotFoundException((new StringBuilder("Cannot create a relative resource for ")).append(getDescription()).toString());
    }

    public boolean equals(Object obj)
    {
        return obj == this || (obj instanceof d) && ((d)obj).getDescription().equals(getDescription());
    }

    public boolean exists()
    {
        boolean flag;
        try
        {
            flag = getFile().exists();
        }
        catch (IOException ioexception)
        {
            try
            {
                getInputStream().close();
            }
            catch (Throwable throwable)
            {
                return false;
            }
            return true;
        }
        return flag;
    }

    public File getFile()
    {
        throw new FileNotFoundException((new StringBuilder()).append(getDescription()).append(" cannot be resolved to absolute file path").toString());
    }

    public String getFilename()
    {
        throw new IllegalStateException((new StringBuilder()).append(getDescription()).append(" does not have a filename").toString());
    }

    public URI getURI()
    {
        URL url = getURL();
        URI uri;
        try
        {
            uri = l.toURI(url);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            throw new b((new StringBuilder("Invalid URI [")).append(url).append("]").toString(), urisyntaxexception);
        }
        return uri;
    }

    public URL getURL()
    {
        throw new FileNotFoundException((new StringBuilder()).append(getDescription()).append(" cannot be resolved to URL").toString());
    }

    public int hashCode()
    {
        return getDescription().hashCode();
    }

    public boolean isOpen()
    {
        return false;
    }

    public boolean isReadable()
    {
        return true;
    }

    public long lastModified()
    {
        long l1 = getFile().lastModified();
        if (l1 == 0L)
        {
            throw new FileNotFoundException((new StringBuilder()).append(getDescription()).append(" cannot be resolved in the file system for resolving its last-modified timestamp").toString());
        } else
        {
            return l1;
        }
    }

    public String toString()
    {
        return getDescription();
    }
}
