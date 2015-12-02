// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.stickers;

import android.net.Uri;
import com.facebook.common.w.e;
import com.facebook.common.w.n;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import com.fasterxml.jackson.databind.node.JsonNodeFactory;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.google.common.a.es;
import com.google.common.a.et;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.facebook.orca.stickers:
//            Sticker, StickerPack

public class k
{

    private final ObjectMapper a;

    public k(ObjectMapper objectmapper)
    {
        a = objectmapper;
    }

    private List a(JsonNode jsonnode)
    {
        LinkedList linkedlist = new LinkedList();
        for (int i = 0; i < jsonnode.size(); i++)
        {
            JsonNode jsonnode1 = jsonnode.get(i);
            linkedlist.add(new Sticker(e.b(jsonnode1.get("id")), b(jsonnode1.get("uri")), b(jsonnode1.get("animated_uri"))));
        }

        return linkedlist;
    }

    private Uri b(JsonNode jsonnode)
    {
        jsonnode = e.b(jsonnode);
        if (jsonnode != null)
        {
            return Uri.parse(jsonnode);
        } else
        {
            return null;
        }
    }

    private ArrayNode c(List list)
    {
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        ObjectNode objectnode;
        for (list = list.iterator(); list.hasNext(); arraynode.add(objectnode))
        {
            Sticker sticker = (Sticker)list.next();
            objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("id", sticker.a());
            objectnode.put("uri", a(sticker.b()));
            objectnode.put("animated_uri", a(sticker.c()));
        }

        return arraynode;
    }

    public es a(String s)
    {
        if (n.a(s))
        {
            return null;
        }
        s = a.readTree(s);
        et et1 = new et();
        for (int i = 0; i < s.size(); i++)
        {
            JsonNode jsonnode = s.get(i);
            et1.b(new StickerPack(e.b(jsonnode.get("id")), e.b(jsonnode.get("name")), e.b(jsonnode.get("description")), Uri.parse(jsonnode.get("thumbnailUri").asText()), Uri.parse(jsonnode.get("previewUri").asText()), Uri.parse(jsonnode.get("tabIconUri").asText()), jsonnode.get("price").asInt(0), jsonnode.get("isFeatured").asBoolean(false), jsonnode.get("isPromoted").asBoolean(false), a(jsonnode.get("stickers"))));
        }

        return et1.b();
    }

    public String a(Uri uri)
    {
        if (uri != null)
        {
            return uri.toString();
        } else
        {
            return null;
        }
    }

    public String a(List list)
    {
        if (list == null)
        {
            return null;
        }
        ArrayNode arraynode = new ArrayNode(JsonNodeFactory.instance);
        ObjectNode objectnode;
        for (list = list.iterator(); list.hasNext(); arraynode.add(objectnode))
        {
            StickerPack stickerpack = (StickerPack)list.next();
            objectnode = new ObjectNode(JsonNodeFactory.instance);
            objectnode.put("id", stickerpack.a());
            objectnode.put("name", stickerpack.b());
            objectnode.put("description", stickerpack.c());
            objectnode.put("thumbnailUri", a(stickerpack.d()));
            objectnode.put("previewUri", a(stickerpack.e()));
            objectnode.put("tabIconUri", a(stickerpack.f()));
            objectnode.put("price", stickerpack.g());
            objectnode.put("isFeatured", stickerpack.h());
            objectnode.put("isPromoted", stickerpack.i());
            objectnode.put("stickers", c(stickerpack.j()));
        }

        return arraynode.toString();
    }

    public String b(List list)
    {
        if (list == null)
        {
            return null;
        } else
        {
            return c(list).toString();
        }
    }

    public List b(String s)
    {
        if (n.a(s))
        {
            return null;
        } else
        {
            return a(a.readTree(s));
        }
    }
}
