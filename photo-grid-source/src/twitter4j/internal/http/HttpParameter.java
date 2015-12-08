// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.File;
import java.io.InputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.List;

public final class HttpParameter
    implements Serializable, Comparable
{

    private static final String GIF = "image/gif";
    private static final String JPEG = "image/jpeg";
    private static final String OCTET = "application/octet-stream";
    private static final String PNG = "image/png";
    private static final long serialVersionUID = 0x8726953b6ebdb774L;
    private File file;
    private InputStream fileBody;
    private String name;
    private String value;

    public HttpParameter(String s, double d)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        value = String.valueOf(d);
    }

    public HttpParameter(String s, int i)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        value = String.valueOf(i);
    }

    public HttpParameter(String s, long l)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        value = String.valueOf(l);
    }

    public HttpParameter(String s, File file1)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        file = file1;
    }

    public HttpParameter(String s, String s1)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        value = s1;
    }

    public HttpParameter(String s, String s1, InputStream inputstream)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        file = new File(s1);
        fileBody = inputstream;
    }

    public HttpParameter(String s, boolean flag)
    {
        name = null;
        value = null;
        file = null;
        fileBody = null;
        name = s;
        value = String.valueOf(flag);
    }

    static boolean containsFile(List list)
    {
        for (list = list.iterator(); list.hasNext();)
        {
            if (((HttpParameter)list.next()).isFile())
            {
                return true;
            }
        }

        return false;
    }

    public static boolean containsFile(HttpParameter ahttpparameter[])
    {
        if (ahttpparameter != null)
        {
            int j = ahttpparameter.length;
            int i = 0;
            while (i < j) 
            {
                if (ahttpparameter[i].isFile())
                {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    public static String encode(String s)
    {
        StringBuilder stringbuilder = null;
        int i;
        try
        {
            s = URLEncoder.encode(s, "UTF-8");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            s = stringbuilder;
        }
        stringbuilder = new StringBuilder(s.length());
        i = 0;
        while (i < s.length()) 
        {
            char c = s.charAt(i);
            if (c == '*')
            {
                stringbuilder.append("%2A");
            } else
            if (c == '+')
            {
                stringbuilder.append("%20");
            } else
            if (c == '%' && i + 1 < s.length() && s.charAt(i + 1) == '7' && s.charAt(i + 2) == 'E')
            {
                stringbuilder.append('~');
                i += 2;
            } else
            {
                stringbuilder.append(c);
            }
            i++;
        }
        return stringbuilder.toString();
    }

    public static String encodeParameters(HttpParameter ahttpparameter[])
    {
        if (ahttpparameter == null)
        {
            return "";
        }
        StringBuilder stringbuilder = new StringBuilder();
        for (int i = 0; i < ahttpparameter.length; i++)
        {
            if (ahttpparameter[i].isFile())
            {
                throw new IllegalArgumentException((new StringBuilder("parameter [")).append(ahttpparameter[i].name).append("]should be text").toString());
            }
            if (i != 0)
            {
                stringbuilder.append("&");
            }
            stringbuilder.append(encode(ahttpparameter[i].name)).append("=").append(encode(ahttpparameter[i].value));
        }

        return stringbuilder.toString();
    }

    public static HttpParameter[] getParameterArray(String s, int i)
    {
        return getParameterArray(s, String.valueOf(i));
    }

    public static HttpParameter[] getParameterArray(String s, int i, String s1, int j)
    {
        return getParameterArray(s, String.valueOf(i), s1, String.valueOf(j));
    }

    public static HttpParameter[] getParameterArray(String s, String s1)
    {
        return (new HttpParameter[] {
            new HttpParameter(s, s1)
        });
    }

    public static HttpParameter[] getParameterArray(String s, String s1, String s2, String s3)
    {
        return (new HttpParameter[] {
            new HttpParameter(s, s1), new HttpParameter(s2, s3)
        });
    }

    public final int compareTo(Object obj)
    {
        obj = (HttpParameter)obj;
        int j = name.compareTo(((HttpParameter) (obj)).name);
        int i = j;
        if (j == 0)
        {
            i = value.compareTo(((HttpParameter) (obj)).value);
        }
        return i;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof HttpParameter))
            {
                return false;
            }
            obj = (HttpParameter)obj;
            if (file == null ? ((HttpParameter) (obj)).file != null : !file.equals(((HttpParameter) (obj)).file))
            {
                return false;
            }
            if (fileBody == null ? ((HttpParameter) (obj)).fileBody != null : !fileBody.equals(((HttpParameter) (obj)).fileBody))
            {
                return false;
            }
            if (!name.equals(((HttpParameter) (obj)).name))
            {
                return false;
            }
            if (value == null ? ((HttpParameter) (obj)).value != null : !value.equals(((HttpParameter) (obj)).value))
            {
                return false;
            }
        }
        return true;
    }

    public final String getContentType()
    {
        if (!isFile())
        {
            throw new IllegalStateException("not a file");
        }
        String s = file.getName();
        if (-1 != s.lastIndexOf("."))
        {
            s = s.substring(s.lastIndexOf(".") + 1).toLowerCase();
            if (s.length() == 3)
            {
                if ("gif".equals(s))
                {
                    return "image/gif";
                }
                if ("png".equals(s))
                {
                    return "image/png";
                }
                if ("jpg".equals(s))
                {
                    return "image/jpeg";
                } else
                {
                    return "application/octet-stream";
                }
            }
            if (s.length() == 4)
            {
                if ("jpeg".equals(s))
                {
                    return "image/jpeg";
                } else
                {
                    return "application/octet-stream";
                }
            }
        }
        return "application/octet-stream";
    }

    public final File getFile()
    {
        return file;
    }

    public final InputStream getFileBody()
    {
        return fileBody;
    }

    public final String getName()
    {
        return name;
    }

    public final String getValue()
    {
        return value;
    }

    public final boolean hasFileBody()
    {
        return fileBody != null;
    }

    public final int hashCode()
    {
        int k = 0;
        int l = name.hashCode();
        int i;
        int j;
        if (value != null)
        {
            i = value.hashCode();
        } else
        {
            i = 0;
        }
        if (file != null)
        {
            j = file.hashCode();
        } else
        {
            j = 0;
        }
        if (fileBody != null)
        {
            k = fileBody.hashCode();
        }
        return (j + (i + l * 31) * 31) * 31 + k;
    }

    public final boolean isFile()
    {
        return file != null;
    }

    public final String toString()
    {
        return (new StringBuilder("PostParameter{name='")).append(name).append('\'').append(", value='").append(value).append('\'').append(", file=").append(file).append(", fileBody=").append(fileBody).append('}').toString();
    }
}
