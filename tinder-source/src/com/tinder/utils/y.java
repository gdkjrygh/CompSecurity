// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.crashlytics.android.Crashlytics;
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
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.tinder.utils:
//            v, SerializableHttpCookie

public final class y
    implements CookieStore
{

    private final Map a = new HashMap();
    private final SharedPreferences b;

    public y(Context context)
    {
        int i = 0;
        super();
        b = context.getSharedPreferences("CookiePrefsFile", 0);
        context = b.getString("names", null);
        if (context != null)
        {
            context = TextUtils.split(context, ",");
            for (int j = context.length; i < j; i++)
            {
                String s = context[i];
                Object obj = b.getString((new StringBuilder("cookie_")).append(s).toString(), null);
                if (obj == null)
                {
                    continue;
                }
                obj = a(((String) (obj)));
                if (obj != null)
                {
                    ArrayList arraylist = new ArrayList();
                    arraylist.add(obj);
                    a.put(URI.create(s), arraylist);
                }
            }

        }
    }

    private static String a(SerializableHttpCookie serializablehttpcookie)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(serializablehttpcookie);
        }
        // Misplaced declaration of an exception variable
        catch (SerializableHttpCookie serializablehttpcookie)
        {
            v.a("IOException in encodeCookie", serializablehttpcookie);
            return null;
        }
        serializablehttpcookie = a(bytearrayoutputstream.toByteArray());
        try
        {
            bytearrayoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (SerializableHttpCookie serializablehttpcookie)
        {
            return null;
        }
        return serializablehttpcookie;
    }

    private static String a(byte abyte0[])
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

    private static HttpCookie a(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        s = new ByteArrayInputStream(abyte0);
        ObjectInputStream objectinputstream;
        objectinputstream = new ObjectInputStream(s);
        s = ((SerializableHttpCookie)objectinputstream.readObject()).a;
        objectinputstream.close();
        return s;
        Object obj;
        obj;
        s = null;
_L4:
        v.a("IOException in decodeCookie", ((Throwable) (obj)));
        return s;
        obj;
        s = null;
_L2:
        v.a("ClassNotFoundException in decodeCookie", ((Throwable) (obj)));
        return s;
        obj;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static URI a(URI uri)
    {
        if (uri == null)
        {
            return null;
        }
        URI uri1;
        try
        {
            uri1 = new URI("http", uri.getHost(), null, null);
        }
        catch (URISyntaxException urisyntaxexception)
        {
            return uri;
        }
        return uri1;
    }

    public final void add(URI uri, HttpCookie httpcookie)
    {
        this;
        JVM INSTR monitorenter ;
        if (httpcookie != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("cookie == null");
        uri;
        this;
        JVM INSTR monitorexit ;
        throw uri;
        URI uri1;
        uri1 = a(uri);
        uri = (List)a.get(uri1);
        if (uri != null) goto _L2; else goto _L1
_L1:
        uri = new ArrayList();
        a.put(uri1, uri);
_L3:
        android.content.SharedPreferences.Editor editor;
        String s;
        uri.add(httpcookie);
        editor = b.edit();
        editor.putString("names", TextUtils.join(",", a.keySet()));
        s = a(new SerializableHttpCookie(httpcookie));
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_173;
        }
        editor.putString((new StringBuilder("cookie_")).append(uri1).toString(), s);
        editor.commit();
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        uri.remove(httpcookie);
          goto _L3
        uri.remove(httpcookie);
        Crashlytics.a(String.format("Failed to encode cookie: %s", new Object[] {
            httpcookie
        }));
          goto _L4
    }

    public final List get(URI uri)
    {
        this;
        JVM INSTR monitorenter ;
        if (uri != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("uri == null");
        uri;
        this;
        JVM INSTR monitorexit ;
        throw uri;
        ArrayList arraylist;
        Object obj;
        arraylist = new ArrayList();
        obj = (List)a.get(uri);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_103;
        }
        obj = ((List) (obj)).iterator();
_L1:
        Object obj1;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_103;
            }
            obj1 = (HttpCookie)((Iterator) (obj)).next();
            if (!((HttpCookie) (obj1)).hasExpired())
            {
                break MISSING_BLOCK_LABEL_91;
            }
            ((Iterator) (obj)).remove();
        } while (true);
        arraylist.add(obj1);
          goto _L1
        obj = a.entrySet().iterator();
_L6:
        if (!((Iterator) (obj)).hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
        if (uri.equals(((java.util.Map.Entry) (obj1)).getKey()))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj1 = ((List)((java.util.Map.Entry) (obj1)).getValue()).iterator();
_L3:
        HttpCookie httpcookie;
        while (((Iterator) (obj1)).hasNext()) 
        {
            httpcookie = (HttpCookie)((Iterator) (obj1)).next();
            if (HttpCookie.domainMatches(httpcookie.getDomain(), uri.getHost()))
            {
                if (!httpcookie.hasExpired())
                {
                    continue; /* Loop/switch isn't completed */
                }
                ((Iterator) (obj1)).remove();
            }
        }
        break; /* Loop/switch isn't completed */
        if (arraylist.contains(httpcookie)) goto _L3; else goto _L2
_L2:
        arraylist.add(httpcookie);
        if (true) goto _L3; else goto _L4
_L4:
        if (true) goto _L6; else goto _L5
_L5:
        uri = Collections.unmodifiableList(arraylist);
        this;
        JVM INSTR monitorexit ;
        return uri;
    }

    public final List getCookies()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        Iterator iterator;
        obj = new ArrayList();
        iterator = a.values().iterator();
_L5:
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            break; /* Loop/switch isn't completed */
        }
        iterator1 = ((List)iterator.next()).iterator();
_L2:
        HttpCookie httpcookie;
        while (iterator1.hasNext()) 
        {
            httpcookie = (HttpCookie)iterator1.next();
            if (!httpcookie.hasExpired())
            {
                continue; /* Loop/switch isn't completed */
            }
            iterator1.remove();
        }
        break; /* Loop/switch isn't completed */
        obj;
        throw obj;
        if (((List) (obj)).contains(httpcookie)) goto _L2; else goto _L1
_L1:
        ((List) (obj)).add(httpcookie);
        if (true) goto _L2; else goto _L3
_L3:
        if (true) goto _L5; else goto _L4
_L4:
        obj = Collections.unmodifiableList(((List) (obj)));
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
    }

    public final List getURIs()
    {
        this;
        JVM INSTR monitorenter ;
        Object obj;
        obj = new ArrayList(a.keySet());
        ((List) (obj)).remove(null);
        obj = Collections.unmodifiableList(((List) (obj)));
        this;
        JVM INSTR monitorexit ;
        return ((List) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean remove(URI uri, HttpCookie httpcookie)
    {
        this;
        JVM INSTR monitorenter ;
        if (httpcookie != null)
        {
            break MISSING_BLOCK_LABEL_21;
        }
        throw new NullPointerException("cookie == null");
        uri;
        this;
        JVM INSTR monitorexit ;
        throw uri;
        List list;
        uri = a(uri);
        list = (List)a.get(uri);
        if (list == null) goto _L2; else goto _L1
_L1:
        boolean flag;
        b.edit().remove((new StringBuilder("cookie_")).append(uri).toString()).commit();
        flag = list.remove(httpcookie);
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final boolean removeAll()
    {
        this;
        JVM INSTR monitorenter ;
        b.edit().clear().commit();
        a.isEmpty();
        a.clear();
        this;
        JVM INSTR monitorexit ;
        return true;
        Exception exception;
        exception;
        throw exception;
    }
}
