// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.common.ui.titlebar;

import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.common.h.a;
import com.facebook.debug.log.f;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

class p
{

    private av a;
    private Set b;
    private String c;
    private int d;

    p(av av1)
    {
        a = av1;
        b = new LinkedHashSet();
    }

    private void a(String s, String s1, int i)
    {
        s = (new cb(s)).e("chat_bar").a("queryStrings", d()).a("queryAttempts", d).h(c);
        if (s1 != null)
        {
            s.b("contact_type", s1).a("index", i);
        }
        b.clear();
        c = null;
        a.a(s);
    }

    private void b(String s)
    {
        a(s, null, 0);
    }

    private JsonNode d()
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (Iterator iterator = b.iterator(); iterator.hasNext(); arraynode.add((String)iterator.next())) { }
        return arraynode;
    }

    public void a(String s)
    {
        if (c != null)
        {
            if (d < 10)
            {
                b.add(s);
            }
            d = d + 1;
            return;
        } else
        {
            f.b("Tried to add a query string to a session but no session is ongoing");
            return;
        }
    }

    public void a(String s, int i)
    {
        if (c != null)
        {
            a("chat_bar_search_result_selected", s, i);
            return;
        } else
        {
            f.b("Tried to terminate a search session but no session is ongoing");
            return;
        }
    }

    public boolean a()
    {
        return c != null;
    }

    public void b()
    {
        if (c != null)
        {
            f.b("Starting search session with one already ongoing");
        }
        b.clear();
        d = 0;
        c = com.facebook.common.h.a.a().toString();
        cb cb1 = (new cb("chat_bar_search_began")).e("chat_bar").h(c);
        a.a(cb1);
    }

    public void c()
    {
        if (c != null)
        {
            b("chat_bar_search_result_ended");
            return;
        } else
        {
            f.b("Tried to cancel a search session but no session is ongoing");
            return;
        }
    }
}
