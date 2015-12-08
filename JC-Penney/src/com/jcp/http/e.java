// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.http;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import com.jcp.b.b;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.jcp.http:
//            JCPSerializableCookie

public class e
    implements CookieStore
{

    private static final String a = com/jcp/http/e.getName();
    private ConcurrentHashMap b;
    private Map c;
    private Map d;
    private ReentrantLock e;
    private final SharedPreferences f;

    public e(Context context)
    {
        b = new ConcurrentHashMap();
        c = new HashMap();
        d = new HashMap();
        e = new ReentrantLock(false);
        f = context.getSharedPreferences("JCPCookiePrefs", 0);
        a();
    }

    private URI a(URI uri)
    {
        URI uri1;
        try
        {
            uri1 = new URI("http", uri.getHost(), null, null, null);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            return uri;
        }
        return uri1;
    }

    private void a()
    {
        String s = f.getString("names", null);
        if (!TextUtils.isEmpty(s))
        {
            String as[] = TextUtils.split(s, ",");
            int j = as.length;
            for (int i = 0; i < j; i++)
            {
                Object obj = as[i];
                TextUtils.split(((String) (obj)), "|");
                obj = f.getString((new StringBuilder()).append("cookie_").append(((String) (obj))).toString(), null);
                if (obj == null)
                {
                    continue;
                }
                obj = a(((String) (obj)));
                if (obj != null)
                {
                    a(((HttpCookie) (obj)));
                }
            }

        }
        b();
    }

    private void a(android.content.SharedPreferences.Editor editor)
    {
        editor.putString("names", TextUtils.join(",", b.keySet()));
    }

    private void a(HttpCookie httpcookie)
    {
        if (httpcookie == null)
        {
            throw new NullPointerException("cookie is null");
        } else
        {
            add(URI.create((new StringBuilder()).append("http://").append(b.b).toString()), httpcookie);
            return;
        }
    }

    private void a(Collection collection, boolean flag)
    {
        android.content.SharedPreferences.Editor editor = f.edit();
        String s;
        for (collection = collection.iterator(); collection.hasNext(); editor.remove((new StringBuilder()).append("cookie_").append(s).toString()))
        {
            s = (String)collection.next();
        }

        if (flag)
        {
            editor.remove("names");
        } else
        {
            a(editor);
        }
        editor.commit();
    }

    private void a(List list, Map map, Comparable comparable, boolean flag)
    {
        for (Iterator iterator = map.keySet().iterator(); iterator.hasNext();)
        {
            Object obj = iterator.next();
            if (comparable.compareTo(obj) == 0)
            {
                obj = (List)map.get(obj);
                if (obj != null)
                {
                    obj = ((List) (obj)).iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        HttpCookie httpcookie = (HttpCookie)((Iterator) (obj)).next();
                        if (b.contains(httpcookie))
                        {
                            if (!httpcookie.hasExpired())
                            {
                                if ((flag || !httpcookie.getSecure()) && !list.contains(httpcookie))
                                {
                                    list.add(httpcookie);
                                }
                            } else
                            {
                                ((Iterator) (obj)).remove();
                                b.remove(c(httpcookie));
                            }
                        } else
                        {
                            ((Iterator) (obj)).remove();
                        }
                    }
                }
            }
        }

    }

    private void a(List list, Map map, String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        for (map = map.entrySet().iterator(); map.hasNext(); arraylist.clear())
        {
            Object obj = (java.util.Map.Entry)map.next();
            String s1 = (String)((java.util.Map.Entry) (obj)).getKey();
            obj = (List)((java.util.Map.Entry) (obj)).getValue();
            Iterator iterator1 = ((List) (obj)).iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break;
                }
                HttpCookie httpcookie1 = (HttpCookie)iterator1.next();
                if (httpcookie1.getVersion() == 0 && a(s1, s) || httpcookie1.getVersion() == 1 && HttpCookie.domainMatches(s1, s))
                {
                    if (b.contains(httpcookie1))
                    {
                        if (!httpcookie1.hasExpired())
                        {
                            if ((flag || !httpcookie1.getSecure()) && !list.contains(httpcookie1))
                            {
                                list.add(httpcookie1);
                            }
                        } else
                        {
                            arraylist.add(httpcookie1);
                        }
                    } else
                    {
                        arraylist.add(httpcookie1);
                    }
                }
            } while (true);
            HttpCookie httpcookie;
            for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); b.remove(c(httpcookie)))
            {
                httpcookie = (HttpCookie)iterator.next();
                ((List) (obj)).remove(httpcookie);
            }

        }

    }

    private void a(Map map, Object obj, HttpCookie httpcookie)
    {
label0:
        {
            if (obj != null)
            {
                List list = (List)map.get(obj);
                if (list == null)
                {
                    break label0;
                }
                list.remove(httpcookie);
                list.add(httpcookie);
            }
            return;
        }
        ArrayList arraylist = new ArrayList();
        arraylist.add(httpcookie);
        map.put(obj, arraylist);
    }

    private boolean a(String s, String s1)
    {
        boolean flag = true;
        if (s != null && s1 != null)
        {
            boolean flag1 = ".local".equalsIgnoreCase(s);
            int k = s.indexOf('.');
            int i = k;
            if (k == 0)
            {
                i = s.indexOf('.', 1);
            }
            if (flag1 || i != -1 && i != s.length() - 1)
            {
                if (s1.indexOf('.') == -1 && flag1)
                {
                    return true;
                }
                int j = s.length();
                j = s1.length() - j;
                if (j == 0)
                {
                    return s1.equalsIgnoreCase(s);
                }
                if (j > 0)
                {
                    return s1.substring(j).equalsIgnoreCase(s);
                }
                if (j == -1)
                {
                    if (s.charAt(0) != '.' || !s1.equalsIgnoreCase(s.substring(1)))
                    {
                        flag = false;
                    }
                    return flag;
                }
            }
        }
        return false;
    }

    private void b(HttpCookie httpcookie)
    {
        android.content.SharedPreferences.Editor editor = f.edit();
        a(editor);
        editor.putString((new StringBuilder()).append("cookie_").append(c(httpcookie)).toString(), a(new JCPSerializableCookie(httpcookie)));
        editor.commit();
    }

    private boolean b()
    {
        android.content.SharedPreferences.Editor editor = f.edit();
        Iterator iterator = b.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (java.util.Map.Entry)iterator.next();
            if (((HttpCookie)((java.util.Map.Entry) (obj)).getValue()).hasExpired())
            {
                obj = (String)((java.util.Map.Entry) (obj)).getKey();
                b.remove(obj);
                editor.remove((new StringBuilder()).append("cookie_").append(((String) (obj))).toString());
                flag = true;
            }
        } while (true);
        if (flag)
        {
            a(editor);
        }
        editor.commit();
        return flag;
    }

    private String c(HttpCookie httpcookie)
    {
        return (new StringBuilder()).append(httpcookie.getName()).append("|").append(httpcookie.getDomain()).toString();
    }

    protected String a(JCPSerializableCookie jcpserializablecookie)
    {
        if (jcpserializablecookie == null)
        {
            return null;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(jcpserializablecookie);
        }
        // Misplaced declaration of an exception variable
        catch (JCPSerializableCookie jcpserializablecookie)
        {
            Log.d(a, "IOException in encodeCookie", jcpserializablecookie);
            return null;
        }
        return a(bytearrayoutputstream.toByteArray());
    }

    protected String a(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        for (int i = 0; i < j; i++)
        {
            int k = abyte0[i] & 0xff;
            if (k < 16)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(Integer.toHexString(k));
        }

        return stringbuilder.toString().toUpperCase(Locale.US);
    }

    protected HttpCookie a(String s)
    {
        s = new ByteArrayInputStream(b(s));
        try
        {
            s = ((JCPSerializableCookie)(new ObjectInputStream(s)).readObject()).getCookie();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d(a, "IOException in decodeCookie", s);
            return null;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d(a, "ClassNotFoundException in decodeCookie", s);
            return null;
        }
        return s;
    }

    public void add(URI uri, HttpCookie httpcookie)
    {
        if (httpcookie == null)
        {
            throw new NullPointerException("cookie is null");
        }
        e.lock();
        b.remove(c(httpcookie));
        if (httpcookie.getMaxAge() != 0L)
        {
            b.put(c(httpcookie), httpcookie);
            if (httpcookie.getDomain() != null)
            {
                a(c, httpcookie.getDomain(), httpcookie);
            }
            a(d, a(uri), httpcookie);
            b(httpcookie);
        }
        e.unlock();
        return;
        uri;
        e.unlock();
        throw uri;
    }

    protected byte[] b(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        return abyte0;
    }

    public List get(URI uri)
    {
        ArrayList arraylist;
        boolean flag;
        if (uri == null)
        {
            throw new NullPointerException("uri is null");
        }
        arraylist = new ArrayList();
        flag = "https".equalsIgnoreCase(uri.getScheme());
        e.lock();
        a(arraylist, c, uri.getHost(), flag);
        a(arraylist, d, a(uri), flag);
        e.unlock();
        return arraylist;
        uri;
        e.unlock();
        throw uri;
    }

    public List getCookies()
    {
        Object obj;
        obj = new ArrayList();
        e.lock();
        ArrayList arraylist;
        Iterator iterator;
        arraylist = new ArrayList();
        iterator = b.entrySet().iterator();
_L1:
        HttpCookie httpcookie;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_130;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            httpcookie = (HttpCookie)entry.getValue();
            if (!httpcookie.hasExpired())
            {
                break MISSING_BLOCK_LABEL_118;
            }
            b.remove(entry.getKey());
            arraylist.add(entry.getKey());
        } while (true);
        obj;
        e.unlock();
        throw obj;
        ((List) (obj)).add(httpcookie);
          goto _L1
        a(arraylist, false);
        e.unlock();
        return ((List) (obj));
    }

    public List getURIs()
    {
        ArrayList arraylist;
        arraylist = new ArrayList();
        e.lock();
        Iterator iterator = d.keySet().iterator();
_L3:
        Object obj;
        if (!iterator.hasNext())
        {
            break MISSING_BLOCK_LABEL_111;
        }
        obj = (URI)iterator.next();
        obj = (List)d.get(obj);
        if (obj == null) goto _L2; else goto _L1
_L1:
        if (((List) (obj)).size() != 0) goto _L3; else goto _L2
_L2:
        iterator.remove();
          goto _L3
        Exception exception;
        exception;
        arraylist.addAll(d.keySet());
        e.unlock();
        throw exception;
        arraylist.addAll(d.keySet());
        e.unlock();
        return arraylist;
    }

    public boolean remove(URI uri, HttpCookie httpcookie)
    {
        if (httpcookie == null)
        {
            throw new NullPointerException("cookie is null");
        }
        e.lock();
        uri = c(httpcookie);
        boolean flag;
        if (b.remove(uri) != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        httpcookie = f.edit();
        httpcookie.remove((new StringBuilder()).append("cookie_").append(uri).toString());
        a(httpcookie);
        httpcookie.commit();
        e.unlock();
        return flag;
        uri;
        e.unlock();
        throw uri;
    }

    public boolean removeAll()
    {
        e.lock();
        a(b.keySet(), true);
        b.clear();
        c.clear();
        d.clear();
        e.unlock();
        return true;
        Exception exception;
        exception;
        e.unlock();
        throw exception;
    }

}
