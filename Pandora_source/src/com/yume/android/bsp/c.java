// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.yume.android.bsp;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.http.client.CookieStore;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.cookie.BasicClientCookie;

// Referenced classes of package com.yume.android.bsp:
//            p

final class c
    implements CookieStore
{

    private p a;
    private ConcurrentHashMap b;
    private SharedPreferences c;
    private android.content.SharedPreferences.Editor d;
    private DateFormat e;

    public c(Context context)
    {
        a = p.a();
        d = null;
        e = new SimpleDateFormat("EEE MMM dd hh:mm:ss z yyyy");
        c = context.getSharedPreferences("YuMeCookiePrefs", 0);
        d = c.edit();
        b = new ConcurrentHashMap();
        if (a())
        {
            clearExpired(new Date());
            if (b != null)
            {
                if (!b.isEmpty())
                {
                    a.a("Cookies loaded from Persistent Storage.");
                    return;
                } else
                {
                    a.a("No Cookies loaded from Persistent Storage.");
                    return;
                }
            } else
            {
                a.a("No Cookies loaded from Persistent Storage.");
                return;
            }
        } else
        {
            a.a("No Cookies loaded from Persistent Storage.");
            return;
        }
    }

    private Cookie a(String s)
    {
        Object obj = null;
        BasicClientCookie basicclientcookie = null;
        String as[] = TextUtils.split(s, ",");
        s = obj;
        if (as != null)
        {
            s = basicclientcookie;
            try
            {
                if (!as[5].equals(""))
                {
                    s = e.parse(as[5]);
                }
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                a.b("Error Parsing Cookie Date String.");
                s.printStackTrace();
                s = basicclientcookie;
            }
            basicclientcookie = new BasicClientCookie(as[1], as[2]);
            basicclientcookie.setVersion(Integer.parseInt(as[0]));
            basicclientcookie.setDomain(as[3]);
            basicclientcookie.setPath(as[4]);
            basicclientcookie.setExpiryDate(s);
            s = basicclientcookie;
        }
        return s;
    }

    private boolean a()
    {
        boolean flag;
        boolean flag1;
        flag = false;
        flag1 = false;
        if (b != null) goto _L2; else goto _L1
_L1:
        String s;
        return flag1;
_L2:
        if ((s = c.getString("YuMeCookies", null)) == null)
        {
            continue;
        }
        String as[] = TextUtils.split(s, ",");
        int j = as.length;
        int i = 0;
        do
        {
            flag1 = flag;
            if (i >= j)
            {
                continue;
            }
            String s1 = as[i];
            Object obj = c.getString((new StringBuilder("YuMeCookie_")).append(s1).toString(), null);
            flag1 = flag;
            if (obj != null)
            {
                obj = a(((String) (obj)));
                flag1 = flag;
                if (obj != null)
                {
                    b.put(s1, obj);
                    flag1 = true;
                }
            }
            i++;
            flag = flag1;
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public final void addCookie(Cookie cookie)
    {
        String s1 = cookie.getName();
        if (s1 != null)
        {
            String s = (new StringBuilder(String.valueOf(Integer.toString(cookie.getVersion())))).append(",").append(s1).append(",").append(cookie.getValue()).append(",").append(cookie.getDomain()).append(",").append(cookie.getPath()).toString();
            Date date = cookie.getExpiryDate();
            if (date != null)
            {
                s = (new StringBuilder(String.valueOf(s))).append(",").append(date.toString()).toString();
            } else
            {
                s = (new StringBuilder(String.valueOf(s))).append(",").toString();
            }
            if (b != null)
            {
                b.put(s1, cookie);
                d.putString("YuMeCookies", TextUtils.join(",", b.keySet()));
                d.putString((new StringBuilder("YuMeCookie_")).append(s1).toString(), s);
                d.commit();
                return;
            }
        }
    }

    public final void clear()
    {
        if (b == null) goto _L2; else goto _L1
_L1:
        Iterator iterator;
        b.clear();
        iterator = b.keySet().iterator();
_L6:
        if (iterator.hasNext()) goto _L4; else goto _L3
_L3:
        d.remove("YuMeCookies");
        d.commit();
_L2:
        return;
_L4:
        String s = (String)iterator.next();
        d.remove((new StringBuilder("YuMeCookie_")).append(s).toString());
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final boolean clearExpired(Date date)
    {
        if (b == null)
        {
            return false;
        }
        Iterator iterator = b.entrySet().iterator();
        boolean flag = false;
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
                        d.putString("YuMeCookies", TextUtils.join(",", b.keySet()));
                    }
                    d.commit();
                    return flag;
                }
                entry = (java.util.Map.Entry)iterator.next();
                s = (String)entry.getKey();
            } while (!((Cookie)entry.getValue()).isExpired(date));
            b.remove(s);
            d.remove((new StringBuilder("YuMeCookie_")).append(s).toString());
            flag = true;
        } while (true);
    }

    public final List getCookies()
    {
        return new ArrayList(b.values());
    }
}
