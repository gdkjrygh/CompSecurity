// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g;

import com.facebook.common.w.e;
import com.facebook.contacts.c.a;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactDetails;
import com.facebook.contacts.models.EntrySection;
import com.facebook.contacts.models.b;
import com.facebook.contacts.models.entry.PhoneEntry;
import com.facebook.contacts.server.FetchContactParams;
import com.facebook.contacts.server.FetchContactResult;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.hq;
import com.google.common.base.Preconditions;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class h
    implements f
{

    private final a a;
    private final com.facebook.contacts.c.b b;

    public h(a a1, com.facebook.contacts.c.b b1)
    {
        a = a1;
        b = b1;
    }

    private Contact a(JsonNode jsonnode)
    {
        return a.a(jsonnode).u();
    }

    private com.facebook.g.a.b a(com.facebook.g.a.b b1)
    {
        b.a(b1);
        com.facebook.g.a.a a1 = com.facebook.g.a.a.b("rows").a(com.facebook.g.a.a.b("nodes").c("label").a(b(com.facebook.g.a.a.b("entries")).f()).a(b(com.facebook.g.a.a.b("hidden_entries")).f()).f()).f();
        b1.a(com.facebook.g.a.a.b("represented_profile").c("has_timeline").d("complete_represented_profile").f()).a(com.facebook.g.a.a.b("info_sections").a(com.facebook.g.a.a.b("nodes").a(a1).c("label").f()).f());
        return b1;
    }

    private JsonNode a(n n1, JsonNode jsonnode)
    {
        JsonNode jsonnode1 = jsonnode.get((String)jsonnode.fieldNames().next());
        jsonnode = jsonnode1;
        if (n1 == n.FACEBOOK)
        {
            jsonnode = jsonnode1.get("contact");
        }
        return jsonnode;
    }

    private String a(UserKey userkey)
    {
        boolean flag;
        if (userkey.a() == n.FACEBOOK || userkey.a() == n.FACEBOOK_CONTACT)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (userkey.a() == n.FACEBOOK)
        {
            userkey = userkey.b();
            com.facebook.g.a.a a1 = a(com.facebook.g.a.a.b("contact")).f();
            userkey = com.facebook.g.a.a.a(userkey).a(a1).f();
        } else
        {
            userkey = a(com.facebook.g.a.a.a(userkey.b())).f();
        }
        return userkey.toString();
    }

    private void a(et et1, et et2, JsonNode jsonnode)
    {
        jsonnode.get("label").textValue();
        Object obj = jsonnode.get("entries");
        jsonnode = jsonnode.get("hidden_entries");
        obj = ((JsonNode) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            PhoneEntry phoneentry = d((JsonNode)((Iterator) (obj)).next());
            if (phoneentry != null)
            {
                et1.b(phoneentry);
            }
        } while (true);
        et1 = jsonnode.iterator();
        do
        {
            if (!et1.hasNext())
            {
                break;
            }
            jsonnode = d((JsonNode)et1.next());
            if (jsonnode != null)
            {
                et2.b(jsonnode);
            }
        } while (true);
    }

    private ContactDetails b(JsonNode jsonnode)
    {
        String s = e.b(jsonnode.get("id"));
        JsonNode jsonnode1 = jsonnode.get("info_sections");
        boolean flag = e.g(jsonnode.path("complete_represented_profile").get("has_timeline"));
        return new ContactDetails(s, c(jsonnode1.get("nodes")), flag);
    }

    private com.facebook.g.a.b b(com.facebook.g.a.b b1)
    {
        return b1.c("graph_api_write_id").a(com.facebook.g.a.a.b("primary_field").c("value").c("source").c("creation_time").c("__type__").a(com.facebook.g.a.a.b("phone").c("display_number").c("universal_number").f()).f());
    }

    private EntrySection c(JsonNode jsonnode)
    {
        if (jsonnode.size() > 0)
        {
            Object obj = jsonnode.get(0);
            jsonnode = ((JsonNode) (obj)).get("label").textValue();
            Object obj1 = ((JsonNode) (obj)).get("rows").get("nodes");
            obj = es.e();
            et et1 = es.e();
            for (obj1 = ((JsonNode) (obj1)).iterator(); ((Iterator) (obj1)).hasNext(); a(((et) (obj)), et1, (JsonNode)((Iterator) (obj1)).next())) { }
            return new EntrySection(jsonnode, ((et) (obj)).b(), et1.b());
        } else
        {
            return new EntrySection(null, es.d(), es.d());
        }
    }

    private PhoneEntry d(JsonNode jsonnode)
    {
        boolean flag = e.g(jsonnode.get("is_verified"));
        String s = e.b(jsonnode.get("graph_api_write_id"));
        JsonNode jsonnode1 = jsonnode.get("primary_field");
        jsonnode = jsonnode1.get("__type__");
        Object obj;
        long l;
        if (jsonnode != null)
        {
            jsonnode = e.b(jsonnode.get("name"));
        } else
        {
            jsonnode = null;
        }
        obj = jsonnode1.get("source");
        if (obj != null)
        {
            obj = e.b(((JsonNode) (obj)).get("text"));
        } else
        {
            obj = null;
        }
        l = e.c(jsonnode1.get("creation_time"));
        if ("ContactPhone".equals(jsonnode))
        {
            return new PhoneEntry(s, flag, ((String) (obj)), l, e.b(jsonnode1.get("phone").get("universal_number")), 2);
        } else
        {
            return null;
        }
    }

    public FetchContactResult a(FetchContactParams fetchcontactparams, r r1)
    {
        r1 = r1.c();
        r1 = a(fetchcontactparams.a().a(), ((JsonNode) (r1)));
        fetchcontactparams = a(((JsonNode) (r1)));
        r1 = b(r1);
        return new FetchContactResult(com.facebook.fbservice.c.b.FROM_SERVER, System.currentTimeMillis(), fetchcontactparams, r1);
    }

    public com.facebook.http.protocol.n a(FetchContactParams fetchcontactparams)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(new BasicNameValuePair("q", a(fetchcontactparams.a())));
        return new com.facebook.http.protocol.n("fetchContact", "GET", "graphql", arraylist, t.JSON);
    }

    public volatile com.facebook.http.protocol.n a(Object obj)
    {
        return a((FetchContactParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((FetchContactParams)obj, r1);
    }
}
