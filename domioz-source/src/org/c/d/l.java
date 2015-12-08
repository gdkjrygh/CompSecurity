// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;

// Referenced classes of package org.c.d:
//            a, c, m

public abstract class l
{

    public static final String CLASSPATH_URL_PREFIX = "classpath:";
    public static final String FILE_URL_PREFIX = "file:";
    public static final String JAR_URL_SEPARATOR = "!/";
    public static final String URL_PROTOCOL_CODE_SOURCE = "code-source";
    public static final String URL_PROTOCOL_FILE = "file";
    public static final String URL_PROTOCOL_JAR = "jar";
    public static final String URL_PROTOCOL_VFS = "vfs";
    public static final String URL_PROTOCOL_VFSZIP = "vfszip";
    public static final String URL_PROTOCOL_WSJAR = "wsjar";
    public static final String URL_PROTOCOL_ZIP = "zip";

    public l()
    {
    }

    public static URL extractJarFileURL(URL url)
    {
        String s = url.getFile();
        int i = s.indexOf("!/");
        if (i != -1)
        {
            s = s.substring(0, i);
            try
            {
                url = new URL(s);
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                url = s;
                if (!s.startsWith("/"))
                {
                    url = (new StringBuilder("/")).append(s).toString();
                }
                return new URL((new StringBuilder("file:")).append(url).toString());
            }
        }
        return url;
    }

    public static File getFile(String s)
    {
        a.notNull(s, "Resource location must not be null");
        if (s.startsWith("classpath:"))
        {
            Object obj = s.substring(10);
            s = (new StringBuilder("class path resource [")).append(((String) (obj))).append("]").toString();
            obj = c.getDefaultClassLoader().getResource(((String) (obj)));
            if (obj == null)
            {
                throw new FileNotFoundException((new StringBuilder()).append(s).append(" cannot be resolved to absolute file path because it does not reside in the file system").toString());
            } else
            {
                return getFile(((URL) (obj)), s);
            }
        }
        File file;
        try
        {
            file = getFile(new URL(s));
        }
        catch (MalformedURLException malformedurlexception)
        {
            return new File(s);
        }
        return file;
    }

    public static File getFile(URI uri)
    {
        return getFile(uri, "URI");
    }

    public static File getFile(URI uri, String s)
    {
        a.notNull(uri, "Resource URI must not be null");
        if (!"file".equals(uri.getScheme()))
        {
            throw new FileNotFoundException((new StringBuilder()).append(s).append(" cannot be resolved to absolute file path because it does not reside in the file system: ").append(uri).toString());
        } else
        {
            return new File(uri.getSchemeSpecificPart());
        }
    }

    public static File getFile(URL url)
    {
        return getFile(url, "URL");
    }

    public static File getFile(URL url, String s)
    {
        a.notNull(url, "Resource URL must not be null");
        if (!"file".equals(url.getProtocol()))
        {
            throw new FileNotFoundException((new StringBuilder()).append(s).append(" cannot be resolved to absolute file path because it does not reside in the file system: ").append(url).toString());
        }
        try
        {
            s = new File(toURI(url).getSchemeSpecificPart());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return new File(url.getFile());
        }
        return s;
    }

    public static URL getURL(String s)
    {
        a.notNull(s, "Resource location must not be null");
        if (s.startsWith("classpath:"))
        {
            String s1 = s.substring(10);
            URL url = c.getDefaultClassLoader().getResource(s1);
            s = url;
            if (url == null)
            {
                s = (new StringBuilder("class path resource [")).append(s1).append("]").toString();
                throw new FileNotFoundException((new StringBuilder()).append(s).append(" cannot be resolved to URL because it does not exist").toString());
            }
        } else
        {
            URL url1;
            try
            {
                url1 = new URL(s);
            }
            catch (MalformedURLException malformedurlexception)
            {
                URL url2;
                try
                {
                    url2 = (new File(s)).toURI().toURL();
                }
                catch (MalformedURLException malformedurlexception1)
                {
                    throw new FileNotFoundException((new StringBuilder("Resource location [")).append(s).append("] is neither a URL not a well-formed file path").toString());
                }
                return url2;
            }
            s = url1;
        }
        return s;
    }

    public static boolean isFileURL(URL url)
    {
        url = url.getProtocol();
        return "file".equals(url) || url.startsWith("vfs");
    }

    public static boolean isJarURL(URL url)
    {
        String s = url.getProtocol();
        return "jar".equals(s) || "zip".equals(s) || "wsjar".equals(s) || "code-source".equals(s) && url.getPath().contains("!/");
    }

    public static boolean isUrl(String s)
    {
        if (s == null)
        {
            return false;
        }
        if (s.startsWith("classpath:"))
        {
            return true;
        }
        try
        {
            new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return true;
    }

    public static URI toURI(String s)
    {
        return new URI(m.replace(s, " ", "%20"));
    }

    public static URI toURI(URL url)
    {
        return toURI(url.toString());
    }
}
