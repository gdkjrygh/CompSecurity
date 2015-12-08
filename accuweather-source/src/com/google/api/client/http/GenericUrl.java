// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.GenericData;
import com.google.api.client.util.Preconditions;
import com.google.api.client.util.escape.CharEscapers;
import com.google.api.client.util.escape.Escaper;
import com.google.api.client.util.escape.PercentEscaper;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.api.client.http:
//            UrlEncodedParser

public class GenericUrl extends GenericData
{

    private static final Escaper URI_FRAGMENT_ESCAPER = new PercentEscaper("=&-_.!~*'()@:$,;/?:", false);
    private String fragment;
    private String host;
    private List pathParts;
    private int port;
    private String scheme;
    private String userInfo;

    public GenericUrl()
    {
        port = -1;
    }

    public GenericUrl(String s)
    {
        this(parseURL(s));
    }

    private GenericUrl(String s, String s1, int i, String s2, String s3, String s4, String s5)
    {
        Object obj = null;
        super();
        port = -1;
        scheme = s.toLowerCase();
        host = s1;
        port = i;
        pathParts = toPathParts(s2);
        if (s3 != null)
        {
            s = CharEscapers.decodeUri(s3);
        } else
        {
            s = null;
        }
        fragment = s;
        if (s4 != null)
        {
            UrlEncodedParser.parse(s4, this);
        }
        s = obj;
        if (s5 != null)
        {
            s = CharEscapers.decodeUri(s5);
        }
        userInfo = s;
    }

    public GenericUrl(URI uri)
    {
        this(uri.getScheme(), uri.getHost(), uri.getPort(), uri.getRawPath(), uri.getRawFragment(), uri.getRawQuery(), uri.getRawUserInfo());
    }

    public GenericUrl(URL url)
    {
        this(url.getProtocol(), url.getHost(), url.getPort(), url.getPath(), url.getRef(), url.getQuery(), url.getUserInfo());
    }

    static void addQueryParams(Set set1, StringBuilder stringbuilder)
    {
        boolean flag = true;
        set1 = set1.iterator();
label0:
        do
        {
            if (!set1.hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)set1.next();
            Object obj = ((java.util.Map.Entry) (obj1)).getValue();
            if (obj == null)
            {
                continue;
            }
            obj1 = CharEscapers.escapeUriQuery((String)((java.util.Map.Entry) (obj1)).getKey());
            if (obj instanceof Collection)
            {
                obj = ((Collection)obj).iterator();
                boolean flag1 = flag;
                do
                {
                    flag = flag1;
                    if (!((Iterator) (obj)).hasNext())
                    {
                        continue label0;
                    }
                    flag1 = appendParam(flag1, stringbuilder, ((String) (obj1)), ((Iterator) (obj)).next());
                } while (true);
            }
            flag = appendParam(flag, stringbuilder, ((String) (obj1)), obj);
        } while (true);
    }

    private static boolean appendParam(boolean flag, StringBuilder stringbuilder, String s, Object obj)
    {
        if (flag)
        {
            flag = false;
            stringbuilder.append('?');
        } else
        {
            stringbuilder.append('&');
        }
        stringbuilder.append(s);
        s = CharEscapers.escapeUriQuery(obj.toString());
        if (s.length() != 0)
        {
            stringbuilder.append('=').append(s);
        }
        return flag;
    }

    private void appendRawPathFromParts(StringBuilder stringbuilder)
    {
        int j = pathParts.size();
        for (int i = 0; i < j; i++)
        {
            String s = (String)pathParts.get(i);
            if (i != 0)
            {
                stringbuilder.append('/');
            }
            if (s.length() != 0)
            {
                stringbuilder.append(CharEscapers.escapeUriPath(s));
            }
        }

    }

