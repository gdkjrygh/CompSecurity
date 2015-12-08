// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.CookieStore;
import java.net.HttpCookie;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

// Referenced classes of package com.pinterest.api:
//            SerializableCookie

public class PersistentCookieStore
    implements CookieStore
{

    private final ConcurrentHashMap a = new ConcurrentHashMap();
    private final SharedPreferences b;

    public PersistentCookieStore(Context context)
    {
        b = context.getSharedPreferences("CookiePrefsFile", 0);
        context = b.getString("names", null);
        if (context != null)
        {
            String as[] = TextUtils.split(context, ",");
            ArrayList arraylist = new ArrayList();
            int j = as.length;
            int i = 0;
            while (i < j) 
            {
                String s = as[i];
                context = b.getString((new StringBuilder("cookie_")).append(s).toString(), null);
                if (context != null)
                {
                    context = b(context);
                } else
                {
                    context = null;
                }
                if (context == null)
                {
                    arraylist.add(s);
                } else
                {
                    a.put(s, context);
                }
                i++;
            }
            a(arraylist);
        }
    }

    private static String a(SerializableCookie serializablecookie)
    {
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(serializablecookie);
        }
        // Misplaced declaration of an exception variable
        catch (SerializableCookie serializablecookie)
        {
            Log.d("PersistentCookieStore", "IOException in encodeCookie", serializablecookie);
            return null;
        }
        return a(bytearrayoutputstream.toByteArray());
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

    private boolean a(List list)
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        Iterator iterator = a.entrySet().iterator();
        boolean flag = false;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            String s1 = (String)entry.getKey();
            if (((HttpCookie)entry.getValue()).hasExpired())
            {
                a.remove(s1);
                editor.remove((new StringBuilder("cookie_")).append(s1).toString());
                flag = true;
            }
        } while (true);
        for (list = list.iterator(); list.hasNext();)
        {
            String s = (String)list.next();
            editor.remove((new StringBuilder("cookie_")).append(s).toString());
            flag = true;
        }

        if (flag)
        {
            editor.putString("names", TextUtils.join(",", a.keySet()));
        }
        editor.commit();
        return flag;
    }

    private static HttpCookie b(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        for (int i = 0; i < j; i += 2)
        {
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
        }

        s = new ByteArrayInputStream(abyte0);
        try
        {
            s = ((SerializableCookie)(new ObjectInputStream(s)).readObject()).a();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("PersistentCookieStore", "Exception in decodeCookie", s);
            return null;
        }
        return s;
    }

    public final String a(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = a.values().iterator();
        int i = 0;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            HttpCookie httpcookie = (HttpCookie)iterator.next();
            if (httpcookie.getDomain().equals(s))
            {
                if (i != 0)
                {
                    stringbuilder.append("; ");
                }
                stringbuilder.append(httpcookie.toString());
                i++;
            }
        } while (true);
        return stringbuilder.toString();
    }

    public void add(URI uri, HttpCookie httpcookie)
    {
        if (httpcookie.getMaxAge() < 0L)
        {
            return;
        }
        uri = (new StringBuilder()).append(httpcookie.getName()).append(httpcookie.getDomain()).toString();
        android.content.SharedPreferences.Editor editor;
        if (!httpcookie.hasExpired())
        {
            a.put(uri, httpcookie);
        } else
        {
            a.remove(uri);
        }
        editor = b.edit();
        editor.putString("names", TextUtils.join(",", a.keySet()));
        editor.putString((new StringBuilder("cookie_")).append(uri).toString(), a(new SerializableCookie(httpcookie)));
        editor.commit();
    }

    public List get(URI uri)
    {
        Object obj = a.values();
        ArrayList arraylist = new ArrayList();
        uri = uri.getHost();
        obj = ((Collection) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            HttpCookie httpcookie = (HttpCookie)((Iterator) (obj)).next();
            if (uri.endsWith(httpcookie.getDomain()))
            {
                arraylist.add(httpcookie);
            }
        } while (true);
        return arraylist;
    }

    public List getCookies()
    {
        Object obj = a.values();
        ArrayList arraylist = new ArrayList();
        obj = ((Collection) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            HttpCookie httpcookie = (HttpCookie)((Iterator) (obj)).next();
            if (!httpcookie.hasExpired())
            {
                arraylist.add(httpcookie);
            }
        } while (true);
        return arraylist;
    }

    public List getURIs()
    {
        return new ArrayList();
    }

    public boolean remove(URI uri, HttpCookie httpcookie)
    {
        uri = (new StringBuilder()).append(httpcookie.getName()).append(httpcookie.getDomain()).toString();
        boolean flag;
        if (a.remove(uri) == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        httpcookie = b.edit();
        httpcookie.remove((new StringBuilder("cookie_")).append(uri).toString());
        httpcookie.commit();
        return flag;
    }

    public boolean removeAll()
    {
        android.content.SharedPreferences.Editor editor = b.edit();
        String s;
        for (Iterator iterator = a.keySet().iterator(); iterator.hasNext(); editor.remove((new StringBuilder("cookie_")).append(s).toString()))
        {
            s = (String)iterator.next();
        }

        editor.remove("names");
        editor.commit();
        a.clear();
        return true;
    }
}
