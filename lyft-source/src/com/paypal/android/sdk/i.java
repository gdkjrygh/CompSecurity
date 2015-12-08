// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.paypal.android.sdk:
//            j

public class i
{

    private static final String a = com/paypal/android/sdk/i.getSimpleName();
    private static final Map b;
    private static final Set c;
    private static boolean g;
    private Map d;
    private j e;
    private Class f;

    public i(Class class1, List list)
    {
        d = new LinkedHashMap();
        f = class1;
        String s;
        for (class1 = list.iterator(); class1.hasNext(); b(s))
        {
            list = (j)class1.next();
            s = list.a();
            if (s == null)
            {
                throw new RuntimeException("Null localeName");
            }
            if (d.containsKey(s))
            {
                throw new RuntimeException((new StringBuilder("Locale ")).append(s).append(" already added").toString());
            }
            d.put(s, list);
        }

        a(((String) (null)));
    }

    private void b(String s)
    {
        j j1 = (j)d.get(s);
        ArrayList arraylist = new ArrayList();
        (new StringBuilder("Checking locale ")).append(s);
        Enum aenum[] = (Enum[])f.getEnumConstants();
        int l = aenum.length;
        for (int k = 0; k < l; k++)
        {
            Enum enum = aenum[k];
            String s1 = (new StringBuilder("[")).append(s).append(",").append(enum).append("]").toString();
            if (j1.a(enum, null) == null)
            {
                arraylist.add((new StringBuilder("Missing ")).append(s1).toString());
            }
        }

        for (s = arraylist.iterator(); s.hasNext(); s.next()) { }
    }

    private j c(String s)
    {
        Object obj3 = null;
        Object obj1 = null;
        Object obj = obj1;
        if (s != null)
        {
            if (s.length() < 2)
            {
                obj = obj1;
            } else
            {
                j j1 = obj3;
                if (b.containsKey(s))
                {
                    obj = (String)b.get(s);
                    j1 = (j)d.get(obj);
                    (new StringBuilder("Overriding locale specifier ")).append(s).append(" with ").append(((String) (obj)));
                }
                obj = j1;
                if (j1 == null)
                {
                    Object obj2;
                    if (s.contains("_"))
                    {
                        obj = s;
                    } else
                    {
                        obj = (new StringBuilder()).append(s).append("_").append(Locale.getDefault().getCountry()).toString();
                    }
                    obj = (j)d.get(obj);
                }
                obj2 = obj;
                if (obj == null)
                {
                    obj2 = (j)d.get(s);
                }
                obj = obj2;
                if (obj2 == null)
                {
                    s = s.substring(0, 2);
                    return (j)d.get(s);
                }
            }
        }
        return ((j) (obj));
    }

    public final String a()
    {
        return e.a();
    }

    public final String a(Enum enum)
    {
        Object obj = e;
        String s1 = Locale.getDefault().getCountry().toUpperCase(Locale.US);
        String s = ((j) (obj)).a(enum, s1);
        obj = s;
        if (s == null)
        {
            (new StringBuilder("Missing localized string for [")).append(e.a()).append(",Key.").append(enum.toString()).append("]");
            obj = ((j)d.get("en")).a(enum, s1);
        }
        s = ((String) (obj));
        if (obj == null)
        {
            (new StringBuilder("Missing localized string for [en,Key.")).append(enum.toString()).append("], so defaulting to keyname");
            s = enum.toString();
        }
        return s;
    }

    public final String a(String s, Enum enum)
    {
        String s1 = e.a(s);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return String.format(a(enum), new Object[] {
                s
            });
        }
    }

    public final void a(String s)
    {
        j j1 = null;
        (new StringBuilder("setLanguage(")).append(s).append(")");
        e = null;
        if (s != null)
        {
            j1 = c(s);
        }
        Object obj = j1;
        if (j1 == null)
        {
            obj = Locale.getDefault().toString();
            (new StringBuilder()).append(s).append(" not found.  Attempting to look for ").append(((String) (obj)));
            obj = c(((String) (obj)));
        }
        s = ((String) (obj));
        if (obj == null)
        {
            s = (j)d.get("en");
        }
        if (!g && s == null)
        {
            throw new AssertionError();
        }
        e = s;
        if (!g && e == null)
        {
            throw new AssertionError();
        } else
        {
            (new StringBuilder("setting locale to:")).append(e.a());
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!com/paypal/android/sdk/i.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        b = new HashMap();
        c = new HashSet();
        b.put("zh_CN", "zh-Hans");
        b.put("zh_TW", "zh-Hant_TW");
        b.put("zh_HK", "zh-Hant");
        b.put("en_UK", "en_GB");
        b.put("en_IE", "en_GB");
        b.put("iw_IL", "he");
        b.put("no", "nb");
        c.add("he");
        c.add("ar");
    }
}
