// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.user.RecipientInfo;
import com.facebook.user.UserFbidIdentifier;
import com.facebook.user.UserIdentifier;
import com.facebook.user.UserPhoneNumber;
import com.facebook.user.s;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

public class ad
{

    public ad()
    {
    }

    private JsonNode b(RecipientInfo recipientinfo)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        Object obj = recipientinfo.a();
        if (((UserIdentifier) (obj)).e() == s.FBID)
        {
            recipientinfo = (UserFbidIdentifier)obj;
            objectnode.put("type", "id");
            objectnode.put("id", recipientinfo.a());
        } else
        if (((UserIdentifier) (obj)).e() == s.PHONE)
        {
            obj = (UserPhoneNumber)obj;
            objectnode.put("type", "phone");
            objectnode.put("phone", ((UserPhoneNumber) (obj)).d());
            objectnode.put("country", Locale.getDefault().getCountry());
            objectnode.put("name", recipientinfo.c());
            return objectnode;
        }
        return objectnode;
    }

    public UserPhoneNumber a(RecipientInfo recipientinfo)
    {
        recipientinfo = recipientinfo.a();
        if (recipientinfo instanceof UserPhoneNumber)
        {
            return (UserPhoneNumber)recipientinfo;
        } else
        {
            return null;
        }
    }

    JsonNode a(List list)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        for (list = list.iterator(); list.hasNext(); arraynode.add(b((RecipientInfo)list.next()))) { }
        return arraynode;
    }
}
