// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import android.content.Context;
import android.content.SharedPreferences;
import com.loopj.android.http.PersistentCookieStore;
import com.loopj.android.http.SerializableCookie;
import com.worklight.common.WLConfig;
import com.worklight.common.WLSimpleDataSharing;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.apache.http.cookie.Cookie;

class WLPersistentCookieStore extends PersistentCookieStore
{

    private static final String COOKIE_NAME_PREFIX = "cookie_";
    private static final String SHARED_PREFS_STORE_NAME = "CookiePrefsFile";
    private static Context context;
    private final SharedPreferences cookiePreferences;
    private List sharableCookies;

    public WLPersistentCookieStore(Context context1)
    {
        super(context1);
        sharableCookies = new ArrayList();
        context = context1;
        cookiePreferences = context.getSharedPreferences("CookiePrefsFile", 0);
        for (sharableCookies = WLConfig.getInstance().getShareCookies(); sharableCookies.remove("JSESSIONID");) { }
    }

    public void addCookie(Cookie cookie)
    {
        super.addCookie(cookie);
        if (sharableCookies.contains(cookie.getName()))
        {
            (new WLSimpleDataSharing(context)).setSharedToken(cookie.getName(), encodeCookie(new SerializableCookie(cookie)));
        }
        if (cookie.getExpiryDate() == null)
        {
            android.content.SharedPreferences.Editor editor = cookiePreferences.edit();
            editor.remove((new StringBuilder()).append("cookie_").append(cookie.getName()).toString());
            editor.commit();
        }
    }

    public List getCookies()
    {
        List list = super.getCookies();
        Iterator iterator = sharableCookies.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            String s = (new WLSimpleDataSharing(context)).getSharedToken(s1);
            if (s != null && !s.equals(""))
            {
                Object obj = null;
                Iterator iterator1 = list.iterator();
                Cookie cookie;
                do
                {
                    cookie = obj;
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    cookie = (Cookie)iterator1.next();
                } while (!cookie.getName().equals(s1));
                list.remove(cookie);
                list.add(decodeCookie(s));
            }
        } while (true);
        return list;
    }
}
