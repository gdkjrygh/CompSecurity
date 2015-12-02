// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.g.a;

import com.facebook.contacts.server.UpdateFavoriteContactsParams;
import com.facebook.http.protocol.f;
import com.facebook.http.protocol.n;
import com.facebook.http.protocol.r;
import com.facebook.http.protocol.t;
import com.facebook.user.User;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.hq;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class j
    implements f
{

    public j()
    {
    }

    public n a(UpdateFavoriteContactsParams updatefavoritecontactsparams)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        updatefavoritecontactsparams = updatefavoritecontactsparams.a().iterator();
        for (int i = 0; updatefavoritecontactsparams.hasNext(); i++)
        {
            User user = (User)updatefavoritecontactsparams.next();
            objectnode.put(Integer.toString(i), user.b());
        }

        updatefavoritecontactsparams = hq.a();
        updatefavoritecontactsparams.add(new BasicNameValuePair("format", "json"));
        updatefavoritecontactsparams.add(new BasicNameValuePair("favorites", objectnode.toString()));
        return new n("updateMessagingFavorites", "POST", "/me/messagingfavorites", updatefavoritecontactsparams, t.JSON);
    }

    public volatile n a(Object obj)
    {
        return a((UpdateFavoriteContactsParams)obj);
    }

    public volatile Object a(Object obj, r r1)
    {
        return a((UpdateFavoriteContactsParams)obj, r1);
    }

    public Void a(UpdateFavoriteContactsParams updatefavoritecontactsparams, r r1)
    {
        r1.f();
        return null;
    }
}
