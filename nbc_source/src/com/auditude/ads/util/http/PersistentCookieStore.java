// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.util.http;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;

// Referenced classes of package com.auditude.ads.util.http:
//            SerializableCookie

public class PersistentCookieStore
    implements CookieStore
{

    private static final String COOKIE_NAME_PREFIX = "cookie_";
    private static final String COOKIE_NAME_STORE = "names";
    private static final String COOKIE_PREFS = "CookiePrefsFile";
    private static final String LOG_TAG = "PersistentCookieStore";
    private final SharedPreferences cookiePrefs;
    private final ConcurrentHashMap cookies;
    private boolean omitNonPersistentCookies;

    public PersistentCookieStore(Context context)
    {
        int i;
        i = 0;
        super();
        omitNonPersistentCookies = false;
        cookiePrefs = context.getSharedPreferences("CookiePrefsFile", 0);
        cookies = new ConcurrentHashMap();
        context = cookiePrefs.getString("names", null);
        if (context == null) goto _L2; else goto _L1
_L1:
        int j;
        context = TextUtils.split(context, ",");
        j = context.length;
_L6:
        if (i < j) goto _L4; else goto _L3
_L3:
        clearExpired(new Date());
_L2:
        return;
_L4:
        String s = context[i];
        Object obj = cookiePrefs.getString((new StringBuilder("cookie_")).append(s).toString(), null);
        if (obj != null)
        {
            obj = decodeCookie(((String) (obj)));
            if (obj != null)
            {
                cookies.put(s, obj);
            }
        }
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void addCookie(Cookie cookie)
    {
        if (omitNonPersistentCookies && !cookie.isPersistent())
        {
            return;
        }
        String s = (new StringBuilder(String.valueOf(cookie.getName()))).append(cookie.getDomain()).toString();
        android.content.SharedPreferences.Editor editor;
        if (!cookie.isExpired(new Date()))
        {
            cookies.put(s, cookie);
        } else
        {
            cookies.remove(s);
        }
        editor = cookiePrefs.edit();
        editor.putString("names", TextUtils.join(",", cookies.keySet()));
        editor.putString((new StringBuilder("cookie_")).append(s).toString(), encodeCookie(new SerializableCookie(cookie)));
        editor.commit();
    }

    protected String byteArrayToHexString(byte abyte0[])
    {
        StringBuilder stringbuilder = new StringBuilder(abyte0.length * 2);
        int j = abyte0.length;
        int i = 0;
        do
        {
            if (i >= j)
            {
                return stringbuilder.toString().toUpperCase(Locale.US);
            }
            int k = abyte0[i] & 0xff;
            if (k < 16)
            {
                stringbuilder.append('0');
            }
            stringbuilder.append(Integer.toHexString(k));
            i++;
        } while (true);
    }

    public void clear()
    {
        android.content.SharedPreferences.Editor editor = cookiePrefs.edit();
        Iterator iterator = cookies.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                editor.remove("names");
                editor.commit();
                cookies.clear();
                return;
            }
            String s = (String)iterator.next();
            editor.remove((new StringBuilder("cookie_")).append(s).toString());
        } while (true);
    }

    public boolean clearExpired(Date date)
    {
        boolean flag = false;
        android.content.SharedPreferences.Editor editor = cookiePrefs.edit();
        Iterator iterator = cookies.entrySet().iterator();
        do
        {
            java.util.Map.Entry entry;
            String s;
            do
            {
                if (!iterator.hasNext())
                {
                    if (flag)
                    {
                        editor.putString("names", TextUtils.join(",", cookies.keySet()));
                    }
                    editor.commit();
                    return flag;
                }
                entry = (java.util.Map.Entry)iterator.next();
                s = (String)entry.getKey();
            } while (!((Cookie)entry.getValue()).isExpired(date));
            cookies.remove(s);
            editor.remove((new StringBuilder("cookie_")).append(s).toString());
            flag = true;
        } while (true);
    }

    protected Cookie decodeCookie(String s)
    {
        s = new ByteArrayInputStream(hexStringToByteArray(s));
        try
        {
            s = ((SerializableCookie)(new ObjectInputStream(s)).readObject()).getCookie();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.d("PersistentCookieStore", "decodeCookie failed", s);
            return null;
        }
        return s;
    }

    public void deleteCookie(Cookie cookie)
    {
        cookie = cookie.getName();
        cookies.remove(cookie);
        android.content.SharedPreferences.Editor editor = cookiePrefs.edit();
        editor.remove((new StringBuilder("cookie_")).append(cookie).toString());
        editor.commit();
    }

    protected String encodeCookie(SerializableCookie serializablecookie)
    {
        if (serializablecookie == null)
        {
            return null;
        }
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        try
        {
            (new ObjectOutputStream(bytearrayoutputstream)).writeObject(serializablecookie);
        }
        // Misplaced declaration of an exception variable
        catch (SerializableCookie serializablecookie)
        {
            return null;
        }
        return byteArrayToHexString(bytearrayoutputstream.toByteArray());
    }

    public List getCookies()
    {
        return new ArrayList(cookies.values());
    }

    protected byte[] hexStringToByteArray(String s)
    {
        int j = s.length();
        byte abyte0[] = new byte[j / 2];
        int i = 0;
        do
        {
            if (i >= j)
            {
                return abyte0;
            }
            abyte0[i / 2] = (byte)((Character.digit(s.charAt(i), 16) << 4) + Character.digit(s.charAt(i + 1), 16));
            i += 2;
        } while (true);
    }

    public void setOmitNonPersistentCookies(boolean flag)
    {
        omitNonPersistentCookies = flag;
    }
}
