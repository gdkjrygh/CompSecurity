// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.protocol.methods;

import com.facebook.debug.log.b;
import com.facebook.http.protocol.ab;
import com.facebook.location.Coordinates;
import com.facebook.messages.model.threads.Message;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;
import com.facebook.ui.media.b.a;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.ev;
import com.google.common.a.fi;
import java.util.Iterator;
import java.util.List;
import org.apache.http.message.BasicNameValuePair;

public class an
{

    private final Class a = com/facebook/orca/protocol/methods/an;
    private final d b;
    private final a c;

    public an(d d1, a a1)
    {
        b = d1;
        c = a1;
    }

    ab a(MediaResource mediaresource)
    {
        if (mediaresource == null)
        {
            com.facebook.debug.log.b.b(a, "No attachment found! Returning null...");
            return null;
        }
        mediaresource = b.b(mediaresource);
        if (mediaresource == null)
        {
            com.facebook.debug.log.b.b(a, "Unable to create an attachment from given resource");
            return null;
        } else
        {
            return c.a(mediaresource);
        }
    }

    ObjectNode a(Message message)
    {
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        java.util.Map.Entry entry;
        for (message = message.J().a().iterator(); message.hasNext(); objectnode.put((String)entry.getKey(), (String)entry.getValue()))
        {
            entry = (java.util.Map.Entry)message.next();
        }

        return objectnode;
    }

    void a(List list, Message message, String s)
    {
        if (message.l())
        {
            list.add(new BasicNameValuePair("message", message.k()));
        }
        if (message.r())
        {
            list.add(new BasicNameValuePair("coordinates", b(message).toString()));
        }
        if (message.I())
        {
            list.add(new BasicNameValuePair("client_tags", a(message).toString()));
        }
        if (message.x())
        {
            list.add(new BasicNameValuePair("offline_threading_id", message.w()));
        }
        if (s != null)
        {
            list.add(new BasicNameValuePair("object_attachment", s));
        }
    }

    ObjectNode b(Message message)
    {
        message = message.n();
        ObjectNode objectnode = new ObjectNode(JsonNodeFactory.instance);
        objectnode.put("latitude", message.b());
        objectnode.put("longitude", message.c());
        if (message.e())
        {
            objectnode.put("altitude", message.d());
        }
        if (message.g())
        {
            objectnode.put("accuracy", message.f());
        }
        if (message.k())
        {
            objectnode.put("heading", message.j());
        }
        if (message.m())
        {
            objectnode.put("speed", message.l());
        }
        return objectnode;
    }
}