    private static URL parseURL(String s)
    {
        try
        {
            s = new URL(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public static List toPathParts(String s)
    {
        if (s != null && s.length() != 0) goto _L2; else goto _L1
_L1:
        Object obj = null;
_L4:
        return ((List) (obj));
_L2:
        ArrayList arraylist = new ArrayList();
        int i = 0;
        boolean flag = true;
        do
        {
            obj = arraylist;
            if (!flag)
            {
                continue;
            }
            int j = s.indexOf('/', i);
            if (j != -1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                obj = s.substring(i, j);
            } else
            {
                obj = s.substring(i);
            }
            arraylist.add(CharEscapers.decodeUri(((String) (obj))));
            i = j + 1;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static URI toURI(String s)
    {
        try
        {
            s = new URI(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

    public void appendRawPath(String s)
    {
label0:
        {
            if (s != null && s.length() != 0)
            {
                s = toPathParts(s);
                if (pathParts != null && !pathParts.isEmpty())
                {
                    break label0;
                }
                pathParts = s;
            }
            return;
        }
        int i = pathParts.size();
        pathParts.set(i - 1, (new StringBuilder()).append((String)pathParts.get(i - 1)).append((String)s.get(0)).toString());
        pathParts.addAll(s.subList(1, s.size()));
    }

    public final String build()
    {
        return (new StringBuilder()).append(buildAuthority()).append(buildRelativeUrl()).toString();
    }

    public final String buildAuthority()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append((String)Preconditions.checkNotNull(scheme));
        stringbuilder.append("://");
        if (userInfo != null)
        {
            stringbuilder.append(CharEscapers.escapeUriUserInfo(userInfo)).append('@');
        }
        stringbuilder.append((String)Preconditions.checkNotNull(host));
        int i = port;
        if (i != -1)
        {
            stringbuilder.append(':').append(i);
        }
        return stringbuilder.toString();
    }

    public final String buildRelativeUrl()
    {
        StringBuilder stringbuilder = new StringBuilder();
        if (pathParts != null)
        {
            appendRawPathFromParts(stringbuilder);
        }
        addQueryParams(entrySet(), stringbuilder);
        String s = fragment;
        if (s != null)
        {
            stringbuilder.append('#').append(URI_FRAGMENT_ESCAPER.escape(s));
        }
        return stringbuilder.toString();
    }

    public GenericUrl clone()
    {
        GenericUrl genericurl = (GenericUrl)super.clone();
        if (pathParts != null)
        {
            genericurl.pathParts = new ArrayList(pathParts);
        }
        return genericurl;
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!super.equals(obj) || !(obj instanceof GenericUrl))
        {
            return false;
        } else
        {
            obj = (GenericUrl)obj;
            return build().equals(((GenericUrl) (obj)).toString());
        }
    }

    public Collection getAll(String s)
    {
        s = ((String) (get(s)));
        if (s == null)
        {
            return Collections.emptySet();
        }
        if (s instanceof Collection)
        {
            return Collections.unmodifiableCollection((Collection)s);
        } else
        {
            return Collections.singleton(s);
        }
    }

    public Object getFirst(String s)
    {
        s = ((String) (get(s)));
        if (s instanceof Collection)
        {
            s = ((Collection)s).iterator();
            if (s.hasNext())
            {
                return s.next();
            } else
            {
                return null;
            }
        } else
        {
            return s;
        }
    }

    public String getFragment()
    {
        return fragment;
    }

    public String getHost()
    {
        return host;
    }

    public List getPathParts()
    {
        return pathParts;
    }

    public int getPort()
    {
        return port;
    }

    public String getRawPath()
    {
        if (pathParts == null)
        {
            return null;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            appendRawPathFromParts(stringbuilder);
            return stringbuilder.toString();
        }
    }

    public final String getScheme()
    {
        return scheme;
    }

    public final String getUserInfo()
    {
        return userInfo;
    }

    public int hashCode()
    {
        return build().hashCode();
    }

    public GenericUrl set(String s, Object obj)
    {
        return (GenericUrl)super.set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public final void setFragment(String s)
    {
        fragment = s;
    }

    public final void setHost(String s)
    {
        host = (String)Preconditions.checkNotNull(s);
    }

    public void setPathParts(List list)
    {
        pathParts = list;
    }

    public final void setPort(int i)
    {
        boolean flag;
        if (i >= -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "expected port >= -1");
        port = i;
    }

    public void setRawPath(String s)
    {
        pathParts = toPathParts(s);
    }

    public final void setScheme(String s)
    {
        scheme = (String)Preconditions.checkNotNull(s);
    }

    public final void setUserInfo(String s)
    {
        userInfo = s;
    }

    public String toString()
    {
        return build();
    }

    public final URI toURI()
    {
        return toURI(build());
    }

    public final URL toURL()
    {
        return parseURL(build());
    }

    public final URL toURL(String s)
    {
        try
        {
            s = new URL(toURL(), s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException(s);
        }
        return s;
    }

}
