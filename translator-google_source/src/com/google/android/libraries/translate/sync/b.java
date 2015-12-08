// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.translate.sync;

import android.content.Context;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.TwsResponseException;
import com.google.android.libraries.translate.core.l;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.core.u;
import com.google.android.libraries.translate.e.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;

// Referenced classes of package com.google.android.libraries.translate.sync:
//            c, g

public final class b
{

    private static String d = null;
    public final Context a;
    public final boolean b;
    String c;
    private l e;

    public b(Context context)
    {
        this(context, false);
    }

    public b(Context context, boolean flag)
    {
        c = null;
        a = context;
        b = flag;
        e = new l();
    }

    static String a(String s)
    {
        return (new JSONArray(s)).getString(5);
    }

    static List a(String s, boolean flag)
    {
        ArrayList arraylist = new ArrayList();
        s = new JSONArray(s);
        if (!flag || !s.isNull(2))
        {
            s = s.getJSONArray(2);
            int j = s.length();
            int i = 0;
            while (i < j) 
            {
                JSONArray jsonarray = s.getJSONArray(i);
                Entry entry = new Entry(jsonarray.getString(1), jsonarray.getString(2), jsonarray.getString(3), jsonarray.getString(4));
                entry.setId(jsonarray.getString(0));
                entry.setCreatedTime(jsonarray.getLong(5) / 1000L);
                arraylist.add(entry);
                i++;
            }
        }
        return arraylist;
    }

    public static void a()
    {
        d = null;
    }

    static void a(b b1, String s)
    {
        b1.c = (new JSONArray(s)).getString(1);
    }

    public static Entry b(Entry entry)
    {
        Object obj;
        try
        {
            obj = l.a(entry.getInputText(), entry.getFromLanguageShortName(), entry.getToLanguageShortName(), "process=sync");
            ((m) (obj)).b();
            String s = entry.getTranslation();
            if (!s.equals(((m) (obj)).a[0]))
            {
                ((m) (obj)).a[0] = s;
                ((m) (obj)).a[1] = "";
            }
            obj = new Entry(entry, ((m) (obj)).toString());
            ((Entry) (obj)).setId(entry.getId());
        }
        // Misplaced declaration of an exception variable
        catch (Entry entry)
        {
            return null;
        }
        return ((Entry) (obj));
    }

    static String b()
    {
        return d;
    }

    static List b(String s)
    {
        ArrayList arraylist = new ArrayList();
        s = (new JSONArray(s)).getJSONArray(2);
        int j = s.length();
        for (int i = 0; i < j; i++)
        {
            arraylist.add(s.getJSONArray(i).getString(0));
        }

        return arraylist;
    }

    static String c(String s)
    {
        d = s;
        return s;
    }

    public final String a(Entry entry)
    {
        String s = entry.getInputText();
        com.google.android.libraries.translate.sync.c c1 = new com.google.android.libraries.translate.sync.c(this, a, s, entry);
        String s1 = entry.getFromLanguageShortName();
        String s2 = entry.getToLanguageShortName();
        entry = entry.getTranslation();
        return (String)c1.a(u.a("a", b).b("sl", s1).b("tl", s2).b("q", s).a("ql", String.valueOf(s.length())).b("utrans", entry).a(false));
    }

    public final List a(List list)
    {
        g g1 = new g(this, a);
        String s = c;
        c c1 = u.a("l", b);
        for (list = list.iterator(); list.hasNext(); c1.b("id", (String)list.next())) { }
        u.a(c1, s);
        return (List)g1.a(c1.a(false));
    }

}
