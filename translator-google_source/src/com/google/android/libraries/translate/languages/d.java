// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.languages;

import android.content.Context;
import com.google.android.libraries.translate.core.b;
import com.google.android.libraries.translate.e.f;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.translate.languages:
//            Language, c

public final class d
{

    public List a;
    public List b;
    private Map c;
    private Map d;
    private Map e;
    private Map f;
    private Language g;
    private Language h;

    public d(String s)
    {
        a = new LinkedList();
        b = new LinkedList();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        g = null;
        h = null;
        s = Arrays.asList(s.split("\t"));
        a = com.google.android.libraries.translate.e.f.a(s);
        b = com.google.android.libraries.translate.e.f.b(s);
        c();
    }

    public d(List list, List list1)
    {
        a = new LinkedList();
        b = new LinkedList();
        c = new HashMap();
        d = new HashMap();
        e = new HashMap();
        f = new HashMap();
        g = null;
        h = null;
        a = list;
        b = list1;
        c();
    }

    private void c()
    {
        Language language;
        for (Iterator iterator = a.iterator(); iterator.hasNext(); d.put(language.getShortName(), language))
        {
            language = (Language)iterator.next();
            c.put(language.getLongName(), language.getShortName());
        }

        Language language1;
        for (Iterator iterator1 = b.iterator(); iterator1.hasNext(); f.put(language1.getShortName(), language1))
        {
            language1 = (Language)iterator1.next();
            e.put(language1.getLongName(), language1.getShortName());
        }

    }

    private String d(String s)
    {
        if (f.keySet().contains(s))
        {
            return s;
        }
        if (f.keySet().contains("es"))
        {
            return "es";
        } else
        {
            return "en";
        }
    }

    private void d()
    {
        Object obj = Locale.getDefault();
        g = a("en");
        if (Locale.ENGLISH.getLanguage().equals(((Locale) (obj)).getLanguage()))
        {
            String s = "es";
            String s1 = ((Locale) (obj)).getCountry();
            obj = s;
            if (s1 != null)
            {
                obj = s;
                if (s1.equalsIgnoreCase("IN"))
                {
                    obj = "hi";
                }
            }
            h = c(d(((String) (obj))));
            return;
        }
        Language language = c(com.google.android.libraries.translate.e.f.a(((Locale) (obj))));
        obj = language;
        if (language == null)
        {
            obj = c(d("es"));
        }
        h = ((Language) (obj));
    }

    public final Language a()
    {
        if (g == null)
        {
            d();
        }
        return g;
    }

    public final Language a(Context context)
    {
        context = com.google.android.libraries.translate.core.b.d(context, this);
        if (context == null) goto _L2; else goto _L1
_L1:
        Iterator iterator = context.iterator();
_L5:
        if (!iterator.hasNext()) goto _L2; else goto _L3
_L3:
        context = (Language)iterator.next();
        if (!com.google.android.libraries.translate.languages.c.a(context.getShortName())) goto _L5; else goto _L4
_L4:
        if (context == null)
        {
            Language language = c(com.google.android.libraries.translate.e.f.a(Locale.getDefault()));
            if (language != null && com.google.android.libraries.translate.languages.c.a(language.getShortName()))
            {
                context = language;
            }
        }
        Object obj = context;
        if (context == null)
        {
            obj = c("zh-CN");
        }
        return ((Language) (obj));
_L2:
        context = null;
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final Language a(String s)
    {
        return (Language)d.get(s);
    }

    public final Language b()
    {
        if (h == null)
        {
            d();
        }
        return h;
    }

    public final Language b(String s)
    {
        String s1 = s;
        if (com.google.android.libraries.translate.languages.c.a(s))
        {
            s1 = "zh-CN";
        }
        return (Language)d.get(s1);
    }

    public final Language c(String s)
    {
        return (Language)f.get(s);
    }
}
