// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.c;

import com.facebook.common.w.e;
import com.facebook.common.w.q;
import com.facebook.contacts.models.Contact;
import com.facebook.contacts.models.ContactPhone;
import com.facebook.contacts.models.b;
import com.facebook.user.Name;
import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import java.io.IOException;
import java.util.Iterator;

public class a
{

    private static final Class a = com/facebook/contacts/c/a;

    public a()
    {
    }

    public b a(JsonNode jsonnode)
    {
        if (jsonnode == null || jsonnode.isNull())
        {
            throw new IOException("Server sent a null response for a contact");
        }
        Object obj = c(jsonnode.get("structured_name"));
        Object obj1 = c(jsonnode.get("phonetic_name"));
        obj1 = Contact.newBuilder().a(e.b(jsonnode.get("id"))).c(e.b(jsonnode.get("graph_api_write_id"))).a(((Name) (obj))).b(((Name) (obj1))).e(e.b(jsonnode.path("small_picture_url").get("uri"))).f(e.b(jsonnode.path("big_picture_url").get("uri"))).g(e.b(jsonnode.path("huge_picture_url").get("uri")));
        JsonNode jsonnode1 = jsonnode.get("represented_profile");
        if (jsonnode1 == null)
        {
            throw new IOException("Server didn't include data for represented profile.");
        }
        if (!jsonnode1.isNull())
        {
            ((b) (obj1)).b(e.b(jsonnode1.get("id")));
            ((b) (obj1)).a((float)e.e(jsonnode1.get("rank")));
            ((b) (obj1)).a(e.g(jsonnode1.get("can_message")));
            if (e.g(jsonnode1.get("is_mobile_pushable")))
            {
                obj = q.YES;
            } else
            {
                obj = q.NO;
            }
            ((b) (obj1)).a(((q) (obj)));
            ((b) (obj1)).b(e.g(jsonnode1.get("is_memorialized")));
            if (!jsonnode1.get("timeline_cover_photo").isNull())
            {
                ((b) (obj1)).i(jsonnode1.get("timeline_cover_photo").toString());
            }
            ((b) (obj1)).a(b(jsonnode1.get("__type__")));
            obj = jsonnode1.get("name_search_tokens");
            if (obj != null)
            {
                et et1 = es.e();
                int j = ((JsonNode) (obj)).size();
                for (int i = 0; i < j; i++)
                {
                    et1.b(((JsonNode) (obj)).get(i).asText());
                }

                ((b) (obj1)).b(et1.b());
            }
        } else
        {
            ((b) (obj1)).a(com.facebook.contacts.models.a.a.UNMATCHED);
        }
        obj = es.e();
        jsonnode = jsonnode.get("phones");
        if (jsonnode != null && !jsonnode.isNull())
        {
            JsonNode jsonnode2;
            JsonNode jsonnode3;
            JsonNode jsonnode4;
            for (jsonnode = jsonnode.elements(); jsonnode.hasNext(); ((et) (obj)).b(new ContactPhone(e.b(jsonnode3.get("id")), e.b(jsonnode3.get("label")), e.b(jsonnode4.get("display_number")), e.b(jsonnode4.get("universal_number")), e.g(jsonnode2.get("is_verified")))))
            {
                jsonnode2 = (JsonNode)jsonnode.next();
                jsonnode3 = jsonnode2.get("primary_field");
                jsonnode4 = jsonnode3.get("phone");
            }

            ((b) (obj1)).a(((et) (obj)).b());
        }
        return ((b) (obj1));
    }

    public com.facebook.contacts.models.a.a b(JsonNode jsonnode)
    {
        Preconditions.checkNotNull(jsonnode);
        JsonNode jsonnode1 = jsonnode.get("name");
        Preconditions.checkNotNull(jsonnode1);
        boolean flag;
        if (!jsonnode.isNull())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        jsonnode = e.b(jsonnode1);
        if (jsonnode.equals("User"))
        {
            return com.facebook.contacts.models.a.a.USER;
        }
        if (jsonnode.equals("Page"))
        {
            return com.facebook.contacts.models.a.a.PAGE;
        } else
        {
            com.facebook.debug.log.b.e(a, (new StringBuilder()).append("Malformed contact type name: ").append(jsonnode).toString());
            throw new IllegalArgumentException((new StringBuilder()).append("Malformed contact type name: ").append(jsonnode).toString());
        }
    }

    public Name c(JsonNode jsonnode)
    {
        Object obj = null;
        if (jsonnode == null || jsonnode.isNull())
        {
            return new Name(null, null);
        }
        String s1 = e.b(jsonnode.get("text"));
        jsonnode = jsonnode.get("parts");
        if (s1 == null || jsonnode == null)
        {
            return new Name(null, null, s1);
        }
        Iterator iterator = jsonnode.iterator();
        String s = null;
        jsonnode = obj;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj1 = (JsonNode)iterator.next();
            int j = e.d(((JsonNode) (obj1)).get("offset"));
            int i = e.d(((JsonNode) (obj1)).get("length"));
            String s2 = e.b(((JsonNode) (obj1)).get("part"));
            j = s1.offsetByCodePoints(0, j);
            obj1 = s1.substring(j, s1.offsetByCodePoints(j, i));
            if (Objects.equal(s2, "first"))
            {
                s = ((String) (obj1));
            } else
            if (Objects.equal(s2, "last"))
            {
                jsonnode = ((JsonNode) (obj1));
            }
        } while (true);
        return new Name(s, jsonnode, s1);
    }

}
