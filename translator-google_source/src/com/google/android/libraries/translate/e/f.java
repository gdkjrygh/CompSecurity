// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.e;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.core.t;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.a;
import com.google.android.libraries.translate.languages.d;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import org.apache.http.client.HttpClient;
import org.json.JSONArray;
import org.json.JSONException;

// Referenced classes of package com.google.android.libraries.translate.e:
//            g, d, c, o

public final class f
{

    public static d a(Context context)
    {
        context = com.google.android.libraries.translate.core.b.a(context);
        if (!TextUtils.isEmpty(context))
        {
            return new d(context);
        } else
        {
            return new d(Collections.unmodifiableList(a.a), Collections.unmodifiableList(a.b));
        }
    }

    public static String a(String s, String s1, String s2)
    {
        return (new StringBuilder()).append(s).append(":").append(s1).append(":").append(s2).toString();
    }

    public static String a(Locale locale)
    {
        String s;
        if (locale == null)
        {
            s = "";
        } else
        {
            s = locale.getLanguage();
        }
        if ("nb".equals(s) || "no".equals(s))
        {
            return "no";
        }
        if ("in".equals(s) || "id".equals(s))
        {
            return "id";
        }
        if ("fil".equals(s))
        {
            return "tl";
        } else
        {
            return b(locale);
        }
    }

    public static List a(List list)
    {
        return a(list, "sl");
    }

    private static List a(List list, String s)
    {
        LinkedList linkedlist = new LinkedList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            String as[] = ((String)list.next()).split(":");
            if (as.length == 3 && s.equals(as[0]))
            {
                linkedlist.add(new Language(as[1], as[2]));
            }
        } while (true);
        return linkedlist;
    }

    public static Locale a(String s)
    {
        int i = s.indexOf('-');
        if (i == -1)
        {
            return new Locale(s);
        } else
        {
            return new Locale(s.substring(0, i), s.substring(i + 1));
        }
    }

    public static boolean a(Language language)
    {
        if (language == null)
        {
            return false;
        } else
        {
            return "auto".equals(language.getShortName());
        }
    }

    public static String b(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = s.toLowerCase(Locale.ENGLISH).replace('_', '-');
            if (s.startsWith("he-"))
            {
                return "iw";
            }
            if (s.equals("latin"))
            {
                return "la";
            }
            if (s.equals("euskara"))
            {
                return "eu";
            }
            if (s.startsWith("fil-"))
            {
                return "tl";
            }
            if (s.startsWith("nb-"))
            {
                return "no";
            }
            if (s.contains("-hans-"))
            {
                return "zh-CN";
            }
            if (s.contains("-hant-"))
            {
                return "zh-TW";
            }
            int j = s.indexOf('-');
            int i = j;
            if (j < 0)
            {
                i = s.length();
            }
            if (i == 2 || i == 3)
            {
                return s.substring(0, i);
            }
        }
        return null;
    }

    public static String b(Locale locale)
    {
        if (locale == null)
        {
            return "";
        }
        if (Locale.TAIWAN.equals(locale))
        {
            return "zh-TW";
        }
        if (Locale.CHINA.equals(locale))
        {
            return "zh-CN";
        } else
        {
            locale.getLanguage();
            return locale.getLanguage();
        }
    }

    public static List b(List list)
    {
        return a(list, "tl");
    }

    public static void b(Context context)
    {
        (new g(context)).start();
    }

    static d c(Locale locale)
    {
        Object obj = null;
        HttpClient httpclient = com.google.android.libraries.translate.e.d.a();
        locale = a(locale);
        StringBuilder stringbuilder = t.a();
        stringbuilder.append("/translate_a/l?client=");
        stringbuilder.append(Singleton.c());
        locale = httpclient.execute((new c(stringbuilder.toString())).a("hl", locale).a("ie", "UTF-8").a("oe", "UTF-8").a("iid", com.google.android.libraries.translate.e.o.b()).a(false));
        if (locale == null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist;
        JSONArray jsonarray;
        locale = com.google.android.libraries.translate.e.d.b(locale).trim();
        arraylist = new ArrayList();
        jsonarray = new JSONArray(locale.replace('{', '[').replace('}', ']').replace(':', ','));
        int i = 0;
_L6:
        locale = arraylist;
        JSONArray jsonarray1;
        int k;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        locale = jsonarray.getString(i);
        jsonarray1 = jsonarray.getJSONArray(i + 1);
        k = jsonarray1.length();
        int j = 0;
_L4:
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        arraylist.add(a(locale, jsonarray1.getString(j), jsonarray1.getString(j + 1)));
        j += 2;
        if (true) goto _L4; else goto _L3
_L3:
        i += 2;
        if (true) goto _L6; else goto _L5
        locale;
        locale = null;
_L5:
        d d1 = obj;
        if (locale != null)
        {
            List list = a(locale);
            locale = b(locale);
            d1 = obj;
            if (list.size() > 80)
            {
                d1 = obj;
                if (locale.size() > 80)
                {
                    d1 = new d(list, locale);
                }
            }
        }
        return d1;
        locale;
        locale = null;
        continue; /* Loop/switch isn't completed */
        locale;
_L2:
        locale = null;
        if (true) goto _L5; else goto _L7
_L7:
    }
}
