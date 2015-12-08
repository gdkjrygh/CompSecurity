// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.io;

import com.google.common.base.Preconditions;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.List;

// Referenced classes of package com.google.common.io:
//            ByteStreams, CharStreams, InputSupplier, LineProcessor

public final class Resources
{

    private Resources()
    {
    }

    public static void copy(URL url, OutputStream outputstream)
        throws IOException
    {
        ByteStreams.copy(newInputStreamSupplier(url), outputstream);
    }

    public static URL getResource(Class class1, String s)
    {
        URL url = class1.getResource(s);
        boolean flag;
        if (url != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "resource %s relative to %s not found.", new Object[] {
            s, class1.getName()
        });
        return url;
    }

    public static URL getResource(String s)
    {
        URL url = com/google/common/io/Resources.getClassLoader().getResource(s);
        boolean flag;
        if (url != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "resource %s not found.", new Object[] {
            s
        });
        return url;
    }

    public static InputSupplier newInputStreamSupplier(URL url)
    {
        Preconditions.checkNotNull(url);
        return new InputSupplier(url) {

            final URL val$url;

            public InputStream getInput()
                throws IOException
            {
                return url.openStream();
            }

            public volatile Object getInput()
                throws IOException
            {
                return getInput();
            }

            
            {
                url = url1;
                super();
            }
        };
    }

    public static InputSupplier newReaderSupplier(URL url, Charset charset)
    {
        return CharStreams.newReaderSupplier(newInputStreamSupplier(url), charset);
    }

    public static Object readLines(URL url, Charset charset, LineProcessor lineprocessor)
        throws IOException
    {
        return CharStreams.readLines(newReaderSupplier(url, charset), lineprocessor);
    }

    public static List readLines(URL url, Charset charset)
        throws IOException
    {
        return CharStreams.readLines(newReaderSupplier(url, charset));
    }

    public static byte[] toByteArray(URL url)
        throws IOException
    {
        return ByteStreams.toByteArray(newInputStreamSupplier(url));
    }

    public static String toString(URL url, Charset charset)
        throws IOException
    {
        return CharStreams.toString(newReaderSupplier(url, charset));
    }
}
