// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import android.content.Context;
import android.os.Handler;
import android.text.Html;
import android.text.TextUtils;
import android.widget.HorizontalScrollView;
import android.widget.TextView;
import com.google.android.apps.translate.widget.SuggestionList;
import com.google.android.libraries.translate.core.Entry;
import com.google.android.libraries.translate.core.Singleton;
import com.google.android.libraries.translate.core.m;
import com.google.android.libraries.translate.languages.Language;
import com.google.android.libraries.translate.languages.d;
import com.google.android.libraries.translate.languages.e;
import com.google.android.libraries.translate.logging.Event;
import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            aq, bk

public final class bj extends aq
{

    private final Map f = Maps.b();
    private final bk g;
    private final SuggestionList h;
    private final String i;
    private final String j;
    private final Context k;
    private final d l;
    private List m;
    private Set n;
    private String o;
    private m p;
    private Entry q;

    public bj(TextView textview, TextView textview1, Language language, Language language1, SuggestionList suggestionlist, HorizontalScrollView horizontalscrollview)
    {
        super(textview, textview1, language, language1, horizontalscrollview);
        k = textview.getContext();
        h = suggestionlist;
        i = language.getShortName();
        j = language1.getShortName();
        g = new bk(this, language);
        l = e.a(k);
    }

    static Context a(bj bj1)
    {
        return bj1.k;
    }

    static void a(bj bj1, String s, List list, Set set)
    {
        bj1.m = list;
        bj1.n = set;
        if (s.equals(bj1.o))
        {
            bj1.b(s, bj1.p);
        }
        bj1.h.a(list);
        if (!list.isEmpty())
        {
            bj1.a(Event.HISTORY_SHOWN_IN_EDIT_MODE);
        }
    }

    private void a(Event event)
    {
        this;
        JVM INSTR monitorenter ;
        Integer integer = (Integer)f.get(event);
        if (integer != null) goto _L2; else goto _L1
_L1:
        int i1 = 1;
_L4:
        f.put(event, Integer.valueOf(i1));
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        i1 = integer.intValue();
        i1++;
        if (true) goto _L4; else goto _L3
_L3:
        event;
        throw event;
    }

    private void a(String s, String s1, String s2)
    {
        if (m == null)
        {
            m = new ArrayList();
            n = new HashSet();
        }
        if (!n.contains(s1))
        {
            m.remove(q);
            q = new Entry(s, "", s1, "");
            q.setId(s2);
            m.add(0, q);
            n.add(s1);
            if (m.size() > 3)
            {
                m.remove(3);
            }
            h.a(m);
        }
    }

    private void b(String s, m m1)
    {
        if (m1 != null)
        {
            String s1 = m1.a(4);
            if (!TextUtils.isEmpty(s1))
            {
                s = Html.fromHtml(s1).toString().trim();
                a(i, s, "spell_correct");
                a(Event.SPELL_CORRECTION_SHOWN_IN_EDIT_MODE);
                return;
            }
            m1 = m1.a(i);
            if (!TextUtils.isEmpty(m1) && !i.equals(m1) && l.a(m1) != null)
            {
                a(m1, s, "lang_suggest");
                a(Event.LANGID_SHOWN_IN_EDIT_MODE);
                return;
            }
            if (m != null && q != null && m.remove(q))
            {
                n.remove(q.getInputText());
                h.a(m);
                return;
            }
        }
    }

    public final void a()
    {
        super.a();
        g.start();
        g.a();
    }

    protected final void a(String s, m m1)
    {
        super.a(s, m1);
        b(s, m1);
        p = m1;
        o = s;
    }

    public final void b()
    {
        super.b();
        g.quit();
        java.util.Map.Entry entry;
        for (Iterator iterator = f.entrySet().iterator(); iterator.hasNext(); Singleton.b().a((Event)entry.getKey(), i, j, ((Integer)entry.getValue()).intValue()))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

    }

    public final void b(String s)
    {
        super.b(s);
        if (g.a != null)
        {
            g.a.removeMessages(1);
            g.a.sendMessage(g.a.obtainMessage(1, s));
        }
    }
}
